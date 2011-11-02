package topc.math;

import java.util.*;
import java.io.*;

// SRM 218 Division I Level Three - 750
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3069&rd=5864
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm218
public class WinningProbability {
  static final int LIM = 14;

  public double probability(int prevWins, int prevLosses, int gamesLeft, int mustWin) {
    int wp = prevWins;
    int tp = prevWins + prevLosses;
    int wn = mustWin;
    int tn = gamesLeft;

    double[][] probs1 = new double[wp + 1][tp + 1];
    double[][] probs2 = new double[tn + 1][tn + 1];

    double sprev = calc(probs1, 0.0, wp);
    double snext = calc(probs2, 0.0, wn);
    double eprev = calc(probs1, 1.0, wp);
    double enext = calc(probs2, 1.0, wn);

    double fnum = 0.5 * (sprev * snext + eprev * enext);
    double fden = 0.5 * (sprev + eprev);

    double num  = 0.0;
    double den  = 0.0;
    double pnum = 0.0;
    double pden = 0.0;

    for (int i = 0; i < LIM; i++) {
      num = (4.0 * fnum - pnum) / 3.0;
      den = (4.0 * fden - pden) / 3.0;

      pnum = fnum;
      pden = fden;

      int lim = 1 << i;
      double delta = 1.0 / lim;
      double p = 0.5 * delta;

      double snum = 0.0;
      double sden = 0.0;
      for (int j = 0; j < lim; j++) {
        double pprev = calc(probs1, p, wp);
        double pnext = calc(probs2, p, wn);
        snum += pprev * pnext;
        sden += pprev;
        p += delta;
      }

      fnum = 0.5 * (fnum + snum / lim);
      fden = 0.5 * (fden + sden / lim);
    }

    return num / den;
  }

  double calc(double[][] probs, double pwin, int wins) {
    int n = probs.length;
    int m = probs[0].length;
    double plose = 1.0 - pwin;

    probs[0][0] = 1.0;
    for (int j = 1; j < m; j++) {
      probs[0][j] = probs[0][j - 1] * plose;

      for (int i = 1; i < n; i++) {
        probs[i][j] = probs[i - 1][j - 1] * pwin + probs[i][j - 1] * plose;
      }
    }

    double res = probs[wins][m - 1];
    for (int i = wins + 1; i < n; i++) {
      res += probs[i][m - 1];
    }

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
