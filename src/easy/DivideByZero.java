package topc.easy;

import java.util.*;
import java.io.*;

// SRM 610 Division II Level One - 250
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12911&rd=15843
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+610
public class DivideByZero {
  public int CountNumbers(int[] numbers) {
    HashSet<Integer> set = new HashSet<Integer>();

    for (int x : numbers) { set.add(x); }

    boolean change = true;
    while (change) {
      ArrayList<Integer> xs = new ArrayList<Integer>();

      for (int x : set) {
        for (int y : set) {
          if (x > y && !set.contains(x / y)) {
            xs.add(x / y);
          }
        }
      }

      set.addAll(xs);
      change = xs.size() > 0;
    }

    return set.size();
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
