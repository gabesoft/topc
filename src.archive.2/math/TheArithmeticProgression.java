package topc.math;

import java.util.*;
import java.io.*;

// SRM 591 Division II Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12755&rd=15703
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+591
public class TheArithmeticProgression {
  public double minimumChange(int a, int b, int c) {
    return Math.abs(b - (c + a) / 2.0);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
