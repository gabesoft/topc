package topc.easy;

import java.util.*;
import java.io.*;

// SRM 175 Division I Level Two - 450
// brute force, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2240&rd=4680
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm175
public class Books {
    String data[];
    int n;

    public int sortMoves(String[] titles) {
        n    = titles.length;
        data = titles;
        return count(0);
    }

    private int count(int mask) {
        for (int i = 0; i < n - 1; i++) {
            if (on(mask, i)) { continue; }

            for (int j = i + 1; j < n; j++) {
                if (on(mask, j)) { continue; }

                if (data[i].compareTo(data[j]) > 0) {
                    int a = count(mask | (1 << i));
                    int b = count(mask | (1 << j));
                    return 1 + Math.min(a, b);
                } else {
                    break;
                }
            }
        }

        return 0;
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
