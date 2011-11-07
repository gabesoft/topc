package topc.easy;

import java.util.*;
import java.io.*;

// SRM 303 Division II Level Three - 1000
// brute force, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6063&rd=9824
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm303
public class PrimePalindromic {
  boolean[] prime;

  public int count(int A, int B) {
    prime = getPrimes(B);

    int count = 0;
    for (int i = A; i < B + 1; i++) {
      if (palindromic(i)) {
        count++;
      }
    }

    return count;
  }

  boolean palindromic(int n) {
    int[] factors = new int[n + 1];
    int k = 0;

    for (int i = 2; i < n + 1; i++) {
      if (prime[i]) {
        int pow = 0;

        for (int j = i; (j <= n) && (n % j == 0); j *= i) { pow++; }

        if (pow > 0) { factors[k++] = i; }
        if (pow > 0 && pow % 2 == 0) { factors[k++] = i; }
      }
    }

    return check(factors, new int[k], 0, 0);
  }

  boolean check(int[] factors, int[] perm, int i, int seen) {
    if (i == perm.length) {
      StringBuilder builder = new StringBuilder();
      for (int j = 0; j < perm.length; j++) {
        builder.append(perm[j]);
      }

      String s = builder.toString();
      for (int j = 0; j < s.length() / 2; j++) {
        if (s.charAt(j) != s.charAt(s.length() - j - 1)) {
          return false;
        }
      }

      return true;
    } else {
      int[] copy = perm.clone();
      for (int j = 0; j < perm.length; j++) {
        if ((seen >> j & 1) == 0) {
          copy[i] = factors[j];
          if (check(factors, copy, i + 1, seen | (1 << j))) {
            return true;
          }
        }
      }

      return false;
    }
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
