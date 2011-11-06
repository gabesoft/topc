package topc.easy;

import java.util.*;
import java.io.*;

// SRM 223 Division I Level Two - 500
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3458&rd=5869
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm223
public class PrimeAnagrams {
  boolean[] prime;
  int[] digits;
  int p1 = 0;
  int p2 = 0;
  int p3 = 0;

  public int[] primes(String anagram) {
    prime = getPrimes();
    digits = new int[anagram.length()];

    for (int i = 0; i < anagram.length(); i++) {
      digits[i] = anagram.charAt(i) - '0';
    }

    perms(new int[digits.length], 0, 0);

    int[] res = p1 == 0 ? new int[] {} : new int[] { p1, p2, p3 };
    Arrays.sort(res);

    return res;
  }

  void perms(int[] d, int i, int free) {
    if (i == d.length) {
      check(d);
    } else {
      int[] copy = d.clone();
      for (int j = 0; j < digits.length; j++) {
        if ((free >> j & 1) == 0) {
          copy[i] = digits[j];
          perms(copy, i + 1, (free | (1 << j)));
        }
      }
    }
  }

  void check(int[] digits) {
    for (int i = 0; i < digits.length - 2; i++) {
      int n1 = num(digits, 0, i);
      if (!prime[n1]) { continue; }

      for (int j = i + 1; j < digits.length - 1; j++) {
        int n2 = num(digits, i + 1, j);
        if (!prime[n2]) { continue; }
        int n3 = num(digits, j + 1, digits.length - 1);

        if (prime[n3] && (p1 == 0 || p1 * p2 * p3 > n1 * n2 * n3)) {
          p1 = n1;
          p2 = n2;
          p3 = n3;
        }
      }
    }
  }

  int num(int[] digits, int s, int e) {
    if (digits[s] == 0) { return 0; }

    int n = digits[s];
    for (int i = s + 1; i < e + 1; i++) {
      n *= 10;
      n += digits[i];
    }

    return n;
  }

  boolean[] getPrimes() {
    boolean[] primes = new boolean[1000000];

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
