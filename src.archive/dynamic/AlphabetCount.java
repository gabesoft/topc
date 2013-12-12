package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 253 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4668&rd=7227
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm253
public class AlphabetCount {
    long MAX = 1000000000;
    int dr[] = new int[] { 0,  0, 1, -1, 1, -1,  1, -1 };
    int dc[] = new int[] { 1, -1, 0,  0, 1, -1, -1,  1 };
    int n;
    int m;

    public int count(String[] grid, int length) {
        n = grid.length;
        m = grid[0].length();

        int G[][]  = new int[n][m];
        long C[][] = new long[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                G[i][j] = grid[i].charAt(j) - 'A';
                if (G[i][j] == 0) {
                    C[i][j] = 1;
                }
            }
        }

        for (int k = 1; k < length; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (G[i][j] == k) {
                        for (int p = 0; p < dr.length; p++) {
                            int r = i + dr[p];
                            int c = j + dc[p];

                            if (valid(r, c) && G[r][c] + 1 == G[i][j]) {
                                C[i][j] += C[r][c];
                            }
                        }
                    }
                }
            }
        }

        long len = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (G[i][j] == length - 1) {
                    len += C[i][j];
                    if (len >= MAX) {
                        len = MAX;
                        break;
                    }
                }
            }
        }

        return (int)len;
    }

    private boolean valid(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
