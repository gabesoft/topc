package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 278 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5922&rd=8075
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm278
public class IntegerSequence {
    int[] data;

    public int maxSubsequence(int[] numbers) {
        data = numbers;

        int best = 0;
        for (int i = 0; i < data.length; i++) {
            int a = longest(i - 1, -1, data[i]);
            int b = longest(i + 1,  1, data[i]);
            best  = Math.max(best, 1 + a + b);
        }

        return data.length - best;
    }

    private int longest(int index, int dir, int last) {
        if (index < 0 || index == data.length) { return 0; }

        if (data[index] >= last) { return longest(index + dir, dir, last); }

        int l1 = 1 + longest(index + dir, dir, data[index]);
        int l2 = longest(index + dir, dir, last);

        return Math.max(l1, l2);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
