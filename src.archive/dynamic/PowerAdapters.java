package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 393 Division II Level Three - 1000
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8391&rd=11127
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm393
public class PowerAdapters {
    public int needed(String[] adapters, String[] itinerary, String homeCountry) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int n = 0;
        map.put(homeCountry, n++);

        for (int i = 0; i < itinerary.length; i++) {
            String name = itinerary[i];
            if (!map.containsKey(name)) {
                map.put(name, n++);
            }
        }

        for (int i = 0; i < adapters.length; i++) {
            String[] names = adapters[i].split(" ");
            if (!map.containsKey(names[0])) {
                map.put(names[0], n++);
            }
            if (!map.containsKey(names[1])) {
                map.put(names[1], n++);
            }
        }

        boolean[][] graph = new boolean[n][n];
        for (int i = 0; i < adapters.length; i++) {
            String[] names = adapters[i].split(" ");
            int n1 = map.get(names[0]);
            int n2 = map.get(names[1]);
            graph[n1][n2] = true;
        }

        for (int i = 0; i < n; i++) {
            graph[i][i] = true;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    graph[i][j] |= graph[i][k] && graph[k][j];
                }
            }
        }

        int m = itinerary.length;
        int [] cover = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][map.get(itinerary[j])]) {
                    cover[i] |= (1 << j);
                }
            }
        }

        int [] memo = new int[1 << m];
        Arrays.fill(memo, 1000000000);

        memo[cover[0]] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = (1 << m) - 1; j >= 0; j--) {
                memo[j | cover[i]] = Math.min(memo[j | cover[i]], memo[j] + 1);
            }
        }

        return memo[(1 << m) - 1];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
