package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 557 Division I Level One - 250
// dynamic programming, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12195&rd=15179
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+557
public class FoxAndMountainEasy {
    public String possible(int n, int h0, int hn, String history) {
        int delta = h0;
        int k     = 0;

        for (int i = 0; i < history.length(); i++) {
            delta += (history.charAt(i) == 'U') ? 1 : -1;
            if (delta < 0) {
                delta++;
                k++;
            }
        }

        k  = k + history.length();
        k  = n - k;
        hn = Math.abs(hn - delta);

        return (k < 0 || hn > k + 1 || hn % 2 != k % 2)
            ? "NO"
            : "YES";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
