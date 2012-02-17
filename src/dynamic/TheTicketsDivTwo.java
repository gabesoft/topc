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

  double check(int friends, int pos, int rem) {
    if (pos == 0) { return 0; }
    if (friends == 1) { return pos == 1 ? 1 : 0; }
    if (rem == 0) { return pos == 1 ? 1 : 0; }

    double sum = 0.0;
    sum += 1.0 / 6.0 * check(1, pos, rem);
    sum += 0.5 * check(friends, (pos - 1 == 0) ? friends : pos - 1, rem - 1);
    sum += (0.5 - (1.0 / 6.0)) * check(friends - 1, pos - 1, rem - 1);

    return sum;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
