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

    double[] probA = getProb(numDiceA, sidesA);
    double[] probB = getProb(numDiceB, sidesB);

    double[] probBacc = new double[probB.length + 1];
    for (int i = 1; i < probBacc.length; i++) {
      probBacc[i] = probBacc[i - 1] + probB[i - 1];
    }

    double prob = 0.0;
    for (int i = sidesA[0] * numDiceA; i < probA.length; i++) {
      prob += probA[i] * probBacc[Math.min(i, probBacc.length - 1)];
    }

    return prob;
  }

  double[] getProb(int num, int[] sides) {
    int lo = sides[0];
    int hi = sides[S - 1];
    double pside = 1.0 / S;
    double[] prob = new double[hi * num + 1];

    prob[0] = 1.0;
    for (int t = 1; t < num + 1; t++) {
      double[] curr = new double[hi * num + 1];
      for (int i = 0; i < S; i++) {
        for (int j = lo * (t - 1); j < hi * (t - 1) + 1; j++) {
          curr[sides[i] + j] += pside * prob[j];
        }
      }
      prob = curr;
    }

    return prob;
  }

  void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
