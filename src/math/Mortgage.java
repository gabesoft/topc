package topc.math;

import java.util.*;
import java.io.*;

// SRM 189 Division II Level Three - 1000
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2427&rd=4765
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm189
public class Mortgage {
  public int monthlyPayment(int loan, int interest, int term) {
    long hi = 2000000001L;
    long lo = 0L;

    while (lo < hi) {
      long mid = lo + (hi - lo + 1) / 2;
      if (pay(loan, interest, term, mid) < 0) {
        hi = mid - 1;
      } else {
        lo = mid;
      }
    }

    return (int)lo + 1;
  }

  long pay(long loan, int interest, int term, long payment) {
    long res = loan;
    int ub = term * 12;
    double monthlyi = interest / 12000.0;

    for (int i = 0; i < ub; i++) {
      res -= payment;

      if (res < 0) { break; }
      if (i < ub - 1) {
        res  = (long)Math.ceil(res * (1.0 + monthlyi));
      }
    }

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
