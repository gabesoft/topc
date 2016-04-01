package topc.greedy;

import java.util.*;

// SRM 544 Division II Level Two - 500
// greedy, simple math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11951&rd=14736
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+544
public class BoardSplitting {
  public int minimumCuts(int desiredLength, int desiredCount, int actualLength) {
    if (desiredLength == actualLength) { return 0; }

    int cuts = 0;
    int curr = 0;

    while (desiredCount > 0) {
      if (curr == desiredLength) {
        curr = actualLength;
        desiredCount--;
      } else if (curr > desiredLength) {
        cuts++;
        curr -= desiredLength;
        desiredCount--;
      } else {
        curr += actualLength;
      }
    }

    return cuts;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
