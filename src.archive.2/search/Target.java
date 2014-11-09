package topc.search;

import java.util.*;
import java.io.*;

// SRM 633 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13462&rd=16076
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+633
public class Target {
    public String[] draw(int n) {
        char[][] d = new char[n][n];

        for (char[] x : d) {
            Arrays.fill(x, ' ');
        }

        int j = 0;
        while (j <= (n - j - 1)) {
            fill(d, j, n - j - 1);
            j += 2;
        }

        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = new String(d[i]);
        }

        return res;
    }

    private void fill(char[][] d, int s, int e) {
        for (int i = s; i <= e; i++) {
            d[s][i] = '#';
            d[e][i] = '#';
            d[i][s] = '#';
            d[i][e] = '#';
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
