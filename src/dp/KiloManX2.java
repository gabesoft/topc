package topc.dp;

import java.util.*;

// SRM 181 Div 1 : 1000 (dynamic programming)
public class KiloManX2 {
  public int leastShots(String[] damageChart, int[] bossHealth) {
    int n = damageChart.length;
    int[][] weight = new int[n][n];
    int[] cost = new int[1 << n];

    for (int i = 0; i < n; i++) {
      char[] chars = damageChart[i].toCharArray();
      for (int j = 0; j < n; j++) {
        weight[i][j] = chars[j] - '0';
      }
    }

    for (int i = 1; i < 1 << n; i++) {
      cost[i] = Integer.MAX_VALUE;
      for (int j = 0; j < n; j++) {
        int pre = i - (1 << j);
        if ((i & (1 << j)) != 0) {
          cost[i] = Math.min(cost[i], cost[pre] + bossHealth[j]);
          for (int k = 0; k < n; k++) {
            if ((i & (1 << k)) != 0 && k != j && weight[k][j] > 0) {
              cost[i] = Math.min(cost[i], cost[pre] + (bossHealth[j] + weight[k][j] - 1) / weight[k][j]);
            }
          }
        }
      }
    }

    return cost[(1 << n) - 1];
  }
}
