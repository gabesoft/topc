package topc.easy;

import java.util.*;
import java.io.*;

// SRM 556 Division II Level One - 250
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12190&rd=15178
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+556
public class ChocolateBar {
    int n = 0;
    char chars[] = null;
    int dp[][];

    public int maxLength(String letters) {
        if (letters.length() <= 1) { return letters.length(); }

        n = letters.length();
        chars = letters.toCharArray();
        dp = new int[n][n];

        return len(0, n - 1);
    }

    private int len(int s, int e) {
        if (e - s < 1) { return e - s + 1; }
        if (dp[s][e] > 0) { return dp[s][e]; }

        int cnt[] = new int[26];

        boolean valid = true;
        for (int i = s; i <= e; i++) {
            char c = chars[i];
            cnt[c - 'a']++;
            if (cnt[c - 'a'] > 1) {
                valid = false;
                break;
            }
        }

        if (valid) {
            dp[s][e] = e - s + 1;
        } else {
            dp[s][e] = Math.max(len(s + 1, e), len(s, e - 1));
        }

        return dp[s][e];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
