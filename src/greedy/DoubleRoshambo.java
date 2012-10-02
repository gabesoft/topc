package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 512 Division II Level Three - 1024
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11289&rd=14537
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+512
public class DoubleRoshambo {
    public int maxScore(String[] A, String[] E) {
        int n         = A.length;
        int graph[][] = new int[n + n][n + n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j + n] = score(A[i], E[j]);
            }
        }

        return maxMatch(graph);
    }

    int maxMatch(int[][] graph) {
        boolean seen[] = new boolean[graph.length];
        int parent[]   = new int[graph.length];

        Arrays.fill(parent, -1);
        
        int sum = 0;
        for (int i = 0; i < graph.length; i++) {
            sum += findMatch(i, 2, graph, parent, seen) ? 2 : 0;
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (parent[j] != -1) {
                    graph[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < parent.length; i++) {
            if (parent[i] != -1) {
                for (int j = 0; j < graph[parent[i]].length; j++) {
                    graph[parent[i]][j] = 0;
                }
            }
        }

        seen   = new boolean[graph.length];
        parent = new int[graph.length];

        Arrays.fill(parent, -1);

        for (int i = 0; i < graph.length; i++) {
            sum += findMatch(i, 1, graph, parent, seen) ? 1 : 0;
        }

        return sum;
    }

    boolean findMatch(int v, int k, int[][] graph, int[] parent, boolean[] seen) {
        if (v == -1) { return true; }

        for (int i = 0; i < graph[v].length; i++) {
            if (graph[v][i] == k && !seen[i]) {
                seen[i] = true;
                if (findMatch(parent[i], k, graph, parent, seen)) {
                    parent[i] = v;
                    return true;
                }
            }
        }

        return false;
    }

    int score(String a, String e) {
        char al = a.charAt(0); 
        char ar = a.charAt(1);
        char el = e.charAt(0);
        char er = e.charAt(1);

        if (better(ar, er) && better(al, el)) {
            return 2;
        }
        if (better(ar, er) && al == el) {
            return 1;
        }

        return 0;
    }

    boolean better(char a, char b) {
        return a == 'R' && b == 'S' 
            || a == 'S' && b == 'P'
            || a == 'P' && b == 'R';
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
