package topc.math;

import java.util.*;
import java.io.*;

// SRM 553 Division II Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12169&rd=15175
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+553
public class PlatypusDuckAndBeaver {
  public int minimumAnimals(int webbedFeet, int duckBills, int beaverTails) {
    for (int i = 0; i < 1001; i++) {
      int w = webbedFeet - 4 * i;
      int d = duckBills - i;
      int b = beaverTails - i;

      if (d < 0 || b < 0) { continue; }

      w -= d * 2;
      w -= b * 4;

      if (w == 0) {
        return i + d + b;
      }
    }

    return -1;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
