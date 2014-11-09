package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 313 Division II Level Three - 1000
// dynamic programming, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6517&rd=9993
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm313
public class ParallelProgramming {
    int n;
    int[] st;   // start time
    int[] et;   // end time
    public int minTime(int[] time, String[] prec) {
        n  = time.length;
        st = new int[n];
        et = new int[n];

        int[] topo = topoSort(prec);

        if (topo == null) { return -1; }

        for (int i = 0; i < n; i++) {
            int p = topo[i];

            st[p] = 0;
            for (int x = 0; x < n; x++) {
                if (prec[p].charAt(x) == 'Y') {
                    st[p] = Math.max(st[p], et[x]);
                }
            }

            et[p] = st[p] + time[p];
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, et[i]);
        }

        return res;
    }

    int[] topoSort(String[] graph) {
        boolean[] seen = new boolean[n];
        int[] topo     = new int[n];

        int idx = 0;
        while (idx < n) {
            int curr = idx;
            for (int i = 0; i < n; i++) {
                if (seen[i]) { continue; }
                boolean ok = true;
                for (int j = 0; j < n; j++) {
                    if (!seen[j] && graph[i].charAt(j) == 'Y') {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    topo[idx++] = i;
                    seen[i]  = true;
                }
            }
            if (curr == idx) { return null; }
        }

        return topo;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
