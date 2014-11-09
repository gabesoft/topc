package topc.search;

import java.util.*;
import java.io.*;

// SRM 392 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8561&rd=11126
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm392
public class QuasiLatinSquares {
    int n;
    int d;

    public String[] makeSquare(int n, int d) {
        this.n = n;
        this.d = d;

        int square[][] = new int[n][n];

        assert search(square, 0, 0) : "malfunction";

        String res[] = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = toString(square[i]);
        }

        return res;
    }

    boolean search(int[][] a, int i, int j) {
        for (int v = 0; v < d; v++) {
            a[i][j] = v;

            if (!enoughRow(a, i, j)) { continue; }
            if (!enoughCol(a, i, j)) { continue; }

            if (i == n - 1 && j == n - 1) { return true; }

            int nj = (j + 1) % n;
            int ni = j == n - 1 ? i + 1 : i;

            if (search(a, ni, nj)) { return true; }
        }

        return false;
    }

    boolean enoughRow(int[][] a, int i, int j) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int k = 0; k < j + 1; k++) {
            set.add(a[i][k]);
        }
        return d - set.size() <= n - j - 1;
    }

    boolean enoughCol(int[][] a, int i, int j) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int k = 0; k < i + 1; k++) {
            set.add(a[k][j]);
        }
        return d - set.size() <= n - i - 1;
    }

    String toString(int[] row) {
        String s = row[0] + "";

        for (int i = 1; i < row.length; i++) {
            s += " ";
            s += row[i];
        }

        return s;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
