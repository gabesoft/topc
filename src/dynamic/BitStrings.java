package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 248 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3545&rd=7223
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm248
public class BitStrings {
    int Z[];
    int O[];
    int n;

    public int maxStrings(String[] list, int numZeroes, int numOnes) {
        n = list.length;
        Z = new int[n];
        O = new int[n];

        for (int i = 0; i < n; i++) {
            String str = list[i];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0') {
                    Z[i]++;
                } else {
                    O[i]++;
                }
            }
        }

        return find(0, numZeroes, numOnes);
    }

    private int find(int index, int zeros, int ones) {
        if (index == n) { return 0; }
        if (zeros == 0 && ones == 0) { return 0; }

        int a = find(index + 1, zeros, ones);
        int b = 0;

        if (zeros >= Z[index] && ones >= O[index]) {
            b = 1 + find(index + 1, zeros - Z[index], ones - O[index]);
        }

        return Math.max(a, b);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
