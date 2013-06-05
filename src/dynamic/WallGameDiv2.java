package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 580 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12579&rd=15500
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+580
public class WallGameDiv2 {
    int n;
    int m;
    int game[][];
    int memo[][][];

    public int play(String[] costs) {
        n = costs.length;
        m = costs[0].length();

        memo = new int[n][m][3];
        game = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = costs[i].charAt(j);
                game[i][j] = c == 'x' ? -1 : c - '0';
                Arrays.fill(memo[i][j], -1);
            }
        }


        return play(0, 0, 0);
    }

    private int play(int row, int col, int dir) {
        if (col < 0 || col >= m || game[row][col] == -1) { return -1; }
        if (row == n - 1) { return game[row][col]; }
        if (memo[row][col][dir + 1] > -1) { return memo[row][col][dir + 1]; }

        int max = -1;

        int a = play(row + 1, col, 0);
        int b = -1;
        int c = -1;
        if (dir == 0) {
            b = play(row, col + 1, 1);
            c = play(row, col - 1, -1);
        } else {
            b = play(row, col + dir, dir);
        }

        max = Math.max(max, a);
        max = Math.max(max, b);
        max = Math.max(max, c);

        if (max > -1) {
            max += game[row][col];
        }

        memo[row][col][dir + 1] = max;
        return max;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
