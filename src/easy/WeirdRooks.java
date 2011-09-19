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
  ArrayList<Pair> results;
  HashSet<String> seen;

  public String describe(int[] cols) {
    N = cols.length;
    M = getMaxValue(cols);
    row = new int[N];
    col = new int[M];
    board = new byte[N][M + 1];
    results = new ArrayList<Pair>();
    seen = new HashSet<String>();

    for (int i = 0; i < N; i++) {
      for (int j = cols[i]; j < M; j++) {
        board[i][j] = 1;
      }
      board[i][M] = (byte)cols[i];
    }

    //debug("board", board);

    for (int i = 0; i < N + 1; i++) {
      //debug("i", i);
      backtrack(copyBoard(), new boolean[M], i, 0, i);
    }

    Collections.sort(results);
    return join(results, " ");
  }

  void process(byte[][] solution, int rooks) {
    Arrays.fill(col, -1);

    for (int i = 0; i < N; i++) {
      row[i] = -1;
      for (int j = 0; j < M; j++) {
        if (solution[i][j] == 2) {
          row[i] = j;
          col[j] = i;
          break;
        }
      }
    }

    int special = 0;
    for (int i = 0; i < N; i++) {
      //for (int j = 0; j < M; j++) {
      for (int j = row[i] + 1; j < board[i][M]; j++) {
        //if (solution[i][j] == 0 && row[i] < j && col[j] < i) {
        if (col[j] < i) { special++; }
      }
    }

    //for (int i = 0; i < N; i++) {
      //debug(solution[i]);
    //}

    Pair p = new Pair(rooks, special);
    //debug("p", p, seen.contains(p.toString()));
    if (!seen.contains(p.toString())) {
      seen.add(p.toString());
      results.add(p);
    }

    //System.out.println("");
  }

  void backtrack(byte[][] board, boolean[] cols, int rooks, int k, int totalRooks) {
    if (rooks == 0) {
      process(board, totalRooks);
    } else {
      rooks = rooks - 1;

      for (int i = k; i < N - rooks; i++) {
        for (int j = 0; j < M; j++) {
          if (!cols[j] && board[i][j] == 0) {

            boolean[] next = cols.clone();
            next[j] = true;
            board[i][j] = 2;
            backtrack(board, next, rooks, i + 1, totalRooks);
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

  private static String join(Collection<?> s, String delimiter) {
    StringBuilder builder = new StringBuilder();
    Iterator iter = s.iterator();
    while (iter.hasNext()) {
      builder.append(iter.next());
      if (!iter.hasNext()) {
        break;                  
      }
      builder.append(delimiter);
    }
    return builder.toString();
  }

  class Pair implements Comparable<Pair> {
    public final int rooks;
    public final int special;

    public Pair(int rooks, int special) {
      this.rooks = rooks;
      this.special = special;
    }

    public String toString() {
      return String.format("%s,%s", rooks, special);
    }

    public int compareTo(Pair other) {
      if (rooks != other.rooks) {
        return Integer.valueOf(rooks).compareTo(Integer.valueOf(other.rooks));
      } else {
        return Integer.valueOf(special).compareTo(Integer.valueOf(other.special));
      }
    }
  }
}
