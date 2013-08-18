package topc.easy;

import java.util.*;
import java.io.*;

// TCO13 Round 3A Division I Level One - 250
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12591&rd=15686
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class YetAnotherANDProblem {
    public String test(int[] X, int K, int[] queries) {
        int n = X.length;
        int a = (K == 1) ? 2 : 3;
        int b = (K == 1) ? 2 : 1 << Math.min(K, 4);

        char res[] = new char[queries.length];

        Arrays.fill(res, '-');

        for (int i = 0; i < queries.length; i++) {
            for (int mask = (1 << a) - 1; mask < (1 << n); mask++) {
                int x = ~0;
                for (int j = 0; j < n; j++) {
                    if (((mask >> j) & 1) == 1) {
                        x = (x & X[j]);
                    }
                }
                if (x == queries[i]) {
                    int c = Integer.bitCount(mask);
                    if (a <= c && c <= b) {
                        res[i] = '+';
                        break;
                    }
                }
            }
        }

        return new String(res);
    }

}
