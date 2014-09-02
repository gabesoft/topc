package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 598 Division II Level Three - 1000
// greedy, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12414&rd=15710
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+598
public class FoxAndFencingEasy {
  public String WhoCanWin(int mov1, int mov2, int d) {
    if (d <= mov1 || mov2 * 2 < mov1) {
      return "Ciel";
    } else if (mov1 * 2 < mov2) {
      return "Liss";
    } else {
      return "Draw";
    }
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
