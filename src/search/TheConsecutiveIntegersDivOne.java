package topc.search;

import java.util.*;
import java.io.*;

// SRM 646 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13625&rd=16278
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+646
public class TheConsecutiveIntegersDivOne {
    public int find(int[] numbers, int k) {
        Arrays.sort(numbers);

        int best = 1 << 30;
        for (int i = 0; i + k <=  numbers.length; i++) {
            best = Math.min(best, count(numbers, i, k));
        }

        return best;
    }

    private int count(int[] numbers, int p, int k) {
        if (k == 0) { return 0; }

        int best = 1 << 30;
        for (int i = 0; i < k; i++) {
            int pivot = numbers[p + i];
            int cost  = 0;

            for (int j = 0; j < k; j++) {
                int curr = numbers[p + j];
                int diff = Math.abs(i - j);
                cost += Math.abs(pivot - curr) - diff;
            }

            best = Math.min(best, cost);
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
