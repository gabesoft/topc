package topc.easy;

import java.util.*;
import java.io.*;

// SRM 578 Division II Level One - 250
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12540&rd=15498
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+578
public class DeerInZooDivTwo {
    public int[] getminmax(int N, int K) {
        int max = N - (int)Math.ceil(K / 2.0);
        int min = Math.max(0, N - K);
        return new int[] { min, max };
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
