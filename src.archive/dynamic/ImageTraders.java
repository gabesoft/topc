package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 430 Division II Level Three - 1000
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7583&rd=13521
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm430
public class ImageTraders {
    int n;
    int [][] p;
    int [][][] memo;

    public int maxOwners(String[] price) {
        n    = price.length;
        p    = new int[n][n];
        memo = new int[1 << (n - 1)][n][10];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = price[i].charAt(j) - '0';
            }
        }

        for (int i = 0; i < (1 << (n - 1)); i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        return 1 + rec(0, 0, 0);
    }

    int rec(int traders, int owner, int price) {
        if ((traders >> 1) == (1 << (n - 1)) - 1) { return n - 1; }
        if (memo[traders >> 1][owner][price] > -1) { return memo[traders >> 1][owner][price]; }

        int res = countOnes(traders);
        for (int i = 1; i < n; i++) {
            if (owner != i && (((traders >> i) & 1) == 0) && p[owner][i] >= price) {
                int next = rec(traders | (1 << i), i, p[owner][i]);
                res = Math.max(res, next);
            }
        }

        memo[traders >> 1][owner][price] = res;
        return res;
    }


    int countOnes(int mask) {
        int n = 0;
        while (mask != 0) {
            n++;
            mask = mask & (mask - 1);
        }
        return n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
