package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 435 Division II Level Three - 1000
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10243&rd=13697
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+435
public class BirdsCounting {
  long[][] bc;

  public double computeProbability(int birdsNumber, int caughtPerDay, int daysNumber, int birdsMarked) {
    buildBinomialCoefficientTable(birdsNumber);

    double[][] prob = new double[daysNumber + 1][birdsNumber + 1];
    double p = 1.0 / bc[birdsNumber][caughtPerDay];

    prob[1][caughtPerDay] = 1.0;
    for (int d = 2; d < daysNumber + 1; d++) {
      for (int i = caughtPerDay; i < birdsNumber + 1; i++) {
        for (int j = i; j >= i - caughtPerDay; j--) {
          prob[d][i] += p * prob[d - 1][j] * bc[j][caughtPerDay - (i - j)] * bc[birdsNumber - j][i - j];
        }
      }
    }

    return prob[daysNumber][birdsMarked];
  }

  void buildBinomialCoefficientTable(int n) {
    n = n + 1;
    bc = new long[n][n];

    for (int i = 0; i < n; i++) {
      bc[i][0] = 1L;
      bc[i][i] = 1L;
    }

    for (int i = 1; i < n; i++) {
      for (int j = 1; j < i; j++) {
        bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
      }
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
