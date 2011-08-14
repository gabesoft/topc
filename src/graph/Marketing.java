package topc.graph;

import java.util.*;

// 2003 TCCC Round 1 : 500 (graph dfs)
public class Marketing {
  int[] cc = new int[50];
  String[] prods;

  public long howMany(String[] compete) {
    cc = new int[50];
    prods = compete;
    int numcc = 0;

    for (int i = 0; i < compete.length; i++) {
      int curcc = countcc(i);
      if (curcc == -1) { return -1; }
      numcc += curcc;
    }

    return 1 << numcc;
  }


  int countcc(int i) {
    debug(prods[i], i, cc);

    if (cc[i] > 0) { return 0; }
    if (prods[i].length() == 0) { 
      cc[i] = 1;
      return 1; 
    }

    int res = 1;
    int[] parents = new int[50];
    int[] sets = new int[50];
    Stack<Integer> nodes = new Stack<Integer>();

    nodes.push(i);
    while (nodes.size() > 0) {
      int top = nodes.pop();
      int set = parents[top] == 2 ? 1 : parents[top] + 1;
      if (sets[top] > 0 && sets[top] != set) { return -1; }
      if (sets[top] == 0 && prods[top].length() > 0) {
        String[] desc = prods[top].split(" ");
        for (int j = 0; j < desc.length; j++) {
          int son = Integer.parseInt(desc[j]);
          parents[son] = set;
          nodes.push(son);
          if (cc[son] > 0 && sets[son] == 0) { res = 0; }
        }
      }
      sets[top] = set;
      cc[top] = 1;
    }
    return res;
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }
}
