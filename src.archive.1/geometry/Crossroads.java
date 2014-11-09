package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 217 Division II Level Three - 1000
// geometry, greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3042&rd=5863
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm217
public class Crossroads {
    public int[] getOut(int[] angles) {
        int n = angles.length;
        boolean blocked[] = new boolean[n];

        for (int i = n - 1; i > -1; i--) {
            if (blocked[i]) { continue; }
            for (int j = i - 1; j > -1; j--) {
                int b = blocks(angles[j], angles[i]);
                if (b == 0) {
                    blocked[i] = true;
                    break;
                }
                if (b == 1) {
                    blocked[j] = true;
                }
            }
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (blocked[i]) {
                k++;
            }
        }

        int res[] = new int[n - k];
        int j     = 0;

        for (int i = 0; i < n; i++) {
            if (!blocked[i]) {
                res[j++] = i;
            }
        }

        return res;
    }

    //  0 : a blocks b
    //  1 : b blocks a
    // -1 : no intersection
    private int blocks(int a, int b) {
        if (a == b) { return -1; }

        if (a >= 90 && b >= 90) { return a < b ? 0 : -1; }
        if (a <= 90 && b <= 90) { return a < b ? 1 : -1; }
        if (a <= 90 && b >= 90) { return a >= (180 - b) ? 0 : 1; }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
