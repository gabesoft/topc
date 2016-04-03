package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 686 Division I Level One - 300
// dynamic programming
// statement: https://community.topcoder.com/stat?c=problem_statement&pm=14210&rd=16690
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+686
public class BracketSequenceDiv1 {
    public long count(String s) {
        int n = s.length();
        long[][] d = new long[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            d[i][i] = 1;
        }

        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len <= n; i++) {
                int j = i + len;

                d[i][j] = d[i + 1][j];

                for (int k = i + 1; k < j; k++) {
                    if (pairs(s.charAt(i), s.charAt(k))) {
                        d[i][j] += d[i + 1][k] * d[k + 1][j];
                    }
                }
            }
        }

        return d[0][n] - 1;
    }

    boolean pairs(char l, char r) {
        return (l == '(' && r == ')') || (l == '[' && r == ']');
    }
}
