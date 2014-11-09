package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 402 Division I Level One - 250
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8590&rd=12174
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm402
public class RandomSort {
    HashMap<String, Double> map;

    public double getExpected(int[] permutation) {
        map = new HashMap<String, Double>();
        return rec(permutation);
    }

    double rec(int[] perm) {
        String key = Arrays.toString(perm);
        if (map.containsKey(key)) { return map.get(key); }

        int perms  = 0;
        double sum = 0;
        for (int i = 0; i < perm.length; i++) {
            for (int j = i + 1; j < perm.length; j++) {
                if (perm[i] > perm[j]) {
                    perms++;
                    sum += rec(swap(i, j, perm.clone()));
                }
            }
        }

        double res = 0.0;
        if (perms > 0) {
            res = 1.0 + (sum / perms);
        }

        map.put(key, res);
        return res;
    }

    int[] swap(int i, int j, int[] arr) {
        int t  = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        return arr;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
