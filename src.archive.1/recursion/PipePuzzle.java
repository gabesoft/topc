package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 265 Division II Level Three - 1000
// recursion, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2001&rd=8007
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm265
public class PipePuzzle {
    int n;
    int m;
    char[][] grid;

    public int longest(String[] pipes) {
        n    = pipes.length;
        m    = pipes[0].length();
        grid = new char[n][m];

        int r = -1;
        int c = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = pipes[i].charAt(j);
                if (grid[i][j] == 'N' || grid[i][j] == 'S' || grid[i][j] == 'E' || grid[i][j] == 'W') {
                    r = i;
                    c = j;
                }
            }
        }

        int seen[][] = new int[n][m];
        return dfs(seen, r, c, -1, -1);
    }

    private int dfs(int[][] seen, int r, int c, int pr, int pc) {
        if (r < 0 || r == n || c < 0 || c == m) {
            return 0;
        }
        if (seen[r][c] > 0 && grid[r][c] != '+') {
            return 0;
        }
        if (seen[r][c] > 1) {
            return 0;
        }

        seen[r][c]++;

        int count = 0;
        switch (grid[r][c]) {
            case 'N': count = dfs(seen, r - 1, c, r, c); break;
            case 'S': count = dfs(seen, r + 1, c, r, c); break;
            case 'E': count = dfs(seen, r, c + 1, r, c); break;
            case 'W': count = dfs(seen, r, c - 1, r, c); break;
            case 'L':
                      if (pr < r || pr > r) {
                          int a = 1 + dfs(seen, r, c + 1, r, c);
                          int b = 1 + dfs(seen, r, c - 1, r, c);
                          count = Math.max(a, b);
                      }
                      if (pc > c || pc < c) {
                          int a = 1 + dfs(seen, r + 1, c, r, c);
                          int b = 1 + dfs(seen, r - 1, c, r, c);
                          count = Math.max(a, b);
                      }
                      break;
            case '-':
            case '+':
                      if (pr == r) {
                          count = 1 + dfs(seen, r, pc < c ? c + 1 : c - 1, r, c);
                      }
                      if (pc == c) {
                          count = 1 + dfs(seen, pr < r ? r + 1 : r - 1, c, r, c);
                      }
                      break;
        }

        seen[r][c]--;

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
