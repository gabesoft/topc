package topc.math;

import java.util.*;
import java.io.*;

// SRM 155 Division II Level Two - 500
// math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1348&rd=4580
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm155
public class BenfordsLaw {
  static public final double DELTA = 0.000001;

  public int questionableDigit(int[] transactions, int threshold) {
    int n = transactions.length;
    int e = 0;
    int a = 1;
    double[][] freq = new double[9][2];

    for (int i = 0; i < 9; i++) {
      freq[i][e] = (double)n * Math.log10(1.0 + 1.0/(i + 1.0));
    }

    for (int i = 0; i < n; i++) {
      freq[firstDigit(transactions[i]) - 1][a]++;
    }

    int digit = Integer.MAX_VALUE;
    for (int i = 0; i < 9; i++) {
      if (freq[i][a] == 0.0) { 
        digit = Math.min(digit, i + 1);
      } else {
        double dx = Math.max(freq[i][e], freq[i][a]) / Math.min(freq[i][e], freq[i][a]);
        if (dx >= threshold) {
          digit = Math.min(digit, i + 1);
        }
      }
    }

    return digit == Integer.MAX_VALUE ? -1 : digit;
  }

  public static int firstDigit(int n) {
    while (n < -9 || 9 < n) { n /= 10; }
    return Math.abs(n);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
