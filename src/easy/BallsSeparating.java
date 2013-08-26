package topc.easy;

import java.util.*;
import java.io.*;

// SRM 568 Division I Level One - 250
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12398&rd=15488
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+568
public class BallsSeparating {
    int INF = 1 << 30;

    public int minOperations(int[] red, int[] green, int[] blue) {
        int res = INF;
        int n   = red.length;

        for (int r = 0; r < n; r++) {
            for (int g = 0; g < n; g++) {
                if (g == r) { continue; }

                for (int b = 0; b < n; b++) {
                    if (b == g || b == r) { continue; }

                    int moves = 0;
                    for (int i = 0; i < n; i++) {
                        int cr = blue[i] + green[i];
                        int cb = red[i] + green[i];
                        int cg = red[i] + blue[i];

                        if (i == r) {
                            moves += cr;
                        } else if (i == g) {
                            moves += cg;
                        } else if (i == b) {
                            moves += cb;
                        } else {
                            moves += Math.min(cr, Math.min(cb, cg));
                        }
                    }

                    res = Math.min(res, moves);
                }
            }
        }

        return res == INF ? -1 : res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
