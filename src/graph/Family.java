package topc.graph;

import java.util.*;
import java.io.*;

// SRM 618 Division I Level One - 250
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10541&rd=15851
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+618
public class Family {
    public String isFamily(int[] parent1, int[] parent2) {
        int n = parent1.length;
        boolean[][] adj = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            int p1 = parent1[i];
            int p2 = parent2[i];
            if (p1 != -1 && p2 != -1) {
                adj[p1][p2] = true;
                adj[p2][p1] = true;
            }
        }

        return bipartite(adj) ? "Possible" : "Impossible";
    }

    private boolean bipartite(boolean[][] adj) {
        int n = adj.length;
        int[] color = new int[n];

        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {
            if (!bfs(adj, color, i)) {
                return false;
            }
        }

        return true;
    }

    private boolean bfs(boolean[][] adj, int[] color, int u) {
        if (color[u] != -1) { return true; }

        int n = adj.length;
        Queue<Integer> Q = new LinkedList<Integer>();

        Q.offer(u);
        color[u] = 1;

        while (Q.size() > 0) {
            int v = Q.poll();

            for (int i = 0; i < n; i++) {
                if (!adj[v][i]) { continue; }

                if (color[i] == -1) {
                    color[i] = 1 - color[v];
                    Q.offer(i);
                } else if (color[v] == color[i]) {
                    return false;
                }
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
