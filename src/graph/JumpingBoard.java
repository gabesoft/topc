package topc.graph;

import java.util.*;
import java.io.*;

// SRM 368 Division I Level One - 250
// graph theory, recursion, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8245&rd=10936
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm368
public class JumpingBoard {
    int INF  = 987654321;
    int THR  = 900000000;
    int[] dr = {-1,1,0,0};
    int[] dc = {0,0,-1,1};

    int memo[][];
    String B[];
    int R;
    int C;

    public int maxJumps(String[] board) {
        B    = board;
        R    = board.length;
        C    = board[0].length();
        memo = new int[R][C];

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (B[r].charAt(c) == 'H') {
                    memo[r][c] = 0;
                } else {
                    memo[r][c] = -1;
                }
            }
        }

        int x = rec(0, 0);
        return (x > THR) ? -1 : x;
    }

    int rec(int r, int c) {
        if (r < 0 || r >= R || c < 0 || c >= C) { return 0; }
        if (memo[r][c] >= 0) { return memo[r][c]; }
        if (memo[r][c] == -2) { return INF; }

        memo[r][c] = -2;

        int res  = 0;
        int jump = B[r].charAt(c) - '0';

        for (int d = 0; d < 4; d++) {
            res = Math.max(res, 1 + rec(r + jump * dr[d], c + jump * dc[d]));
        }

        memo[r][c] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
