package topc.graph;

import java.util.*;

// 2003 TCCC Round 1 : 500 (graph dfs)
public class Marketing {
  int[] ccid;
  int[] stid;
  String[] items;

  int[] cc = new int[50];
  String[] prods;

  public long howMany(String[] compete) {
    ccid = new int[50];
    stid = new int[50];
    items = compete;

    for (int i = 0; i < items.length; i++) {
      if (!dfs(i)) {
        return -1;
      }
    }

    int maxccid = 0;
    for (int i = 0; i < ccid.length; i++) {
      maxccid = Math.max(maxccid, ccid[i]);
    }

    int[] counts = new int[maxccid + 1];
    for (int i = 0; i < items.length; i++) {
      if (ccid[i] == 0) {
        counts[ccid[i]]++;
      } else {
        counts[ccid[i]] = 1;
      }
    }


    int count = 0;
    for (int i = 0; i < counts.length; i++) {
      count += counts[i];
    }

    return 1 << count;
  }

  boolean dfs(int i) {
    if (ccid[i] > 0 || items[i].length() == 0) { return true; }

    int[] parents = new int[50];
    int[] curcc = new int[50];
    int cc = i + 1; 
    Stack<Integer> nodes = new Stack<Integer>();

    Arrays.fill(parents, -1);
    nodes.push(i);
    while (nodes.size() > 0) {
      int top = nodes.pop();
      int set = setId(parents[top]);

      if (stid[top] > 0 && stid[top] != set) { return false; }
      if (curcc[top] == 0 && ccid[top] == 0 && items[top].length() > 0) {
        String[] sons = items[top].split(" ");
        for (int j = 0; j < sons.length; j++) {
          int son = Integer.parseInt(sons[j]);
          parents[son] = top;
          nodes.push(son);

          if (stid[son] > 0 && stid[top] == 0 && parents[top] == -1 && curcc[son] == 0) {
            set = setId(son);
          }
        }
      }

      stid[top] = set;
      curcc[top] = 1;
      if (ccid[top] > 0) {
        cc = ccid[top];
      }
    }

    for (int j = 0; j < curcc.length; j++) {
      if (curcc[j] == 1) {
        ccid[j] = cc;
      }
    }

    return true;
  }

  int setId(int parent) {
    if (parent < 0) { return 1; }
    return stid[parent] == 2 ? 1 : stid[parent] + 1;
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
