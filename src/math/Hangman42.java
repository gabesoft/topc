package topc.math;

import java.util.*;
import java.io.*;

// SRM 229 Division I Level Three - 1000
// math, recursion, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3068&rd=6518
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm229
public class Hangman42 {
  static public final int A = 97;
  static public final int Z = 122 - A + 1;
  int N;    // number of words
  int M;    // number of letters per word
  long[][] states;
  double[] memo;

  public double probability(String[] words) {
    N = words.length;
    M = words[0].length();
    memo = new double[1 << N];
    states = new long[Z][N];

    Arrays.fill(memo, -1.0);

    for (int i = 0; i < Z; i++) {
      for (int j = 0; j < N; j++) {
        for (int k = 0; k < M; k++) {
          if (words[j].charAt(k) == A + i) {
            states[i][j] |= (1L << k);
          }
        }
      }
    }

    return win(0);
  }

  double win(int state) {
    if (countOnes(state) == N - 1) { return 1; }
    if (memo[state] > -1) { return memo[state]; }

    double ret = 0.0;

    for (int i = 0; i < Z; i++) {
      double prob = 0.0;
      int count = 0;

      for (int j = 0; j < N; j++) {
        if ((state >> j & 1) == 1) { continue; }

        count++;
        int next = state;
        for (int k = 0; k < N; k++) {
          if ((state >> k & 1) == 1) { continue; }
          if (states[i][j] == states[i][k]) { continue; }
          next |= (1 << k);
        }

        if (next == state) { continue; }

        if (states[i][j] == 0) {
          prob += 1 - win(next);
        } else {
          prob += win(next);
        }
      }

      prob /= count;

      ret = Math.max(ret, prob);
    }

    memo[state] = ret;
    return ret;
  }

  int countOnes(int mask) {
    int n = 0;
    while (mask != 0) {
      n++;
      mask = mask & (mask - 1);
    }
    return n;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
