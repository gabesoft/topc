package topc.graph;

import java.util.*;
import java.io.*;

// SRM 358 Division I Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7834&rd=10768
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm358
public class SharksDinner {
    int n;
    int m;
    boolean [][] graph;
    boolean [] seen;
    int [] a;
    int [] b;
    int [] c;
    int [] parent;

    public int minSurvivors(int[] size, int[] speed, int[] intelligence) {
        n = size.length;
        m = 2 * n;
        a = size;
        b = speed;
        c = intelligence;

        graph = new boolean[m + 1][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (canEat(i, j)) {
                    graph[2 * i][j]     = true;
                    graph[2 * i + 1][j] = true;
                }
            }

            for (int j = 0; j < i; j++) {
                if (eq(i, j)) {
                    graph[2 * i][j]     = true;
                    graph[2 * i + 1][j] = true;
                }
            }
        }

        return n - maxMatch();
    }

    // computes the maximum matching cardinality for a bipartite graph
    int maxMatch() {
        int res = 0;
        parent   = new int[n];

        Arrays.fill(parent, -1);

        for (int i = 0; i < m; i++) {
            seen = new boolean[n];

            if (match(i)) {
                res++;
            }
        }

        return res;
    }

    boolean match(int v) {
        for (int i = 0; i < n; i++) {
            if (seen[i]) { continue; }

            if (graph[v][i]) {
                if (parent[i] == -1) {
                    seen[i]   = true;
                    parent[i] = v;
                    return true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (seen[i]) { continue; }

            if (graph[v][i]) {
                seen[i] = true;
                if (match(parent[i])) {
                    parent[i] = v;
                    return true;
                }
            }
        }

        return false;
    }

    boolean canEat(int i, int j) {
        return !eq(i, j) && a[i] >= a[j] && b[i] >= b[j] && c[i] >= c[j];
    }

    boolean eq(int i, int j) {
        return a[i] == a[j] && b[i] == b[j] && c[i] == c[j];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
