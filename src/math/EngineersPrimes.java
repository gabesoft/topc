package topc.math;

import java.util.*;
import java.io.*;

// SRM 181 Division II Level Three - 950
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2017&rd=4725
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm181
public class EngineersPrimes {
  public long smallestNonPrime(int N) {
    int pcount = 0;
    boolean[] prime = getPrimes(2000000);

    for (int i = 0; i < prime.length; i++) {
      if (prime[i]) { pcount++; }
    }

    int idx = 0;
    int[] primes = new int[pcount];
    for (int i = 2; i < prime.length; i++) {
      if (idx == primes.length) { break; }
      if (prime[i]) {
        primes[idx++] = i;
      }
    }

    return (long)primes[N] * (long)primes[N];
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
