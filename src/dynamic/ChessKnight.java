package topc.dynamic;

import java.util.*;
import java.io.*;

// TCCC05 Round 1 Division I Level Two - 450
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3509&rd=6528
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=tccc05_online_rd_1
public class ChessKnight {
  static public final int B = 8;

  public double probability(int x, int y, int n) {
    //boolean[][] prev = new boolean[B][B];
    double[][] prev = new double[B][B];
    //double[] prob = new double[n + 1];

    prev[x - 1][y - 1] = 1.0;
    //prob[0] = 1.0;
    //prev[x - 1][y - 1] = true;
    for (int i = 1; i <= n; i++) {
      //int sum = 0;
      double[][] curr = new double[B][B];
      double avg = 1.0;
      double s = 0.0;
      int c = 0;
      for (int j = 0; j < B; j++) {
        for (int k = 0; k < B; k++) {
          if (prev[j][k] == 0.0) { continue; }

          int sum = 0;
          for (int a = -2; a <= 2; a = a + 4) {
            for (int b = -1; b <= 1; b = b + 2) {

              int x1 = j + a;
              int y1 = k + b;
              int x2 = j + b;
              int y2 = k + a;
              if (on(x1) && on(y1)) {
                sum++;
              }
              if (on(x2) && on(y2)) {
                sum++;
              }
            }
          }

          for (int a = -2; a <= 2; a = a + 4) {
            for (int b = -1; b <= 1; b = b + 2) {

              int x1 = j + a;
              int y1 = k + b;
              int x2 = j + b;
              int y2 = k + a;
              if (on(x1) && on(y1)) {
                //debug(j, k, curr[x1][y1], prev[j][k] * (sum / 8.0)); 
                //assert curr[x1][y1] == 0.0 || curr[x1][y1] == prev[j][k] * (sum / 8.0): String.format("%s, %s", x1, y1);
                if (curr[x1][y1] == 0.0) {
                  curr[x1][y1] = prev[j][k] * (sum / 8.0);
                } else {
                  curr[x1][y1] = (curr[x1][y1] + prev[j][k] * (sum / 8.0)) / 2.0;
                }
              }
              if (on(x2) && on(y2)) {
                //debug(j, k, curr[x2][y2], prev[j][k] * (sum / 8.0)); 
                //assert curr[x2][y2] == 0.0 || curr[x2][y2] == prev[j][k] * (sum / 8.0): String.format("%s, %s", x2, y2);
                if (curr[x2][y2] == 0.0) {
                  curr[x2][y2] = prev[j][k] * (sum / 8.0);
                } else {
                  curr[x2][y2] = (curr[x2][y2] + prev[j][k] * (sum / 8.0)) / 2.0;
                }
              }
            }
          }

          s += prev[j][k] * (sum / 8.0);
          c++;
          avg = s / c;
        }
      }

      debug("avg", s / c);

      for (int j = 0; j < B; j++) {
        //int[] a = new int[B];
        //for (int k = 0; k < B; k++) {
        //a[k] = curr[j][k] ? 1 : 0;
        //}
        debug(curr[j]);
      }
      debug();

      prev = curr;
      //prob[i] = (sum / 8.0) * prob[i - 1];

      //debug("prob[i]", i, sum, prob[i]);
    }

    //return prob[n];

    //double d = prob(x - 1, y - 1, 1.0, n);
    double d = prob(x - 1, y - 1, 1, 0, n);
    debug("d", d);
    return d;
  }

  double prob(int x, int y, int s, int k, int n) {
    //debug(x, y, p, n);

    if (n == 0) { return (double)s / Math.pow(8.0, k); }

    int sum = 0;
    for (int a = -2; a <= 2; a = a + 4) {
      for (int b = -1; b <= 1; b = b + 2) {
        int x1 = x + a;
        int y1 = y + b;
        int x2 = x + b;
        int y2 = y + a;
        if (on(x1) && on(y1)) { sum++; }
        if (on(x2) && on(y2)) { sum++; }
      }
    }

    //debug("sum", sum);

    double avg = 0.0;
    for (int a = -2; a <= 2; a = a + 4) {
      for (int b = -1; b <= 1; b = b + 2) {
        int x1 = x + a;
        int y1 = y + b;
        int x2 = x + b;
        int y2 = y + a;
        //if (on(x1) && on(y1)) { avg += prob(x1, y1, s * sum, k * 8, n - 1); }
        //if (on(x2) && on(y2)) { avg += prob(x2, y2, s * sum, k * 8, n - 1); }
        if (on(x1) && on(y1)) { avg += prob(x1, y1, s * sum, k + 1, n - 1); }
        if (on(x2) && on(y2)) { avg += prob(x2, y2, s * sum, k + 1, n - 1); }
      }
    }

    return avg / sum;
  }

  boolean on(int x) {
    return x >= 0 && x < B;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
