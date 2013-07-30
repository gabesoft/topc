package topc.easy;

import java.util.*;
import java.io.*;

// SRM 172 Division II Level Three - 1000
// brute force, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1815&rd=4665
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm172
public class Cubism {
    int n = 4;

    public int lines(String[] lattice, String color) {
        int[][][] cube = new int[n][n][n];

        char col = color.equals("black") ? 'B' : 'W';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    char c = lattice[i].charAt(j * n + k);
                    cube[i][j][k] = (c == col) ? 1 : 0;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            count += checkRows(cube[i]);
            count += checkDiag(cube[i]);
        }

        for (int i = 0; i < n; i++) {
            int[][] square = new int[4][];
            for (int j = 0; j < n; j++) {
                square[j] = cube[j][i];
            }
            count += checkCols(square);
            count += checkDiag(square);
        }

        for (int i = 0; i < n; i++) {
            int[][] square = new int[4][4];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    square[j][k] = cube[k][j][i];
                }
            }
            count += checkCols(square);
            count += checkDiag(square);
        }

        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;

        for (int i = 0; i < n; i++) {
            d1 += cube[i][i][i];
            d2 += cube[i][i][n - 1 - i];
            d3 += cube[i][n - 1 - i][i];
            d4 += cube[n - 1 - i][i][i];
        }

        count += (d1 >> 2);
        count += (d2 >> 2);
        count += (d3 >> 2);
        count += (d4 >> 2);

        return count;
    }

    private int[] check(int[][] sq) {
        int rows = 0;
        int cols = 0;
        int d1   = 0;
        int d2   = 0;

        for (int i = 0; i < n; i++) {
            int r = 0;
            int c = 0;
            for (int j = 0; j < n; j++) {
                r += sq[i][j];
                c += sq[j][i];
            }

            rows += (r >> 2);
            cols += (c >> 2);
            d1   += sq[i][i];
            d2   += sq[i][n - 1 - i];
        }

        return new int[] { rows, cols, (d1 >> 2) + (d2 >> 2) };
    }

    private int checkRows(int[][] sq) {
        return check(sq)[0];
    }

    private int checkCols(int[][] sq) {
        return check(sq)[1];
    }

    private int checkDiag(int[][] sq) {
        return check(sq)[2];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
