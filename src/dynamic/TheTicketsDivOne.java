package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 504.5 Division I Level Three - 900
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11098&rd=14514
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+504.5
public class TheTicketsDivOne {
  public double find(int n, int m) {
    double[][] dp = new double[n + 1][n + 1];

    dp[1][1] = 1.0;

    double k2 = 1.0 / 2.0;
    double k3 = 1.0 / 3.0;
    double k6 = 1.0 / 6.0;

    for (int i = 2; i < n + 1; i++) {
      double a = 1;
      double b = 0;

      for (int j = 2; j < i + 1; j++) {
        double atemp = k2 * a;
        double btemp = k2 * b + k3 * dp[i - 1][j - 1];
        a = atemp;
        b = btemp;
      }

      dp[i][1] = (k6 + k2 * b) / (1.0 - k2 * a);

      for (int j = 2; j < i + 1; j++) {
        dp[i][j] = k2 * dp[i][j - 1] + k3 * dp[i - 1][j - 1];
      }
    }

    return dp[n][m];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
