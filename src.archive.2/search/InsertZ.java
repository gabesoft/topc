package topc.search;

import java.util.*;
import java.io.*;

// SRM 587 Division II Level One - 250
// simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12700&rd=15699
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+587
public class InsertZ {
  public String canTransform(String init, String goal) {
    init = init.replaceAll("z", "");
    goal = goal.replaceAll("z", "");
    return init.equals(goal) ? "Yes" : "No";
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
