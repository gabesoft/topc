package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 169 Division I Level Three - 900
// greedy, math
// http://community.topcoder.com/stat?c=problem_statement&pm=1957&rd=4650
public class GoldMine {
  int W = 7;        // max workers per mine
  int N;            // mine count
  double[][] perc;
  int[][] profit;

  public int[] getAllocation(String[] mines, int miners) {
    N = mines.length;
    perc = new double[N][W];

    for (int i = 0; i < N; i++) {
      String[] mine = mines[i].split(",\\s+");
      assert mine.length == W : "Failure message";
      for (int j = 0; j < W; j++) {
        perc[i][j] = Double.parseDouble(mine[j]) / 100.0;
      }
    }

    calculateProfit();

    // TODO: remove debug code below
    debug("perc", perc);
    for (int i = 0; i < N; i++) {
      debug(i, profit[i]);
    }

    int[] alloc = new int[N];
    for (int i = 0; i < miners; i++) {
      int mine = -1;
      int best = Integer.MIN_VALUE;
      for (int j = 0; j < N; j++) {
        int curr = profitIncrease(j, alloc[j]);
        if (curr > best) {
          mine = j;
          best = curr;
        }
      }
      if (mine > -1) { alloc[mine]++; }
    }

    debug("alloc", alloc);
    return alloc;
  }

  int profitIncrease(int mine, int workers) {
    if (workers >= W - 1) {
      return Integer.MIN_VALUE + 1;
    } else {
      return profit[mine][workers + 1] - profit[mine][workers];
    }
  }

  void calculateProfit() {
    profit = new int[N][W];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < W; j++) {
        profit[i][j] = calculateProfit(perc[i], j);
      }
    }
  }

  int calculateProfit(double[] perc, int workerCount) {
    double profit = 0;
    for (int i = workerCount + 1; i < W; i++) {
      profit += perc[i] * 60 * (double)workerCount;
    }
    for (int i = 0; i < workerCount + 1; i++) {
      profit += perc[i] * 50 * (double)i;
      profit -= perc[i] * 20 * (double)(workerCount - i);
    }
    return (int)profit;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
