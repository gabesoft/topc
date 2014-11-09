package topc.graph;

import java.util.*;
import java.io.*;

// TCO13 Round 2C Division I Level One - 250
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12548&rd=15653
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class DancingFoxes {
    public int minimalDays(String[] friendship) {
        int n = friendship.length;

        char[][] graph = new char[n][];
        for (int i = 0; i < n; i++) {
            graph[i] = friendship[i].toCharArray();
        }

        int dist  = bfs(graph, 0, 1);
        int count = 0;

        if (dist == -1) { return -1; }

        while (dist > 2) {
            dist -= (dist / 3);
            count++;
        }

        return count;
    }

    private int bfs(char[][] graph, int s, int e) {
        int n          = graph.length;
        int[] queue    = new int[n * n];
        int[] len      = new int[n * n];
        boolean[] seen = new boolean[n];

        int h = 0;
        int t = 0;

        queue[t++] = s;
        len[0] = 1;

        while (h < t) {
            int u = queue[h];
            int l = len[h++];

            if (u == e) { return l; }
            if (seen[u]) { continue; }

            seen[u] = true;
            for (int i = 0; i < n; i++) {
                if (graph[u][i] == 'Y') {
                    queue[t] = i;
                    len[t++] = l + 1;
                }
            }
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
