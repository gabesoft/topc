package topc.easy;

import java.util.*;
import java.io.*;

// SRM 279 Division II Level Three - 1100
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4841&rd=8076
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm279
public class CoinPiles {
    public int organize(int[] sizes) {
        if (sizes.length == 1) { return 1; }

        Arrays.sort(sizes);

        boolean[] used = new boolean[sizes.length];

        int count = 1;
        int ltop  = 1;
        int llen  = 1;

        used[0] = true;
        while (true) {
            ltop = find(sizes, used, ltop, llen);

            if (ltop == -1) { break; }

            llen++;
            count++;
        }

        return count;
    }

    private int find(int[] sizes, boolean[] used, int ltop, int llen) {
        int index = 0;
        int len   = 0;
        int top   = 0;

        for (int i = 0; i < sizes.length && len < llen; i++) {
            if (!used[i]) {
                index   = i;
                used[i] = true;
                top     = sizes[i];
                len++;
            }
        }

        index++;
        while (index < sizes.length) {
            if (!used[index] && sizes[index] > ltop && sizes[index] > top) {
                used[index] = true;
                return sizes[index];
            }
            index++;
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
