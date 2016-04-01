package topc.graph;

import java.util.*;

// SRM 653 Division I Level Two - 450
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13680&rd=16317
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+653
public class Singing {
    private int INF = 1 << 30;

    public int solve(int N, int low, int high, int[] pitch) {
        MaxFlow g = new MaxFlow();

        g.source = g.addVertex();
        for (int i = 1; i <= N; i++) {
            g.addVertex();
        }

        g.sink = g.addVertex();

        for (int i = 1; i < low; i++) {
            g.addEdge(g.source, i, INF, false);
        }
        for (int i = high + 1; i <= N; i++) {
            g.addEdge(i, g.sink, INF, false);
        }

        for (int i = 0; i + 1 < pitch.length; i++) {
            if (pitch[i] != pitch[i + 1]) {
                g.addEdge(pitch[i], pitch[i + 1], 1, true);
            }
        }

        return g.maxFlow();
    }

    @SuppressWarnings("unused")
	private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    // Max flow solver (Ford-Fulkerson)
    public class MaxFlow {
        public int source;
        public int sink;
        private int count;
        private ArrayList<String> edges;
        private boolean seen[];

        public MaxFlow () {
            this.count = 0;
            this.edges = new ArrayList<String>();
        }

        // Adds a new vertex and returns its id
        public int addVertex() {
            return this.count++;
        }

        // Adds an edge
        public void addEdge(int u, int v, int cost, boolean undirected) {
            edges.add(u + ":" + v + ":" + cost);
            if (undirected) {
                int w = this.addVertex();
                this.addEdge(v, w, cost, false);
                this.addEdge(w, u, cost, false);
            }
        }

        // Computes the max flow
        public int maxFlow() {
            int[][] g = new int[count][count];

            for (String e : edges) {
                String[] edge = e.split(":");

                int u    = Integer.parseInt(edge[0]);
                int v    = Integer.parseInt(edge[1]);
                int cost = Integer.parseInt(edge[2]);

                g[u][v] += cost;
            }

            int flow = 0;
            int c = INF;

            seen = new boolean[count];

            while (c > 0) {
                if (hasPath(this.source, this.sink, c, g)) {
                    flow += c;
                } else {
                    c /= 2;
                }

                Arrays.fill(seen, false);
            }

            return flow;
        }

        private boolean hasPath(int s, int t, int c, int[][] g) {
            if (s == t) { return true; }
            if (seen[s]) { return false; }

            seen[s] = true;

            for (int i = 0; i < count; i++) {
                if (g[s][i] >= c && hasPath(i, t, c, g)) {
                    g[s][i] -= c;
                    g[i][s] += c;
                    return true;
                }
            }

            return false;
        }
    }
}
