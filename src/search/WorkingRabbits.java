package topc.search;

import java.util.*;
import java.io.*;

// SRM 542 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11936&rd=14734
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+542
public class WorkingRabbits {
    public double getEfficiency(String[] profit) {
        int n = profit.length;
        int Q = (n - 1) * n / 2;
        double P = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                P += (profit[i].charAt(j) - '0');
            }
        }

        return P / Q;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
