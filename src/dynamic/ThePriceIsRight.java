package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 159 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1784&rd=4600
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm159
public class ThePriceIsRight {
    public int[] howManyReveals(int[] prices) {
        int n = prices.length;

        int L[] = new int[n];
        int C[] = new int[n];

        int best  = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            L[i] = 1;
            C[i] = 1;
            for (int j = 0; j < i; j++) {
                if (prices[j] < prices[i]) {
                    if (1 + L[j] > L[i]) {
                        L[i] = 1 + L[j];
                        C[i] = C[j];
                    } else if (1 + L[j] == L[i]) {
                        C[i] += C[j];
                    }
                }
            }
            if (L[i] > best) {
                best  = L[i];
                count = C[i];
            } else if (L[i] == best) {
                count += C[i];
            }
        }

        return new int[] { best, count };
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
