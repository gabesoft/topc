package topc.graph;

import java.util.*;
import java.io.*;

// SRM 570 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12426&rd=15490
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+570
public class CentaurCompanyDiv2 {
    int G[][] = null;
    int degree[] = null;
    long mem[][] = null;
    boolean done[][] = null;

    public long count(int[] a, int[] b) {
        int n = a.length + 1;
        degree = new int[n];
        G = new int[n][n];
        root(a, b, 0, -1);

        mem = new long[2][n];
        done = new boolean[2][n];

        return rec(0, 0) + 1;
    }

    private long rec(int useIt, int x) {
        if (done[useIt][x]) { return mem[useIt][x]; }

        done[useIt][x] = true;
        long res = 0;

        if (useIt == 0) {
            res = rec(1, x);
            for (int i = 0; i < degree[x]; i++) {
                res += rec(0, G[x][i]);
            }
        } else {
            res = 1;
            for (int i = 0; i < degree[x]; i++) {
                long p = rec(1, G[x][i]);
                res *= (1 + p);
            }
        }

        mem[useIt][x] = res;
        return res;
    }

    private void root(int[] a, int[] b, int x, int parent) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x + 1 || b[i] == x + 1) {
                int y = (a[i] == x + 1) ? b[i] - 1 : a[i] - 1;
                if (y != parent) {
                    G[x][degree[x]++] = y;
                    root(a, b, y, x);
                }
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
