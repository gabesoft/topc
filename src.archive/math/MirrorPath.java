package topc.math;

import java.util.*;
import java.io.*;

// SRM 237 Division II Level Three - 1000
// geometry, simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4462&rd=6536
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm237
public class MirrorPath {
    int n;
    int m;
    char M[][];
    int dr[] = { 0, 0, 1, -1 };
    int dc[] = { 1, -1, 0, 0 };

    public String[] path(String[] map) {
        n = map.length;
        m = map[0].length();
        M = new char[n][];

        for (int i = 0; i < n; i++) {
            M[i] = map[i].toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] != '.') { continue; }

                if (i == 0 || i == n - 1) {
                    follow(i, j, '|', i == 0 ? 0 : 1);
                }
                if (j == 0 || j == m - 1) {
                    follow(i, j, '-', j == 0 ? 2 : 3);
                }
            }
        }

        String res[] = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = new String(M[i]);
        }

        return res;
    }

    // from:
    // 0: above
    // 1: below
    // 2: left
    // 3: right
    private void follow(int r, int c, char v, int from) {
        if (!valid(r, c)) { return; }
        if (M[r][c] == '#') { return; }
        if (M[r][c] == v || M[r][c] == '+') { return; }

        if (M[r][c] == '.') {
            M[r][c] = v;
        } else if ((M[r][c] == '-' && v == '|') || (M[r][c] == '|' && v == '-')) {
            M[r][c] = '+';
        }

        switch (M[r][c]) {
            case '|': 
                follow(r + 1, c, '|', 0);
                follow(r - 1, c, '|', 1);
                break;
            case '-':
                follow(r, c + 1, '-', 2);
                follow(r, c - 1, '-', 3);
                break;
            case '+':
                follow(r + 1, c, '|', 0);
                follow(r - 1, c, '|', 1);
                follow(r, c + 1, '-', 2);
                follow(r, c - 1, '-', 3);
                break;
            case '/':
                if (from == 0) {
                    follow(r, c - 1, '-', 3);
                } else if (from == 1) {
                    follow(r, c + 1, '-', 2);
                } else if (from == 2) {
                    follow(r - 1, c, '|', 1);
                } else if (from == 3) {
                    follow(r + 1, c, '|', 0);
                }
                break;
            case '`':
                if (from == 0) {
                    follow(r, c + 1, '-', 2);
                } else if (from == 1) {
                    follow(r, c - 1, '-', 3);
                } else if (from == 2) {
                    follow(r + 1, c, '|', 0);
                } else if (from == 3) {
                    follow(r - 1, c, '|', 1);
                }
                break;
        }
    }

    private boolean valid(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
