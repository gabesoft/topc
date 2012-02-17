package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 504.5 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11433&rd=14514
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+504.5
public class TheTicketsDivTwo {
  public double find(int n, int m, int k) {
    return check(n, m, k);
  }

  double check(int n, int m, int k) {
    if (n == 1) { return 1; }
    if (k == 0) { return m == 1 ? 1 : 0; }
    if (m == 1) { return 1 / 6.0 + 1 / 2.0 * check(n, n, k - 1); }

    double sum = 0.0;
    sum += 1 / 2.0 * check(n, m - 1, k - 1);
    sum += 1 / 3.0 * check(n - 1, m - 1, k - 1);

    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
