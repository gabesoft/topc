package topc.search;

import java.util.*;
import java.io.*;

// SRM 571 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12439&rd=15491
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+571
public class MagicMoleculeEasy {
    int[] V;
    int[] A;
    int[] B;
    boolean[] used;
    int n;
    int m;
    int best;

    public int maxMagicPower(int[] magicPower, String[] magicBond, int k) {
        V = magicPower;
        n = V.length;
        A = new int[1225];
        B = new int[1225];

        m = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (magicBond[i].charAt(j) == 'Y') {
                    A[m] = i;
                    B[m] = j;
                    m++;
                }
            }
        }

        used = new boolean[n];
        best = -1;
        find(0, k);
        return best;
    }

    void find(int p, int k) {
        if (p == m) {
            int res = 0;
            int x[] = new int[n];

            int t = 0;
            for (int i = 0; i < n; i++) {
                if (used[i]) {
                    res += V[i];
                } else {
                    x[t++] = V[i];
                }
            }

            Arrays.sort(x);

            for (int i = x.length - 1; i > -1 && k > 0; i--) {
                res += x[i];
                k--;
            }

            best = Math.max(best, res);
        } else {
            if (used[A[p]] || used[B[p]]) {
                find(p + 1, k);
            } else if (k > 0) {
                int u = A[p];
                int v = B[p];

                used[u] = true;
                find(p + 1, k - 1);
                used[u] = false;

                used[v] = true;
                find(p + 1, k - 1);
                used[v] = false;
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
