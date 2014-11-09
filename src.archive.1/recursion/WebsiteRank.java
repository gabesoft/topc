package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 357 Division I Level Two - 500
// recursion, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6406&rd=10766
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm357
public class WebsiteRank {
    int graph[][];
    int data[][];
    long memo[];

    public long countVotes(String[] votes, String website) {
        graph = new int[votes.length][];
        data  = new int[votes.length][];

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int id = 0;
        for (int i = 0; i < votes.length; i++) {
            String w[] = votes[i].split("\\s+");
            map.put(w[0], id++);
        }

        for (int i = 0; i < votes.length; i++) {
            String w[] = votes[i].split("\\s+");
            int u      = map.get(w[0]);
            graph[u]   = new int[w.length - 1];

            for (int j = 1; j < w.length; j++) {
                if (!map.containsKey(w[j])) {
                    map.put(w[j], id++);
                }

                graph[u][j - 1] = map.get(w[j]);
            }
        }

        for (int i = 0; i < graph.length; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < graph[i].length; j++) {
                int v = graph[i][j];
                if (v >= graph.length || !reachable(v, i)) {
                    list.add(v);
                }
            }
            data[i] = toArray(list);
        }

        memo = new long[id];
        Arrays.fill(memo, -1);

        return count(map.get(website));
    }

    boolean reachable(int u, int v) {
        Queue<Integer> nodes = new LinkedList<Integer>();
        boolean seen[]       = new boolean[51];

        nodes.offer(u);
        while (nodes.size() > 0) {
            int top = nodes.poll();

            if (top == v) { return true; }
            if (top >= graph.length) { continue; }
            if (seen[top]) { continue; }

            seen[top] = true;

            for (int i = 0; i < graph[top].length; i++) {
                nodes.offer(graph[top][i]);
            }
        }

        return false;
    }

    long count(int w) {
        if (memo[w] > -1) { return memo[w]; }

        long c = 1;

        if (w < data.length) {
            for (int i = 0; i < data[w].length; i++) {
                c += count(data[w][i]);
            }
        }

        memo[w] = c;
        return c;
    }

    int[] toArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
