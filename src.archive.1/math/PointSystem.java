package topc.math;

import java.util.*;
import java.io.*;

// SRM 174 Division I Level Three - 800
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1849&rd=4675
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm174
public class PointSystem {
  int PW;
  int PB;

  public double oddsOfWinning(int pointsToWin, int pointsToWinBy, int skill) {
    PW = pointsToWin;
    PB = pointsToWinBy;

    int n = 1000;
    double[][] game = new double[n][n];
    double pworse = skill / 100.0;
    double pbetter = 1.0 - pworse;
    double prob = 0.0;

    game[0][0] = 1.0;
    for (int j = 1; j < n; j++) {
      if (bwin(0, j)) { break; }
      game[0][j] = pbetter * game[0][j - 1];
    }

    for (int i = 1; i < n; i++) {
      double pnext = pworse * game[i - 1][0];
      if (wwin(i, 0)) { prob += pnext; break; } 
      game[i][0] = pnext;
    }

    for (int i = 1; i < n; i++) {
      for (int j = 1; j < n; j++) {
        if (bwin(i, j)) { continue; }

        double pnext = pworse * game[i - 1][j];
        if (wwin(i, j)) { prob += pnext; continue; }

        game[i][j] = pbetter * game[i][j - 1] + pnext;
      }
    }

    return prob;
  }

  boolean win(int scoreA, int scoreB) {
    return scoreA >= PW && scoreA - scoreB >= PB;
  }

  boolean bwin(int wscore, int bscore) {
    return win(bscore, wscore);
  }

  boolean wwin(int wscore, int bscore) {
    return win(wscore, bscore);
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
