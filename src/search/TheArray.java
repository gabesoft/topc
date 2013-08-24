package topc.search;

import java.util.*;
import java.io.*;

// TCO13 Round 1C Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12455&rd=15585
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class TheArray {
    public int find(int n, int d, int first, int last) {
        int max = Math.max(first, last);
        for (int i = 1; i < n; i++) {
            int p = topMove(first, d, i);
            int q = topMove(last, d, n - i - 1);
            max   = Math.max(max, Math.min(p, q));
        }
        return max;
    }

    private int topMove(int x, int d, int s) {
        return x + s * d;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
