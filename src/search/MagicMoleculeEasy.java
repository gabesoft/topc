package topc.search;

import java.util.*;
import java.io.*;

// SRM 571 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12439&rd=15491
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+571
public class MagicMoleculeEasy {
    int n = 0;
    int edges = 0;
    int a[] = null;
    int b[] = null;
    int MP[] = null;
    boolean used[] = null;
    int best = 0;

    public int maxMagicPower(int[] magicPower, String[] magicBond, int k) {
        MP = magicPower;
        n = MP.length;
        edges = 0;

        a = new int[1225];
        b = new int[1225];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (magicBond[i].charAt(j) == 'Y') {
                    a[edges] = i;
                    b[edges] = j;
                    edges++;
                }
            }
        }

        used = new boolean[n];
        best = -1;
        rec(0, k);
        return best;
    }

    private void rec(int p, int k) {
        if (k < 0) { return; }
        if (p == edges) {
            int r = 0;
            int t = 0;
            int x[] = new int[n];
            for (int i = 0; i < n; i++) {
                if (used[i]) {
                    r += MP[i];
                } else {
                    x[t++] = MP[i];
                }
            }

            Arrays.sort(x);

            for (int i = x.length - 1; i > -1; i--) {
                if (k == 0) { break; }
                r += x[i];
                k--;
            }

            best = Math.max(best, r);
        } else {
            if (used[a[p]] || used[b[p]]) {
                rec(p + 1, k);
            } else {
                int u = a[p];
                int v = b[p];

                used[u] = true;
                rec(p + 1, k - 1);
                used[u] = false;

                used[v] = true;
                rec(p + 1, k - 1);
                used[v] = false;
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
