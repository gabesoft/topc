package topc.math;

import java.util.*;
import java.io.*;

// SRM 445 Division II Level Three - 1000
// math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10513&rd=13899
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+445
public class TheLockDivTwo {
    public String password(int n, int k) {
        if (n == 0) { return ""; }

        int half = 1 << (n - 1);

        if (k <= half) {
            return "0" + password(n - 1, k);
        } else if (k == half + 1) {
            return "1" + password(n - 1, half);
        } else {
            return "1" + password(n - 1, k - half - 1);
        }
    }
}
