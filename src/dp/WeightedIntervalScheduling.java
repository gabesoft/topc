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

    for (int i = 1; i < ivals.length; i++) {
      for (int j = i - 1; j >= 0; j--) {
        Interval vi = ivals[i];
        Interval vj = ivals[j];
        if (vj.getEnd() < vi.getStart()) { 
          vi.setp(j);
          break;
        }
      }
    }

    int[] cache = new int[n];
    Arrays.fill(cache, -1);

    int resRec = solveRec(n - 1, ivals, cache);
    int resIter = solveIter(ivals);
    assert resRec == resIter : "results differ";

    printSolution(n - 1, ivals, cache);
    System.out.println("");
    
    return resRec;
  }

  int solveIter(Interval[] ivals) {
    int n = ivals.length;
    int[] data = new int[n];
    
    data[0] = ivals[0].getWeight();
    for (int i = 1; i < data.length; i++) {
      Interval ival = ivals[i];
      int m = ival.getp() > -1 ? data[ival.getp()] : 0;
      data[i] = Math.max(ival.getWeight() + m, data[i-1]);
    }

    return data[n-1];
  }

  void printSolution(int k, Interval[] ivals, int[] cache) {
    if (k < 0) { return; }

    Interval ival = ivals[k];
    int m = ival.getp() > 0 ? cache[ival.getp()] : 0;

    if (k == 0 || ival.getWeight() + m >= cache[k-1]) {
      printSolution(ival.getp(), ivals, cache);
      System.out.print(String.format("| %s", ival.toString()));
    } else {
      printSolution(k - 1, ivals, cache);
    }
  }

  int solveRec(int k, Interval[] ivals, int[] cache) {
    if (k < 0) { return 0; }
    if (cache[k] > -1) { return cache[k]; }
    Interval ival = ivals[k];
    int a = ival.getWeight() + solveRec(ival.getp(), ivals, cache);
    int b = solveRec(k - 1, ivals, cache);
    cache[k] = Math.max(a, b);
    return cache[k];
  }

  void debug(Object...os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Interval implements Comparable<Interval> {
    int _start;
    int _end;
    int _weight;
    int _pval = -1;

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

    public int getp() {
      return _pval;
    }

    public int getWeight() {
      return _weight;
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
