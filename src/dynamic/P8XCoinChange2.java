package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 527 Division I Level Three - 1050
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11155&rd=14552
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+527
public class P8XCoinChange2 {
  public int solve(long coins_sum, long[] values) {
    Poly p = new Poly(new long[] { 1 });

    for (int i = 1; i < values.length; i++) {
      long div = values[i] / values[i - 1];
      p = p.sum(coins_sum % div, div);
      coins_sum = coins_sum / div;
    }

    return (int)p.value(coins_sum);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}

class Poly {
  static final int MOD = 1000003;
  static final long[] reverse;
  static final long[][] bc;

  final long[] values;

  static {
    int k = 101;
    bc = Util.binomialCoefficient(k, MOD);
    reverse = new long[k];
    for (int i = 0; i < reverse.length; i++) {
      reverse[i] = Util.reverse(i, MOD);
    }
  }

  public Poly(long[] values) {
    this.values = values;
  }

  public Poly sum(long first, long step) {
    long[] values = new long[this.values.length + 1];
    long x = first % MOD;

    values[0] = value(x);
    for (int i = 1; i < values.length; i++) {
      x = (x + step) % MOD;
      values[i] = (value(x) + values[i - 1]) % MOD;
    }

    return new Poly(values);
  }

  public long value(long x) {
    x = x % MOD;
    if (x < values.length) { 
      return values[(int)x]; 
    } else {
      return interpolate(x);
    }
  }

  private long interpolate(long x) {
    long pow = 1;
    long res = 0;

    for (int i = 0; i < values.length; i++) {
      long val = 0;

      for (int j = 0; j < i + 1; j++) {
        if (((i - j) & 1) == 0) {
          val += values[j] * bc[i][j] % MOD;
        } else {
          val -= values[j] * bc[i][j] % MOD;
        }
      }

      res += val * pow % MOD;
      pow *= (x - i);
      pow %= MOD;
      pow *= reverse[i + 1];
      pow %= MOD;
    }

    res %= MOD;
    res += MOD;
    res %= MOD;

    return res;
  }
}

class Util {
  public static long[][] binomialCoefficient(long n, long mod) {
    long[][] bc = new long[(int)n + 1][(int)n + 1];
    if (mod == 1) { return bc; }

    for (int i = 0; i < n + 1; i++) {
      bc[i][0] = 1;
      for (int j = 1; j < i + 1; j++) {
        bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
        bc[i][j] = (bc[i][j] >= mod) ? (bc[i][j] - mod) : bc[i][j];
      }
    }

    return bc;
  }

  public static long pow(long base, long exp, long mod) {
    if (exp == 0) { return 1; }
    long res = pow(base, exp >> 1, mod);
    res = res * res % mod;
    res = (exp % 2 != 0) ? res * base % mod : res;
    return res;
  }

  public static long reverse(long n, long mod) {
    return pow(n, mod - 2, mod);
  }
}
