package topc.dynamic;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 518 Division I Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11469&rd=14543
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+518
public class Nim {
  static final long MOD = 1000000007L;
  int L;
  int N;
  long INV2;

  public int count(int K, int L) {
    this.L = L;
    this.N = 1 << 16;
    this.INV2 = pow(2, MOD - 2);

    boolean[] primes = getPrimes(N);
    long[] base = new long[N];

    for (int i = 2; i < L + 1; i++) {
      base[i] = primes[i] ? 1 : 0;
    }

    transform(base, 0, N);

    for (int i = 0; i < N; i++) {
      base[i] = pow(base[i], K);
    }

    untransform(base, 0, N);

    return (int)base[0];
  }

  void transform(long[] a, int i, int j) {
    if (i == j - 1) { return; }

    int half = (j - i) / 2;

    transform(a, i, i + half);
    transform(a, i + half, j);

    for (int k = i; k < i + half; k++) {
      long x1 = a[k];
      long x2 = a[k + half];
      a[k]        = (x1 - x2 + MOD) % MOD;
      a[k + half] = (x1 + x2) % MOD;
    }
  }

  void untransform(long[] a, int i, int j) {
    if (i == j - 1) { return; }

    int half = (j - i) / 2;

    for (int k = i; k < i + half; k++) {
      long y1 = a[k];
      long y2 = a[k + half];
      a[k]        = ((y1 + y2) * INV2) % MOD;
      a[k + half] = ((y2 - y1 + MOD) * INV2) % MOD;
    }

    untransform(a, i, i + half);
    untransform(a, i + half, j);
  }

  long pow(long x, long y) {
    long r = 1;
    long a = x;
    while (y > 0) {
      r = (y % 2 == 1) ? (r * a) % MOD : r;
      a = (a * a) % MOD;
      y = (y / 2);
    }
    return r;
  }

  boolean[] getPrimes(int n) {
    boolean[] primes = new boolean[n + 1];

    Arrays.fill(primes, true);
    primes[0] = false;
    primes[1] = false;

    for (int i = 2; i < Math.sqrt(primes.length) + 1; i++) {
      if (primes[i]) {
        for (int j = i * i; j < primes.length; j += i) {
          primes[j] = false;
        }
      }
    }

    return primes;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
