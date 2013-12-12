package topc.graph;

import java.util.*;
import java.io.*;

// SRM 302 Division I Level One - 250
// graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6186&rd=9823
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm302
public class DivisorInc {
  public int countOperations(int N, int M) {
    if (M == N) { return 0; }
    if (isPrime(M)) { return -1; }

    Queue<Node> nodes = new LinkedList<Node>();
    boolean[] seen = new boolean[M];

    nodes.offer(new Node(N, 0));
    while (nodes.size() > 0) {
      Node top = nodes.poll();

      if (top.m == M) { return top.c; }
      if (top.m > M || seen[top.m]) { continue; }

      seen[top.m] = true;
      for (int i = 2; i < Math.sqrt(top.m) + 1; i++) {
        if (top.m % i == 0) {
          nodes.offer(new Node(top.m + i, top.c + 1));
          nodes.offer(new Node(top.m + top.m / i, top.c + 1));
        }
      }
    }

    return -1;
  }

  boolean isPrime(int n){
    if (n < 2)      { return false; }
    if (n == 2)     { return true;  }
    if (n % 2 == 0) { return false; }

    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) { return false; }
    }

    return true;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Node {
    public final int m;
    public final int c;

    public Node(int m, int c) {
      this.m = m;
      this.c = c;
    }
  }
}
