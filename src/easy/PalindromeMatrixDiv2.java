package topc.easy;

import java.util.*;
import java.io.*;

// SRM 600 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12876&rd=15712
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+600
public class PalindromeMatrixDiv2 {
    int n;
    int m;

    public int minChange(String[] A, int rowCount, int columnCount) {
        n = A.length;
        m = A[0].length();

        int best = n * m;
        for (int rows = 0; rows <= ((1 << n) - 1); rows++) {
            if (Integer.bitCount(rows) != rowCount) { continue; }

            for (int cols = 0; cols <= ((1 << m) - 1); cols++) {
                if (Integer.bitCount(cols) != columnCount) { continue; }

                best = Math.min(best, change(A, rows, cols));
            }
        }

        return best;
    }

    private int change(String[] A, int rows, int  cols) {
        int cost = 0;
        boolean visited[][] = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    int o = 0;
                    int z = 0;

                    Stack<Integer> S = new Stack<Integer>();
                    S.push(i);
                    S.push(j);

                    while (S.size() > 0) {
                        int y = S.pop();
                        int x = S.pop();

                        if (!visited[x][y]) {
                            z += (A[x].charAt(y) == '0' ? 1 : 0);
                            o += (A[x].charAt(y) == '1' ? 1 : 0);
                            visited[x][y] = true;

                            if (on(cols, y)) {
                                S.push(n - x - 1);
                                S.push(y);
                            }
                            if (on(rows, x)) {
                                S.push(x);
                                S.push(m - y - 1);
                            }
                        }
                    }

                    cost += Math.min(o, z);
                }
            }
        }

        return cost;
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
