package topc.easy;

import java.util.*;

// SRM 648 Division II Level Two - 500
// brute force, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13648&rd=16312
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+648
public class Fragile2 {
    public int countPairs(String[] graph) {
        int cc  = countConnectedComponents(graph, -1, -1);
        int cnt = 0;
        int n   = graph.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && cc < countConnectedComponents(graph, i, j)) {
                    cnt++;
                }
            }
        }

        return cnt / 2;
    }

    private int countConnectedComponents(String[] graph, int x, int y) {
        int n = graph.length;
        boolean[] mark = new boolean[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (!mark[i] && i != x && i != y) {
                cnt++;
                markReachable(graph, mark, i, x, y);
            }
        }

        return cnt;
    }

    private void markReachable(String[] graph, boolean[] mark, int k, int x, int y) {
        if (mark[k]) { return; }

        mark[k] = true;
        for (int i = 0; i < graph.length; i++) {
            if (i != x && i != y && graph[k].charAt(i) == 'Y') {
                markReachable(graph, mark, i, x, y);
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
