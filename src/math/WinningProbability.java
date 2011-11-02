package topc.math;

import java.util.*;
import java.io.*;

// SRM 218 Division I Level Three - 750
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3069&rd=5864
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm218
public class WinningProbability {
  static final int ACC = 19990;

  public double probability(int prevWins, int prevLosses, int gamesLeft, int mustWin) {
    double num = 0.0;
    double den = 0.0;

    int wp = prevWins;
    int tp = prevWins + prevLosses;
    int wn = mustWin;
    int tn = gamesLeft;

    for (int i = 0; i < ACC + 1; i++) {
      double p = (double)i / ACC;
      double pprev = calcProb(p, wp, tp, false);
      double pnext = calcProb(p, wn, tn, true);
      den += pprev;
      num += pprev * pnext;
    }

    return num / den;
  }

  double calcProb(double pwin, int wins, int total, boolean atLeast) {
    int n = atLeast ? total + 1 : wins + 1;
    int m = total + 1;
    double plose = 1.0 - pwin;
    double[][] probs = new double[n][m];

    probs[0][0] = 1.0;
    for (int j = 1; j < m; j++) {
      probs[0][j] = probs[0][j - 1] * plose;

      for (int i = 1; i < n; i++) {
        probs[i][j] += probs[i - 1][j - 1] * pwin;
        probs[i][j] += probs[i][j - 1] * plose;
      }
    }

    double prob = probs[wins][total];
    if (atLeast) {
      for (int i = wins + 1; i < total + 1; i++) {
        prob += probs[i][total];
      }
    }

    return prob;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
