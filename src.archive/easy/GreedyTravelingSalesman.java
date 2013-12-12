package topc.easy;

import java.util.*;
import java.io.*;

// Round 2C Division I Level One - 300
// brute force, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11952&rd=15095
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class GreedyTravelingSalesman {
    final int MAX = 9999;

    public int worstDistance(String[] thousands, String[] hundreds, String[] tens, String[] ones) {
        int n = thousands.length;

        if (n == 2) { return MAX; }

        int graph[][] = new int[n][n];
        int min[] = new int[n];

        Arrays.fill(min, MAX);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d1 = thousands[i].charAt(j) - '0';
                int d2 = hundreds[i].charAt(j) - '0';
                int d3 = tens[i].charAt(j) - '0';
                int d4 = ones[i].charAt(j) - '0';

                graph[i][j] = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

                min[i] = Math.min(min[i], graph[i][j]);
            }
        }

        return rec(graph, new boolean[n], 0, true);
    }

    private int rec(int[][] graph, boolean[] seen, int v, boolean canChange) {
        seen[v] = true;

        ArrayList<Vert> verts = new ArrayList<Vert>();
        for (int i = 0; i < graph.length; i++) {
            if (!seen[i] && i != v) {
                verts.add(new Vert(i, graph[v][i]));
            }
        }

        int best = 0;

        if (verts.size() == 1) {
            best = canChange ? MAX : graph[v][verts.get(0).index];
        } else if (verts.size() > 1) {
            Collections.sort(verts);

            Vert fst = verts.get(0);
            Vert snd = verts.get(1);

            best = graph[v][fst.index] + rec(graph, seen, fst.index, canChange);

            if (canChange) {
                for (Vert u : verts) {
                    int weight = 0;

                    if (u.index == fst.index) {
                        weight = (fst.index < snd.index) ? snd.value : snd.value - 1;
                    } else if (u.index == snd.index) {
                        if (fst.index < snd.index && fst.value == MAX) {
                            weight = fst.value - 1;
                        } else {
                            weight = (fst.index > snd.index || snd.value < MAX) ? snd.value : 0;
                        }
                    } else {
                        weight = (u.index < fst.index) ? fst.value : fst.value - 1;
                    }

                    if (weight > 0) {
                        best = Math.max(best, weight + rec(graph, seen, u.index, false));
                    }
                }
            }
        }

        seen[v] = false;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Vert implements Comparable<Vert> {
        public final int index;
        public final int value;

        public Vert(int i, int v) {
            index = i;
            value = v;
        }

        public int compareTo(Vert v) {
            return v.value == value ? index - v.index : value - v.value;
        }

        public String toString() {
            return index + ":" + value;
        }
    }
}
