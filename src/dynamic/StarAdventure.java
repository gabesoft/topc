package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 208 Division I Level Three - 1000
// dynamic programming, recursion
// http://community.topcoder.com/stat?c=problem_statement&pm=2940&rd=5854
public class StarAdventure {
  int N;
  int M;
  int[][] data;
  int[][][][] best;
  int[][][] sums;

  public int mostStars(String[] level) {
    N = level.length;
    M = level[0].length();
    data = new int[N][M];
    sums = new int[N][M][M];

    for (int i = 0; i < N; i++) {
      char[] chars = level[i].toCharArray();
      for (int j = 0; j < M; j++) {
        data[i][j] = chars[j] - '0';
      }
    }

    computeSums();

    if (M <= 3) { return sumAll(); }

    best = new int[N][M][M][M];
    for (int y = 0; y < N; y++) {
      for (int i = 0; i < M - 2; i++) {
        for (int j = i + 1; j < M - 1; j++) {
          for (int k = j + 1; k < M; k++) {
            best[y][i][j][k] = findBest(y, i, j, k);
          }
        }
      }
    }

    return best[N - 1][M - 3][M - 2][M - 1];
  }

  int findBest(int row, int i, int j, int k) {
    int curr = 0;
    int[][][] prev = row == 0 ? new int[M][M][M] : best[row - 1];

    for (int ip = 0; ip < i + 1; ip++) {
      for (int jp = i + 1; jp < j + 1; jp++) {
        for (int kp = j + 1; kp < k + 1; kp++) {
          curr = Math.max(curr, prev[ip][jp][kp] + sums[row][ip][i] + sums[row][jp][j] + sums[row][kp][k]);
        }
      }
    }

    return curr;
  }

  void computeSums() {
    for (int y = 0; y < N; y++) {
      for (int i = 0; i < M; i++) {
        for (int j = i; j < M; j++) {
          sums[y][i][j] = sum(y, i, j);
        }
      }
    }
  }

  int sum(int row, int start, int end) {
    int res = 0;
    for (int i = start; i < end + 1; i++) { res += data[row][i]; }
    return res;
  }

  int sumAll() {
    int res = 0;
    for (int i = 0; i < N; i++) { res += sums[i][0][M - 1]; }
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
