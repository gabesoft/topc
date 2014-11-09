package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 628 Division I Level Two - 500
// greedy, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13237&rd=16009
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+628
public class CircuitsConstruction {
  public int maximizeResistance(String circuit, int[] conductors) {
    Arrays.sort(conductors);

    return maximize(new Connection(circuit), conductors);
  }

  private int maximize(Connection c, int[] conductors) {
    int n = conductors.length;

    if (c.type == 0) {
      for (int i = n - 1; i >= 0; i--) {
        if (conductors[i] > 0) {
          int v = conductors[i];
          conductors[i] = 0;
          return v;
        }
      }

      return -1;
    } else if (c.type == 1) {
      return maximize(c.X, conductors) + maximize(c.Y, conductors);
    } else {
      int[] ca = conductors.clone();
      int[] cb = conductors.clone();
      int a    = maximize(c.X, ca);
      int b    = maximize(c.Y, cb);

      if (a > b) {
        for (int i = 0; i < n; i++) {
          conductors[i] = ca[i];
        }
      } else {
        for (int i = 0; i < n; i++) {
          conductors[i] = cb[i];
        }
      }

      return Math.max(a, b);
    }
  }

  public class Connection {
    public int type = 0;            // A: 1, B: 2, Leaf: 0
    public Connection X = null;
    public Connection Y = null;
    public String rest = "";

    public Connection(String input) {
      if (input.charAt(0) == 'A') {
        type = 1;
      } else if (input.charAt(0) == 'B') {
        type = 2;
      }

      int n = input.length();
      String r = input.substring(1, n);

      if (type > 0) {
        X = new Connection(r);
        Y = new Connection(X.rest);
        rest = Y.rest;
      } else {
        rest = r;
      }
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
