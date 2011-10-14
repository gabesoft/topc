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
  int[][] subsets;
  double[][] prob;

  public double[] chances(int[] chips) {
    this.chips = chips;

    N = chips.length;
    S = arraySum(chips);
    C = (int)Math.round(S / 5.0);
    prob = new double[C][N];

    buildSubsets();

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
    //for (int i = 0; i < C; i++) {
    //debug(prob[i]);
    //}
    //for (int i = 0; i < N; i++) {
      //debug(i, subsets[i]);
    //}
    // -----------------------

    double[] res = new double[N];
    for (int i = 0; i < C; i++) {
      for (int j = 0; j < N; j++) {
        res[j] += prob[i][j];
      }
    }

    debug("res", res);
    return res;
  }

  void calcProb(int c, int k) {
    //for (int i = 0; i < N; i++) {
      //if (i == k) { continue; }
      //prob[c][k] += (prob[c - 1][i] * chips[k]) / (S - chips[i]);
    //}

    int[] sets = subsets[c - 1];
    debug(c, k, sets);

    for (int i = 0; i < sets.length; i++) {
      if (sets[i] == 0) { break; }
      if (((sets[i] >> k) & 1) == 1) { continue; };
      int idx = 0;
      double p = 1.0;
      double s = S;
      debug(i, "sets[i]", sets[i]);
      for (int j = 0; j < N; j++) {
        if (((sets[i] >> j) & 1) == 0) { continue; }
        // TODO: need to iterate through all perms here for p
        p *= prob[idx++][j];
        s -= chips[j];
        debug("idx", idx, "j", j, s);
      }
      prob[c][k] += p * (chips[k] / s);
    }
    debug("prob[c][k]", c, k, prob[c][k]);
  }

  void buildSubsets() {
    subsets = new int[N][1 << N];
    int[] idx = new int[N];
    for (int i = 1; i < 1 << N; i++) {
      int j = countBits(i);
      int k = idx[j - 1]++;
      subsets[j - 1][k] = i;
    }
  }

  int arraySum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < N; i++) { sum += chips[i]; }
    return sum;
  }

  int countBits(int n) {
    int sum = n;
    while (n != 0) { n = n >> 1; sum -= n; }
    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
