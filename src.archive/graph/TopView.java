package topc.graph;

import java.util.*;
import java.io.*;

// SRM 550 Division II Level Three - 1000
// graph theory, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11494&rd=15172
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+550
public class TopView {
    int n;
    int[] id;

    public String findOrder(String[] grid) {
        n  = 0;
        id = new int[256];

        Arrays.fill(id, -1);

        int[][] board  = new int[grid.length][grid[0].length()];
        boolean[] seen = new boolean[256];

        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], -1);
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length(); j++) {
                char c = grid[i].charAt(j);
                if (c != '.') { 
                    seen[c] = true;
                }
            }
        }

        for (int i = 0; i < id.length; i++) {
            if (seen[i]) {
                id[i] = n++;
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length(); j++) {
                char c = grid[i].charAt(j);
                if (c != '.') {
                    board[i][j] = id[c];
                }
            }
        }

        int[][] graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] bounds = getBounds(i, board);
            int rmin = bounds[0];
            int rmax = bounds[1];
            int cmin = bounds[2];
            int cmax = bounds[3];

            for (int j = rmin; j < rmax + 1; j++) {
                for (int k = cmin; k < cmax + 1; k++) {
                    if (board[j][k] == -1) {
                        return "ERROR!";
                    }
                    if (board[j][k] != i) {
                        graph[board[j][k]][i] = 1;
                    }
                }
            }

        }

        int[] sorted = topoSort(graph);

        if (sorted == null) { return "ERROR!"; }

        String res = "";
        for (int i = 0; i < sorted.length; i++) {
            char c = idToChar(sorted[i]);
            res += c;
        }

        return res;
    }

    int[] topoSort(int[][] graph) {
        boolean[] seen = new boolean[n];
        int[] topo     = new int[n];

        int idx = 0;
        while (idx < n) {
            int curr = idx;
            for (int i = 0; i < n; i++) {
                if (seen[i]) { continue; }
                boolean ok = true;
                for (int j = 0; j < n; j++) {
                    if (!seen[j] && graph[i][j] == 1) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    topo[idx++] = i;
                    seen[i]  = true;
                    break;
                }
            }

            if (curr == idx) { return null; }
        }

        return topo;
    }

    char idToChar(int x) {
        for (int i = 0; i < id.length; i++) {
            if (id[i] == x) {
                return (char)i;
            }
        }

        assert false : "should never get here";
        return '.';
    }

    int[] getBounds(int x, int[][] board) {
        int rmin = board.length;
        int rmax = -1;
        int cmin = board[0].length;
        int cmax = -1;

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == x) {
                    rmin = Math.min(rmin, r);
                    rmax = Math.max(rmax, r);
                    cmin = Math.min(cmin, c);
                    cmax = Math.max(cmax, c);
                }
            }
        }

        return new int[] { rmin, rmax, cmin, cmax };
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
