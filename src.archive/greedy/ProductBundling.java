package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 324 Division II Level Three - 1000
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6811&rd=10004
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm324
public class ProductBundling {
    public int howManyBundles(String[] data) {
        int n        = data[0].length();
        int m        = data.length;
        int prod[][] = new int[n][m];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length(); j++) {
                prod[j][i] = data[i].charAt(j) - '0';
            }
        }

        int bundle[][] = new int[n][n];
        for (int p1 = 0; p1 < n; p1++) {
            for (int p2 = 0; p2 < n; p2++) {
                if (p1 != p2 && equal(prod[p1], prod[p2])) {
                    bundle[p1][p2] = 1;
                }
            }
        }

        int p[]   = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (p[i] == 0) {
                p[i] = 1;
                for (int j = 0; j < n; j++) {
                    if (bundle[i][j] == 1) {
                        p[j] = 1;
                    }
                }
                count++;
            }
        }

        return count;
    }

    private boolean equal(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) { return false; }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
