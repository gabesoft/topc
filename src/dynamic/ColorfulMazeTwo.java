package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 464 Division II Level Three - 1000
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10742&rd=14149
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+464
public class ColorfulMazeTwo {
    public double getProbability(String[] maze, int[] trap) {
        int n = maze.length;
        int m = maze[0].length();

        int[][] move   = new int[][] { new int[] { -1, 0, 1, 0 }, new int[] { 0, -1, 0, 1 } };
        int[][][] seen = new int[n][m][(1 << 7) + 1];

        Queue<Node> queue = new PriorityQueue<Node>();

        queue.offer(getStartNode(maze));

        while (queue.size() > 0) {
            Node top = queue.poll();
            int r    = top.row;
            int c    = top.col;
            int s    = top.seen;

            if (maze[r].charAt(c) == '!') { return top.prob; }
            if (seen[r][c][s] == 1) { continue; }

            seen[r][c][s] = 1;

            for (int i = 0; i < move[0].length; i++) {
                int newr = r + move[0][i];
                int newc = c + move[1][i];

                if (0 <= newr && newr < n && 0 <= newc && newc < m) {
                    char newp = maze[newr].charAt(newc);

                    if (newp != '#' && newp != '$') {
                        int newv    = newp - 'A';
                        double prob = getProb(newp, trap, top.seen);

                        Node next = new Node(newr, newc, top.prob * (1.0 - prob));
                        next.seen = top.seen;

                        if (newv > -1) {
                            next.seen = next.seen | (1 << newv);
                        }

                        queue.offer(next);
                    }
                }
            }
        }

        return 0.0;
    }

    Node getStartNode(String[] maze) {
        int sr = -1;
        int sc = -1;

        for (int i = 0; i < maze.length; i++) {
            int si = maze[i].indexOf('$');

            if (si > -1) { 
                sc = si;
                sr = i;
                break;
            }
        }

        return new Node(sr, sc, 1.0);
    }

    double getProb(char c, int[] trap, int seen) {
        if (c == '$' || c == '!' || c == '.') {
            return 0;
        } else {
            int v = c - 'A';
            return ((seen >> v) & 1) == 1 ? 0 : trap[v] / 100.0;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node implements Comparable<Node> {
        public final int row;
        public final int col;
        public final double prob;
        public int seen;

        public Node(int r, int c, double p) {
            prob = p;
            seen = 0;
            row  = r;
            col  = c;
        }

        public int compareTo(Node other) {
            return Double.valueOf(other.prob).compareTo(prob);
        }
    }
}
