package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 266 Division I Level Three - 1000
// recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4440&rd=7999
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm266
public class AntiChess {
  int P;

  public int sacrifice(String[] white, String black) {
    int[][] game = new int[white.length + 1][2];
    P = white.length;

    read(game[0], black);
    for (int i = 0; i < white.length; i++) {
      read(game[i + 1], white[i]);
    }

    return moveWhite(game, 0, 0, 9);
  }

  void read(int[] pos, String val) {
    pos[1] = val.charAt(0) - 'a';
    pos[0] = val.charAt(1) - '1';
  }

  int moveWhite(int[][] game, int taken, int alpha, int beta) {
    if (alpha >= beta) { return 0; }
    if (canTakeQueen(game)) { return taken; }

    int[][] next = null;
    int best = 0;
    int curr = 0;

    for (int i = 1; i < game.length; i++) {
      if (game[i][0] == 7 || (game[i][1] == game[0][1] && game[i][0] == game[0][0] - 1)) { continue; }

      next = copyGame(game);

      next[i][0]++;
      curr = moveBlack(next, taken, best, beta);
      if (curr > best) { best = curr; }

      if (game[i][0] != 1) { continue; }

      next[i][0]++;
      curr = moveBlack(next, taken, best, beta);
      if (curr > best) { best = curr; }
    }

    return best == 0 ? taken : best;
  }

  int moveBlack(int[][] game, int taken, int alpha, int beta) {
    if (alpha >= beta) { return 9; }

    int[][] moves = new int[8][2];
    int qr = game[0][0];
    int qc = game[0][1];

    for (int i = 1; i < game.length; i++) {
      int r = game[i][0];
      int c = game[i][1];
      int d = 0;
      int k = 0;
      int dr = Math.abs(r - qr);
      int dc = Math.abs(c - qc);

      if (dr == 0) {
        k = c > qc ? 0 : 1;
        if (moves[k][0] == 0 || dc < moves[k][1]) { d = dc; }
      }
      if (dc == 0) {
        k = r > dr ? 2 : 3;
        if (moves[k][0] == 0 || dr < moves[k][1]) { d = dr; }
      }
      if (dc == dr) {
        if (r > qr) { k = c > qc ? 4 : 5; }
        if (r < qr) { k = c > qc ? 6 : 7; }
        if (moves[k][0] == 0 || dr < moves[k][1]) { d = dr; }
      }

      if (d > 0) {
        moves[k][0] = i;
        moves[k][1] = d;
      }
    }

    int[][] next = null;
    int best = 9;
    int curr = 0;

    for (int i = 0; i < moves.length; i++) {
      if (moves[i][0] > 0) {
        int j = moves[i][0];
        next = copyGame(game, j);
        next[0][0] = game[j][0];
        next[0][1] = game[j][1];
        curr = moveWhite(next, taken + 1, alpha, best);
        if (curr < best) { best = curr; }
      }
    }

    return best == 9 ? taken : best;
  }

  boolean canTakeQueen(int[][] game) {
    int qr = game[0][0];
    int qc = game[0][1];

    for (int i = 1; i < game.length; i++) {
      if ((qr - 1 == game[i][0]) && (qc - 1 == game[i][1] || qc + 1 == game[i][1])) {
        return true;
      }
    }

    return false;
  }

  int[][] copyGame(int[][] game, int j) {
    int[][] copy = new int[game.length - 1][2];
    int k = 0;
    for (int i = 0; i < game.length; i++) {
      if (i != j) {
        copy[k][0] = game[i][0];
        copy[k][1] = game[i][1];
        k++;
      }
    }
    return copy;
  }

  int[][] copyGame(int[][] game) {
    int[][] copy = new int[game.length][2];
    for (int i = 0; i < game.length; i++) {
      copy[i][0] = game[i][0];
      copy[i][1] = game[i][1];
    }
    return copy;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
