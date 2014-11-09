package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 549 Division I Level One - 250
// geometry, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11965&rd=15171
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+549
public class PointyWizardHats {
    public int getNumHats(int[] topHeight, int[] topRadius, int[] bottomHeight, int[] bottomRadius) {
        int n = topHeight.length;
        int m = bottomHeight.length;

        int[][] pairs = new int[n][m];
        for (int i = 0; i < n; i++) {
            int rt = topRadius[i];
            int ht = topHeight[i];

            for (int j = 0; j < m; j++) {
                int rb = bottomRadius[j];
                int hb = bottomHeight[j];

                if (rb > rt && ht * rb > hb * rt) {
                    pairs[i][j] = 1;
                }
            }
        }

        return maxBipartiteMatch(pairs);
    }

    // maximum bipartite matching
    private int maxBipartiteMatch(int[][] pairs) {
        int n = pairs.length;
        int m = pairs[0].length;

        int matchL[] = new int[n];
        int matchR[] = new int[m];

        Arrays.fill(matchL, -1);
        Arrays.fill(matchR, -1);

        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean[] seen = new boolean[m];
            if (match(pairs, seen, matchL, matchR, i)) {
                count++;
            }
        }

        return count;
    }

    private boolean match(int[][] pairs, boolean[] seen, int[] matchL, int[] matchR, int u) {
        for (int v = 0; v < pairs[u].length; v++) {
            if (pairs[u][v] == 1 && !seen[v]) {
                seen[v] = true;
                if (matchR[v] == -1 || match(pairs, seen, matchL, matchR, matchR[v])) {
                    matchL[u] = v;
                    matchR[v] = u;
                    return true;
                }
            }
        }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
