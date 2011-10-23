package topc.math;

import java.util.*;
import java.io.*;

// TCO '03 Finals Division I Level Two - 500
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1972&rd=4711
// editorial: http://www.topcoder.com/tc?module=Static&d1=tournaments&d2=tco03&d3=summary&d4=final_analysis
public class BaseballLineup {
  double[][] probs;
  double[][][][][] memo;

  public double expectedRuns(String[] stats) {
    probs = new double[9][6];
    memo = new double[9][9][21][4][8];

    for (int i = 0; i < 9; i++) {
      String[] stat = stats[i].split("\\s+");
      for (int j = 0; j < 6; j++) {
        probs[i][j] = Double.parseDouble(stat[j]) / 1000.0;
      }
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        for (int k = 0; k < 21; k++) {
          for (int l = 0; l < 4; l++) {
            Arrays.fill(memo[i][j][k][l], -1.0);
          }
        }
      }
    }

    return exp(0, 0, 0, 0, 0);
  }

  double exp(int inning, int player, int batters, int outs, int runners) {
    if (inning == 9) { return 0.0; }
    if (batters == 20 || outs == 3) {
      return exp(inning + 1, player, 0, 0, 0);
    }

    double cached = memo[inning][player][batters][outs][runners];
    if (cached > -1.0) { return cached; }

    double prob = 0.0;
    for (int action = 0; action < 6; action++) {
      int[] state = hit(action, runners);
      int runs = state[0];
      int nextRunners = state[1];
      double nextRuns = exp(inning, (player + 1) % 9, batters + 1, action == 0 ? outs + 1 : outs, nextRunners);
      prob += probs[player][action] * (runs + nextRuns);
    }

    memo[inning][player][batters][outs][runners] = prob;
    return prob;
  }

  int[] hit(int action, int runners) {
    int[] res = new int[2];
    int base1 = (runners)       & 1;
    int base2 = (runners >> 1)  & 1;
    int base3 = (runners >> 2)  & 1;

    switch (action) {
      case 0: // out
        res[0] = 0;
        break;

      case 1: // walk
        res[0] = base3 & base2 & base1;
        base3 |= base2 & base1;
        base2 |= base1;
        base1  = 1;
        break;

      case 2: // single
        res[0] = base3 + base2; 
        base3  = 0;
        base2  = base1;
        base1  = 1;
        break;

      case 3: // double
        res[0] = base3 + base2 + base1;
        base3  = 0;
        base2  = 1;
        base1  = 0;
        break;

      case 4: // triple
        res[0] = base3 + base2 + base1;
        base3  = 1;
        base2  = 0;
        base1  = 0;
        break;

      case 5: // home run
        res[0] = base3 + base2 + base1 + 1;
        base3  = 0;
        base2  = 0;
        base1  = 0;
        break;
    }

    res[1] = (base3 << 2) | (base2 << 1) | base1;

    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
