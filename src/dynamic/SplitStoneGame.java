package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 619 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13113&rd=15852
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+619
public class SplitStoneGame {
    public String winOrLose(int[] number) {
        int n = number.length;

        if (n % 2 == 0) {
            return "LOSE";
        }
        if (n <= 2) {
            return "LOSE";
        }

        for (int i = 0; i < n; i++) {
            if (number[i] != 1) {
                return "WIN";
            }
        }

        return "LOSE";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
