package topc.easy;

import java.util.*;
import java.io.*;

// SRM 601 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12860&rd=15713
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+601
public class WinterAndPresents {
    public long getNumber(int[] apple, int[] orange) {
        int n = apple.length;

        int minSum = apple[0] + orange[0];
        for (int i = 1; i < n; i++) {
            minSum = Math.min(minSum, apple[i] + orange[i]);
        }

        Arrays.sort(apple);
        Arrays.sort(orange);

        long res = 0;
        for (int i = 1; i <= minSum; i++) {
            int maxA = max(apple, i);
            int maxO = max(orange, i);

            res += (maxO - (n * (long)i - maxA) + 1L);
        }

        return res;
    }

    private int max(int[] items, int v) {
        int n = items.length;
        int s = 0;
        int k = 0;

        while (k < n && items[k] < v) {
            s += items[k];
            k++;
        }

        return s + v * (n - k);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
