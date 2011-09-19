package topc.easy;

import java.util.*;
import java.io.*;

// SRM 234 Division I Level Two - 650
// brute force, recursion
// http://community.topcoder.com/stat?c=problem_statement&pm=3998&rd=6533
public class WeirdRooks {
  byte[][] board;
  int N;
  int M;
  int[] row;
  int[] col;
  boolean[][] res;

  public String describe(int[] cols) {
    N = cols.length;
    M = getMaxValue(cols);
    row = new int[N];
    col = new int[M];
    board = new byte[N][M + 1];
    res = new boolean[N + 1][N * M + 1];

    for (int i = 0; i < N; i++) {
      for (int j = cols[i]; j < M; j++) {
        board[i][j] = 1;
      }
      board[i][M] = (byte)cols[i];
    }

    for (int i = 0; i < N + 1; i++) {
      backtrack(copyBoard(), 0, i, 0, i);
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < N + 1; i++) {
      for (int j = 0; j < N * M + 1; j++) {
        if (res[i][j]) {
          builder.append(String.format("%s,%s ", i, j));
        }
      }
    }

    return builder.substring(0, builder.length() - 1);
  }

  void process(byte[][] solution, int rooks) {
    Arrays.fill(col, -1);

    for (int i = 0; i < N; i++) {
      row[i] = -1;
      for (int j = 0; j < board[i][M]; j++) {
        if (solution[i][j] == 2) {
          row[i] = j;
          col[j] = i;
          break;
        }
      }
    }

    int special = 0;
    for (int i = 0; i < N; i++) {
      for (int j = row[i] + 1; j < board[i][M]; j++) {
        if (col[j] < i) { special++; }
      }
    }

    res[rooks][special] = true;
  }

  void backtrack(byte[][] board, int cols, int rooks, int k, int totalRooks) {
    if (rooks == 0) {
      process(board, totalRooks);
    } else {
      rooks = rooks - 1;

      for (int i = k; i < N - rooks; i++) {
        for (int j = 0; j < board[i][M]; j++) {
          if ((cols & 1 << j) == 0) {
            board[i][j] = 2;
            backtrack(board, (cols | 1 << j), rooks, i + 1, totalRooks);
            board[i][j] = 0;
          }
        }
      }

    }
  }

  byte[][] copyBoard() {
    byte[][] copy = new byte[N][M];
    for (int i = 0; i < N; i++) {
      copy[i] = board[i].clone();
    }
    return copy;
  }

  public static int getMaxValue(int[] numbers){  
    int maxValue = numbers[0];  
    for(int i = 1; i < numbers.length; i++){  
      maxValue = Math.max(maxValue, numbers[i]);
    }  
    return maxValue;  
  }  

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
