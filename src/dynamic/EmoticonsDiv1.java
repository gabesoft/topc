package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 612 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10543&rd=15845
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+612
public class EmoticonsDiv1 {
  private static final int INF = 0x70707070;

  public int printSmiles(int smiles) {
    int dist[][] = new int[2 * smiles + 1][1000];

    for (int i = 0; i < dist.length; i++) {
      Arrays.fill(dist[i], INF);
    }

    dist[1][0] = 0;

    Queue<Integer> Q = new LinkedList<Integer>();
    Q.offer(1);
    Q.offer(0);

    while (Q.size() > 0) {
      int s = Q.poll();
      int c = Q.poll();

      if ((s + c <= 2 * smiles) && dist[s + c][c] >= INF) {
        dist[s + c][c] = dist[s][c] + 1;
        Q.offer(s + c);
        Q.offer(c);
      }

      if (s < smiles && dist[s][s] >= INF) {
        dist[s][s] = dist[s][c] + 1;
        Q.offer(s);
        Q.offer(s);
      }

      if (s > 1 && dist[s - 1][c] >= INF) {
        dist[s - 1][c] = dist[s][c]  + 1;
        Q.offer(s - 1);
        Q.offer(c);
      }
    }

    int res = smiles;

    for (int c = 1; c < smiles; c++) {
      res = Math.min(res, dist[smiles][c]);
    }

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
