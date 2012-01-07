package topc.graph;

import java.util.*;
import java.io.*;

// SRM 200 Division I Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2852&rd=5075
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm200
public class Graduation {
  static public final int C = 128;
  int[] classesPerReq;
  char[] classes;
  boolean[][] reqGraph;
  int n;
  int t;

  public String moreClasses(String classesTaken, String[] requirements) {
    n = requirements.length;
    t = classesTaken.length();

    buildGraph(classesTaken, requirements);

    int[] reqCount = new int[n];
    int[] clsMatch = new int[C];
    Arrays.fill(clsMatch, -1);

    String res = "";
    boolean allMatched = false;
    for (int i = 0; i < C; i++) {
      if (matchReq(i, clsMatch, reqCount) && i >= t) {
        res += classes[i];
      }

      allMatched = true;
      for (int j = 0; j < reqCount.length; j++) {
        allMatched &= reqCount[j] == classesPerReq[j];
        if (!allMatched) { break; }
      }
      if (allMatched) { break; }
    }

    return allMatched ? res : "0";
  }

  boolean matchReq(int cls, int[] clsMatch, int[] reqCount) {
    int[] from = new int[clsMatch.length];
    Arrays.fill(from, -1);
    from[cls] = cls;

    int[] newMatch = new int[clsMatch.length];
    Arrays.fill(newMatch, -1);

    Queue<Integer> classes = new LinkedList<Integer>();
    classes.offer(cls);

    boolean found = false;
    int curr = -1;
    int match = -1;
    while (!found && classes.size() > 0) {
      curr = classes.poll();
      for (int i = 0; i < n; i++) {
        if (!reqGraph[i][curr]) { continue; }

        match = i;
        if (reqCount[match] < classesPerReq[match]) {
          reqCount[match]++;
          found = true;
          break;
        }

        for (int j = 0; j < clsMatch.length; j++) {
          if (clsMatch[j] == match) {
            int next = j;
            if (from[next] == -1) {
              classes.offer(next);
              from[next] = curr;
              newMatch[curr] = match;
            }
          }
        }
      }
    }

    if (!found) { return false; }

    while (from[curr] != curr) {
      clsMatch[curr] = match;
      curr = from[curr];
      match = newMatch[curr];
    }

    clsMatch[curr] = match;
    return true;
  }

  void buildGraph(String classesTaken, String[] requirements) {
    HashMap<Character, ArrayList<Integer>> taken = new HashMap<Character, ArrayList<Integer>>();
    for (int i = 0; i < classesTaken.length(); i++) {
      taken.put(classesTaken.charAt(i), new ArrayList<Integer>());
    }

    classesPerReq = new int[n];
    HashMap<Character, ArrayList<Integer>> chars = new HashMap<Character, ArrayList<Integer>>();
    for (int i = 0; i < requirements.length; i++) {
      String req = requirements[i];
      int j = 0;

      String count = "";
      for (j = 0; j < req.length(); j++) {
        if (Character.isDigit(req.charAt(j))) {
          count += req.charAt(j);
        } else {
          break;
        }
      }
      classesPerReq[i] = Integer.parseInt(count);
      assert classesPerReq[i] <= C : "invalid class count";

      for (; j < req.length(); j++) {
        char ch = req.charAt(j);
        if (!taken.containsKey(ch)) {
          if (!chars.containsKey(ch)) {
            chars.put(ch, new ArrayList<Integer>());
          }
          chars.get(ch).add(i);
        } else {
          taken.get(ch).add(i);
        }
      }
    }

    int c = 0;
    classes = new char[C];
    reqGraph = new boolean[n][C];

    List<Character> takenList = new ArrayList<Character>(taken.keySet());
    Collections.sort(takenList);
    for (int i = 0; i < takenList.size(); i++) {
      char ch = takenList.get(i);
      classes[c] = ch;
      for (int j = 0; j < taken.get(ch).size(); j++) {
        reqGraph[taken.get(ch).get(j)][c] = true;
      }
      c++;
    }

    List<Character> charList = new ArrayList<Character>(chars.keySet());
    Collections.sort(charList);
    for (int i = 0; i < charList.size(); i++) {
      char ch = charList.get(i);
      classes[c] = ch;
      for (int j = 0; j < chars.get(ch).size(); j++) {
        reqGraph[chars.get(ch).get(j)][c] = true;
      }
      c++;
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
