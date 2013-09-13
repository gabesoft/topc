package topc.search;

import java.util.*;
import java.io.*;

// SRM 544 Division I Level One - 275
// simple math, simple search, iteration, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11945&rd=14736
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+544
public class ElectionFraudDiv1 {
    int MAX = 202;

    public int MinimumVoters(int[] percentages) {
        int n = percentages.length;

        for (int sum = 1; sum <= MAX; sum++) {
            int minim = 0;
            int maxim = 0;

            boolean invalid = false;
            for (int i = 0; i < n; i++) {
                int a = minPossible(sum, percentages[i]);
                int b = minPossible(sum, percentages[i] + 1) - 1;
                if (a > b) {
                    invalid = true;
                }
                minim += a;
                maxim += b;
            }

            if (!invalid && minim <= sum && sum <= maxim) {
                return sum;
            }
        }

        return -1;
    }

    private int minPossible(long total, long p) {
        long res = 0;
        long tot = p * total - total / 2;

        if (tot < 0) { return 0; }

        if (tot % 100 == 0) {
            res = tot / 100;
        } else {
            res = tot / 100 + 1;
        }

        return (int) res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
