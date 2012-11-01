package topc.math;

import java.util.*;
import java.io.*;

// SRM 473 Division II Level Three - 1000
// brute force, math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10978&rd=14155
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+473
public class ChildlessNumbers {
    public int howMany(int A, int B) {
        int count = 0;

        for (long i = (long) A; i <= B; i++) {
            if (childless(i)) {
                count++;
            }
        }

        return count;
    }

    boolean childless(long x) {
        for (long i = 1; i < 101; i++) {
            long n = x * i;
            if (digitSum(n) == (int) i) {
                return false;
            }
        }
        return true;
    }

    int digitSum(long x) {
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        return s;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
