package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 259 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4619&rd=8012
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm259
public class NumericalSequence {
    public int makePalindrome(int[] sequence) {
        int n = sequence.length;

        if (n == 1) { return 0; }
        if (n == 2) { return sequence[0] == sequence[1] ? 0 : 1; }

        if (sequence[0] == sequence[n - 1]) {
            return makePalindrome(take(sequence, 1, n - 1));
        }

        if (n == 3) {
            boolean b1 = sequence[0] + sequence[1] == sequence[2];
            boolean b2 = sequence[0] == sequence[1] + sequence[2];
            return b1 || b2 ? 1 : 2;
        }

        int s1 = sequence[0] + sequence[1];
        int s2 = sequence[n - 2] + sequence[n - 1];

        if (s1 < s2) {
            sequence[1] = s1;
            return 1 + makePalindrome(take(sequence, 1, n));
        }
        if (s2 < s1) {
            sequence[n - 2] = s2;
            return 1 + makePalindrome(take(sequence, 0, n - 1));
        }

        sequence[1]     = s1;
        sequence[n - 2] = s2;
        return 2 + makePalindrome(take(sequence, 1, n - 1));
    }

    private int[] take(int[] data, int s, int e) {
        int n = e - s;
        int[] d = new int[n];

        for (int i = s; i < e; i++) {
            d[i - s] = data[i];
        }

        return d;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
