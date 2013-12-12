package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 169 Division I Level Three - 900
// greedy, math
// http://community.topcoder.com/stat?c=problem_statement&pm=1957&rd=4650
public class GoldMine {
  double DELTA = 0.0001;
  int W = 7;        // max workers per mine
  int N;            // mine count
  double[][] perc;
  double[][] profit;

  public int[] getAllocation(String[] mines, int miners) {
    N = mines.length;
    perc = new double[N][W];

    for (int i = 0; i < N; i++) {
      String[] mine = mines[i].split(",\\s+");
      for (int j = 0; j < W; j++) {
        perc[i][j] = Double.parseDouble(mine[j]) / 100.0;
      }
    }

    calculateProfit();

    int[] alloc = new int[N];
    for (int i = 0; i < miners; i++) {
      int mine = -1;
      double best = Double.MAX_VALUE / -2;
      for (int j = 0; j < N; j++) {
        double curr = profitIncrease(j, alloc[j]);

        if (curr > best + DELTA) {
          mine = j;
          best = curr;
        }
      }

      if (mine > -1) { alloc[mine]++; }
    }

    return alloc;
  }

  double profitIncrease(int mine, int workers) {
    if (workers >= W - 1) {
      return Double.MAX_VALUE / -4;
    } else {
      return profit[mine][workers + 1] - profit[mine][workers];
    }
  }

  void calculateProfit() {
    profit = new double[N][W];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < W; j++) {
        profit[i][j] = calculateProfit(perc[i], j);
      }
    }
  }

  double calculateProfit(double[] perc, int workerCount) {
    double profit = 0;
    for (int i = workerCount + 1; i < W; i++) {
      profit += perc[i] * 60 * (double)workerCount;
    }
    for (int i = 0; i < workerCount + 1; i++) {
      profit += perc[i] * 50 * (double)i;
      profit -= perc[i] * 20 * (double)(workerCount - i);
    }
    return profit;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
