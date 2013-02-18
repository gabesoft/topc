package topc.graph;

import java.util.*;
import java.io.*;

// SRM 570 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12426&rd=15490
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+570
public class CentaurCompanyDiv2 {
    int[] degree;
    int[][] graph;
    boolean[][] seen;
    long[][] memo;

    public long count(int[] a, int[] b) {
        int n  = a.length + 1;
        degree = new int[n];
        graph  = new int[n][n];

        root(a, b, 0, -1);

        memo = new long[2][n];
        seen = new boolean[2][n];

        return rec(0, 0) + 1;
    }

    long rec(int use, int x) {
        if (seen[use][x]) { return memo[use][x]; }

        seen[use][x] = true;

        long res = 0;

        if (use == 0) {
            res = rec(1, x);
            for (int i = 0; i < degree[x]; i++) {
                res += rec(0, graph[x][i]);
            }
        } else {
            res = 1;
            for (int i = 0; i < degree[x]; i++) {
                long p = rec(1, graph[x][i]);
                res *= (1 + p);
            }
        }

        memo[use][x] = res;
        return res;
    }

    void root(int[] a, int[] b, int x, int parent) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x + 1 || b[i] == x + 1) {
                int y = (a[i] == x + 1) ? b[i] - 1 : a[i] - 1;
                if (y != parent) {
                    graph[x][degree[x]++] = y;
                    root(a, b, y, x);
                }
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
