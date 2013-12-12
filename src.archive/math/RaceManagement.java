package topc.math;

import java.util.*;
import java.io.*;

// SRM 352 Division II Level Three - 1000
// math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7822&rd=10709
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm352
public class RaceManagement {
    public double getPayoutFactor(int[] probability, int[] amounts, int minimumMoney) {
        int n = probability.length;

        double gain = 0;
        double loss = 0;

        for (int i = 0; i < (1 << n); i++) {
            int win     = 0;
            int g       = 0;
            int l       = 0;
            double prob = 1;

            for (int j = 0; j < n; j++) {
                double p = on(i, j) ? probability[j] : (100 - probability[j]);

                win  += on(i, j) ? 1 : 0;
                prob *= (p / 100.0);
                g    += on(i, j) ? amounts[j] : 0;
                l    += on(i, j) ? 0 : amounts[j];
            }

            if (win != 1) {
                l = l + g;
                g = 0;
            }

            gain += prob * g;
            loss += prob * l;
        }

        if (minimumMoney > loss) {
            return -1;
        }
        if (gain == 0) {
            return -2;
        }

        return (loss - minimumMoney) / gain;
    }

    boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
