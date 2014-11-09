package topc.search;

import java.util.*;
import java.io.*;

// SRM 307 Division II Level Three - 1000
// search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6083&rd=9987
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm307
public class PreprimeNumbers {
  public int nthNumber(int n) {
    return sol1(n);
  }

  int sol1(int n) {
    int lim = Integer.MAX_VALUE / 300;
    int idx = 0;
    int pcount = 0;
    boolean[] prime = getPrimes(3000000);

    for (int i = 0; i < prime.length; i++) {
      if (prime[i]) { pcount++; }
    }

    int[] primes = new int[pcount];
    for (int i = 2; i < prime.length; i++) {
      if (prime[i]) { primes[idx++] = i; }
    }

    idx = 0;
    long[] nums = new long[1 << 21];
    for (int i = 0; i < primes.length && idx < nums.length; i++) {
      long cb = (long)primes[i] * (long)primes[i] * (long)primes[i];
      if (cb > 0) { nums[idx++] = cb; }
      if (cb < 0) { break; }
      for (int j = i + 1; j < primes.length && idx < nums.length; j++) {
        long v = (long)primes[i] * (long)primes[j];
        if (v > 0) { nums[idx++] = v; }
        if (v < 0 || v > lim) { break; }
      }
    }

    Arrays.sort(nums);
    return (int)nums[n + nums.length - idx - 1];
  }

  int sol2(int n) {
    int lim = 6000000;
    int cnt = 0;
    int[] divs = new int[lim];

    int i;
    for (i = 2; cnt < n; i++) {
      if (divs[i] == 0) {
        for (int j = 2 * i; j < lim; j += i) {
          int t = j;

          while (t % i == 0) {
            divs[j]++;
            t /= i;
          }

          if (t == 1) { divs[j]--; }
        }
      }

      if (divs[i] == 2) { cnt++; }
    }

    return i - 1;
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
