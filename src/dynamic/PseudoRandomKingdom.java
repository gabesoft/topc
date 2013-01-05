package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 394 Division I Level Three - 900
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8593&rd=11128
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm394
public class PseudoRandomKingdom {
    public double probabilityOfHappiness(String[] g, int cost, int savings) {
        int n             = g.length;
        boolean graph[][] = new boolean[n][n];

        for (int i = 0; i < g.length; i++) {
            String[] list = g[i].split("\\s+");
            for (int j = 0; j < list.length; j++) {
                int k = Integer.parseInt(list[j]);
                graph[i][k] = true;
            }
        }

        double r[] = dfs(graph, 0, -1, cost, savings);
        double res = 0;

        for (int i = 0; i < r.length; i++) {
            res += r[i];
        }
        for (int i = 0; i < g.length - 1; i++) {
            res /= (cost + 1);
        }

        return res;
    }

    double[] dfs(boolean[][] graph, int root, int parent, int cost, int savings) {
        double res[] = new double[savings + 1];

        res[0] = 1;

        for (int i = 0; i < graph[root].length; i++) {
            if (!graph[root][i]) { continue; }
            if (i == parent) { continue; }

            double next[] = dfs(graph, i, root, cost, savings);
            double curr[] = new double[savings + 1];

            for (int c = 0; c <= cost; c++) {
                for (int u = 0; u + c <= savings; u++) {
                    for (int v = 0; u + v + c <= savings; v++) {
                        curr[Math.max(u, v + c)] += res[u] * next[v];
                    }
                }
            }

            res = curr;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
