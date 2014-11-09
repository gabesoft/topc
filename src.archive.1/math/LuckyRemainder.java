package topc.math;

import java.util.*;
import java.io.*;

// SRM 509 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11138&rd=14438
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+509
public class LuckyRemainder {
    public int getLuckyRemainder(String X) {
        int n      = X.length();
        int pow2[] = new int[] { 1, 2, 4, 8, 7, 5 };

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (X.charAt(i) - '0');
        }

        return (sum * pow2[(n - 1) % 6]) % 9;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
