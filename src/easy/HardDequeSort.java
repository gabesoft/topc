package topc.easy;

import java.util.*;
import java.io.*;

// SRM 263 Division I Level Two - 500
// brute force, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1845&rd=7997
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm263
public class HardDequeSort {
    public int minDeques(int[] data) {
        int[] sorted = dedup(data);
        Arrays.sort(sorted);

        int k     = 0;
        int count = 1;
        int c = 0;
        while (k < sorted.length - 1) {
            for (int i = k; i < sorted.length; i++) {
                boolean can = canBuild(data, sorted, k, i);
                if (!can || i == sorted.length - 1) { 
                    k = i;
                    if (!can) { count++; }
                    break;
                }
            }
        }

        return count;
    }

    private boolean canBuild(int[] data, int[] sorted, int s, int e) {
        if (s == e) { return true; }

        boolean use[] = new boolean[2002];
        for (int i = s; i < e + 1; i++) {
            use[1001 + sorted[i]] = true;
        }

        int hi = 2000;
        int lo = 2000;

        for (int i = 0; i < data.length; i++) {
            if (!use[1001 + data[i]]) { continue; }
            if (data[i] == hi || data[i] == lo) { continue; }

            if (hi == 2000) {
                hi = data[i];
                lo = data[i];
            } else {
                if (data[i] > hi) {
                    hi = data[i];
                } else if (data[i] < lo) {
                    lo = data[i];
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    private int[] dedup(int[] data) {
        HashSet<Integer> set = new HashSet<Integer>();
        int[] clean = new int[data.length];
        int k = 0;

        for (int i = 0; i < data.length; i++) {
            if (!set.contains(data[i])) {
                set.add(data[i]);
                clean[k++] = data[i];
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = clean[i];
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
