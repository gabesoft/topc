package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 550 Division I Level One - 300
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12033&rd=15172
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+550
public class RotatingBot {
    int dx[] = new int [] { 1, 0, -1, 0 };
    int dy[] = new int [] { 0, -1, 0, 1 };

    public int minArea(int[] moves) {
        if (moves.length == 1) { return moves[0] + 1; }

        int x[] = new int[4];
        int y[] = new int[4];

        int x0  = 0;
        int y0  = 0;
        int dir = 0;

        for (int i = 0; i < moves.length; i++) {
            int m = moves[i];

            x0 += dx[dir] * m;
            y0 += dy[dir] * m;

            dir += 1;
            dir %= 4;

            x[0] = Math.min(x[0], x0);
            y[0] = Math.min(y[0], y0);

            x[1] = Math.max(x[1], x0);
            y[1] = Math.min(y[1], y0);

            x[2] = Math.max(x[2], x0);
            y[2] = Math.max(y[2], y0);

            x[3] = Math.min(x[3], x0);
            y[3] = Math.max(y[3], y0);
        }

        int w = 1 + Math.max(x[1] - x[0], x[2] - x[3]);
        int h = 1 + Math.max(y[3] - y[0], y[2] - y[1]);

        int grid[][] = new int[h][w];

        int sx = w - moves[0] - 1;
        int sy = moves[1];

        if (sx < 0 || sy < 0) { return -1; }

        x0  = sx;
        y0  = sy;
        dir = 0;

        grid[y0][x0] = 1;

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < moves[i]; j++) {
                x0 += dx[dir];
                y0 += dy[dir];

                if (!valid(grid, x0, y0) || grid[y0][x0] == 1) {
                    return -1;
                }

                grid[y0][x0] = 1;
            }

            if (i < moves.length - 1) {
                int nx = x0 + dx[dir];
                int ny = y0 + dy[dir];

                if (valid(grid, nx, ny) && grid[ny][nx] != 1) {
                    return -1;
                }
            }

            dir += 1;
            dir %= 4;
        }

        return h * w;
    }

    private boolean valid(int[][] grid, int x, int y) {
        return x >= 0 && x < grid[0].length && y >= 0 && y < grid.length;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
