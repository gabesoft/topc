package topc.easy;

import java.util.*;
import java.io.*;

// SRM 620 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13161&rd=15853
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+620
public class PairGameEasy {
    public String able(int a, int b, int c, int d) {
        return check(a, b, c, d) ? "Able to generate" : "Not able to generate";
    }

    private boolean check(int a, int b, int c, int d) {
        if (a == c && b == d) { return true; }
        if (a > c || b > d) { return false; }

        return check(a + b, b, c, d) || check(a, a + b, c, d);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
