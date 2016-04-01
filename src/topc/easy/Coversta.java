package topc.easy;

import java.util.*;

// SRM 660 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13807&rd=16463
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+660
public class Coversta {
    public int place(String[] a, int[] x, int[] y) {
        int w = a.length;
        int h = a[0].length();
        int n = x.length;

        int[][] sum1 = new int[w][h];

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < n; k++) {
                    int nx = i + x[k];
                    int ny = j + y[k];

                    if (0 <= nx && nx < w && 0 <= ny && ny < h) {
                        sum1[i][j] += (a[nx].charAt(ny) - '0');
                    }
                }
            }
        }

        int res = 0;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                int[][] sum2 = clone(sum1);

                for (int k1 = 0; k1 < n; k1++) {
                    int nx = i + x[k1];
                    int ny = j + y[k1];

                    if (0 <= nx && nx < w && 0 <= ny && ny < h) {
                        for (int k2 = 0; k2 < n; k2++) {
                            int nnx = nx - x[k2];
                            int nny = ny - y[k2];

                            if (0 <= nnx && nnx < w && 0 <= nny && nny < h) {
                                sum2[nnx][nny] -= (a[nx].charAt(ny) - '0');
                            }
                        }
                    }
                }

                for (int r = 0; r < w; r++) {
                    for (int c = 0; c < h; c++) {
                        res = Math.max(res, sum2[r][c] + sum1[i][j]);
                    }
                }
            }
        }

        return res;
    }

    private int[][] clone(int[][] a) {
        int[][] b = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i].clone();
        }
        return b;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
