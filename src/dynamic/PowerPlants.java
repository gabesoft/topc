package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 364 Division I Level Two - 500
// dynamic programming, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8062&rd=10778
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm364
public class PowerPlants {
    int INF = Integer.MAX_VALUE / 4;
    int [][] cost;
    int [] memo;
    int P;
    int N;

    public int minCost(String[] connectionCost, String plantList, int numPlants) {
        N    = connectionCost.length;
        P    = numPlants;
        cost = new int[N][N];
        memo = new int[1 << N];

        Arrays.fill(memo, -1);

        for (int i = 0; i < N; i++) {
            String c = connectionCost[i];
            for (int j = 0; j < N; j++) {
                cost[i][j] = charCost(c.charAt(j));
            }
        }

        int on = 0;
        for (int i = 0; i < N; i++) {
            if (plantList.charAt(i) == 'Y') {
                on = on | (1 << i);
            }
        }

        return rec(on);
    }

    int rec(int on) {
        if (countOnes(on) >= P) { return 0; }
        if (memo[on] > -1) { return memo[on]; }

        int best = INF;

        for (int i = 0; i < N; i++) {
            if (((on >> i) & 1) == 0) {
                for (int j = 0; j < N; j++) {
                    if (((on >> j) & 1) == 1) {
                        best = Math.min(best, cost[j][i] + rec(on | (1 << i)));
                    }
                }
            }
        }

        memo[on] = best;
        return best;
    }

    int countOnes(int mask) {
        int n = 0;
        while (mask != 0) {
            n++;
            mask = mask & (mask - 1);
        }
        return n;
    }

    int charCost(char c) {
        return Character.isDigit(c)
            ? c - '0'
            : c - 'A' + 10;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
