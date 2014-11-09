package topc.easy;

import java.util.*;
import java.io.*;

// SRM 592 Division II Level Three - 1000
// brute force, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12704&rd=15704
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+592
public class LittleElephantAndArray {
  public static final int MOD = 1000000007;

  public int getNumber(long A, int N) {
    long[] F = new long[] { 1L };
    long[] prev = new long[] { Long.MIN_VALUE };

    for (long n = 0; n <= N; n++) {
      long a = A + n;
      String s = Long.valueOf(a).toString();
      int L = s.length();
      long[] x = new long[(1 << L) - 1];
      int idx = 0;


      for (int m = 1; m < (1 << L); m++) {
        x[idx] = 0;
        for (int i = 0; i < L; i++) {
          if ((m & (1 << i)) != 0) {
            x[idx] = x[idx] * 10 + (s.charAt(i) - '0');
          }
        }
        idx++;
      }

      long[] NF = new long[x.length];
      Arrays.sort(x);

      int j = 0;
      for (int i = 0; i < x.length; i++) {
        if (x[i] < prev[0]) { continue; }
        if (i > 0) {
          NF[i] += NF[i - 1];
        }
        while (j + 1 < prev.length && prev[j + 1] <= x[i]) {
          j++;
        }

        NF[i] += F[j];
        NF[i] %= MOD;
      }

      F = NF;
      prev = x;
    }

    return (int)F[prev.length - 1];
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
