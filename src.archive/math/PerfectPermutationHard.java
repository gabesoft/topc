package topc.math;

import java.util.*;
import java.io.*;

// SRM 441 Division II Level Three - 1000
// greedy, simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10469&rd=13749
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+441
public class PerfectPermutationHard {
    public int[] reorder(int[] P) {
        int n = P.length;
        int cycles[][] = new int[n][];

        boolean seen[] = new boolean[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (seen[i]) { continue; }

            int j   = i;
            int t[] = new int[n + 1];

            t[++t[0]] = i;
            seen[i]   = true;

            while (P[j] != i) {
                j         = P[j];
                t[++t[0]] = j;
                seen[j]   = true;
            }

            cycles[k++] = t;
        }

        if (k == 1) { return P; }

        int result[] = new int[n + n];
        int l        = 0;
        int p        = 0;

        for (int i = 1; i < cycles[0][0] + 1; i++) {
            if (cycles[1][1] < cycles[0][i]) {
                p = i;
                break;
            }
            result[l++] = cycles[0][i];
        }

        for (int i = 1; i < k; i++) {
            for (int j = 1; j < cycles[i][0] + 1; j++) {
                result[l++] = cycles[i][j];
            }
        }
        for (int i = p; i < cycles[0][0] + 1; i++) {
            result[l++] = cycles[0][i];
        }

        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[result[i]] = result[(i + 1) % n];
        }

        return ans;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
