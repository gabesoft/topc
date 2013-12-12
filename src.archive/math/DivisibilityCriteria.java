package topc.math;

import java.util.*;
import java.io.*;

// SRM 239 Division II Level Three - 1000
// math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4481&rd=6538
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm239
public class DivisibilityCriteria {
  public int[] multipliers(int N, int P) {
    return sol2(N, P);
  }

  int[] sol1(int N, int P) {
    int[] res = new int[N];
    res[0] = 1;

    if (N > 1) {
      res[1] = P > 10 ? 10 : 0;
    }

    long n = P;
    for (int i = P > 10 ? 2 : 1; i < N; i++) {
      n = getN(n, i);

      int[] digits = getDigits(n, i + 1);
      int s = 0;
      for (int j = 0; j < i; j++) {
        s += res[j] * digits[j];
      }

      for (int j = 0; j < P; j++) {
        if ((s + j * digits[i]) % P == 0) {
          res[i] = j;
          break;
        }
      }
    }

    reverse(res);
    return res;
  }

  int[] sol2(int N, int P) {
    int[] res = new int[N];

    int mult = 1;
    for (int i = N - 1; i >= 0; i--) {
      res[i] = mult;
      mult = mult * 10 % P;
    }

    return res;
  }

  long getN(long n, int width) {
    return n * 7L < Math.pow(10L, width) ? n * 13L : n * 7L;
  }

  int[] getDigits(long n, int c) {
    int[] digits = new int[c];
    for (int i = 0; i < digits.length; i++) {
      digits[i] = (int)(n % 10L);
      n /= 10L;
    }
    return digits;
  }

  void reverse(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = temp;
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
