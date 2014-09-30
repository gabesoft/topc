package topc.math;

import java.util.*;
import java.io.*;

// SRM 572 Division II Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12387&rd=15492
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+572
public class EasyHomework {
  public String determineSign(int[] A) {
    boolean zero = false;
    int neg = 0;

    for (int i = 0; i < A.length; i++) {
      if (A[i] == 0) {
        zero = true;
        break;
      }
      if (A[i] < 0) {
        neg++;
      }
    }

    return zero ? "ZERO" : (neg % 2 == 1 ? "NEGATIVE" : "POSITIVE");
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
