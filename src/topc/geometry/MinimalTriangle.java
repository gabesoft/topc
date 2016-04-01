package topc.geometry;

import java.util.*;

// SRM 547 Division II Level One - 250
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12056&rd=14739
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+547
public class MinimalTriangle {
  public double maximalArea(int length) {
    double area    = 3 * Math.sqrt(3) * length * length / 2.0;
    double apothem = length / (2 * Math.tan(Math.toRadians(30)));
    double tr1     = 2 * apothem * length;
    double tr2     = Math.abs((area / 2) - tr1);
    return Math.min(tr1, tr2);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
