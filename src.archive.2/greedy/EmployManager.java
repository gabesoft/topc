package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 619 Division II Level Three - 950
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13116&rd=15852
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+619
public class EmployManager {
    public int maximumEarnings(int[] value, String[] earning) {
        int res = 0;
        int n = value.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                res -= (earning[i].charAt(j) - '0');
            }
        }

        for (int i = 0; i < n; i++) {
            int col = 0;
            for (int j = 0; j < n; j++) {
                col += (earning[j].charAt(i) - '0');
            }
            if (col > value[i]) {
                res += (col - value[i]);
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
