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
            //debug('x', i, xslice[i]);
        }


        //for (int i = 0; i < ns; i++) {
        //debug('o', i, oslice[i]);
        //}

        long white  = 0;
        long xwhite = count(xslice, 0);
        long owhite = count(oslice, 0);
        int st      = 0;
        int en      = nu - 1;

        while (st < nu && u.charAt(st) == u.charAt(0)) {
            white += (u.charAt(st++) == 'x') ? xwhite : owhite;
        }
        while (en > st && u.charAt(en) == u.charAt(nu - 1)) {
            white += (u.charAt(en--) == 'x') ? xwhite : owhite;
        }

        //debug("BEFORE", white, st, en);

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

        //for (int i = 0; i < ns; i++) {
        //debug('o', i, oslice[i]);
        //}


        long xborder = count(xslice, 2);
        long oborder = count(oslice, 2);

        for (int i = st; i < en + 1; i++) {
            white += (u.charAt(i) == 'x') ? xborder : oborder;
        }

        //debug(ns, nt, nu, xwhite, owhite, xborder, oborder, white);

        long L = ns;
        long M = nt;
        long W = nu;

        return L * M * W - white;
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

    private void flood(int[][] slice, int row, int col, int x) {
        if (slice[row][col] != 0) { return; }

        int n = slice.length;
        int m = slice[0].length;
        //int k = 2 * Math.max(m, n);
        int k = m * n;

        int rows[] = new int[k];
        int cols[] = new int[k];

        int h = 0;
        int t = 0;

        rows[t] = row;
        cols[t] = col;
        t++;

        while (h < t) {
            int r = rows[h];
            int c = cols[h];
            h++;
            if (h >= k) {
                h -= k;
            }

            slice[r][c] = x;

            for (int i = 0; i < dr.length; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (0 <= nr && nr < n && 0 <= nc && nc < m && slice[nr][nc] == 0) {
                    rows[t] = nr;
                    cols[t] = nc;
                    t++;
                    if (t >= k) {
                        t -= k;
                    }
                }
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
