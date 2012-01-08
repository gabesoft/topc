package topc.easy;

import java.util.*;
import java.io.*;

// TCO05 Round 3 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4731&rd=8016
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tco05_online_rd_3
public class PlayingCubes {
  int n;
  int c = 'Z' - 'A' + 1;
  boolean[][] cubeGraph;

  public int[] composeWords(String[] cubes, String[] words) {
    n = cubes.length;

    cubeGraph = new boolean[n][c];
    for (int i = 0; i < n; i++) {
      String cube = cubes[i];
      for (int j = 0; j < cube.length(); j++) {
        int k = cube.charAt(j) - 'A';
        cubeGraph[i][k] = true;
      }
    }

    List<Integer> matched = new ArrayList<Integer>();
    for (int i = 0; i < words.length; i++) {
      String word     = words[i];
      boolean make    = true;

      int[] cubeMatch = new int[n];
      Arrays.fill(cubeMatch, -1);

      for (int j = 0; j < word.length(); j++) {
        boolean[] seen  = new boolean[n];
        int k = word.charAt(j) - 'A';
        make &= match(k, cubeMatch, seen);
        if (!make) { break; }
      }

      if (make) { matched.add(i); }
    }

    int[] res = new int[matched.size()];
    for (int i = 0; i < matched.size(); i++) {
      res[i] = matched.get(i);
    }
    
    return res;
  }

  boolean match(int letter, int[] cubeMatch, boolean[] seen) {
    if (letter == -1) { return true; }

    for (int i = 0; i < n; i++) {
      if (!cubeGraph[i][letter]) { continue; }

      int match = i;
      if (!seen[match]) {
        seen[match] = true;

        if (match(cubeMatch[match], cubeMatch, seen)) {
          cubeMatch[match] = letter;
          return true;
        }
      }
    }

    return false;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
