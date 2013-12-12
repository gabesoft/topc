package topc.search;

import java.util.*;
import java.io.*;

// SRM 562 Division I Level One - 250
// brute force, simple search, iteration, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12317&rd=15184
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+562
public class PastingPaintingDivOne {
    public long[] countColors(String[] clipboard, int T) {
        int n = clipboard.length;
        int m = clipboard[0].length();

        int orig[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                orig[i][j] = code(clipboard[i].charAt(j));
            }
        }

        int pic[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            pic[i] = orig[i].clone();
        }

        long r = 0;
        long g = 0;
        long b = 0;

        long t = 0;
        long rgb[] = null;
        for (int i = 0; i < Math.min(m, n); i++) {
            if (t == T - 1) { break; }

            rgb = countBorder(pic);

            r += rgb[0];
            g += rgb[1];
            b += rgb[2];

            pic = paste(pic, orig);

            t++;
        }

        if (t < T - 1) {
            long mul = (T - 1) - t;
            r += mul * rgb[0];
            g += mul * rgb[1];
            b += mul * rgb[2];
        }

        rgb = countAll(pic);

        r += rgb[0];
        g += rgb[1];
        b += rgb[2];

        return new long[] { r, g, b };
    }

    private int[][] paste(int[][] pic, int[][] orig) {
        int n = pic.length;
        int m = pic[0].length;
        int next[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            next[i] = orig[i].clone();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (next[i - 1][j - 1] == 0) {
                    next[i - 1][j - 1] = pic[i][j];
                }
            }
        }

        return next;
    }

    private int code(char c) {
        switch (c) {
            case 'R': return 1;
            case 'G': return 2;
            case 'B': return 3;
        }
        return 0;
    }

    private long[] countAll(int[][] pic) {
        long counts[] = new long[3];
        for (int i = 0; i < pic.length; i++) {
            for (int j = 0; j < pic[0].length; j++) {
                if (pic[i][j] > 0) {
                    counts[pic[i][j] - 1]++;
                }
            }
        }
        return counts;
    }

    private long[] countBorder(int[][] pic) {
        long counts[] = new long[3];
        if (pic[0][0] > 0) {
            counts[pic[0][0] - 1]++;
        }
        for (int i = 1; i < pic.length; i++) {
            if (pic[i][0] > 0) {
                counts[pic[i][0] - 1]++;
            }
        }
        for (int i = 1; i < pic[0].length; i++) {
            if (pic[0][i] > 0) {
                counts[pic[0][i] - 1]++;
            }
        }
        return counts;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
