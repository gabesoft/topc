package topc.easy;

import java.util.*;
import java.io.*;

// SRM 157 Division II Level Three - 1000
// brute force, recursion, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1787&rd=4590
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm157
public class HourGlass {
    int A;
    int B;
    HashSet<Integer> set;

    public int[] measurable(int glass1, int glass2) {
        A = Math.min(glass1, glass2);
        B = Math.max(glass1, glass2);

        set = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    set.add(A * i + k * Math.abs(A * i - B * j));
                    set.add(A * i + B * j);
                }
            }
        }

        int[] values = new int[set.size()];
        int i = 0;
        for (int k : set) {
            values[i++] = k;
        }

        Arrays.sort(values);
        return Arrays.copyOfRange(values, 1, 11);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
