package topc.easy;

import java.util.*;
import java.io.*;

// SRM 553 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11354&rd=15175
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+553
public class Suminator {
  public int findMissing(int[] program, int wantedResult) {
    int x = -1;
    for (int i = 0; i < program.length; i++) {
      if (program[i] == -1) {
        x = i;
      }
    }

    program[x] = 0;

    if (result(program).v == wantedResult) {
      return 0;
    }

    program[x] = -1;

    Node r = result(program);
    int res = -1;

    if (r.wcard && wantedResult - r.v - 1 > 0) {
      res = (int)(wantedResult - r.v - 1);
    }

    return res;
  }

  private Node result(int[] p) {
    Stack<Node> stack = new Stack<Node>();

    for (int i = 0; i < p.length; i++) {
      if (p[i] == 0) {
        Node x = stack.size() > 0 ? stack.pop() : new Node(0);
        Node y = stack.size() > 0 ? stack.pop() : new Node(0);
        stack.push(x.add(y));
      } else {
        stack.push(new Node(p[i]));
      }
    }

    return stack.size() > 0 ? stack.pop() : new Node(0);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  public class Node {
    public long v;
    public boolean wcard;

    public Node(long v) {
      this(v, v == -1);
    }

    public Node (long v, boolean wcard) {
      this.v = v;
      this.wcard = wcard;
    }

    public Node add(Node n) {
      return new Node(v + n.v, wcard || n.wcard);
    }

    public String toString() {
      return v + ":" + wcard;
    }
  }
}
