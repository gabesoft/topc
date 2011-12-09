package topc.math;

import java.util.*;
import java.io.*;

// SRM 349 Division I Level Three - 1000
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6067&rd=10673
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm349
public class LastMarble {
  double[][][] memo;

  public double winningChance(int red, int blue, int removed) {
    System.out.println("");

    memo = new double[red + 1][blue + 1][2];
    for (int i = 0; i < red + 1; i++) {
      for (int j = 0; j < blue + 1; j++) {
        Arrays.fill(memo[i][j], -1.0);
      }
    }

    //red = 8;
    //blue = 2;
    return play(red, blue, true);
  }


  double play(int r, int b, boolean me) {
    if (r <= 0 || b < 0) { return 1.0; }
    //if (r == 0) { return 2.0;}

    if (r == 1 && b == 0) { return 0.0; }
    //if (r % 4 == 0 && b == 0) { return 0.0; }

    //if (r == 1 && b == 0) { return me ? 0.0 : 1.0; }
    //if (r == 2 && b == 0) { return me ? 1.0 : 0.0; }
    //if (r == 0) { return me ? 1.0 : 0.0; }
    //if (r == 1 && b == 0) { return me ? 0.0 : 1.0; }

    if (memo[r][b][0] > -1.0) { return memo[r][b][0]; }

    assert r > 0 : "invalid red count";

    double n = r + b;

    double[] prob = new double[3];

    double pr, pb;
    pr = r / n;
    pb = b / n;

    prob[0] += pr * (1.0 - play(r - 1, b, !me));
    prob[0] += pb * (1.0 - play(r, b - 1, !me));

    //assert n > 1.0 : "n was: " + n;
    //assert r >= 1 : "r was: " + r;

    double prr = 0.0, pbb = 0.0, prb = 0.0;
    if (n > 1.0) {
      prr = pr * (Math.max(r - 1, 0) / (n - 1.0));
      pbb = pb * (Math.max(b - 1, 0) / (n - 1.0));
      prb = 1.0 - prr - pbb;

      //assert prb >= 0.0 : "prb was: " + prb;
      //assert prr + pbb + prb == 1.0 : "invalid probs(1): " + (prr + pbb + prb) + " " + prr + ", " + pbb;

      prob[1] += prr * (1.0 - play(r - 2, b,     !me));
      prob[1] += pbb * (1.0 - play(r,     b - 2, !me));
      prob[1] += prb * (1.0 - play(r - 1, b - 1, !me));
    }

    double prrr = 0.0, pbbb = 0.0, prrb = 0.0, pbbr = 0.0;
    if (n > 2.0) {
      prrr = prr * (Math.max(r - 2, 0) / (n - 2.0));
      pbbb = pbb * (Math.max(b - 2, 0) / (n - 2.0));
      prrb = prr * (Math.max(b, 0) / (n - 2.0)) + prb * (Math.max(r - 1, 0) / (n - 2.0));
      pbbr = pbb * (Math.max(r, 0) / (n - 2.0)) + prb * (Math.max(b - 1, 0) / (n - 2.0));

      //assert Math.abs((prrr + pbbb + prrb + pbbr) - 1.0) < 1.0e-13 || prrr + pbbb + prrb + pbbr == -1.0 : 
        //"invalid probs(2): " + (prrr + pbbb + prrb + pbbr) + 
        //" | " + prrr + ", " + pbbb + ", " + prrb + ", " + pbbr + 
        //" ( " + r + ", " + b + " ) " + pr + ", " + pb + 
        //" | " + prr + ", " + pbb + ", " + prb;

      prob[2] += prrr * (1.0 - play(r - 3, b,     !me));
      prob[2] += pbbb * (1.0 - play(r,     b - 3, !me));
      prob[2] += prrb * (1.0 - play(r - 2, b - 1, !me));
      prob[2] += pbbr * (1.0 - play(r - 1, b - 2, !me));
    }

    double res = max(prob);

    //assert res >= 0.0 : "res was: " + res;
    //debug(r, b, n, me, res, prob, pr, pb, prr, pbb, prb, prrr, pbbb, prrb, pbbr);
    //debug(r, b, n, me, "\t", res);

    //memo[r][b][me ? 1 : 0] = me ? res : 1.0 - res;
    memo[r][b][0] = res;
    //return me ? res : 1.0 - res;
    return res;
  }

  double max(double[] arr) {
    double res = arr[0];
    for (int i = 1; i < arr.length; i++) {
      res = Math.max(res, arr[i]);
    }
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
