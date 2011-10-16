package topc.math;

import java.util.*;
import java.io.*;

// SRM 243 Division I Level Two - 500
// advanced math, brute force, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4453&rd=7218
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm243
public class TopFive {
  int[][] scores;
  double[][] probs;

  public double findProbability(String[] results, String[] accuracies, int points) {
    int n = results.length;
    int k = 5;

    scores = new int[n][3];
    probs = new double[n][3];
    for (int i = 0; i < n; i++) {
      String[] rtokens = results[i].split("\\s+");
      String[] atokens = accuracies[i].split("\\s+");
      for (int j = 0; j < 3; j++) {
        scores[i][j] = Integer.parseInt(rtokens[j]);
        probs[i][j] = Double.parseDouble(atokens[j]) / 100.0;
      }
    }

    double[] ans = new double[k];
    Arrays.fill(ans, 1.0);

    for (int i = 0; i < n; i++) {
      double otherBetter = probBetter(i, points);

      for (int j = k - 1; j > 0; j--) {
        ans[j] = otherBetter * ans[j - 1] + (1 - otherBetter) * ans[j];
      }

      ans[0] = (1 - otherBetter) * ans[0];
    }

    return ans[k - 1];
  }

  double probBetter(int i, int points) {
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
          if (j * s1 + k * s2 + l * s3 >= points) {
            double prob1 = (j == 0) ? (1 - p1) : p1;
            double prob2 = (k == 0) ? (1 - p2) : p2;
            double prob3 = (l == 0) ? (1 - p3) : p3;
            prob += prob1 * prob2 * prob3;
          }
        }
      }
    }

    return prob;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
