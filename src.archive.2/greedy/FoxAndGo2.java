package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 594 Division II Level Three - 1000
// greedy, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12809&rd=15706
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+594
public class FoxAndGo2 {
  public static final int MAX_N = 19;
  public static final int MAX_CO = 100;
  int dx[] = new int[] { 0, 0, -1, 1 };
  int dy[] = new int[] { -1, 1, 0, 0 };
  int n;
  int killed;
  int emptyN;
  int emptyCount[];
  int emptyId[][];
  int adjEmpty[];
  int fullCo;
  boolean adjFound[][];
  boolean visited[][];
  char board[][];

  public int maxKill(String[] board) {
    this.killed     = 0;
    this.emptyCount = new int[2 * MAX_CO];
    this.emptyId    = new int[MAX_N][MAX_N];
    this.adjEmpty   = new int[MAX_CO];
    this.adjFound   = new boolean[MAX_N][MAX_N];
    this.visited    = new boolean[MAX_N][MAX_N];
    this.n          = board.length;
    this.board      = new char[n][];

    for (int i = 0; i < n; i++) {
      this.board[i] = board[i].toCharArray();
    }

    int old = 0;

    do {
      old = killed;
      emptyN = 0;

      for (int i = 0; i < emptyId.length; i++) {
        Arrays.fill(emptyId[i], -1);
      }

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (this.board[i][j] == '.' && emptyId[i][j] == -1) {
            emptyCount[emptyN] = 0;
            emptyDFS(i, j, emptyN++);
          }
        }
      }

      for (int i = 0; i < visited.length; i++) {
        Arrays.fill(visited[i], false);
      }

      for (int i = 0; i < n && killed == old; i++) {
        for (int j = 0; j < n && killed == old; j++) {
          if (this.board[i][j] == 'o' && !visited[i][j]) {
            Arrays.fill(adjEmpty, 0);

            for (int k = 0; k < adjFound.length; k++) {
              Arrays.fill(adjFound[k], false);
            }

            fullCo = 0;

            whiteDFS(i, j);

            if (fullCo <= 1) {
              killDFS(i, j);
            }
          }
        }
      }

    } while (old < killed);

    return killed;
  }

  private void killDFS(int i, int j) {
    if (inBounds(i, j) && board[i][j] == 'o') {
      board[i][j] = '.';
      killed++;
      for (int k = 0; k < dx.length; k++) {
        killDFS(i + dx[k], j + dy[k]);
      }
    }
  }

  private void whiteDFS(int i, int j) {
    if (board[i][j] == 'o') {
      if (!visited[i][j]) {
        visited[i][j] = true;
        for (int k = 0; k < dx.length; k++) {
          if (inBounds(i + dx[k], j + dy[k])) {
            whiteDFS(i + dx[k], j + dy[k]);
          }
        }
      }
    } else {
      if (!adjFound[i][j]) {
        adjFound[i][j] = true;
        int id = emptyId[i][j];
        adjEmpty[id]++;
        if (adjEmpty[id] == emptyCount[id]) {
          fullCo++;
        }
      }
    }
  }

  private void emptyDFS(int i, int j, int id) {
    if (inBounds(i, j) && board[i][j] == '.' && emptyId[i][j] == -1) {
      emptyId[i][j] = id;
      emptyCount[id]++;
      for (int k = 0; k < dx.length; k++) {
        emptyDFS(i + dx[k], j + dy[k], id);
      }
    }
  }

  private boolean inBounds(int x, int y) {
    return 0 <= x && x < n && 0 <= y && y < n;
  }

  private void debug(Object... os) {
    System.out.println(Arrays.deepToString(os));
  }
}
