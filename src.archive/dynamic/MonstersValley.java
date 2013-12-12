package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 565 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12350&rd=15187
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+565
public class MonstersValley {
    final long INF = 51 * 1000000000000L;

    int n;
    long[] dread;
    int[] price;

    public int minimumPrice(long[] dread, int[] price) {
        this.dread = dread;
        this.price = price;
        this.n     = dread.length;

        long max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dread[i]);
        }

        return dijkstra(0, max);
        //return dp();
    }

    private int dp() {
        long[][] maxDread = new long[2 * n + 1][n + 1];

        for (int p = 0; p <= 2 * n; p++) {
            maxDread[p][0] = 0;
            for (int i = 1; i < n + 1; i++) {
                maxDread[p][i] = -INF;
                if (p >= price[i - 1]) {
                    maxDread[p][i] = maxDread[p - price[i - 1]][i - 1] + dread[i - 1];
                }
                if (maxDread[p][i - 1] >= dread[i - 1]) {
                    maxDread[p][i] = Math.max(maxDread[p][i], maxDread[p][i - 1]);
                }
            }
        }

        for (int p = 0; p <= 2 * n; p++) {
            if (maxDread[p][n] >= 0) {
                return p;
            }
        }

        return 2 * n;
    }

    private int dijkstra(int start, long max) {
        PriorityQueue<Node> queue = new PriorityQueue<Node>();
        long maxDread[] = new long[2 * n + 1];

        queue.offer(new Node(start, dread[start], price[start]));
        while (queue.size() > 0) {
            Node top = queue.poll();

            if (top.dread >= max) { return top.cost; }

            for (int i = top.index + 1; i < n; i++) {
                Node next = new Node(i, top.dread + dread[i], top.cost + price[i]);
                if (maxDread[next.cost] < next.dread) {
                    queue.offer(next);
                    maxDread[next.cost] = next.dread;
                }
                if (top.dread < dread[i]) {
                    break;
                }
            }
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node implements Comparable<Node> {
        public final int index;
        public final long dread;
        public final int cost;

        public Node(int index, long dread, int cost) {
            this.index = index;
            this.cost  = cost;
            this.dread = dread;
        }

        public int compareTo(Node o) {
            return cost - o.cost;
        }

        public String toString() {
            return String.format("%s:(%s,%s)", index, cost, dread);
        }
    }
}
