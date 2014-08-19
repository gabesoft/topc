package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 612 Division II Level Two - 500
// dynamic programming, graph theory, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13041&rd=15845
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+612
public class EmoticonsDiv2 {
  private static final int INF = 1 << 30;
  private int all;

  public int printSmiles(int smiles) {
    all = smiles;
    return find(1, 1, 1);
  }

  private int find(int steps, int clipboard, int done) {
    if (done == all) { return steps; }
    if (done > all) { return INF; }

    int a = find(steps + 1, clipboard, done + clipboard);
    int b = find(steps + 2, done, done + done);

    return Math.min(a, b);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
