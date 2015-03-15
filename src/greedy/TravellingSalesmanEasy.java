package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 647 Division II Level Two - 500
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13631&rd=16279
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+647
public class TravellingSalesmanEasy {
    public int getMaxProfit(int M, int[] profit, int[] city, int[] visit) {
        int sum = 0;
        boolean[] sold = new boolean[city.length];

        for (int v : visit) {
            int best = -1;

            for (int i = 0; i < city.length; i++) {
                if (city[i] != v) { continue; }
                if (sold[i]) { continue; }

                if (best == -1 || profit[i] > profit[best]) {
                    best = i;
                }
            }

            if (best != -1) {
                sold[best] = true;
                sum += profit[best];
            }
        }

        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
