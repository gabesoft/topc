package topc.easy;

import java.util.*;
import java.io.*;

// SRM 575 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12501&rd=15495
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+575
public class TheTilesDivTwo {
    int n;
    int m;
    int grid[][];
    int memo[][][];

    public int find(String[] board) {
        if (board.length == 1) { return 0; }

        n    = board.length;
        m    = board[0].length();
        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = board[i].charAt(j) == '.' ? 0 : 1;
            }
        }

        memo = new int[m][1 << 4][1 << 4];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return count(0, 0, 0);
    }

    private int count(int c, int s, int sp) {
        if (c == m) { return 0; }
        if (memo[c][s][sp] > -1) { return memo[c][s][sp]; }

        int best = count(c + 1, 0, s);

        // tiles = 1
        for (int r = c % 2; r < n; r += 2) {
            if (grid[r][c] == 0) {
                for (int dr = -1; dr < 2; dr += 2) {
                    for (int dc = -1; dc < 2; dc += 2) {
                        int r1 = r + dr;
                        int c1 = c + dc;

                        int ns  = 0;
                        int nsp = s;
                        if (canAdd(c, s, sp, r1, c) && canAdd(c, s, sp, r, c1)) {
                            nsp |= (1 << r1);
                            if (c1 > c) {
                                ns |= (1 << r);
                            }

                            best = Math.max(best, 1 + count(c + 1, ns, nsp));
                        }
                    }
                }
            }
        }

        // tiles = 2
        if (n == 4) {
            int r1 = c % 2;
            int r2 = r1 + 2;
            int dr = r1 % 2 == 1 ? -1 : 1;
            if (grid[r1][c] == 0 && grid[r2][c] == 0) {
                for (int dc1 = -1; dc1 < 2; dc1 += 2) {
                    for (int dc2 = -1; dc2 < 2; dc2 += 2) {
                        int r11 = r1 + dr;
                        int c11 = c + dc1;

                        int r12 = r2 + dr;
                        int c12 = c + dc2;

                        boolean a11 = canAdd(c, s, sp, r11, c);
                        boolean a12 = canAdd(c, s, sp, r1, c11);
                        boolean a21 = canAdd(c, s, sp, r12, c);
                        boolean a22 = canAdd(c, s, sp, r2, c12);

                        int ns  = 0;
                        int nsp = s;
                        if (a11 && a12 && a21 && a22) {
                            nsp |= (1 << r11);
                            nsp |= (1 << r12);

                            if (c11 > c) {
                                ns |= (1 << r1);
                            }
                            if (c12 > c) {
                                ns |= (1 << r2);
                            }

                            best = Math.max(best, 2 + count(c + 1, ns, nsp));
                        }
                    }
                }
            }
        }

        memo[c][s][sp] = best;
        return best;
    }

    private boolean canAdd(int c, int s, int sp, int nr, int nc) {
        if (0 <= nr && nr < n && 0 <= nc && nc < m) {
            if (grid[nr][nc] != 0) { return false; }
            if (nc < c && ((sp >> nr) & 1) == 1) { return false; }
            if (nc == c && ((s >> nr) & 1) == 1) { return false; }
            return true;
        } else {
            return false;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
