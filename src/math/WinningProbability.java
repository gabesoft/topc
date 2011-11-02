package topc.math;

import java.util.*;
import java.io.*;

// SRM 218 Division I Level Three - 750
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3069&rd=5864
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm218
public class WinningProbability {
  //static final int ACC = 100;
  static final int ACC = 13;
  static public final int LIM = 1;
  //static final int ACC = Integer.MAX_VALUE - 100;
  //static public final long ACC = 1000000000L;

  public double probability(int prevWins, int prevLosses, int gamesLeft, int mustWin) {
    double cnum = 0.0;
    double cden = 0.0;
    double pnum = 0.0;
    double pden = 0.0;
    double onum = 0.0;
    double oden = 0.0;


    int wp = prevWins;
    int tp = prevWins + prevLosses;
    int wn = mustWin;
    int tn = gamesLeft;

    double[][] probs1 = new double[wp + 1][tp + 1];
    double[][] probs2 = new double[tn + 1][tn + 1];


    double base = 1.0 / ACC;

    double anum = calc(probs1, 0.0, wp) * calc(probs2, 0.0, wn);
    double bnum = calc(probs1, LIM, wp) * calc(probs2, LIM, wn);
    double aden = calc(probs1, 0.0, wp);
    double bden = calc(probs1, LIM, wp);

    double inum = 0.5 * LIM * (anum + bnum);
    double iden = 0.5 * LIM * (aden + bden);

    //debug(inum, iden, anum, bnum, aden, bden);
    for (int i = 0; i < ACC + 1; i++) {

      cnum = (4.0 * inum - pnum) / 3.0;
      cden = (4.0 * iden - pden) / 3.0;

      pnum = inum;
      pden = iden;

      // --------------------------------------------------------------------------------
      int it = 1;
      for (int j = 0; j < i; j++) {
        it = it << 1;
      }

      //debug(it);

      double sp = (double)LIM / it;
      double x = 0.5 * sp;
      double snum = 0.0;
      double sden = 0.0;
      for (int j = 0; j < it; j++) {
        double pprev = calc(probs1, x, wp);
        double pnext = calc(probs2, x, wn);
        //snum += calc(probs1, x, wp) * calc(probs2, x, wn);
        //sden += calc(probs1, x, wp);  
        snum += pprev * pnext;
        sden += pprev;
        x += sp;
      }

      inum = 0.5 * (inum + LIM * snum / it);
      iden = 0.5 * (iden + LIM * sden / it);

      //debug(inum, iden, sp);

      // --------------------------------------------------------------------------------

      //double p = (double)i / ACC;
      //double p = base * i;
      //double pprev = calcProb(p, wp, tp, false);
      //double pnext = calcProb(p, wn, tn, true);
      //

      //double pprev = calc(probs1, p, wp);
      //double pnext = calc(probs2, p, wn);

      //cden = (4.0 * pprev - pden) / 3.0;
      //cnum = (4.0 * pprev * pnext - pnum) / 3.0;

      //pden = pprev;
      //pnum = pprev * pnext;

      //oden = cden;
      //onum = cnum;

      //den += pprev;
      //num += pprev * pnext;
    }

    return cnum / cden;
  }

  //HashMap<Long, Double> cache = new HashMap<Long, Double>();
  double calc(double[][] probs, double pwin, int wins) {
    //long key = (long)(pwin * 100000000L);
    //if (cache.containsKey(key)) { return cache.get(key); }

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

    //cache.put(key, res);
    return res;
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
