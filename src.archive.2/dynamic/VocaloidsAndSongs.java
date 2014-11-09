package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 609 Division II Level Three - 950
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12989&rd=15842
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+609
public class VocaloidsAndSongs {
  private final int MOD = 1000000007;
  private static int[][][][] mem;

  static {
    mem = new int[51][51][51][51];
    for (int i = 0; i < mem.length; i++) {
      for (int j = 0; j < mem[i].length; j++) {
        for (int k = 0; k < mem[i][j].length; k++) {
          Arrays.fill(mem[i][j][k], -1);
        }
      }
    }
  }

  public int count(int S, int a, int b, int c) {
    if (mem[S][a][b][c] > -1) { return mem[S][a][b][c]; }

    int res = -1;

    if (S == 0) {
      res = (a == 0 && b == 0 && c == 0) ? 1 : 0;
    } else {
      res = 0;

      for (int na = a; na >= a - 1 && na >= 0; na--) {
        for (int nb = b; nb >= b - 1 && nb >= 0; nb--) {
          for (int nc = c; nc >= c - 1 && nc >= 0; nc--) {
            if (na != a || nb != b || nc != c) {
              res = (res + count(S - 1, na, nb, nc)) % MOD;
            }
          }
        }
      }
    }

    mem[S][a][b][c] = res;

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
