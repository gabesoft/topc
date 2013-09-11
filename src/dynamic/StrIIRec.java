package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 545 Division I Level One - 275
// dynamic programming, greedy, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12025&rd=14737
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+545
public class StrIIRec {
    int n;

    public String recovstr(int n, int minInv, String minStr) {
        this.n = n;

        char[] c = new char[n];
        int used = 0;

        for (int i = 0; i < minStr.length(); i++) {
            c[i] = minStr.charAt(i);
            used = set(used, c[i] - 'a');
        }

        fill(c, used, minStr.length(), 0);

        for (int i = 0; i < n - 1; i++) {
            while (calc(c, i) < minInv) {
                incr(c, i);
            }
        }

        return new String(c);
    }

    private void fill(char[] c, int used, int k, int start) {
        for (int i = k; i < n; i++) {
            for (int j = (i == k ? start : 0); j < 26; j++) {
                if (!on(used, j)) {
                    c[i] = (char)(j + 'a');
                    used = set(used, j);
                    break;
                }
            }
        }
    }

    private void incr(char[] c, int k) {
        assert c[k] < 'z' : "invalid c[k]";

        int used = 0;
        for (int i = 0; i < k; i++) {
            used = set(used, c[i] - 'a');
        }

        fill(c, used, k, c[k] - 'a' + 1);
    }

    private int calc(char[] c, int k) {
        int inv = 0;

        for (int i = 0; i < k + 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i] > c[j]) {
                    inv++;
                }
            }
        }

        return inv + (n - k - 1) * (n - k - 2) / 2;
    }

    private int set(int mask, int k) {
        return mask | (1 << k);
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
