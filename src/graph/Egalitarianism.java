package topc.graph;

import java.util.*;
import java.io.*;

// SRM 584 Division I Level One - 250
// graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12613&rd=15696
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+584
public class Egalitarianism {
  public int maxDifference(String[] isFriend, int d) {
    int n = isFriend.length;
    int best = bfs(isFriend, d, 0);

    if (best == -1) { return -1; }

    for (int i = 1; i < n; i++) {
      best = Math.max(best, bfs(isFriend, d, i));
    }

    return best;
}

  private int bfs(String[] isFriend, int d, int u) {
    int n = isFriend.length;
    boolean[] seen = new boolean[n];
    Queue<Integer> Q = new LinkedList<Integer>();
    Q.offer(u);
    Q.offer(0);

    int best = 0;
    int cnt  = 0;

    while (Q.size() > 0) {
      int v = Q.poll();
      int x = Q.poll();

      if (seen[v]) { continue; }

      best = Math.max(best, x);
      seen[v] = true;
      cnt++;

      for (int i = 0; i < n; i++) {
        if (isFriend[v].charAt(i) == 'Y') {
          Q.offer(i);
          Q.offer(x + d);
        }
      }
    }

    return cnt < n ? -1 : best;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
