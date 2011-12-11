package topc.math;

import java.util.*;
import java.io.*;

// SRM 258 Division I Level One - 250
// advanced math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3970&rd=7993
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm258
public class AutoLoan {
  public double interestRate(double price, double monthlyPayment, int loanTerm) {
    double lo = 0.0;
    double hi = 1.0;

    int count = 0;
    while (count++ < 200) {
      double mid = lo + (hi - lo) / 2.0;
      if (calc(price, mid, monthlyPayment, loanTerm) > 0.0) {
        hi = mid;
      } else {
        lo = mid;
      }
    }

    return lo * 12.0 * 100.0;
  }

  double calc(double balance, double interest, double payment, int payments) {
    double rem = balance;
    for (int i = 0; i < payments; i++) {
      rem = rem * (1.0 + interest) - payment;
    }
    return rem;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
