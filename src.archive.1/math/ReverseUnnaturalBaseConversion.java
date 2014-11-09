package topc.math;

import java.util.*;
import java.io.*;

// SRM 342 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7413&rd=10666
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm342
public class ReverseUnnaturalBaseConversion {
    public String convertToBase(int x, int b) {
        if (x == 0) { return "0"; }

        boolean addsign = false;
        if (b > 0 && x < 0) {
            addsign = true;
            x = Math.abs(x);
        }

        String s  = "";
        int digit = 0;

        while (x != 0) {
            digit = mod(x, Math.abs(b));
            s     = digit + s;
            x     = (x - digit) / b;
        }

        return addsign ? "-" + s : s;
    }

    int mod(int x, int b) {
        return (x % b + b) % b;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
