package topc.easy;

import java.util.*;
import java.io.*;

// SRM 575 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12496&rd=15495
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+575
public class TheNumberGameDivOne {
    public String find(long n) {
        if (n % 2 != 0) { return "Brus"; }
        if ((n & (n - 1)) != 0) { return "John"; }

        int k = 0;
        while (n > 0) {
            n >>= 1;
            k++;
        }

        return k % 2 == 0 ? "Brus" : "John";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
