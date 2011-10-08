package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 242 Division I Level Two - 500
// dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4450&rd=7217
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm242
public class DiceThrows {
  public double winProbability(int numDiceA, int[] sidesA, int numDiceB, int[] sidesB) {
    Arrays.sort(sidesA);
    Arrays.sort(sidesB);

    int loA = sidesA[0];
    int loB = sidesB[0];
    int hiA = sidesA[5];
    int hiB = sidesB[5];

    //double[] A = new double[hiA * numDiceA + 1];
    //double[] B = new double[hiB * numDiceB + 1];

    double[] A = fillProb(numDiceA, sidesA);
    double[] B = fillProb(numDiceB, sidesB);

    //A = sub(A, loA * numDiceA, (hiA * numDiceA + 1) - (loA * numDiceA));
    //B = sub(B, loB * numDiceB, (hiB * numDiceB + 1) - (loB * numDiceB));
    //

    double prob = 0.0;
    for (int i = 0; i < hiA * numDiceA  + 1; i++) {
      for (int j = 0; j < Math.min(i, hiB * numDiceB + 1); j++) {
        prob += A[i] * B[j];
      }
    }

    debug("A", A);
    debug("B", B);
    debug("prob", prob);
    return prob;
  }

  double[] fillProb(int num, int[] sides) {
    double pside = 1.0 / 6.0;
    int lo = 0;
    int hi = 0;
    int pn = sides[5] * num + 1;
    double[] prev = new double[pn];

    //Arrays.fill(prob, 1.0);

    for (int t = 1; t < num + 1; t++) {
      double[] curr = new double[pn];
      for (int i = 0; i < 6; i++) {
        for (int j = sides[0] * (t - 1); j < sides[1] * (t - 1) + 1; j++) {
          int v = sides[i] + j;
          curr[v] += pside * (prev[j] == 0.0 ? 1.0 : prev[j]);
        }
      }
      lo = hi + sides[0];
      hi = hi + sides[5];
      prev = curr;
    }

    return prev;
  }

  public static double[] sub(double[] array, int offset, int length) {
    double[] result = new double[length];
    System.arraycopy(array, offset, result, 0, length);
    return result;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
