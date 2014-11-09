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
    boolean[][][] seen;

    public int[] measurable(int glass1, int glass2) {
        A    = Math.min(glass1, glass2);
        B    = Math.max(glass1, glass2);
        set  = new HashSet<Integer>();
        seen = new boolean[A + 1][B + 1][501];

        return iterative();   // faster
        //return recursive();
    }

    private int[] iterative() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    set.add(A * i + k * Math.abs(A * i - B * j));
                    set.add(A * i + B * j);
                }
            }
        }
        return getValues();
    }

    private int[] recursive() {
        rec(0, 0, 0);
        return getValues();
    }

    private void rec(int x, int y, int t) {
        if (t > 500) { return; }
        if (seen[x][y][t]) { return; }

        seen[x][y][t] = true;
        set.add(t);

        if (x == 0 && y == 0) {
            rec(0, A, t + A);
            rec(0, 0, t + A + B);
        }
        if (y == 0) {
            // flip
            rec(0, x, t + x);
            // don't flip
            rec(0, A - x, t + (A - x));
        }
        if (x == 0) {
            // flip 
            if (y < A) {
                rec(y, 0, t + y);
            }
            if (y == A) {
                rec(0, 0, t + y);
            }
            if (y > A) {
                rec(0, y - A, t + A);
            }

            // don't flip
            if (B - y < A) {
                rec(B - y, 0, t + (B - y));
            }
            if (B - y == A) {
                rec(0, 0, t + (B - y));
            }
            if (B - y > A) {
                rec(0, y + A, t + A);
            }
        }
    }

    private int[] getValues() {
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
