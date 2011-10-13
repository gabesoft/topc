package topc.math;

import java.util.*;
import java.io.*;

// SRM 199 Division I Level Two - 500
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2436&rd=5074
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm199
public class ChipRace {
  int N; // number of players
  int C; // number of chips to be awarded
  int S; // sum of odd chips
  int[] chips;
  double[][] prob;

  public double[] chances(int[] chips) {
    this.chips = chips;

    N = chips.length;
    S = sum(chips);
    C = (int)Math.round(S / 5.0);
    prob = new double[C][N];

    for (int i = 0; i < N; i++) {
      prob[0][i] = (double)chips[i] / S;
    }

    for (int i = 1; i < C; i++) {
      for (int j = 0; j < N; j++) {
        calcProb(i, j);
      }
    }

    // TODO: remove debug code
    debug(C, S, N);
    for (int i = 0; i < C; i++) {
      debug(prob[i]);
    }
    // -----------------------

    double[] res = new double[N];
    for (int i = 0; i < C; i++) {
      for (int j = 0; j < N; j++) {
        res[j] += prob[i][j];
      }
    }

    return res;
  }

  void calcProb(int c, int p) {
    for (int i = 0; i < N; i++) {
      if (i == p) { continue; }
      prob[c][p] += (prob[c - 1][i] * chips[p]) / (S - chips[i]);
    }
  }

  int sum(int[] arr) {
    int res = 0;
    for (int i = 0; i < N; i++) { res += chips[i]; }
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
