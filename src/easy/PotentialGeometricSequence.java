package topc.easy;

import java.util.*;
import java.io.*;

// SRM 632 - TCO14 Wildcard Sweep Division II Level Two - 500
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13390&rd=16075
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+632
public class PotentialGeometricSequence {
    public int numberOfSubsequences(int[] d) {
        int n = d.length;
        int cnt = n;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if (seq(d, i, j)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    private boolean seq(int[] d, int len, int s) {
        int v = d[s + 1] - d[s];
        for (int i = s + 1; i < s + len; i++) {
            if (d[i] - d[i - 1] != v) {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
