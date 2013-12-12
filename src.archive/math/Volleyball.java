package topc.math;

import java.util.*;
import java.io.*;

// TCO04 Round 3 Division I Level Two - 500
// math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2959&rd=5880
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tco04_online_rd_3
public class Volleyball {
  int LIM = 1000;
  double[][] memo;
  double sProb;
  double rProb;

  public double win(int sScore, int rScore, double probWinServe) {
    memo  = new double[LIM + 1][LIM + 1];

    sProb = probWinServe;
    rProb = 1.0 - sProb;

    return prob(sScore, rScore);
  }

  double prob(int s, int r) {
    if (memo[s][r] > 0.0) { return memo[s][r]; }

    if (win(r, s)) { return 0; }
    if (win(s, r)) { return 1; }

    if (s >= LIM || r >= LIM) { return 0.0; }

    memo[s][r] += sProb * prob(s + 1, r);
    memo[s][r] += rProb * (1 - prob(r + 1, s));

    return memo[s][r];
  }

  boolean win(int aScore, int bScore) {
    return aScore >= 15 && aScore - bScore >= 2;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
