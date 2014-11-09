package topc.math;

import java.util.*;
import java.io.*;

// SRM 174 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1848&rd=4675
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm174
public class BirthdayOdds {
  public int minPeople(int minOdds, int daysInYear) {
    int people = 1;
    double target = 1.0 - minOdds / 100.0;
    double prob = 1.0;

    while (prob > target) {
      prob *= 1.0 - (double)people / daysInYear;
      people++;
    }

    return people;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
