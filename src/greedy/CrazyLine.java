package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 486 Division II Level Three - 1000
// greedy, math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10926&rd=14239
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+486
public class CrazyLine {
    public int maxCrazyness(int[] heights) {
        return heights.length == 1 ? 0 : maxdiff(heights);
    }

    int maxdiff(int[] arr) {
        int n          = arr.length;
        boolean seen[] = new boolean[n];

        int res = -1;
        int a   = -1;
        int b   = -1;
        int c   = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int dx = Math.abs(arr[i] - arr[j]);
                if (res < dx) {
                    res = dx;
                    a = i;
                    b = j;
                }
            }
        }

        seen[a] = true;
        seen[b] = true;
        while (c < n) {
            int best = 0;

            int ka = -1;
            int kb = -1;
            for (int i = 0; i < n; i++) {
                if (seen[i]) { continue; }
                int da = Math.abs(arr[i] - arr[a]);
                int db = Math.abs(arr[i] - arr[b]);
                if (best < da) {
                    ka = i;
                    kb = -1;
                    best = da;
                }
                if (best < db) {
                    ka = -1;
                    kb = i;
                    best = db;
                }
            }

            res += best;

            if (ka > -1) {
                a = ka;
                seen[a] = true;
            }
            if (kb > -1) {
                b = kb;
                seen[b] = true;
            }

            c++;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
