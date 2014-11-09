package topc.math;

import java.util.*;
import java.io.*;

// TCO11 Qual 3 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11415&rd=14531
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'11+Qualification+Round+3
public class AllButOneDivisor {
    public int getMinimum(int[] divisors) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < divisors.length; i++) {
            int k = lcm(divisors, i);
            if (k % divisors[i] != 0) {
                nums.add(k);
            }
        }

        Collections.sort(nums);

        return nums.size() > 0 ? nums.get(0) : -1;
    }

    private int lcm(int[] divisors, int k) {
        int res = 1;
        for (int i = 0; i < divisors.length; i++) {
            if (i != k) {
                res = lcm(res, divisors[i]);
            }
        }
        return res;
    }

    private int gcd(int x, int y) {
        while (x != 0) {
            int z = x;
            x = y % x;
            y = z;
        }
        return y;
    }

    private int lcm(int x, int y) {
        return x * (y / gcd(x, y));
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
