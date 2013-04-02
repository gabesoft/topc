package topc.math;

import java.util.*;
import java.io.*;

// SRM 288 Division II Level Three - 1000
// brute force, math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6030&rd=9809
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm288
public class TurnOffLights {
    int[] dr    = new int[] { -1, 1, 0, 0 };
    int[] dc    = new int[] { 0, 0, -1, 1 };
    int[] moves = new int[16];

    public int fewestMoves(String[] board) {
        int n     = 1 << 16;
        int start = 0;
        int h     = n;
        int t     = n + 1;
        int qs[]  = new int[10 * n];
        int qc[]  = new int[10 * n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                int k = i * 4 + j;
                int v = board[i].charAt(j) - '0';
                if (v == 1) {
                    start = on(start, k);
                }
            }
        }

        for (int i = 0; i < 16; i++) {
            moves[i] |= 1L << i;
            if (i <= 11)   { moves[i] |= 1L << (i + 4); }
            if (i >= 4)    { moves[i] |= 1L << (i - 4); }
            if (i % 4 > 0) { moves[i] |= 1L << (i - 1); }
            if (i % 4 < 3) { moves[i] |= 1L << (i + 1); }
        }

        Queue<Node> nodes = new PriorityQueue<Node>();
        boolean seen[]    = new boolean[n];

        nodes.offer(new Node(start, 0));
        seen[start] = true;

        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (top.value == 0) { return top.count; }

            for (int i = 0; i < 16; i++) {
                int next1 = press(top.value, i);
                int next2 = hold(top.value, i);

                if (!seen[next1]) {
                    seen[next1] = true;
                    nodes.offer(new Node(next1, top.count + 1));
                }
                if (!seen[next2]) {
                    seen[next2] = true;
                    nodes.offer(new Node(next2, top.count + 2));
                }
            }
        }

        return 0;
    }

    int press(int state, int k) {
        return state ^ moves[k];
    }

    int hold(int state, int k) {
        return flip(state, k);
    }

    boolean isOff(int mask, int bit) {
        return !isOn(mask, bit);
    }

    boolean isOn(int mask, int bit) {
        return ((mask >> bit) & 1) == 1;
    }

    int flip(int mask, int bit) {
        return mask ^ (1 << bit);
    }

    int on(int mask, int bit) {
        return mask | (1 << bit);
    }

    int off(int mask, int bit) {
        return mask & ~(1 << bit);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node implements Comparable<Node> {
        public final int value;
        public final int count;

        public Node(int value, int count) {
            this.value = value;
            this.count = count;
        }

        public int compareTo(Node other) {
            return count - other.count;
        }
    }
}
