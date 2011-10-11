package topc.math;

import java.util.*;
import java.io.*;

// TCO04 Round 3 Division I Level Two - 500
// math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2959&rd=5880
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tco04_online_rd_3
public class Volleyball {
  int LIM = 92;
  double sProb;
  double rProb;
  double sWin;

  public double win(int sScore, int rScore, double probWinServe) {
    sProb = probWinServe;
    rProb = 1.0 - sProb;

    prob(sScore, rScore, 1.0, 1);

    return sWin;
  }

  //double[][][] memo = new double[2][LIM][LIM];
  void prob(int s, int r, double p, int sTeam) {
    //debug(s, r, sTeam);
    //if (memo[sTeam][s][r] > 0) {
      //return;
    //}

    if (win(r, s)) { 
      sWin += (1 - sTeam) * p;
      return;
    }
    if (win(s, r)) {
      sWin += sTeam * p;
      return;
    }
    if (s + r > LIM) { return; }

    //memo[sTeam][s][r] = 1.0;
    prob(s + 1, r, p * sProb, sTeam);
    prob(r + 1, s, p * rProb, 1 - sTeam);
  }

  boolean win(int aScore, int bScore) {
    return aScore >= 15 && aScore - bScore >= 2;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
