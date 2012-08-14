package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 306 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6417&rd=9986
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm306
public class BlockDistance {
    int INF = Integer.MAX_VALUE / 4;
    int n1;
    int n2;
    char[] t1;
    char[] t2;
    int[][] memo;

    public int minDist(String[] oldText, String[] newText) {
        String s1 = join(oldText);
        String s2 = join(newText);

        if (s1.length() > s2.length()) {
            String temp = s1;
            s1          = s2;
            s2          = temp;
        }

        n1 = s1.length();
        n2 = s2.length();

        t1 = new char[n1];
        t2 = new char[n2];

        for (int i = 0; i < n1; i++) {
            t1[i] = s1.charAt(i);
        }
        for (int i = 0; i < n2; i++) {
            t2[i] = s2.charAt(i);
        }

        memo = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            Arrays.fill(memo[i], -2);
        }

        int res = dist(0, 0);

        return res == INF ? -1 : res;
    }

    int dist(int i1, int i2) {
        if (i1 == n1 && i2 == n2) { return 0; }
        if (i1 == n1) { return 1; }
        if (i2 == n2) { return INF; }
        if (t1[i1] == t2[i2]) { return dist(i1 + 1, i2 + 1); }
        if (memo[i1][i2] > -2) { return memo[i1][i2]; }

        int best = INF;
        for (int i = i2 + 1; i < n2; i++) {
            if (t1[i1] == t2[i]) {
                best = Math.min(best, 1 + dist(i1, i));
            }
        }

        memo[i1][i2] = best;
        return best;
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
