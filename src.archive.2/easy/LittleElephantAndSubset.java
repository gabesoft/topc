package topc.easy;

import java.util.*;
import java.io.*;

// SRM 597 Division II Level Three - 1000
// brute force, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12761&rd=15709
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+597
public class LittleElephantAndSubset {
  static final int MOD = 1000000007;
  String M;
  int F[];
  int partition[];
  int pn;
  long total;
  int ways;


  public int getNumber(int N) {
    partition = new int[10];
    F         = new int[11];
    M         = "" + N;
    pn        = 0;
    total     = 0;
    ways      = 0;

    F[0] = 1;
    for (int i = 1; i < 11; i++) {
      F[i] = (F[i - 1] * i) % MOD;
    }

    backtrack(0);
    return (int)((total + MOD - 1) % MOD);
  }

  private void backtrack(int d) {
    if (d == 10) {
      long x = 1;
      for (int i = 0; i < pn; i++) {
        x = (x * subProblem(partition[i])) % MOD;
      }
      total += x;
      ways++;
    } else {
      for (int i = 0; i < pn; i++) {
        partition[i] ^= (1 << d);
        backtrack(d + 1);
        partition[i] ^= (1 << d);
      }

      partition[pn++] = (1 << d);
      backtrack(d + 1);
      pn--;

      backtrack(d + 1);
    }
  }

  private long subProblem(int D) {
    int c = Integer.bitCount(D);
    if (c < M.length()) {
      boolean hasZero = (D & 1) != 0;
      if (!hasZero) {
        return F[c];
      } else {
        return (c - 1) * F[c - 1];
      }
    } else if (c > M.length()) {
      return 0;
    } else {
      long s = 0;
      for (int i = 0; i <= M.length(); i++) {
        long p = 1;
        int tem = D;
        for (int j = 0; j < i; j++) {
          int d = M.charAt(j) - '0';
          if ((tem & (1 << d)) != 0) {
            tem ^= (1 << d);
          } else {
            p = 0;
          }
        }

        int rem = Integer.bitCount(tem);
        if (i < M.length()) {
          int v = 0;
          for (int d = 0; d < M.charAt(i) - '0'; d++) {
            if (d == 0 && i == 0) { continue; }
            if ((tem & (1 << d)) == 0) { continue; }
            v++;
          }
          p *= v;
          rem--;
        }

        p *= F[rem];
        s += p;
      }

      return s % MOD;
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
