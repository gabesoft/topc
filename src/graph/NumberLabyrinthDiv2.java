package topc.graph;

import java.util.*;
import java.io.*;

// SRM 509 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11137&rd=14438
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+509
public class NumberLabyrinthDiv2 {
    public int getMinimumNumberOfMoves(String[] board, int r1, int c1, int r2, int c2, int K) {
        int n = board.length;
        int m = board[0].length();

        Queue<Node> nodes  = new LinkedList<Node>();
        boolean[][][] seen = new boolean[n][m][K + 1];

        nodes.offer(new Node(r1, c1, K, 0));

        while (nodes.size() > 0) {
            Node top  = nodes.poll();

            if (top.r < 0 || top.r >= n) { continue; }
            if (top.c < 0 || top.c >= m) { continue; }

            int r     = top.r;
            int c     = top.c;
            int k     = top.k;
            int v     = board[r].charAt(c) - '0';
            int moves = top.moves;

            if (r == r2 && c == c2) { return moves; }
            if (seen[r][c][k]) { continue; }

            seen[r][c][k] = true;

            if (v > 0) {
                addNodes(nodes, r, c, v, k, moves + 1);
            } else if (v < 0 && k > 0) {
                for (int i = 1; i < 10; i++) {
                    addNodes(nodes, r, c, i, k - 1, moves + 1);
                }
            }
        }

        return -1;
    }

    void addNodes(Queue<Node> nodes, int r, int c, int v, int k, int moves) {
        nodes.offer(new Node(r + v, c, k, moves));
        nodes.offer(new Node(r - v, c, k, moves));
        nodes.offer(new Node(r, c + v, k, moves));
        nodes.offer(new Node(r, c - v, k, moves));
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node {
        public final int r;
        public final int c;
        public final int k;
        public final int moves;

        public Node(int r, int c, int k, int moves) {
            this.r     = r;
            this.c     = c;
            this.k     = k;
            this.moves = moves;
        }
    }
}
