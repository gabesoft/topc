package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 587 Division I Level One - 250
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12300&rd=15699
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+587
public class JumpFurther {
  public int furthest(int N, int badStep) {
    return Math.max(count(1, N, badStep), count(2, N, badStep));
  }

  private int count(int s, int e, int bad) {
    int step = 0;
    for (int i = s; i <= e; i++) {
      if (step + i != bad) {
        step += i;
      }
    }
    return step;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
