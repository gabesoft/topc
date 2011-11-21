package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 155 Division I Level Three - 1000
// recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1748&rd=4580
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm155
public class RedBlack {
  static final int BLK = 1;
  static final int RED = 2;
  final Node EMPTY = new Node(-1, 0, null, null);
  Node root;
  int count;

  public int numTwists(int[] keys) {
    root = null;
    count = 0;

    for (int i = 0; i < keys.length; i++) {
      insert(keys[i]);
    }

    return count;
  }

  void insert(int n) {
    root = (root == null) ? ins(n, EMPTY) : ins(n, root);
    root.color = BLK;
  }

  Node ins(int n, Node t) {
    if (t == EMPTY) { return new Node(n, RED, EMPTY, EMPTY); }

    if (n < t.value) { t.L = ins(n, t.L); }
    if (n > t.value) { t.R = ins(n, t.R); }

    if (t.L.color == RED && t.L.L.color == RED) {
      return twist(t.L.L, t.L, t, t.L.L.L, t.L.L.R, t.L.R, t.R);
    } 
    if (t.L.color == RED && t.L.R.color == RED) {
      return twist(t.L, t.L.R, t, t.L.L, t.L.R.L, t.L.R.R, t.R);
    }
    if (t.R.color == RED && t.R.L.color == RED) {
      return twist(t, t.R.L, t.R, t.L, t.R.L.L, t.R.L.R, t.R.R);
    }
    if (t.R.color == RED && t.R.R.color == RED) {
      return twist(t, t.R, t.R.R, t.L, t.R.L, t.R.R.L, t.R.R.R);
    }

    return t;
  }

  Node twist(Node x, Node y, Node z, Node T1, Node T2, Node T3, Node T4) {
    count++;

    y.L = x;
    y.R = z;
    x.L = T1;
    x.R = T2;
    z.L = T3;
    z.R = T4;

    x.color = BLK;
    y.color = RED;
    z.color = BLK;

    return y;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public int value;
    public int color;
    public Node L;  
    public Node R;

    public Node(int value, int color, Node left, Node right) {
      this.value = value;
      this.color = color;
      this.L = left;
      this.R = right;
    }

    public String toString() {
      return String.format("%s:%s", color == 1 ? "BLK" : "RED", value);
    }
  }
}
