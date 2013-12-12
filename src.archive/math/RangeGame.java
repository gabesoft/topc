package topc.math;

import java.util.*;
import java.io.*;

// SRM 174 Division I Level Two - 600
// math, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2233&rd=4675
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm174
public class RangeGame {
  public int[] bestDoors(String[] possible, String[] hints) {
    Range[] p = read(possible);
    Range[] h = read(hints);

    int[] doors = new int[p.length * 2];
    for (int i = 0; i < p.length; i++) {
      doors[i * 2]      = p[i].lo;
      doors[i * 2 + 1]  = p[i].hi;
    }

    boolean[][] affected = new boolean[hints.length][possible.length];
    for (int i = 0; i < h.length; i++) {
      for (int j = 0; j < p.length; j++) {
        affected[h[i].ix][p[j].ix] |= p[j].overlaps(h[i]);
      }
    }

    int[] best = new int[hints.length + 1];
    for (int i = 0; i < hints.length + 1; i++) {
      int[] prob = new int[doors.length];
      for (int j = 0; j < p.length; j++) {
        if (p[j] == null) { continue; }
        for (int k = 0; k < doors.length; k++) {
          if (p[j].contains(doors[k])) { prob[k]++; }
        }
      }

      int bestProb = 0;
      for (int j = 0; j < prob.length; j++) {
        if (bestProb < prob[j]) {
          bestProb = prob[j];
          best[i] = doors[j];
        }
        else if (bestProb == prob[j]) {
          best[i] = Math.min(best[i], doors[j]);
        }
      }

      if (i == hints.length) { break; }

      for (int k = 0; k < p.length; k++) {
        if (p[k] != null && affected[i][p[k].ix]) {
          p[k] = null;
        }
      }
    }

    return best;
  }

  Range[] read(String[] ranges) {
    Range[] output = new Range[251];
    int n = 0;
    for (int i = 0; i < ranges.length; i++) {
      String[] tokens = ranges[i].split("\\s+");
      for (int j = 0; j < tokens.length; j++) {
        if (tokens[j].indexOf('-') > -1) {
          String[] range = tokens[j].split("-");
          output[n++] = new Range(i, Integer.parseInt(range[0]), Integer.parseInt(range[1]));
        } else {
          output[n++] = new Range(i, Integer.parseInt(tokens[j]), Integer.parseInt(tokens[j]));
        }
      }
    }

    Range[] ans = new Range[n];
    for (int i = 0; i < n; i++) {
      ans[i] = output[i];
    }

    return ans;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }

  class Range {
    public int ix;
    public int lo;
    public int hi;

    public Range(int ix, int lo, int hi) {
      this.ix = ix;
      this.lo = lo;
      this.hi = hi;
    }

    public boolean contains(int num) {
      return lo <= num && num <= hi;
    }

    public boolean overlaps(Range other) {
      return lo <= other.hi && other.lo <= hi;
    }

    public String toString() {
      return String.format("%s: %s - %s", ix, lo, hi);
    }
  }
}
