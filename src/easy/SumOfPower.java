package topc.easy;

import java.util.*;
import java.io.*;

// SRM 626 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13230&rd=15859
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+626
public class SumOfPower {
    public int findSum(int[] array) {
        int sum = 0;
        int l   = array.length;

        for (int i = 0; i < l; i++) {
            int k = (l - i) * (i + 1);
            sum += (k * array[i]);
        }

        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
