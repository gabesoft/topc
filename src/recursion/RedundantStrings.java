package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 238 Division II Level Three - 1000
// recursion, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4505&rd=6537
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm238
public class RedundantStrings {
    public int howMany(int length) {
        if (length <= 1) { return 0; }

        int sum = 0;

        for (int i = 1; i < (length / 2) + 1; i++) {
            if (length % i == 0) {
                sum += (1 << i);
                sum -= howMany(i);
            }
        }

        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
