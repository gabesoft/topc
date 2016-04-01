package topc.search;

import java.util.*;

// SRM 646 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13626&rd=16278
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+646
public class TheConsecutiveIntegersDivTwo {
    public int find(int[] numbers, int k) {
        if (k == 1) { return 0; }

        int min = 1 << 30;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                min = Math.min(min, Math.abs(numbers[i] - numbers[j]) - 1);
            }
        }

        return min;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
