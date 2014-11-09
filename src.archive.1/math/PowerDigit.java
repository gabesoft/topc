package topc.math;

import java.util.*;
import java.io.*;

// TCO06 Round 2 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4515&rd=9891
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tco06_online_rd_2
public class PowerDigit {
  public int digitK(int x, int y, int k) {
    int m = (int)Math.pow(10, k + 1);
    int n = powmod(x, y, m);
    return n == -1 ? n : n / (m / 10);
  }

  int powmod(int a, int b, int mod) {
    long x = 1;
    long y = a;
    long w = mod / 10;
    boolean larger = w == 1;

    while (b > 0) {
      if (b % 2 == 1) {
        larger |= (x * y) >= w;
        x = (x * y) % mod;
      }
      if (b > 1) {
        larger |= (y * y) >= w;
      }
      y = (y * y) % mod;
      b = b / 2;
    }

    return larger ? (int)(x % mod) : -1;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
