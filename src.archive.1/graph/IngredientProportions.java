package topc.graph;

import java.util.*;
import java.io.*;
import java.util.regex.*;

// SRM 429 Division I Level Two - 500
// graph theory, simple math, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8729&rd=13520
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm429
public class IngredientProportions {
    public int[] getMasses(String[] proportions) {
        Pattern pat = Pattern.compile("#(\\d)\\sand\\s#(\\d)\\sas\\s(\\d):(\\d)");

        long data[][][] = new long[10][10][];
        int n = 0;

        for (int i = 0; i < proportions.length; i++) {
            Matcher m = pat.matcher(proportions[i]);
            assert m.matches() : "No match for " + proportions[i];

            int x  = m.group(1).charAt(0) - '0';
            int y  = m.group(2).charAt(0) - '0';
            long u = m.group(3).charAt(0) - '0';
            long v = m.group(4).charAt(0) - '0';

            long g = gcd(u, v);

            data[x][y] = new long[] { u / g, v / g };
            data[y][x] = new long[] { v / g, u / g };

            n = Math.max(n, Math.max(x, y));
        }

        n++;


        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (data[i][j] == null && data[i][k] != null && data[k][j] != null) {
                        long a1    = data[i][k][0];
                        long b1    = data[i][k][1];
                        long a2    = data[k][j][0];
                        long b2    = data[k][j][1];
                        data[i][j] = new long[] { a1 * a2, b1 * b2 };
                    }
                }
            }
        }

        long fst = data[0][0][0];

        for (int i = 1; i < n; i++) {
            fst = lcm(fst, data[0][i][0]);
        }

        long vals[] = new long[n];

        vals[0] = fst;
        for (int i = 1; i < n; i++) {
            vals[i] = fst * data[i][0][0] / data[i][0][1];
        }

        long g = vals[0];
        for (int i = 1; i < n; i++) {
            g = gcd(g, vals[i]);
        }

        for (int i = 0; i < n; i++) {
            vals[i] /= g;
        }

        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = (int)vals[i];
        }

        return res;
    }

    long gcd(long n, long m) {
        return m > 0 ? gcd(m, n % m) : n;
    }

    long lcm(long n, long m) {
        return n / gcd(n, m) * m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
