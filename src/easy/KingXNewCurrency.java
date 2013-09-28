package topc.easy;

import java.util.*;
import java.io.*;

// SRM 537 Division I Level One - 275
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11817&rd=14730
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+537
public class KingXNewCurrency {
    public int howMany(int A, int B, int X) {
        if (A % X == 0 && B % X == 0) { return -1; }

        int r = 0;
        for (int y = 1; y <= Math.max(A, B); y++) {
            if (y != X && 
                    linearCombination(X, y, A) && 
                    linearCombination(X, y, B)) { r++; }
        }

        return r;
    }

    private boolean linearCombination(int x, int y, int n) {
        for (int i = 0; i * x <= n; i++) {
            if ((n - x * i) % y == 0) {
                return true;
            }
        }
        return false;
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
