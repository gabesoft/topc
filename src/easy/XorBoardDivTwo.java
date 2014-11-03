package topc.easy;

import java.util.*;
import java.io.*;

// SRM 555 Division II Level One - 255
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12188&rd=15177
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+555
public class XorBoardDivTwo {
    public int theMax(String[] board) {
        int ones = 0;
        int n = board.length;
        int m = board[0].length();
        int B[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[i][j] = board[i].charAt(j) - '0';
                if (B[i][j] == 1) {
                    ones++;
                }
            }
        }

        int max = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                max = Math.max(max, ones + count(B, r, c));
            }
        }

        return max;
    }

    private int count(int[][] b, int row, int col) {
        int ones = 0;

        for (int i = 0; i < b.length; i++) {
            if (i != row) {
                ones += (b[i][col] == 0 ? 1 : -1);
            }
        }

        for (int i = 0; i < b[0].length; i++) {
            if (i != col) {
                ones += (b[row][i] == 0 ? 1 : -1);
            }
        }

        return ones;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
