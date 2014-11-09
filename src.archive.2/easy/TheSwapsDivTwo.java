package topc.easy;

import java.util.*;
import java.io.*;

// SRM 575 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12499&rd=15495
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+575
public class TheSwapsDivTwo {
    public int find(int[] sequence) {
        int n = sequence.length;
        int sum = 0;
        int eq = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sequence[i] != sequence[j]) {
                    sum++;
                } else {
                    eq = 1;
                }
            }
        }
        return sum + eq;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
