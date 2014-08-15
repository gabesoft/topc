package topc.graph;

import java.util.*;
import java.io.*;

// TCO14 Round 2C Division I Level Two - 500
// adj theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13251&rd=16016
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2014+Round+2c

@SuppressWarnings("unchecked")
public class CliqueGraph {
  public static final int INF = 123456789;

  public long calcSum(int N, int[] V, int[] sizes) {
    int Z = N + V.length;
    Object[] G = new Object[Z];
    ArrayList<Integer> S = new ArrayList<Integer>();

    S.add(0);
    int sum = 0;
    for (int sz : sizes) {
      sum += sz;
      S.add(sum);
    }

    for (int i = 0; i < sizes.length; i++) {
      for (int j = S.get(i); j < S.get(i + 1); j++) {
        if (G[V[j]] == null) {
          G[V[j]] = new ArrayList<Integer>();
        }
        if (G[N + i] == null) {
          G[N + i] = new ArrayList<Integer>();
        }

        ArrayList<Integer> gj = (ArrayList<Integer>)G[V[j]];
        ArrayList<Integer> gi = (ArrayList<Integer>)G[N + i];

        gj.add(N + i);
        gi.add(V[j]);
      }
    }

    long ans = 0;

    for (int n = 0; n < N; n++) {
      int[] D = new int[Z];

      Arrays.fill(D, INF);

      D[n] = 0;

      Queue<Integer> Q = new LinkedList<Integer>();
      Q.offer(n);

      while (Q.size() > 0) {
        int src = Q.poll();
        ArrayList<Integer> nodes = (ArrayList<Integer>)G[src];

        if (nodes == null) {
          nodes = new ArrayList<Integer>();
        }

        for (int dest : nodes) {
          if (D[dest] <= D[src] + 1) {
            continue;
          }
          D[dest] = D[src] + 1;
          Q.offer(dest);
        }
      }

      for (int i = n + 1; i < N; i++) {
        ans += D[i] / 2;
      }
    }

    return ans;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
