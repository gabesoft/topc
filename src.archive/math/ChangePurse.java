package topc.math;

import java.util.*;
import java.io.*;

// SRM 195 Division II Level Three - 1100
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2442&rd=5070
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm195
public class ChangePurse {
    int[] T;
    int[] R;
    int n;

    public int[] optimalCoins(int[] coinTypes, int value) {
        n = coinTypes.length;
        T = coinTypes.clone();
        R = new int[n];
        Arrays.sort(T);

        search(n, value);

        int r[] = new int[n];
        for (int i = 0; i < n; i++) {
            int t = T[i];
            for (int j = 0; j < n; j++) {
                if (t == coinTypes[j]) {
                    r[j] = R[i];
                }
            }
        }

        return r;
    }

    private void search(int k, int value) {
        for (int i = k - 1; i > -1; i--) {
            R[i] = 0;

            if ((value + 1) % T[i] == 0 && (k == n || T[k] % T[i] == 0)) {
                R[i] = value / T[i];
                search(i, value - R[i] * T[i]);
                return;
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
