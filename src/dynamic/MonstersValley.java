package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 565 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12350&rd=15187
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+565
public class MonstersValley {
    long[] dread;
    int[] price;

    public int minimumPrice(long[] dread, int[] price) {
        this.dread = dread;
        this.price = price;

        long max = 0;
        for (int i = 0; i < dread.length; i++) {
            max = Math.max(max, dread[i]);
        }

        return dijkstra(0, max);
    }

    private int dijkstra(int start, long max) {
        PriorityQueue<Node> queue = new PriorityQueue<Node>();
        long costs[] = new long[101];

        queue.offer(new Node(start, dread[start], price[start]));
        while (queue.size() > 0) {
            Node top = queue.poll();

            if (top.dread >= max) { return top.cost; }

            for (int i = top.index + 1; i < dread.length; i++) {
                Node next = new Node(i, top.dread + dread[i], top.cost + price[i]);
                if (costs[next.cost] < next.dread) {
                    queue.offer(next);
                    costs[next.cost] = next.dread;
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
