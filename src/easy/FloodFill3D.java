package topc.easy;

import java.util.*;
import java.io.*;

// TCO12 Semifinal 1 Division I Level One - 250
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12165&rd=15150
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class FloodFill3D {
    int dr[] = new int[] { -1, 1, 0, 0 };
    int dc[] = new int[] { 0, 0, 1, -1 };

    public long countBlack(String[] sArray, String[] tArray, String[] uArray) {
        String s = join(sArray);
        String t = join(tArray);
        String u = join(uArray);

        int ns = s.length();
        int nt = t.length();
        int nu = u.length();

        int xslice[][] = new int[ns][nt];
        int oslice[][] = new int[ns][nt];

        for (int i = 0; i < ns; i++) {
            char cs = s.charAt(i);
            for (int j = 0; j < nt; j++) {
                char ct = t.charAt(j);
                xslice[i][j] = cs == ct && ct == 'x' ? 0 : 1;
                oslice[i][j] = cs == ct && ct == 'o' ? 0 : 1;
            }
        }

        long xwhite = count(xslice, 0);
        long owhite = count(oslice, 0);
        int st      = 0;
        int en      = nu - 1;

        long white  = 0;
        while (st < nu && u.charAt(st) == u.charAt(0)) {
            white += (u.charAt(st++) == 'x') ? xwhite : owhite;
        }
        while (en > st && u.charAt(en) == u.charAt(nu - 1)) {
            white += (u.charAt(en--) == 'x') ? xwhite : owhite;
        }

        for (int i = 0; i < ns; i++) {
            for (int j = 0; j < nt; j++) {
                if (xslice[i][j] == oslice[i][j] && xslice[i][j] == 0) {
                    flood(xslice, i, j, 2);
                    flood(oslice, i, j, 2);
                }
            }
        }

        floodBorders(xslice, 2);
        floodBorders(oslice, 2);

        long xborder = count(xslice, 2);
        long oborder = count(oslice, 2);

        for (int i = st; i < en + 1; i++) {
            white += (u.charAt(i) == 'x') ? xborder : oborder;
        }

        return (long)ns * (long)nt * (long)nu - white;
    }

    private void floodBorders(int[][] slice, int x) {
        for (int i = 0; i < slice.length; i++) {
            flood(slice, i, 0, x);
            flood(slice, i, slice[0].length - 1, x);
        }
        for (int i = 0; i < slice[0].length; i++) {
            flood(slice, 0, i, x);
            flood(slice, slice.length - 1, i, x);
        }
    }

    private void flood(int[][] slice, int r, int c, int x) {
        if (slice[r][c] != 0) { return; }

        slice[r][c] = x;

        int n = slice.length;
        int m = slice[0].length;

        int rmax = 0;
        int rmin = 0;
        int cmin = 0;
        int cmax = 0;

        for (int i = r + 1; i < n; i++) {
            if (slice[i][c] == 0) {
                slice[i][c] = x;
                rmax = i;
            } else {
                break;
            }
        }

        for (int i = r - 1; i > -1; i--) {
            if (slice[i][c] == 0) {
                slice[i][c] = x;
                rmin = i;
            } else {
                break;
            }
        }

        for (int i = c + 1; i < m; i++) {
            if (slice[r][i] == 0) {
                slice[r][i] = x;
                cmax = i;
            } else {
                break;
            }
        }

        for (int i = c - 1; i > -1; i--) {
            if (slice[r][i] == 0) {
                slice[r][i] = x;
                cmin = i;
            } else {
                break;
            }
        }

        for (int i = rmin; i <= rmax; i++) {
            if (i == r) { continue; }
            if (c - 1 >= 0) {
                flood(slice, i, c - 1, x);
            }
            if (c + 1 < m) {
                flood(slice, i, c + 1, x);
            }
        }

        for (int i = cmin; i <= cmax; i++) {
            if (i == c) { continue; }
            if (r - 1 >= 0) {
                flood(slice, r - 1, i, x);
            }
            if (r + 1 < n) {
                flood(slice, r + 1, i, x);
            }
        }
    }

    private long count(int[][] slice, int x) {
        long c = 0;

        for (int i = 0; i < slice.length; i++) {
            for (int j = 0; j < slice[0].length; j++) {
                c += (slice[i][j] == x) ? 1 : 0;
            }
        }
        return c;
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
