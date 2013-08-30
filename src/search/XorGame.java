package topc.search;

import java.util.*;
import java.io.*;

// TCO12 Championship Round Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12094&rd=15378
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class XorGame {
    public int play(String S, String E) {
        int n     = S.length();
        int xor[] = new int[n];
        int ones  = 0;

        for (int i = 0; i < n; i++) {
            xor[i] = S.charAt(i) == E.charAt(i) ? 0 : 1;
            ones += xor[i];
        }

        boolean contiguous = contiguousOnes(xor);

        if (ones == n) { return 1; }
        if (ones == 0) { return 0; }

        if (n < 3) { return 1; }
        if (n > 4) { return contiguous ? 1 : -1; }

        if (n == 3) { return contiguous ? 1 : 2; }

        return contiguous ? 1 : ones;
    }

    private boolean contiguousOnes(int[] a) {
        int last = -1;

        for (int i = 0; i < a.length; i++) {
            if (last > -1 && a[i] == 1 && last < i - 1) {
                return false;
            }
            if (a[i] == 1) {
                last = i;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
