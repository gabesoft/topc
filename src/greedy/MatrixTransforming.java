package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 311 Division I Level One - 300
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6431&rd=9991
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm311
public class MatrixTransforming {
    public int minPushes(String[] a, String[] b) {
        int n = a.length;
        int m = a[0].length();

        int m1[][]          = new int[n][m];
        int m2[][]          = new int[n][m];
        boolean changed[][] = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                m1[i][j] = a[i].charAt(j) - '0';
                m2[i][j] = b[i].charAt(j) - '0';
            }
        }

        int count = 0;
        for (int r = 0; r < n - 2; r++) {
            for (int c = 0; c < m - 2; c++) {
                if (m1[r][c] != m2[r][c]) {
                    count++;
                    for (int i = r; i < r + 3; i++) {
                        for (int j = c; j < c + 3; j++) {
                            m1[i][j]      = m1[i][j] == 0 ? 1 : 0;
                            changed[i][j] = true;
                        }
                    }

                }
            }
        }

        return differ(m1, m2) ? -1 : count;
    }

    private int countDiff(int[][] m1, int[][] m2, int r, int c) {
        int count = 0;

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (m1[i][j] != m2[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean differ(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
