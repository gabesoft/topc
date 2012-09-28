package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 521 Division II Level Three - 1000
// geometry, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11438&rd=14546
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+521
public class SquaredSubsets {
    HashMap<String, Integer> map;
    HashSet<String> seen;
    int n;
    int x[];
    int y[];

    public long countSubsets(int n, int[] x, int[] y) {
        HashSet<Long> memo = new HashSet<Long>();

        int[] sx = pad(x);
        int[] sy = pad(y);

        Arrays.sort(sx);
        Arrays.sort(sy);

        for (int xi = 1; xi < sx.length; xi++) {
            for (int yi = 1; yi < sy.length; yi++) {
                for (int xj = xi; xj < sx.length - 1; xj++) {
                    for (int yj = yi; yj < sy.length - 1; yj++) {

                        int x0    = sx[xi];
                        int y0    = sy[yi];
                        int x1    = sx[xj];
                        int y1    = sy[yj];
                        long mask = 0;

                        if (isNSquare(n, x1 - x0, y1 - y0, sx[xj + 1] - sx[xi - 1], sy[yj + 1] - sy[yi - 1])) {
                            for (int k = 0; k < x.length; k++) {
                                if (inside(x0, y0, x1, y1, x[k], y[k])) {
                                    mask |= (1L << k);
                                }
                            }
                            if (mask > 0L) {
                                memo.add(mask);
                            }
                        }
                    }
                }
            }
        }
                        
        return memo.size();
    }

    boolean inside(int x0, int y0, int x1, int y1, int px, int py) {
        return (x0 <= px && px <= x1 && y0 <= py && py <= y1);
    }

    boolean isNSquare(int n, int nxi, int nyi, int nxj, int nyj){
        return Math.max(nxi, nyi) <= n && n < nxj && n < nyj;
    }

    int[] pad(int[] a) {
        int n      = a.length;
        int[] res  = new int[n + 2];
        res[n]     = Integer.MAX_VALUE / 4;
        res[n + 1] = -(Integer.MAX_VALUE / 4);

        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
