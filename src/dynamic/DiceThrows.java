package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 242 Division I Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4450&rd=7217
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm242
public class DiceThrows {
  int S = 6;

  public double winProbability(int numDiceA, int[] sidesA, int numDiceB, int[] sidesB) {
    Arrays.sort(sidesA);
    Arrays.sort(sidesB);

    double[] A = fillProb(numDiceA, sidesA);
    double[] B = fillProb(numDiceB, sidesB);

    double prob = 0.0;
    for (int i = sidesA[0] * numDiceA; i < sidesA[S - 1] * numDiceA  + 1; i++) {
      for (int j = sidesB[0] * numDiceB; j < Math.min(i, sidesB[S - 1] * numDiceB + 1); j++) {
        prob += A[i] * B[j];
      }
    }

    return prob;
  }

  double[] fillProb(int num, int[] sides) {
    double pside = 1.0 / S;
    int lo = sides[0];
    int hi = sides[S - 1];
    double[] prev = new double[hi * num + 1];

    Arrays.fill(prev, 1.0);

    for (int t = 1; t < num + 1; t++) {
      double[] curr = new double[hi * num + 1];
      for (int i = 0; i < S; i++) {
        for (int j = lo * (t - 1); j < hi * (t - 1) + 1; j++) {
          int v = sides[i] + j;
          curr[v] += pside * prev[j];
        }
      }
      prev = curr;
    }

    return prev;
  }

  void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
