package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 348 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7753&rd=10672
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm348
public class IncreasingSubsequences {
    int[] a;
    int n;

    public long count(int[] a) {
        this.n = a.length;
        this.a = a;

        long[] end = new long[n];
        int idx    = 0;

        end[idx++] = 1;
        for (int i = 1; i < n; i++) {
            int shadow = 0;
            long sum   = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > shadow && a[j] < a[i]) {
                    sum += end[j];
                    shadow = a[j];
                }
            }

            if (sum == 0) {
                sum = 1;
            }

            end[idx++] = sum;
        }

        long ans = 0;
        int max  = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > max) {
                ans += end[i];
                max = a[i];
            }
        }

        return ans;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
