package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 386 Division II Level Three - 1000
// dynamic programming, greedy, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8486&rd=11120
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm386
public class LittleTree {
    int INF = 10000000;
    int [][] dp;
    int height;
    IntegerList [] ch;

    public int minCost(int N, String[] edges, int height) {
        this.height     = height;
        String all      = join(edges);
        String [] pairs = all.split(" ");

        dp = new int[N][N + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        ch = new IntegerList[N];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = new IntegerList();
        }

        for (int i = 0; i < pairs.length; i++) {
            String [] pair = pairs[i].split(",");
            int parent = Integer.parseInt(pair[0]);
            int child = Integer.parseInt(pair[1]);
            ch[parent].add(child);
        }

        return rec(0, 0);
    }

    int rec(int v, int h) {
        if (ch[v].size() == 0) { return h <= height ? 0 : 1; }
        if (dp[v][h] > -1) { return dp[v][h]; }

        int ans = INF;
        int amt = Math.max(1, h - 1);
        if (amt < h) {
            int res = (h - amt) + rec(v, amt);
            ans = Math.min(ans, res);
        }

        if (h <= height) {
            int res = 0;
            for (int i = 0; i < ch[v].size(); i++) {
                res += rec(ch[v].get(i), h + 1);
            }
            ans = Math.min(ans, res);
        }

        dp[v][h] = ans;
        return ans;
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

    @SuppressWarnings("serial")
    class IntegerList extends ArrayList<Integer> {

    }
}
