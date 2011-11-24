package topc.easy;

import java.util.*;
import java.io.*;

// SRM 319 Division II Level Three - 1000
// brute force, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6713&rd=9999
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm319
public class IncompleteBST {
  public String missingValues(String[] tree) {
    HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();

    for (int i = 0; i < tree.length; i++) {
      String[] tokens = tree[i].split("\\s+");
      int v = tokens[0].charAt(0) - 'A';
      int p = Integer.parseInt(tokens[1]);
      nodes.put(p, new Node(v));
    }

    Node root = nodes.get(1);
    buildTree(root, 1, nodes);

    String range = findRange(root, 0, 25);
    return range.indexOf('@') > -1 ? "" : range;
  }

  String findRange(Node n, int min, int max) {
    if (n == null) { return ""; }
    if (n.value != -2 && (n.value < min || n.value > max)) { return "@"; }

    String res = "";
    int vmin = n.value;
    int vmax = n.value;
    if (n.value == -2) { 
      vmax = findMin(n.R, max + 1);
      vmin = findMax(n.L, min);
      for (int i = vmin; i < vmax; i++) { res += (char)(i + 'A'); }
    }

    return res + findRange(n.L, min, vmax) + findRange(n.R, vmin + 1, max);
  }

  int findMin(Node n, int min) {
    if (n == null) { return min; }
    return findMin(n.L, n.value);
  }

  int findMax(Node n, int max) {
    if (n == null) { return max; }
    return findMax(n.R, n.value);
  }

  void buildTree(Node n, int p, HashMap<Integer, Node> nodes) {
    if (n == null) { return; }
    n.L = nodes.get(2 * p);
    n.R = nodes.get(2 * p + 1);
    buildTree(n.L, 2 * p, nodes);
    buildTree(n.R, 2 * p + 1, nodes);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public final int value;
    public Node L;
    public Node R;

    public Node(int value) {
      this.value = value;
    }

    public String toString() {
      return String.format("%s:%s", value, (char)(value + 'A'));
    }
  }
}
