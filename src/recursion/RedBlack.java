package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 155 Division I Level Three - 1000
// recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1748&rd=4580
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm155
public class RedBlack {
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
    if (root == null) {
      root = new Node(n);
    } else {
      balance(insertRec(root, n));
    }
    if (root.red()) {
      root.makeBlack();
    }
  }

  void balance(Node n) {
    if (n == null || n.black()) { return; }
    if (n.parent == null || n.parent.black()) { return; }

    if (n.parent.left == n && n.parent.parent.left == n.parent) {
      balanceCase1(n);
    }
    else if (n.parent.right == n && n.parent.parent.left == n.parent) {
      balanceCase2(n);
    }
    else if (n.parent.left == n && n.parent.parent.right == n.parent) {
      balanceCase3(n);
    }
    else if (n.parent.right == n && n.parent.parent.right == n.parent) {
      balanceCase4(n);
    }
    else {
      assert false : "balance malfunction";
    }
  }

  void balanceCase1(Node n) {
    count++;

    Node x = n;
    Node y = x.parent;
    Node z = y.parent;

    updateParent(z, y);
    z.left(y.right);
    y.right(z);

    x.makeBlack();
    balanceContinue(z, y);
  }

  void balanceCase2(Node n) {
    count++;

    Node y = n;
    Node x = y.parent;
    Node z = x.parent;

    updateParent(z, y);
    x.right(y.left);
    z.left(y.right);
    y.left(x);
    y.right(z);

    x.makeBlack();
    balanceContinue(z, y);
  }

  void balanceCase3(Node n) {
    count++;

    Node y = n;
    Node z = y.parent;
    Node x = z.parent;

    updateParent(x, y);
    x.right(y.left);
    z.left(y.right);
    y.left(x);
    y.right(z);

    z.makeBlack();
    balanceContinue(x, y);
  }

  void balanceCase4(Node n) {
    count++;

    Node z = n;
    Node y = z.parent;
    Node x = y.parent;

    updateParent(x, y);
    x.right(y.left);
    y.left(x);

    z.makeBlack();
    balanceContinue(x, y);
  }

  void balanceContinue(Node oldAncestor, Node node) {
    if (oldAncestor == root) {
      root = node;
    } else {
      balance(node);
    }
  }

  void updateParent(Node from, Node to) {
    if (from.parent == null) {
      to.parent = null;
    } else {
      from.parent.replace(from, to);
    }
  }

  Node insertRec(Node parent, int n) {
    if (n > parent.value && parent.right != null) { return insertRec(parent.right, n); }
    if (n < parent.value && parent.left  != null) { return insertRec(parent.left,  n); }

    Node node = new Node(n);
    node.parent = parent;
    if (n > parent.value) {
      parent.right = node;
    } else {
      parent.left = node;
    }

    return node;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    boolean black;
    public final int value;
    public Node parent;
    public Node left;
    public Node right;

    public Node(int value) {
      this.value = value;
      this.black = false;
    }

    public void makeBlack() {
      assert !black : "node " + this + " is already black";
      black = true;
    }

    public boolean red() {
      return !black;
    }

    public boolean black() {
      return black;
    }

    public void left(Node n) {
      assert left != n : n + " is already the left child";
      left = n;
      if (n != null) { n.parent = this; }
    }

    public void right(Node n) {
      assert right != n : n + " is already the right child";
      right = n;
      if (n != null) { n.parent = this; }
    }

    public void replace(Node child, Node replacement) {
      assert left != right : "same child encountered";

      if (left == child) {
        left = replacement;
      }
      else if (right == child) {
        right = replacement;
      }
      else {
        assert false : "node: " + child + " is not a child of " + this;
      }
      replacement.parent = this;
    }

    public String toString() {
      return String.format("%s:%s", black ? "BLK" : "RED", value);
    }
  }
}
