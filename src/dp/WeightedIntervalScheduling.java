package topc.dp;

import java.util.*;

public class WeightedIntervalScheduling {
  public int maxWeight(String[] intervals) {
    int n = intervals.length;
    Interval[] ivals = new Interval[n];

    for (int i = 0; i < intervals.length; i++) {
      ivals[i] = new Interval(intervals[i].split(":"));
    }

    Arrays.sort(ivals);

    for (int i = 0; i < ivals.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        Interval vi = ivals[i];
        Interval vj = ivals[j];
        if (vj.getEnd() < vi.getStart()) { 
          vi.setp(j + 1);
          break;
        }
      }
    }

    debug("ivals", ivals);
    return 0;
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Interval implements Comparable<Interval> {
    int _start;
    int _end;
    int _weight;
    int _pval;

    public Interval(String[] values) {
      _start = Integer.parseInt(values[0]);
      _end = Integer.parseInt(values[1]);
      _weight = Integer.parseInt(values[2]);
    }

    public Interval(int start, int end, int weight) {
      _start = start;
      _end = end;
      _weight = weight;
    }

    public int getEnd() {
      return _end;
    }

    public int getStart() {
      return _start;
    }

    public void setp(int pval) {
      _pval = pval;
    }

    public int compareTo(Interval other) {
      if (_end > other._end) { return 1; }
      if (_end < other._end) { return -1; }
      return 0;
    }

    public String toString() {
      return String.format("%s:%s (%s) %s", _start, _end, _weight, _pval);
    }
  }
}
