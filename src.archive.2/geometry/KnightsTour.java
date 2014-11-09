package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 447 Division I Level One - 250
// geometry, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10577&rd=13901
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+447
public class KnightsTour {
    int[] dr = new int[] {-2,-2,-1,-1,1,1,2,2};
    int[] dc = new int[] {-1,1,-2,2,-2,2,-1,1};

    public int visitedPositions(String[] input) {
        int n = input.length;
        int m = input[0].length();

        int sr = -1;
        int sc = -1;

        char[][] board = new char[n][];
        for (int i = 0; i < n; i++) {
            board[i] = input[i].toCharArray();

            if (input[i].indexOf('K') != -1) {
                sr = i;
                sc = input[i].indexOf('K');
            }
        }

        int seen[][]   = new int[n][m];
        boolean change = true;
        int count      = 1;

        seen[sr][sc] = 1;

        while (change) {
            change = false;
            int nr = -1;
            int nc = -1;

            for (int i = 0; i < dr.length; i++) {
                int r = sr + dr[i];
                int c = sc + dc[i];

                if (!(0 <= r && r < n && 0 <= c && c < m)) { continue; }
                if (seen[r][c] == 1) { continue; }
                if (board[r][c] == '*') { continue; }

                if (nr == -1) {
                    nr = r;
                    nc = c;
                } else {
                    int a = accessibility(board, seen, r, c);
                    int b = accessibility(board, seen, nr, nc);

                    if (a < b) {
                        nr = r;
                        nc = c;
                    }
                }
            }

            if (nr != -1) {
                change = true;
                sr = nr;
                sc = nc;
                seen[sr][sc] = 1;
                count++;
            }
        }

        return count;
    }

    private int accessibility(char[][] board, int[][] seen, int r, int c) {
        int cnt = 0;
        for (int i = 0; i < dr.length; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (0 <= nr && nr < board.length && 0 <= nc && nc < board[0].length) {
                if (seen[nr][nc] == 0 && board[nr][nc] == '.') {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
