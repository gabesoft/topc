package topc.easy;

import java.util.*;
import java.io.*;

// SRM 590 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12744&rd=15702
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+590
public class FoxAndGomoku {
  public String win(String[] board) {
    int n = board.length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i].charAt(j) == 'o' && found(board, i, j)) {
          return "found";
        }
      }
    }

    return "not found";
  }

  private boolean found(String[] b, int row, int col) {
    int n = b.length;


    int c = col + 1;
    while (c < n && c <= col + 5) {
      if (b[row].charAt(c) != 'o') { break; }
      if (c == col + 4) { return true; }
      c++;
    }

    int r = row + 1;
    while (r < n && r <= row + 5) {
      if (b[r].charAt(col) != 'o') { break; }
      if (r == row + 4) { return true; }
      r++;
    }

    c = col + 1;
    r = row + 1;
    while (c < n && r < n && c <= col + 5 && r <= row + 5) {
      if (b[r].charAt(c) != 'o') { break; }
      if (r == row + 4 && c == col + 4) { return true; }
      c++;
      r++;
    }

    c = col - 1;
    r = row + 1;
    while (c >= 0 && r < n && c >= col - 5 && r <= row + 5) {
      if (b[r].charAt(c) != 'o') { break; }
      if (r == row + 4 && c == col - 4) { return true; }
      c--;
      r++;
    }

    return false;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
