package topc.search;

import java.util.*;
import java.io.*;

// SRM 490 Division II Level Three - 1000
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11230&rd=14243
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+490
public class Hieroglyphs {
    public int minimumVisible(String[] hier1, String[] hier2) {
        String[] h1 = join(hier1).split(",");
        String[] h2 = join(hier2).split(",");

        int n          = h1.length;
        int m          = h2.length;
        int hc1[][]    = new int[n][];
        int hc2[][]    = new int[m][];
        int horz[][][] = new int[81][n][];
        int vert[][][] = new int[81][n][];
        int horzn[]    = new int[81];
        int vertn[]    = new int[81];

        for (int i = 0; i < n; i++) {
            String[] coord1 = h1[i].split(" ");

            hc1[i] = new int[] { 
                Integer.parseInt(coord1[0]),
                    Integer.parseInt(coord1[1]),
                    Integer.parseInt(coord1[2]),
                    Integer.parseInt(coord1[3])
            };

            if (hc1[i][0] == hc1[i][2]) {
                int x1 = hc1[i][0];
                vert[x1][vertn[x1]++] = hc1[i];
            } else {
                int y1 = hc1[i][1];
                horz[y1][horzn[y1]++] = hc1[i];
            }
        }

        for (int i = 0; i < m; i++) {
            String[] coord2 = h2[i].split(" ");

            hc2[i] = new int[] { 
                Integer.parseInt(coord2[0]),
                    Integer.parseInt(coord2[1]),
                    Integer.parseInt(coord2[2]),
                    Integer.parseInt(coord2[3])
            };
        }

        int sum = sumLengths(hc1) + sumLengths(hc2);
        int maxIntersection = 0;

        for (int dx = -80; dx <= 80; dx++) {
            for (int dy = -80; dy <= 80; dy++) {
                int inter = 0;

                for (int j = 0; j < hc2.length; j++) {
                    int x1 = hc2[j][0], y1 = hc2[j][1], x2 = hc2[j][2], y2 = hc2[j][3];

                    if (y1 == y2) {
                        int y = y1 + dy;
                        if (y >= 0 && y <= 80) {
                            for (int i = 0; i < horzn[y]; i++) {
                                inter += intersection(horz[y][i], hc2[j], dx, dy);
                            }
                        }
                    } else {
                        int x = x1 + dx;
                        if (x >= 0 && x <= 80) {
                            for (int i = 0; i < vertn[x]; i++) {
                                inter += intersection(vert[x][i], hc2[j], dx, dy);
                            }
                        }
                    }
                }

                maxIntersection = Math.max(maxIntersection, inter);
            }
        }

        return sum - maxIntersection;
    }

    int overlap(int a, int b, int c, int d) {
        int d1 = Math.max(a, c);
        int d2 = Math.min(b, d);
        return Math.max(d2 - d1, 0);
    }

    int intersection(int[] a, int[] b, int dx, int dy) {
        int ax1 = a[0], ay1 = a[1], ax2 = a[2], ay2 = a[3];
        int bx1 = b[0], by1 = b[1], bx2 = b[2], by2 = b[3];

        if (ax1 == ax2) { // vertical
            if (bx1 == bx2 && bx1 + dx == ax1) {
                return overlap(ay1, ay2, by1 + dy, by2 + dy);
            }
        } else {          // horizontal
            if (by1 == by2 && by1 + dy == ay1) {
                return overlap(ax1, ax2, bx1 + dx, bx2 + dx);
            }
        }

        return 0;
    }

    int segmentLength(int[] a) {
        int ax1 = a[0], ay1 = a[1], ax2 = a[2], ay2 = a[3];
        if (ax1 == ax2) {   // vertical
            return ay2 - ay1;
        } else {            // horizontal
            return ax2 - ax1;
        }
    }

    int sumLengths(int h[][]) {
        int res = 0;
        for (int i = 0; i < h.length; i++) {
            res += segmentLength(h[i]);
        }
        return res;
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
            builder.append(",");
        }
        return builder.toString().substring(0, builder.length() - 1);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
