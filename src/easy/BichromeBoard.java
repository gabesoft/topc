package topc.easy;

import java.util.*;
import java.io.*;

// SRM 655 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13719&rd=16415
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+655
public class BichromeBoard {
    int dx[] = new int[] { 0, 0, -1, 1 };
    int dy[] = new int[] { -1, 1, 0, 0 };
    int n;
    int m;

    public String ableToDraw(String[] board) {
        n = board.length;
        m = board[0].length();

        char ch[][] = new char[n][];

        int sx = -1;
        int sy = -1;

        for (int i = 0; i < n; i++) {
            ch[i] = board[i].toCharArray();
            if (sx == -1) {
                for (int j = 0; j < m; j++) {
                    if (ch[i][j] != '?') {
                        sx = i;
                        sy = j;
                        break;
                    }
                }
            }
        }

        if (sx == -1) { return "Possible"; }

        return fill(ch, new boolean[n][m], sx, sy) ? "Possible" : "Impossible";
    }

    private boolean fill(char[][] ch, boolean[][] seen, int row, int col) {
        if (seen[row][col]) { return true; }

        seen[row][col] = true;

        char color = '?';
        for (int i = 0; i < dx.length; i++) {
            int r = row + dx[i];
            int c = col + dy[i];

            if (0 <= r && r < n && 0 <= c && c < m) {
                if (ch[r][c] != '?') {
                    if (color == '?') {
                        color = ch[r][c];
                    } else if (color != ch[r][c]) {
                        return false;
                    }
                }
            }
        }

        if (ch[row][col] == '?') {
            if (color == 'W') {
                ch[row][col] = 'B';
            } else {
                ch[row][col] = 'W';
            }
        } else if (color != '?' && ch[row][col] == color) {
            return false;
        }

        boolean res = true;
        for (int i = 0; i < dx.length && res; i++) {
            int r = row + dx[i];
            int c = col + dy[i];

            if (0 <= r && r < n && 0 <= c && c < m) {
                res = res && fill(ch, seen, r, c);
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
