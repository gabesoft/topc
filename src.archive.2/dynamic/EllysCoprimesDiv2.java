package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 577 Division II Level Three - 1000
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12461&rd=15497
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+577
public class EllysCoprimesDiv2 {
    public int getCount(int[] numbers) {
        Arrays.sort(numbers);
        int res = 0;
        for (int i = 1; i < numbers.length; i++) {
            res += minFill(numbers[i - 1], numbers[i]);
        }
        return res;
    }

    private int minFill(int a, int b) {
        if (gcd(a, b) == 1) { return 0; }

        for (int i = a + 1; i < b; i++) {
            if (gcd(a, i) == 1 && gcd(i, b) == 1) {
                return 1;
            }
        }

        return 2;
    }

    private int gcd(int x, int y) {
        while (y > 0) {
            int z = y;
            y = x % y;
            x = z;
        }
        return x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
