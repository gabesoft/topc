package topc.easy;

import java.util.*;
import java.io.*;

// SRM 609 Division II Level Two - 500
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12995&rd=15842
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+609
public class PackingBallsDiv2 {
  private static int[][][] mem = new int[101][101][101];

  public int minPacks(int R, int G, int B) {
    if (R == 0 && G == 0 && B == 0) { return 0; }
    if (mem[R][G][B] > 0) { return mem[R][G][B]; }

    int best = 99999999;
    if (R > 0 || G > 0 || B > 0) {
      best = Math.min(best, 1 + minPacks(pos(R - 1), pos(G - 1), pos(B - 1)));
    }

    if (R > 0) {
      best = Math.min(best, 1 + minPacks(pos(R - 3), G, B));
    }

    if (G > 0) {
      best = Math.min(best, 1 + minPacks(R, pos(G - 3), B));
    }

    if (B > 0) {
      best = Math.min(best, 1 + minPacks(R, G, pos(B - 3)));
    }

    mem[R][G][B] = best;
    return best;
  }

  private int pos(int x) {
    return x > -1 ? x : 0;
  }
}
