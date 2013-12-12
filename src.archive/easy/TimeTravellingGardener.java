package topc.easy;

import java.util.*;
import java.io.*;

// SRM 492 Division I Level One - 250
// brute force, geometry, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11060&rd=14245
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+492
public class TimeTravellingGardener {
    public int determineUsage(int[] distance, int[] height) {
        int n   = height.length;
        int[] x = new int[n];

        for (int i = 0; i < distance.length; i++) {
            x[i + 1] = x[i] + distance[i];
        }

        int best = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int curr = count(x, height, i, j);
                    if (curr > -1) {
                        best = Math.min(best, curr);
                    }
                }
            }
        }

        return best;
    }

    private int count(int[] x, int[] y, int a, int b) {
        int x1 = x[a];
        int y1 = y[a];
        int x2 = x[b];
        int y2 = y[b];

        int c = 0;
        for (int i = 0; i < x.length; i++) {
            if (i == a || i == b) { continue; }

            int k = check(x1, y1, x2, y2, x[i], y[i]);
            if (k < 0) {                // below
                return -1;
            } else if (k > 0) {         // above
                c++;
            }
        }

        return c;
    }

    private int check(int x1, int y1, int x2, int y2, int x, int y) {
        int A = y2 - y1;
        int B = x1 - x2;
        int C = A * x1 + B * y1;

        if (A * x + B * y == C) { 
            return 0;
        }

        double dy = (C - A * x) / (double) B;

        if (dy < 0 || dy > y) { 
            return -1;
        }

        return 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
