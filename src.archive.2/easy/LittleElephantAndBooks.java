package topc.easy;

import java.util.*;
import java.io.*;

// SRM 592 Division II Level One - 250
// brute force, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12112&rd=15704
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+592
public class LittleElephantAndBooks {
  public int getNumber(int[] pages, int number) {
    Arrays.sort(pages);

    int c1 = 0;
    int c2 = 0;
    for (int i = 1; i <= number; i++) {
      c1 += pages[i];
      c2 += pages[i - 1];
    }

    c2 -= pages[number - 1];
    c2 += pages[number];

    return Math.min(c1, c2);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
