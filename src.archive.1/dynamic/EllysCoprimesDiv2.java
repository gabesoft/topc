package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 577 Division II Level Three - 1000
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12461&rd=15497
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+577
public class EllysCoprimesDiv2 {
    public int getCount(int[] numbers) {
        int n = numbers.length;

        Arrays.sort(numbers);

        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            count += split(numbers[i], numbers[i + 1]);
        }

        return count;
    }

    private int split(int n1, int n2) {
        if (gcd(n1, n2) == 1) { return 0; }

        for (int i = n1 + 1; i < n2; i++) {
            if (gcd(n1, i) == 1 && gcd(i, n2) == 1) {
                return 1;
            }
        }

        return 2;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }

        return a;
    }


    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
