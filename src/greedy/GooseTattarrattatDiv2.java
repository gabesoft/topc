package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 589 Division II Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12733&rd=15701
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+589
public class GooseTattarrattatDiv2 {
    public int getmin(String S) {
        int[] cnt = new int[26];
        int n = S.length();

        for (int i = 0; i < n; i++) {
            cnt[S.charAt(i) - 'a']++;
        }

        int max = 0;
        for (int i = 0; i < cnt.length; i++) {
            max = Math.max(max, cnt[i]);
        }

        return n - max;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
