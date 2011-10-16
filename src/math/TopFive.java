package topc.math;

import java.util.*;
import java.io.*;

// SRM 243 Division I Level Two - 500
// advanced math, brute force, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4453&rd=7218
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm243
public class TopFive {
  int N;
  int S;
  int[][] scores;
  double[][] probs;
  double[] pbetter;
  boolean[] memo;

  public double findProbability(String[] results, String[] accuracies, int points) {
    N = results.length;
    S = points;

    memo = new boolean[(1 << N) + 1];

    scores = new int[N][3];
    probs = new double[N][3];

    for (int i = 0; i < N; i++) {
      String[] rtokens = results[i].split("\\s+");
      String[] atokens = accuracies[i].split("\\s+");
      for (int j = 0; j < 3; j++) {
        scores[i][j] = Integer.parseInt(rtokens[j]);
        probs[i][j] = Double.parseDouble(atokens[j]) / 100.0;
      }
    }

    pbetter = new double[N];
    for (int i = 0; i < N; i++) {
      pbetter[i] = probBetter(i);
    }

    debug("scores", scores);
    debug("probs", probs);
    debug("pbetter", pbetter);

    return rec(4, 0);
  }

  double rec(int top, int excluded) {
    if (memo[excluded] || top < 0) { return 0.0; };

    double p = 1.0;
    for (int i = 0; i < N; i++) {
      if (((excluded >> i) & 1) == 1) { continue; }
      p *= pbetter[i];
    }

    for (int i = 0; i < N; i++) {
      if (((excluded >> i) & 1) == 1) { continue; }
      p += (1.0 - pbetter[i]) * rec(top - 1, excluded | (1 << i));
    }

    memo[excluded] = true;
    return p;
  }

  double probBetter(int i) {
    int s1 = scores[i][0];
    int s2 = scores[i][1];
    int s3 = scores[i][2];

    double p1 = probs[i][0];
    double p2 = probs[i][1];
    double p3 = probs[i][2];

    double prob = 0.0;
    for (int j = 0; j < 2; j++) {
      for (int k = 0; k < 2; k++) {
        for (int l = 0; l < 2; l++) {
          if (j * s1 + k * s2 + l * s3 >= S) {
            double prob1 = (j == 0) ? (1 - p1) : p1;
            double prob2 = (k == 0) ? (1 - p2) : p2;
            double prob3 = (l == 0) ? (1 - p3) : p3;
            prob += prob1 * prob2 * prob3;
          }
        }
      }
    }

    return 1 - prob;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
