package topc.math;

import java.util.*;
import java.io.*;

// SRM 626 Division II Level Two - 500
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13240&rd=15859
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+626
public class FixedDiceGameDiv2 {
    public double getExpectation(int a, int b) {
        double num = 0;
        double den = 0;

        for (int i = 1; i <= a; i++) {
            double p = i > b ? 1 : (i - 1) / (double)b;
            num += (i * p);
            den += p;
        }

        return num / den;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
