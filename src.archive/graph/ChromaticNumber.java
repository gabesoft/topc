package topc.graph;

import java.util.*;
import java.io.*;

// TCO12 Round 3A Division I Level One - 250
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12082&rd=15096
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2012+Round+3a
public class ChromaticNumber {
    int n;

    public int minColors(String[] graph) {
        n = graph.length;

        int seen[] = new int[n];
        int colors = 0;
        int rings3 = findRings3(graph, seen);

        if (rings3 > 0) {
            colors += rings3;
        }

        for (int i = 0; i < n; i++) {
            int k = unconnected(graph, seen, i);
            colors += (k + 1) / 2;
        }

        return colors;
    }

    private int unconnected(String[] graph, int[] seen, int k) {
        if (seen[k] == 1) { return 0; }

        seen[k] = 1;

        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i != k && seen[i] == 0 && graph[k].charAt(i) == 'N') {
                count += unconnected(graph, seen, i);
            }
        }

        return count;
    }

    private int findRings3(String[] graph, int[] seen) {
        int r = 0;

        for (int k = 0; k < n; k++) {
            if (seen[k] == 1) { continue; }
            for (int i = 0; i < n; i++) {
                if (i == k) { continue; }
                if (seen[i] == 1) { continue; }
                for (int j = 0; j < n; j++) {
                    if (j == k || j == i) { continue; }
                    if (seen[j] == 1) { continue; }
                    if (graph[i].charAt(k) == 'N' && graph[k].charAt(j) == 'N' && graph[j].charAt(i) == 'N') {
                        r++;
                        seen[i] = 1;
                        seen[j] = 1;
                        seen[k] = 1;
                    }
                }
            }
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
