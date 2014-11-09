package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 578 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12533&rd=15498
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+578
public class WolfInZooDivTwo {
    public static final long MOD = 1000000007L;
    int V[][] = null; //V[k] = list of intervals that end at k
    int N = 0;
    long dp[][] = null;

    public int count(int N, String[] L, String[] R) {
        this.N = N;
        this.V = new int[N + 1][0];

        String[] start = join(L).split("\\s+");
        String[] end = join(R).split("\\s+");

        for (int i = 0; i < start.length; i++) {
            int s = Integer.parseInt(start[i]);
            int e = Integer.parseInt(end[i]);

            V[e + 1] = push(V[e + 1], s + 1);
        }

        this.dp = new long[N + 1][N + 1];
        for (long[] d : dp) {
            Arrays.fill(d, -1);
        }

        return (int)run(0, 1);
    }

    private long run(int last, int at) {
        if (at > N) { return 1; }
        if (dp[last][at] > -1) { return dp[last][at]; }

        long res = 0;
        boolean both = true;

        for (int i = 0; i < V[at].length; i++) {
            if (V[at][i] > last) {
                both = false;
                break;
            }
        }

        if (both) {
            res = run(last, at + 1);
        }
        res += run(at, at + 1);
        res %= MOD;

        dp[last][at] = res;
        return res;
    }

    private int[] push(int[] a, int n) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[b.length - 1] = n;
        return b;
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
