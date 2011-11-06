package topc.easy;

import java.util.*;
import java.io.*;

// SRM 259 Division II Level Two - 600
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4475&rd=8012
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm259
public class PrimePolynom {
  public int reveal(int A, int B, int C) {
    int m = 0;
    while (true) {
      int v = A * m * m + B * m + C;
      if (!isPrime(v)) { return m; };
      m++;
    }
  }

  boolean isPrime(int n){
    if (n < 2)      { return false; }
    if (n == 2)     { return true;  }
    if (n % 2 == 0) { return false; }

    for (int i = 3; i * i <= n; i += 2) {
      if (n % i == 0) { return false; }
    }

    return true;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
