package topc.easy;

import java.util.*;

// SRM 539 Division I Level One - 250
// brute force, search, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11855&rd=14731
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+539
public class Over9000Rocks {
  public int countPossibilities(int[] lowerBound, int[] upperBound) {
    int n = lowerBound.length;
    int l = 1 << n;
    ArrayList<Interval> ints = new ArrayList<Interval>();

    for (int i = 1; i < l; i++) {
      int lo = 0;
      int hi = 0;

      for (int j = 0; j < n; j++) {
        if (((i >> j) & 1) == 0) { continue; }

        lo += lowerBound[j];
        hi += upperBound[j];
      }

      if (hi > 9000) {
        lo = Math.max(9001, lo);
        ints.add(new Interval(lo, hi));
      }
    }

    if (ints.size() == 0) { return 0; }

    Collections.sort(ints);

    Stack<Interval> stack = new Stack<Interval>();
    stack.push(ints.get(0));

    for (int i = 1; i < ints.size(); i++) {
      Interval top = stack.pop();
      Interval next = ints.get(i);
      if (top.overlaps(next)) {
        stack.push(top.merge(next));
      } else {
        stack.push(top);
        stack.push(next);
      }
    }

    int len = 0;
    while (stack.size() > 0) {
      len += stack.pop().length();
    }

    return len;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  public class Interval implements Comparable<Interval>  {
    public int a;
    public int b;

    public Interval (int a, int b) {
      this.a = a;
      this.b = b;
    }

    public Interval merge(Interval o) {
      return new Interval(Math.min(a, o.a), Math.max(b, o.b));
    }

    public boolean overlaps(Interval o) {
      return o.a <= b;
    }

    @Override
	public int compareTo(Interval o) {
      return a - o.a;
    }

    public int length() {
      return b - a + 1;
    }

    @Override
	public String toString() {
      return a + "-" + b;
    }
  }
}
