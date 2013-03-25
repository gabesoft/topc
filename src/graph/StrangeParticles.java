package topc.graph;

import java.util.*;
import java.io.*;

// SRM 299 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6040&rd=9820
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm299
public class StrangeParticles {
    int n;
    int time;

    public int remain(String[] interacts) {
        n  = interacts.length;

        boolean[][] g1 = new boolean[n][n];
        boolean[][] g2 = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g1[i][j] = interacts[i].charAt(j) == '-';
                g2[j][i] = interacts[i].charAt(j) == '-';
            }
        }

        int[] t1     = new int[n];
        boolean[] s1 = new boolean[n];

        time = 0;
        for (int i = 0; i < n; i++) {
            if (!s1[i]) {
                dfs(g1, t1, s1, i);
            }
        }

        int[] cc        = new int[n];
        int id          = 1;
        Vertex[] sorted = sortByTime(t1);
        boolean[] s2    = new boolean[n];


        for (int i = 0; i < n; i++) {
            int v = sorted[i].v;
            if (!s2[v]) {
                int[] t2 = new int[n];

                dfs(g2, t2, s2, v);

                for (int j = 0; j < n; j++) {
                    if (t2[j] > 0) {
                        cc[j] = id;
                    }
                }

                id++;
            }
        }

        id--;

        if (id == 1) { return 1; }

        boolean[][] graph;

        if (id == n) {
            graph = g1;
        } else {
            graph = mergecc(g1, cc, id);
        }

        int[] roots = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j]) {
                    roots[j] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < roots.length; i++) {
            if (roots[i] == 0) {
                count++;
            }
        }

        return count;
    }

    private boolean[][] mergecc(boolean[][] graph, int[] cc, int m) {
        boolean[][] res = new boolean[m][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j]) {
                    int v = cc[i] - 1;
                    int u = cc[j] - 1;
                    if (v != u) {
                        res[v][u] = true;
                    }
                }
            }
        }

        return res;
    }

    private Vertex[] sortByTime(int[] time) {
        Vertex vertices[] = new Vertex[n];
        for (int i = 0; i < n; i++) {
            vertices[i] = new Vertex(i, time[i]);
        }
        Arrays.sort(vertices);
        return vertices;
    }

    private void dfs(boolean[][] graph, int[] times, boolean[] seen, int v) {
        time++;
        seen[v] = true;

        for (int i = 0; i < n; i++) {
            if (!seen[i] && graph[v][i]) {
                dfs(graph, times, seen, i);
            }
        }

        time++;
        times[v] = time;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Vertex implements Comparable<Vertex> {
        public int v;
        public int t;

        public Vertex(int vertex, int time) {
            v = vertex;
            t = time;
        }

        public int compareTo(Vertex other) {
            return other.t - t;
        }

        public String toString() {
            return t + "";
        }
    }
}
