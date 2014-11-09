package topc.math;

import java.util.*;
import java.io.*;

// SRM 608 Division I Level One - 300
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12997&rd=15841
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+608
public class MysticAndCandies {
    public int minBoxes(int C, int X, int[] low, int[] high) {
        int n = low.length;
        int H = 0;

        for (int i = 0; i < n; i++) {
            H += high[i];
        }

        Arrays.sort(low);
        Arrays.sort(high);

        reverse(low);
        reverse(high);

        int a = 0;
        int b = 0;

        for (int t = 1; t < n; t++) {
            a += low[t - 1];

            if (a >= X) { return t; }

            b += high[t - 1];

            if (C - H + b >= X) { return t; }
        }

        return n;
    }

    void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
