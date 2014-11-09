package topc.math;

import java.util.*;
import java.io.*;

// SRM 628 Division II Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13280&rd=16009
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+628
public class BishopMove {
  public int howManyMoves(int r1, int c1, int r2, int c2) {
    if (r1 == r2 && c1 == c2) { return 0; }
    if (Math.abs(r1 - r2) == Math.abs(c1 - c2)) { return 1; }
    if (Math.abs(r1 - r2) % 2 == Math.abs(c1 - c2) % 2) { return 2; }
    return -1;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
