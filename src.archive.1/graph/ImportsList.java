package topc.graph;

import java.util.*;
import java.io.*;

// SRM 447 Division II Level Three - 900
// graph theory, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10579&rd=13901
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+447
public class ImportsList {
    int INF = Integer.MAX_VALUE;

    public int[] importsCount(String[] requires) {
        int n         = requires.length;
        int graph[][] = new int[n][n];
        int edges[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = requires[i].charAt(j) == 'Y' ? 1 : 0;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && graph[i][j] == 1) {
                    graph[i][j] = 0;
                    edges[i][j] = reachable(graph, i, j) ? 0 : 1;
                    graph[i][j] = 1;
                }
            }
        }

        int results[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                results[i] += edges[i][j];
            }
        }

        return results;
    }

    boolean reachable(int[][] graph, int u, int v) {
        int n            = graph.length;
        Queue<Integer> q = new LinkedList<Integer>();
        boolean seen[]   = new boolean[n];

        q.offer(u);
        while (q.size() > 0) {
            int top = q.poll();
            if (top == v) { return true; }
            if (seen[top]) { continue; }

            seen[top] = true;
            for (int i = 0; i < n; i++) {
                if (graph[top][i] == 1) {
                    q.offer(i);
                }
            }
        }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
