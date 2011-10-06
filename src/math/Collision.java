package topc.math;

import java.util.*;
import java.io.*;

// SRM 153 Division I Level Two - 450
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1771&rd=4570
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm153
public class Collision {
  public double probability(int[] assignments, int ids) {
    int n = assignments.length;

    double p1 = 1.0; // without memory
    double p2 = 1.0; // with memory
    double amt1 = 0.0;
    double amt2 = 0.0;
    for (int i = 0; i < n; i++) {
      int c = assignments[i];
      for (int j = 0; j < c; j++) {
        p1 *= 1.0 - amt1 / ids;
        p2 *= 1.0 - amt2 / (ids - j);
        amt1++;
      }
      amt2 += c;
    }

    return amt1 <= ids ? p2 - p1 : 0;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
