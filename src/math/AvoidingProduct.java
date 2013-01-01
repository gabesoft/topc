package topc.math;

import java.util.*;
import java.io.*;

// SRM 399 Division I Level One - 250
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8758&rd=12171
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm399
public class AvoidingProduct {
    public int[] getTriple(int[] a, int n) {
        int lim        = n + 51;
        boolean skip[] = new boolean[lim];

        for (int i = 0; i < a.length; i++) {
            skip[a[i]] = true;
        }

        int best = Integer.MAX_VALUE / 4;
        int prev = best;
        int x    = 0;
        int y    = 0;
        int z    = 0;

        for (int i = 1; i < lim; i++) {
            if (skip[i]) { continue; }

            prev = -1;

            for (int j = i; j < lim; j++) {
                if (skip[j]) { continue; }

                prev = -1;

                for (int k = j; k < lim; k++) {

                    if (skip[k]) { continue; }

                    int curr = Math.abs(n - i * j * k);

                    if (curr < best) {
                        best = curr;
                        x    = i;
                        y    = j;
                        z    = k;
                    }

                    if (curr > best && prev != -1 && curr > prev) { break; }

                    prev = curr;
                }
            }
        }

        return new int[] { x, y, z };
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
