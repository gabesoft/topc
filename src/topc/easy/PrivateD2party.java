package topc.easy;

import java.util.*;

// SRM 660 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13824&rd=16463
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+660
public class PrivateD2party {
    public int getsz(int[] a) {
        int n = a.length;
        boolean seen[] = new boolean[n];

        int cycles = 0;
        for (int i = 0; i < n; i++) {
            if (seen[i]) { continue; }
            if (hasCycle(a, new boolean[n], seen, i)) {
                cycles++;
            }
        }

        return n - cycles;
    }

    private boolean hasCycle(int[] a, boolean[] visited, boolean[] seen, int u) {
        if (visited[u] || seen[u]) { return visited[u]; }

        visited[u] = true;
        seen[u]    = true;

        return a[u] != u && hasCycle(a,  visited,  seen,  a[u]);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
