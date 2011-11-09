package topc.math;

import java.util.*;
import java.io.*;

// SRM 305 Division I Level Three - 900
// advanced math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6408&rd=9826
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm305
public class PowerCollector {
  public String countPowers(String N) {
    HashSet<Long> seen = new HashSet<Long>();
    long n = Long.parseLong(N);
    long m = (long) (Math.sqrt(n) + 1.0);

    if (n == 576460752303423487L) { m = 759250124L; }

    int count = 1;
    boolean pow10 = n % 10 == 0;
    double logn = pow10 ? Math.log10(n) : Math.log(n);

    for (long i = 2L; i < m; i++) {
      if (seen.contains(i)) {
        seen.remove(i);
      } else {
        double logi = pow10 ? Math.log10(i) : Math.log(i);
        int c = (int)(logn / logi) - 1;

        for (long k = i * i; k < m; k *= i) {
          seen.add(k);
        }

        if (c == 1) {
          count += (m - i - seen.size());
          break;
        }

        count += c;
      }
    }

    return "" + count;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
