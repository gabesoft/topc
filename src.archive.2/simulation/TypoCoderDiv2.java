package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 602 Division II Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12927&rd=15820
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+602
public class TypoCoderDiv2 {
  public int count(int[] rating) {
    boolean a = true;
    int c = 0;

    for (int i = 0; i < rating.length; i++) {
      if (a && rating[i] >= 1200) {
        c++;
        a = !a;
      } else if (!a && rating[i] < 1200) {
        c++;
        a = !a;
      }
    }


    return c;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
