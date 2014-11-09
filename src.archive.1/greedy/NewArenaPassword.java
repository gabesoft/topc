package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 572 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12386&rd=15492
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+572
public class NewArenaPassword {
    int L = 26;

    public int minChange(String oldPassword, int K) {
        int n = oldPassword.length();

        if (K == n) { return 0; }

        int count = 0;
        int p = n - K;

        for (int i = 0; i < p && i < K; i++) {
            int chars[] = new int[L];
            int all = 0;
            for (int j = i; j < n; j += p) {
                char c = oldPassword.charAt(j);
                chars[c - 'a']++;
                all++;
            }

            count += (all - max(chars));
        }

        return count;
    }

    private int max(int[] a) {
        int mx = a[0];
        for (int i = 1; i < a.length; i++) {
            mx = Math.max(mx, a[i]);
        }
        return mx;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
