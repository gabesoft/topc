package topc.easy;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 522 Division II Level Three - 900
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11609&rd=14547
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+522
public class CorrectMultiplicationTwo {
    public int getMinimum(int a, int b, int c) {
        int res = a + b + c - 3;
        for (int A = 1; A <= c + res; A++) {
            for (int B = 1; B <= (c + res) / A; B++) {
                int C = A * B;
                int next = Math.abs(A - a) + Math.abs(B - b) + Math.abs(C - c);
                res = Math.min(res, next);
            }
        }
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
