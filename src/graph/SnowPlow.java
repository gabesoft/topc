package topc.graph;

import java.util.*;
import java.io.*;

// TCO10 Round 2 Division I Level One - 250
// graph theory, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10946&rd=14280
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'10+Online+Round+2
public class SnowPlow {
    public int solve(String[] roads) {
        int n = roads.length;

        int time = 0;

        boolean[][] seen  = new boolean[n][n];
        Queue<Node> nodes = new LinkedList<Node>();

        nodes.offer(new Node(0, 0, 0));

        while (nodes.size() > 0) {
            Node top = nodes.poll();

            int a = Math.min(top.index, top.from);
            int b = Math.max(top.index, top.from);

            if (seen[a][b]) { continue; }

            time += top.time;
            seen[a][b] = true;

            for (int i = 0; i < n; i++) {
                int t = roads[top.index].charAt(i) - '0';
                if (t > 0) {
                    nodes.offer(new Node(i, top.index, t * 2));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (roads[i].charAt(j) != '0' && !seen[i][j]) {
                    return -1;
                }
            }
        }

        return time;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node {
        public final int index;
        public final int from;
        public final int time;

        public Node(int index, int from, int time) {
            this.index = index;
            this.time  = time;
            this.from  = from;
        }

        public String toString() {
            return String.format("%s:%s", index, time);
        }
    }
}
