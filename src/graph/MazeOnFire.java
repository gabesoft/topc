package topc.graph;

import java.util.*;
import java.io.*;

// SRM 467 Division II Level Three - 1000
// graph theory, search, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10695&rd=14151
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+467
public class MazeOnFire {
    int [] dx = {0, 0, 1, -1};
    int [] dy = {1, -1, 0, 0}; 

    public int maximumTurns(String[] maze) {
        int n = maze.length;
        int m = maze[0].length();

        int[][] fire  = calculateFire(maze);
        int[][] moves = calculateMoves(maze, fire);

        if (moves == null) { return -1; }

        int best = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (moves[i][j] > -1 && fire[i][j] > -1 && fire[i][j] >= moves[i][j]) {
                    best = Math.max(best, fire[i][j]);
                }
            }
        }

        return best;
    }

    int[][] calculateFire(String[] maze) {
        int n = maze.length;
        int m = maze[0].length();

        int[][] fire = new int[n][m];

        for (int i = 0; i < n; i++) { Arrays.fill(fire[i], -1); }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maze[i].charAt(j) == 'F') {
                    fire[i][j] = 0;
                }
                if (maze[i].charAt(j) == '#') {
                    fire[i][j] = -2;
                }
            }
        }

        boolean update = true;
        while (update) {
            update = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (fire[i][j] > -1) {
                        for (int k = 0; k < dx.length; k++) {
                            int r = i + dx[k];
                            int c = j + dy[k];

                            if (0 <= r && r < n && 0 <= c && c < m && fire[r][c] != -2) {
                                if (fire[r][c] == -1 || fire[r][c] > fire[i][j] + 1) {
                                    fire[r][c] = fire[i][j] + 1;
                                    update = true;
                                }
                            }
                        }
                    }
                }
            }

        }

        return fire;
    }

    int[][] calculateMoves(String[] maze, int[][] fire) {
        int n = maze.length;
        int m = maze[0].length();

        Queue<Integer> nodes = new LinkedList<Integer>();
        boolean[][] seen     = new boolean[n][m];
        int[][] moves        = new int[n][m];

        for (int i = 0; i < n; i++) { Arrays.fill(moves[i], -1); }

        int sr = -1;
        int sc = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (maze[i].charAt(j) == '$') {
                    sr = i;
                    sc = j;
                    break;
                }
            }
        }

        nodes.offer(sr);
        nodes.offer(sc);
        nodes.offer(0);

        boolean fireReachable = false;
        while (nodes.size() > 0) {
            int r = nodes.poll();
            int c = nodes.poll();
            int x = nodes.poll();

            if (r < 0 || r >= n) { continue; }
            if (c < 0 || c >= m) { continue; }
            if (maze[r].charAt(c) == '#') { continue; }
            if (seen[r][c]) { continue; }
            if (maze[r].charAt(c) == 'F') { 
                moves[r][c]   = -2;
                fireReachable = true;
                continue;
            }

            seen[r][c]  = true;

            if (fire[r][c] > -1 && fire[r][c] < x) { 
                fireReachable = true;
                continue;
            }
            if (fire[r][c] > -1 && fire[r][c] == x) { 
                fireReachable = true;
                moves[r][c] = x;
                continue;
            }

            moves[r][c] = x;

            for (int i = 0; i < dx.length; i++) {
                nodes.offer(r + dx[i]);
                nodes.offer(c + dy[i]);
                nodes.offer(x + 1);
            }
        }

        return fireReachable ? moves : null;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
