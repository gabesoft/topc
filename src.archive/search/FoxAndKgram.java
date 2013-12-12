package topc.search;

import java.util.*;
import java.io.*;

// TCO12 Round 1B Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11809&rd=15091
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2012+Round+1b
public class FoxAndKgram {
    public int maxK(int[] len) {
        Arrays.sort(len);

        int n = len.length;
        for (int i = n; i > 0; i--) {
            if (canDo(len, i)) { return i; }
        }

        return 0;
    }

    private boolean canDo(int[] len, int k) {
        int t = 0;
        int n = len.length;
        int j = 0;
        for (int i = n - 1; i > -1; i--) {
            if (len[i] == k) {
                t++;
            }
            if (len[i] < k) {
                j = i;
                break;
            }
        }

        int i = 0;
        while (i < j) {
            int s = len[i] + len[j];
            if (s == k - 1) {
                t++;
                i++;
                j--;
            }
            if (s > k - 1) { j--; }
            if (s < k - 1) { i++; }
        }

        return t >= k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
