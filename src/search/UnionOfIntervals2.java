package topc.search;

import java.util.*;
import java.io.*;

// SRM 277 Division II Level Three - 1000
// search, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4823&rd=8074
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm277
public class UnionOfIntervals2 {
  public int nthElement(int[] lowerBound, int[] upperBound, int n) {
    Interval[] intervals = buildIntervals(lowerBound, upperBound);
    Arrays.sort(intervals);

    long low = 0;
    for (int i = 0; i < intervals.length; i++) {
      Interval intv = intervals[i];
      intv.lo = low;
      intv.hi = low + (intv.ub - intv.lb + 1) * intv.count - 1;
      low = intv.hi + 1;
    }

    Interval intv = null;
    for (int i = 0; i < intervals.length; i++) {
      if (intervals[i].lo <= n && n <= intervals[i].hi) {
        intv = intervals[i];
        break;
      }
    }

    return (int)(intv.lb + (n - intv.lo) / intv.count);
  }

  Interval[] buildIntervals(int[] lb, int[] ub) {
    Interval[] raw = new Interval[lb.length];
    for (int i = 0; i < lb.length; i++) {
      raw[i] = new Interval(lb[i], ub[i]);
    }
    Arrays.sort(raw);

    ArrayList<Interval> intervals = new ArrayList<Interval>();
    ArrayList<Interval> temp;

    for (int i = 0; i < raw.length; i++) {
      temp = new ArrayList<Interval>();

      Interval curr = raw[i];
      for (Interval intv : intervals) {
        if (curr!= null && curr.overlap(intv)) {
          curr = breakAndAdd(intv, curr, temp);
        } else {
          temp.add(intv);
        }
      }

      if (curr != null) {
        temp.add(curr);
      }

      intervals = temp;
    }

    return intervals.toArray(new Interval[] {});
  }

  Interval breakAndAdd(Interval a, Interval b, ArrayList<Interval> list) {
    if (a.lb == b.lb && a.ub == b.ub) {
      a.count += b.count;
      list.add(a);
      return null;
    }

    if (a.lb == b.lb) {
      Interval i1 = a.ub < b.ub ? a : b;
      Interval i2 = a.ub > b.ub ? a : b;

      Interval i3 = new Interval(i1.ub + 1, i2.ub);
      i3.count = i2.count;

      i1.count += i2.count;

      list.add(i1);
      if (i3.ub != b.ub) { list.add(i3); }
      return i3.ub == b.ub ? i3 : null;
    }

    Interval i1 = a.lb < b.lb ? a : b;
    Interval i2 = a.lb > b.lb ? a : b;
    Interval i3 = a.ub < b.ub ? a : b;
    Interval i4 = a.ub > b.ub ? a : b;

    Interval i5 = new Interval(i1.lb, i2.lb - 1);
    i5.count = i1.count;

    Interval i6 = new Interval(i2.lb, i3.ub);
    i6.count  = i1.count;
    i6.count += i2.count;

    Interval i7 = new Interval(i3.ub + 1, i4.ub);
    i7.count = i4.count;

    list.add(i5);
    list.add(i6);
    if (i7.ub != b.ub) { list.add(i7); }
    return i7.ub == b.ub ? i7 : null;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Interval implements Comparable<Interval> {
    public final long lb; // lower bound
    public final long ub; // upper bound
    public long lo;
    public long hi;
    public int count;

    public Interval(long lb, long ub) {
      this.lb = lb;
      this.ub = ub;
      this.count = 1;
    }

    public boolean overlap(Interval other) {
      return this.lb <= other.ub && other.lb <= this.ub;
    }

    public int compareTo(Interval other) {
      return Long.valueOf(this.lb).compareTo(other.lb);
    }

    public String toString() {
      return String.format("(%s:%s)[%s:%s-%s]", lb, ub, count, lo, hi);
    }
  }
}
