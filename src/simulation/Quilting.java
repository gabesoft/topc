package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 160 Division I Level Two - 500
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1608&rd=4605
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm160
public class Quilting {
    int[] dr = new int[] { -1,  0, 1, 1, 1, 0, -1, -1 };
    int[] dc = new int[] { -1, -1, -1, 0, 1, 1,  1, 0 };

    public String lastPatch(int length, int width, String[] colorList) {
        int n = colorList.length;

        Color[] colors = new Color[n];
        for (int i = 0; i < n; i++) {
            colors[i] = new Color(i, colorList[i]);
        }

        int m   = Math.max(length, width);
        int max = length * width;

        int[][] grid = new int[m][m];

        grid[m / 2][m / 2] = 1;
        fill(grid, 2, 2, -1, m / 2 - 1, m / 2);

        int[][] loc = new int[m * m][];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                loc[grid[i][j] - 1] = new int[] { i, j };
            }
        }

        Color last = null;
        Color[][] quilt = new Color[m][m];

        for (int i = 0; i < max; i++) {
            int r = loc[i][0];
            int c = loc[i][1];

            for (int j = 0; j < n; j++) {
                colors[j].neighbors = 0;
            }

            for (int j = 0; j < dr.length; j++) {
                int nr = r + dr[j];
                int nc = c + dc[j];
                if (nr > -1 && nc > -1 && nr < m && nc < m && quilt[nr][nc] != null) {
                    quilt[nr][nc].neighbors++;
                }
            }

            Arrays.sort(colors);
            colors[0].used++;

            quilt[r][c] = colors[0];
            last        = colors[0];
        }

        return last.text;
    }

    private void fill(int[][] data, int k, int v, int dir, int r, int c) {
        if (r == -1 || c == -1 || r == data.length || c == data[0].length) {
            return;
        }
        for (int i = 0; i < k - 1; i++) {
            data[r][c] = v;
            v += 1;
            c += dir;
        }
        for (int i = 0; i < k; i++) {
            data[r][c] = v;
            v += 1;
            r += (-dir);
        }
        fill(data, k + 1, v, -dir, r, c);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Color implements Comparable<Color> {
        public int neighbors;
        public int used;
        public final int index;
        public final String text;

        public Color(int index, String text) {
            this.index     = index;
            this.text      = text;
            this.neighbors = 0;
            this.used      = 0;
        }

        public int compareTo(Color c) {
            if (neighbors != c.neighbors) {
                return neighbors - c.neighbors;
            }
            if (used != c.used) {
                return used - c.used;
            }
            return index - c.index;
        }

        public String toString() {
            return text;
        }
    }
}
