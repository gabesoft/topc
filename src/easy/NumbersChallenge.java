package topc.easy;

import java.util.*;
import java.io.*;

// SRM 621 Division II Level Two - 500
// brute force, dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13166&rd=15854
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+621
public class NumbersChallenge {
    public int MinNumber(int[] S) {
        int l = 1 << S.length;

        boolean hits[] = new boolean[l + 1];
        for (int i = 1; i < l; i++) {
            int k = sum(S, i);
            if (k < hits.length) {
                hits[k] = true;
            }
        }

        for (int i = 1; i < hits.length; i++) {
            if (!hits[i]) {
                return i;
            }
        }

        return -1;
    }

    private int sum(int[] S, int k) {
        int s = 0;
        int n = S.length;

        for (int i = 0; i < n; i++) {
            if (((k >> i) & 1) == 1) {
                s += S[i];
            }
        }

        return s;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
