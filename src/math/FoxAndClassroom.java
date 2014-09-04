package topc.math;

import java.util.*;
import java.io.*;

// SRM 594 Division II Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12811&rd=15706
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+594
public class FoxAndClassroom {
  public String ableTo(int n, int m) {
    int count = 0;
    boolean seen[][] = new boolean[n][m];

    int r = 0;
    int c = 0;
    while (!seen[r][c]) {
      seen[r][c] = true;
      r = (r + 1) % n;
      c = (c + 1) % m;
      count++;
    }

    return count == n * m ? "Possible" : "Impossible";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
