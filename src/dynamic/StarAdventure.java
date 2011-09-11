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
  int[][][] P1;
  int[][][] P2;
  int[][][] P3;

  public int mostStars(String[] level) {
    N = level.length;
    M = level[0].length();
    data = new int[N][M];

    for (int i = 0; i < N; i++) {
      char[] chars = level[i].toCharArray();
      for (int j = 0; j < M; j++) {
        data[i][j] = chars[j] - '0';
      }
    }

    // TODO: if M <= 3 return sum(data);

    P1 = new int[M][N][M];
    P2 = new int[M][N][M];
    P3 = new int[M][N][M];

    for (int y = 0; y < N; y++) {
      for (int i = 0; i < M - 2; i++) {
        for (int j = i + 1; j < M - 1; j++) {
          for (int k = j + 1; k < M; k++) {
            P1[0][y][i]      = findBest(y, 0,     i, P1[0]);
            P2[i + 1][y][j]  = findBest(y, i + 1, j, P2[i + 1]);
            P3[j + 1][y][k]  = findBest(y, j + 1, k, P3[j + 1]);

            //P1[y][i] = Math.max(P1[y][i], findBest(y, 0,     i, P1));
            //P2[y][j] = Math.max(P2[y][j], findBest(y, i + 1, j, P2));
            //P3[y][k] = Math.max(P3[y][k], findBest(y, j + 1, k, P3));
          }
        }
      }
    }

    debug("P1", P1);
    debug("P2", P2);
    debug("P3", P3);

    int most = 0;
    for (int i = 0; i < M - 2; i++) {
      for (int j = i + 1; j < M - 1; j++) {
        for (int k = j + 1; k < M; k++) {
          most = Math.max(most, P1[0][N-1][i] + P2[i + 1][N-1][j] + P3[j + 1][N-1][k]);
        }
      }
    }

    return most;
  }

  int findBest(int row, int start, int end, int[][] pathBest) {
    int[] path = row == 0 ? new int[M] : pathBest[row - 1];
    int best = 0;
    for (int i = start; i < end + 1; i++) {
      best = Math.max(best, path[i] + sum(row, i, end));
    }
    return best;
  }

  int sum(int row, int start, int end) {
    int res = 0;
    for (int i = start; i < end + 1; i++) {
      res += data[row][i];
    }
    return res;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
