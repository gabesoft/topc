package topc.easy;

import java.util.*;
import java.io.*;

// SRM 425 Division I Level Two - 500
// brute force, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10117&rd=13516
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm425
public class PiecesMover {
    int [] dx = {0, 0, 1, -1};
    int [] dy = {1, -1, 0, 0}; 

    public int getMinimumMoves(String[] board) {
        int n      = 0;
        int grid[] = new int[5];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                if (board[i].charAt(j) == '*') {
                    grid[i] |= (1 << j);
                    n++;
                }
            }
        }

        Queue<Node> nodes    = new LinkedList<Node>();
        HashSet<String> seen = new HashSet<String>();

        nodes.offer(new Node(0, grid.clone()));

        while (nodes.size() > 0) {
            Node top = nodes.poll();

            if (top.connected(n)) { return top.moves; }
            if (seen.contains(top.toString())) { continue; }

            seen.add(top.toString());

            int curr[] = top.grid;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (((curr[i] >> j) & 1) == 1) {
                        for (int k = 0; k < dx.length; k++) {
                            int r = i + dx[k];
                            int c = j + dy[k];
                            if (0 <= r && r < 5 && 0 <= c && c < 5) {
                                int next[] = curr.clone();

                                next[i] &= ~(1 << j);
                                next[r] |= (1 << c);

                                nodes.offer(new Node(top.moves + 1, next));
                            }
                        }
                    }
                }
            }
        }

        return -1;
    }

    boolean[][] clone(boolean[][] grid) {
        boolean[][] copy = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[i].length; j++) {
                copy[i][j] = grid[i][j];
            }
        }
        return copy;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Node {
        public final int[] grid;
        public final int moves;

        public Node(int moves, int[] grid) {
            this.moves = moves;
            this.grid  = grid;
        }

        public String toString() {
            return Arrays.toString(grid);
        }

        public boolean connected(int n) {
            boolean seen[][] = new boolean[5][5];
            int r = -1;
            int c = -1;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (((grid[i] >> j) & 1) == 1) {
                        r = i;
                        c = j;
                    }
                }
            }

            return dfs(seen, r, c) == n;
        }

        int dfs(boolean[][] seen, int r, int c) {
            if (seen[r][c] || ((grid[r] >> c) & 1) == 0) { return 0; }

            seen[r][c] = true;

            int count = 1;
            for (int i = 0; i < dx.length; i++) {
                int nr = r + dx[i];
                int nc = c + dy[i];

                if (0 <= nr && nr < 5 && 0 <= nc && nc < 5) {
                    count += dfs(seen, nr, nc);
                }
            }

            return count;
        }
    }
}
