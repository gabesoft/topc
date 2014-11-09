package topc.search;

import java.util.*;
import java.io.*;

// SRM 453.5 Division I Level One - 250
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10451&rd=14174
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+453.5
public class MazeMaker {
    public int longestPath(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol) {
        int n = maze.length;
        int m = maze[0].length();
        int max = 0;

        int[][] dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], -1);
        }

        solve(maze, dist, startRow, startCol, moveRow, moveCol);

        for (int i = 0; i < n; i++) {
            for (int j = 0;  j < m; j++) {
                if (maze[i].charAt(j) == 'X') { continue; }
                if (i == startRow && j == startCol) { continue; }

                int steps = dist[i][j];
                if (steps == -1) {
                    return -1;
                } else {
                    max = Math.max(max, steps);
                }
            }
        }

        return max;
    }

    private void solve(String[] maze, int[][] dist, int sr, int sc, int[] mr, int[] mc) {
        int n = maze.length;
        int m = maze[0].length();

        boolean seen[][] = new boolean[n][m];
        Node[] nodes     = new Node[Math.max(n, m) * n * m];

        int h = 0;
        int t = 0;

        nodes[t] = new Node(sr, sc, 0);
        t++;

        while (h < t) {
            int r = nodes[h].r;
            int c = nodes[h].c;
            int l = nodes[h].l;
            h++;

            if (seen[r][c]) { continue; }

            dist[r][c] = l;
            seen[r][c] = true;

            for (int i = 0; i < mr.length; i++) {
                int nr = r + mr[i];
                int nc = c + mc[i];
                if (0 <= nr && nr < n && 0 <= nc && nc < m && maze[nr].charAt(nc) != 'X') {
                    if (!seen[nr][nc]) {
                        nodes[t++] = new Node(nr, nc, l + 1);
                    }
                }
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Node {
        public final int r;
        public final int c;
        public final int l;

        public Node(int r, int c, int l) {
            this.r = r;
            this.c = c;
            this.l = l;
        }
    }
}
