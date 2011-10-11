package topc.math;

import java.util.*;
import java.io.*;

// TCO04 Round 3 Division I Level Two - 500
// math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2959&rd=5880
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tco04_online_rd_3
public class Volleyball {
  int LIM = 5000;
  double[][][] memo;
  double sProb;
  double rProb;

  public double win(int sScore, int rScore, double probWinServe) {
    memo  = new double[2][LIM / 2 + 10][LIM / 2 + 10];

    sProb = probWinServe;
    rProb = 1.0 - sProb;

    return prob(sScore, rScore, 1);
  }

  double prob(int s, int r, int sTeam) {
    if (memo[sTeam][s][r] > 0.0) { return memo[sTeam][s][r]; }

    if (win(r, s)) { return 1 - sTeam; }
    if (win(s, r)) { return sTeam; }

    if (s + r > LIM) { return 0.0; }

    double res = 0.0;
    res += sProb * prob(s + 1, r, sTeam);
    res += rProb * prob(r + 1, s, 1 - sTeam);

    memo[sTeam][s][r] = res;
    return res;
  }

  boolean win(int aScore, int bScore) {
    return aScore >= 15 && aScore - bScore >= 2;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}