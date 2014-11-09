package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 238 Division I Level Two - 500
// dynamic programming, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4506&rd=6537
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm238
public class SequenceSync {
    public int getLength(String[] transitions) {
        int n     = transitions.length;
        int T[][] = new int[n][4];

        for (int i = 0; i < n; i++) {
            String parts[] = transitions[i].split("\\s+");
            for (int j = 0; j < parts.length; j++) {
                T[i][j] = Integer.parseInt(parts[j]);
            }
        }

        Queue<Node> nodes = new LinkedList<Node>();
        boolean seen[]    = new boolean[1 << n];

        nodes.offer(new Node((1 << n) - 1, 0));

        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (top.done()) { return top.count; }
            if (seen[top.state]) { continue; }

            seen[top.state] = true;

            for (int i = 0; i < 4; i++) {
                int next = 0;

                for (int j = 0; j < n; j++) {
                    if (((top.state >> j) & 1) == 1) {
                        next |= (1 << T[j][i]);
                    }
                }

                nodes.offer(new Node(next, top.count + 1));
            }
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node {
        public final int state;
        public final int count;

        public Node(int s, int c) {
            state = s;
            count = c;
        }

        public boolean done() {
            return Integer.bitCount(state) == 1;
        }
    }
}
