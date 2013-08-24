package topc.search;

import java.util.*;
import java.io.*;

// TCO13 Round 1C Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12455&rd=15585
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class TheArray {
    public int find(int n, int d, int first, int last) {
        int a = Math.max(first, last);
        int b = Math.min(first, last);

        int k = a;
        for (int i = 1; i < n - 1; i++) {
            if (Math.abs((k + d) - b) <= (n - i - 1) * d) {
                k += d;
            } else {
                int l = 0;
                for (int j = 1; j < d; j++) {
                    if (Math.abs((k + j) - b) <= (n - i - 1) * d) {
                        l = j;
                    }
                }
                k += l;
                break;
            }
        }

        return k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
