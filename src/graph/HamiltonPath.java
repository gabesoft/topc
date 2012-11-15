package topc.graph;

import java.util.*;
import java.io.*;

// SRM 452 Division II Level Three - 1000
// graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10572&rd=13906
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+452
public class HamiltonPath {
    long MOD = 1000000007L;
    String[] roads;
    boolean[] seen;
    int[] d;
    int n;

    public int countPaths(String[] roads) {
        this.roads = roads;
        this.seen  = new boolean[100];
        this.d     = new int[100];
        this.n     = roads.length;

        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < n; j++) {
                if (roads[i].charAt(j) == 'Y') {
                    s++;
                }
            }
            if (s > 2) { return 0; }

            d[i] = s;
        }

        int tot1 = 0;
        int tot2 = 0;

        for (int i = 0; i < n; i++) {
            if (!seen[i] && d[i] < 2) {
                dfs(i);
                if (d[i] == 0) {
                    tot1++;
                } else {
                    tot2++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (!seen[i]) { return 0; }
        }

        long ans = 1;
        for (long i = 0; i < tot1 + tot2; i++) {
            ans = (ans * (i + 1)) % MOD;
        }

        for (int i = 0; i < tot2; i++) {
            ans = (ans * 2) % MOD;
        }

        return (int)ans;
    }

    void dfs(int v) {
        seen[v] = true;
        for (int i = 0; i < n; i++) {
            if (roads[v].charAt(i) == 'Y' && !seen[i]) {
                dfs(i);
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
