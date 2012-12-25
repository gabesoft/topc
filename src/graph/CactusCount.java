package topc.graph;

import java.util.*;
import java.io.*;

// SRM 419 Division II Level Three - 1000
// graph theory, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10077&rd=13510
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm419
public class CactusCount {
    public int countCacti(int n, String[] edges) {
        boolean graph[][] = new boolean[n][n];
        String all        = join(edges);
        String pairs[]    = all.split(",");

        if (all.length() == 0) { return n; }

        for (int i = 0; i < pairs.length; i++) {
            String pair[] = pairs[i].split("\\s+");
            int u = Integer.parseInt(pair[0]) - 1;
            int v = Integer.parseInt(pair[1]) - 1;
            graph[u][v] = true;
            graph[v][u] = true;
        }

        int cc[] = new int[n];
        int id   = 1;

        for (int i = 0; i < n; i++) {
            if (findcc(graph, cc, i, id)) {
                id++;
            }
        }

        int count = 0;
        for (int i = 1; i < id; i++) {
            if (isVertexCactus(graph, cc, i)) {
                count++;
            }
        }

        return count;
    }

    boolean isVertexCactus(boolean[][] graph, int[] cc, int id) {
        for (int i = 0; i < graph.length; i++) {
            int count = 0;
            if (cc[i] == id) {
                for (int j = 0; j < graph.length; j++) {
                    if (graph[i][j]) {
                        graph[i][j] = false;
                        graph[j][i] = false;
                        if (connected(graph, i, j)) {
                            count++;
                        }
                        graph[i][j] = true;
                        graph[j][i] = true;
                    }
                }
                if (count > 2) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean connected(boolean[][] graph, int v, int u) {
        int cc[] = new int[graph.length];
        findcc(graph, cc, v, 1);
        return cc[v] == cc[u];
    }

    boolean findcc(boolean[][] graph, int[] cc, int v, int id) {
        if (cc[v] > 0) { return false; }

        cc[v] = id;
        for (int i = 0; i < graph.length; i++) {
            if (graph[v][i]) {
                findcc(graph, cc, i, id);
            }
        }

        return true;
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
