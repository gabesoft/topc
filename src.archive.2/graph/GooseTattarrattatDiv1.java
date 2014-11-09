package topc.graph;

import java.util.*;
import java.io.*;

// SRM 589 Division I Level One - 250
// graph theory, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12730&rd=15701
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+589
public class GooseTattarrattatDiv1 {
    public int getmin(String S) {
        int n          = S.length();
        int[][] graph  = new int[26][26];
        int cost[]     = new int[26];
        boolean[] seen = new boolean[26];

        if (n % 2 == 1) {
            cost[S.charAt(n / 2) - 'a']++;
        }

        for (int i = 0; i < n / 2; i++) {
            int c1 = S.charAt(i) - 'a';
            int c2 = S.charAt(n - i - 1) - 'a';

            cost[c1]++;
            cost[c2]++;

            graph[c1][c2] = 1;
            graph[c2][c1] = 1;
        }


        int count = 0;

        for (int i = 0; i < graph.length; i++) {
            ArrayList<Integer> seq = new ArrayList<Integer>();

            search(graph, seen, seq, i);

            int max = 0;
            int tot = 0;

            for (int x : seq) {
                max = Math.max(max, cost[x]);
                tot += cost[x];
            }

            count += (tot - max);
        }

        return count;
    }

    private void search(int[][] graph, boolean[] seen, ArrayList<Integer> seq, int x) {
        if (seen[x]) { return; }

        seen[x] = true;
        seq.add(x);

        for (int i = 0; i < graph.length; i++) {
            if (i != x && graph[x][i] == 1) {
                search(graph, seen, seq, i);
            }
        }
    }
}
