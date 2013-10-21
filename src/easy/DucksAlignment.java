package topc.easy;

import java.util.*;
import java.io.*;

// SRM 526 Division I Level One - 250
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11667&rd=14551
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+526
public class DucksAlignment {
    int INF = 1 << 30;

    public int minimumTime(String[] grid) {
        int n = grid.length;
        int m = grid[0].length();

        int d = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i].charAt(j) == 'o') {
                    d++;
                }
            }
        }

        int r[] = new int[d];
        int c[] = new int[d];

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i].charAt(j) == 'o') {
                    r[k] = i;
                    c[k] = j;
                    k++;
                }
            }
        }

        Arrays.sort(r);
        Arrays.sort(c);

        return Math.min(
                sameCost(r) + contiguousCost(c),
                sameCost(c) + contiguousCost(r));
    }

    private int sameCost(int[] data) {
        int n    = data.length;
        int best = INF;

        for (int i = data[0]; i <= data[n - 1]; i++) {
            int cost = 0;
            for (int j = 0; j < n; j++) {
                cost += Math.abs(data[j] - i);
            }
            best = Math.min(best, cost);
        }

        return best;
    }

    private int contiguousCost(int[] data) {
        int n    = data.length;
        int best = INF;

        for (int i = data[0]; i <= data[n - 1]; i++) {
            int cost = 0;
            for (int j = 0; j < n; j++) {
                cost += Math.abs(data[j] - (i + j));
            }
            best = Math.min(best, cost);
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
