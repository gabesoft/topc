package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 506 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11154&rd=14435
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+506
public class SlimeXSlimesCity {
    public int merge(int[] population) {
        Arrays.sort(population);

        int n = population.length;
        long[] sum = new long[n];

        sum[0] = population[0];
        for (int i = 1; i < n; i++) {
            sum[i] = population[i] + sum[i - 1];
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean can = true;
            long p = sum[i];

            for (int j = i + 1; j < n; j++) {
                if (p >= population[j]) {
                    p += population[j];
                } else {
                    can = false;
                    break;
                }
            }

            if (can) {
                count++;
            }
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
