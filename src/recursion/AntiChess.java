package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 266 Division I Level Three - 1000
// recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4440&rd=7999
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm266
public class AntiChess {
  public int sacrifice(String[] white, String black) {
    // game[i][0] = row pos for piece i
    // game[i][1] = col pos for piece i
    int[][] game = new int[white.length + 1][2]; // first is the queen

    game[0][1] = black.charAt(0) - 'a';
    game[0][0] = black.charAt(1) - '1';
    
    for (int i = 0; i < white.length; i++) {
      game[i + 1][1] = white[i].charAt(0) - 'a';
      game[i + 1][0] = white[i].charAt(1) - '1';
    }

    return moveWhite(game, 0);
  }

  int moveWhite(int[][] game, int taken) {
    if (canTakeQueen(game)) { return taken; }

    int[][] next = null;
    int best = 0;
    int curr = 0;

    for (int i = 1; i < game.length; i++) {
      if (game[i][0] == -1 || game[i][0] == 7) { continue; }
      if (game[i][1] == game[0][1] && game[i][0] == game[0][0] - 1) { continue; }

      next = copyGame(game);
      next[i][0]++;
      curr = moveBlack(next, taken);
      if (curr > best) { best = curr; }

      if (game[i][0] == 1) {
        next[i][0]++;
        curr = moveBlack(next, taken);
        if (curr > best) { best = curr; }
      }
    }

    return best == 0 ? taken : best;
  }

  int moveBlack(int[][] game, int taken) {
    int[][] moves = new int[8][2];
    int qr = game[0][0];
    int qc = game[0][1];

    for (int i = 1; i < game.length; i++) {
      if (game[i][0] == -1) { continue; }

      int r = game[i][0];
      int c = game[i][1];
      int dr = Math.abs(r - qr);
      int dc = Math.abs(c - qc);

      if (dr == 0) {
        int k = c > qc ? 0 : 1;
        if (moves[k][0] == 0 || dc < moves[k][1]) {
          moves[k][0] = i;
          moves[k][1] = dc;
        }
      }
      else if (dc == 0) {
        int k = r > dr ? 2 : 3;
        if (moves[k][0] == 0 || dr < moves[k][1]) {
          moves[k][0] = i;
          moves[k][1] = dr;
        }
      }
      else if (dc == dr) {
        int k = 0;
        if (r > qr && c > qc) { k = 4; }
        if (r > qr && c < qc) { k = 5; }
        if (r < qr && c > qc) { k = 6; }
        if (r < qr && c < qc) { k = 7; }
        if (moves[k][0] == 0 || dr < moves[k][1]) {
          moves[k][0] = i;
          moves[k][1] = dr;
        }
      }
    }

    int[][] next = null;
    int best = 9;
    int curr = 0;

    for (int i = 0; i < moves.length; i++) {
      if (moves[i][0] > 0) {
        int j = moves[i][0];
        next = copyGame(game);
        next[0][0] = game[j][0];
        next[0][1] = game[j][1];
        next[j][0] = -1;
        curr = moveWhite(next, taken + 1);
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
