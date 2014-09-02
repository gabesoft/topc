package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 597 Division II Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12117&rd=15709
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+597
public class LittleElephantAndDouble {
  public String getAnswer(int[] A) {
    for (int i = 0; i < A.length; i++) {
      A[i] = div(A[i]);
    }

    for (int i = 0; i < A.length - 1; i++) {
      if (A[i] != A[i + 1]) {
        return "NO";
      }
    }

    return "YES";
  }

  private int div(int x) {
    while (x % 2 == 0) {
      x /= 2;
    }
    return x;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
