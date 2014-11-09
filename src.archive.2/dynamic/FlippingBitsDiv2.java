package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 589 Division II Level Three - 1000
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12731&rd=15701
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+589
public class FlippingBitsDiv2 {
    String s;
    int N;
    int T;
    int dp[][][];
    int c[][];

    public int getmin(String[] S, int M) {
        s  = join(S);
        N  = s.length();
        T  = N / M;
        dp = new int[T + 1][2][2];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        c = new int[2][T + 1];

        for (int i = 0; i < T; i++) {
            c[1][i] = countOnes(s, i * M, (i + 1) * M);
            c[0][i] = M - c[1][i];
        }

        return g(T, 0, 1);
    }

    private int countOnes(String s, int p1, int p2) {
        int cnt = 0;
        for (int i = p1; i < p2; i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }

    private int g(int t, int p, int allflipped) {
        if (dp[t][p][allflipped] > -1) { return dp[t][p][allflipped]; }
        if (t == 0) { return allflipped; }

        int res = 1000000000;
        for (int f : (new int[] { 0, 1 })) {
            int cost = 0;
            if (t != T && f != p) {
                cost = 1;
            }
            cost += c[f][t - 1];
            cost += g(t - 1, f, (f == 1 ? allflipped : 0));
            res = Math.min(res, cost);
        }

        dp[t][p][allflipped] = res;
        return res;
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
