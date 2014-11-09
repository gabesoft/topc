package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 622 Division II Level Two - 500
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13192&rd=15855
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+622
public class BoxesDiv2 {
    public int findSize(int[] candyCounts) {
        int n       = candyCounts.length;
        int boxes[] = new int[n];

        for (int i = 0; i < n; i++) {
            boxes[i] = findNextPow2(candyCounts[i]);
        }

        int prev[] = boxes;
        int k      = prev.length;

        while (k > 1) {
            Arrays.sort(prev);

            int[] next = new int[k - 1];
            next[0]    = findNextPow2(prev[0] + prev[1]);

            for (int i = 1; i < k - 1; i++) {
                next[i] = prev[i + 1];
            }

            prev = next;
            k    = prev.length;
        }

        return prev[0];
    }

    private int findNextPow2(int k) {
        int pow2 = 1;

        for (int i = 0; i < 100; i++) {
            if (pow2 >= k) {
                return pow2;
            }
            pow2 *= 2;
        }

        return 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
