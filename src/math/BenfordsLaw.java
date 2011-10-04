package topc.math;

import java.util.*;
import java.io.*;

// SRM 155 Division II Level Two - 500
// math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1348&rd=4580
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm155
public class BenfordsLaw {
  public int questionableDigit(int[] transactions, int threshold) {
    int n = transactions.length;

    double[] freq = new double[9];
    for (int i = 0; i < n; i++) {
      freq[firstDigit(transactions[i]) - 1]++;
    }

    int digit = Integer.MAX_VALUE;
    for (int i = 0; i < 9; i++) {
      if (freq[i] == 0.0) { 
        digit = Math.min(digit, i + 1);
      } else {
        double expected = (double)n * Math.log10(1.0 + 1.0/(i + 1.0));
        double dx = Math.max(expected, freq[i]) / Math.min(expected, freq[i]);
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
