package topc.math;

import java.util.*;
import java.io.*;

// SRM 544 Division II Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11946&rd=14736
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+544
public class ElectionFraudDiv2 {
  public String IsFraudulent(int[] percentages) {
    double losum = 0;
    double hisum = 0;

    for (int p : percentages) {
      losum += Math.max(0, p - 0.5);
      hisum += (p + 0.5);
    }

    return losum <= 100 && 100 < hisum ? "NO" : "YES";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
