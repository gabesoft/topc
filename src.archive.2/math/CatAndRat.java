package topc.math;

import java.util.*;
import java.io.*;

// SRM 623 Division II Level Two - 450
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12932&rd=15856
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+623
public class CatAndRat {
  public double getTime(int R, int T, int Vrat, int Vcat) {
    if (Vrat >= Vcat) { return -1.0; }

    double clen = 2 * Math.PI * R;
    double rdist = Vrat * T;
    double idist = Math.min(clen / 2, rdist);

    return  idist / (Vcat - Vrat);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
