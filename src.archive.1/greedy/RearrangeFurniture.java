package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 220 Division I Level Three - 900
// greedy, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3076&rd=5866
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm220
public class RearrangeFurniture {
  int n;
  int[] weights;

  public int lowestEffort(int[] weights, int[] finalPositions) {
    this.n = finalPositions.length;
    this.weights = weights;

    int min = weights[0];
    for (int i = 0; i < n; i++) {
      if (min > weights[i]) { min = weights[i]; }
    }

    int effort = 0;
    int[] work = finalPositions.clone();
    for (int i = 0; i < n; i++) {
      if (work[i] == i) { continue; }

      int cycleSum = weights[i];
      int cycleMin = cycleSum;
      int cycleCount = 1;
      int prev = i;
      for (int c = work[i]; c != i; c = work[c]) {
        cycleMin = Math.min(cycleMin, weights[c]);
        cycleSum += weights[c];
        cycleCount++;

        work[prev] = prev;
        prev = c;
      }
      work[prev] = prev;

      int original = cycleSum + (cycleCount - 2) * cycleMin;
      int extended = cycleSum + 2 * min + cycleMin + (cycleCount - 1) * min;
      effort += Math.min(original, extended);
    }

    return effort;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
