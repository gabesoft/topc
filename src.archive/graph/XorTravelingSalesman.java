package topc.graph;

import java.util.*;
import java.io.*;

// SRM 556 Division I Level One - 250
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12175&rd=15178
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+556
public class XorTravelingSalesman {
    final int MAX_ITERATIONS = 15000;
    boolean[][] seen;
    int[] values;
    char[][] graph;
    int best;
    int count;

    public int maxProfit(int[] cityValues, String[] roads) {
        values = cityValues;
        seen   = new boolean[cityValues.length][2000];
        graph  = new char[roads.length][];
        best   = 0;
        count  = 0;

        for (int i = 0; i < graph.length; i++) {
            graph[i] = roads[i].toCharArray();
        }

        search(0, values[0]);

        return best;
    }

    private void search(int city, int profit) {
        if (seen[city][profit]) { return; }
        if (count++ > MAX_ITERATIONS) { return; }

        seen[city][profit] = true;

        best = Math.max(best, profit);

        for (int i = 0; i < graph[city].length; i++) {
            if (graph[city][i] == 'Y' && !seen[i][profit ^ values[i]]) {
                search(i, profit ^ values[i]);
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
