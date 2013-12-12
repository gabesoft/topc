package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 228 Division I Level Two - 400
// dynamic programming, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3491&rd=6517
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm228
public class BagsOfGold {
    int bags[];
    int memo[][];

    public int netGain(int[] bags) {
        int n = bags.length;

        this.bags = bags;
        this.memo = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }

        return play(0, n - 1);
    }

    private int play(int s, int e) {
        if (s == e) { return bags[s]; }
        if (memo[s][e] > -1) { return memo[s][e]; }

        int a = play(s + 1, e);
        int b = play(s, e - 1);

        memo[s][e] = Math.max(bags[s] - a, bags[e] - b);

        return memo[s][e];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
