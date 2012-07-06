package topc.math;

import java.util.*;
import java.io.*;

// SRM 390 Division II Level Three - 1000
// advanced math, dynamic programming, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8307&rd=11124
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm390
public class SetOfPatterns {
    int MOD = 1000003;

    public int howMany(String[] patterns, int k) {
        int n      = patterns.length;
        int m      = patterns[0].length();
        int [][] d = new int[m + 1][1 << n];

        for (int i = 0; i < m; i++) {
            for (char c = 'a'; c <= 'z'; c++) {

                int v = 0;
                for (int j = 0; j < n; j++) {
                    if (patterns[j].charAt(i) == c || patterns[j].charAt(i) == '?') {
                        v |= (1 << j);
                    }
                }

                if (i == 0) {
                    d[i][v]++;
                } else {
                    for (int j = 0; j < (1 << n); j++) {
                        d[i][j & v] = (d[i][j & v] + d[i - 1][j]) % MOD;
                    }
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < (1 << n); i++) {
            if (countOnes(i) == k) {
                ans = (ans + d[m - 1][i]) % MOD;
            }
        }

        return ans;
    }

    int countOnes(int mask) {
        int n = 0;
        while (mask != 0) {
            n++;
            mask = mask & (mask - 1);
        }
        return n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
