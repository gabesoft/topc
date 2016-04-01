package topc.easy;

import java.util.*;

// SRM 653 Division II Level One - 250
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13687&rd=16317
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+653
public class CountryGroup {
    public int solve(int[] a) {
        int cnt  = 0;
        int prev = -1;
        int left = 0;

        for (int i = 0; i < a.length; i++) {
            if (left > 0 && a[i] != prev) {
                return -1;
            }
            if (left == 0) {
                prev = a[i];
                left = a[i] - 1;
                cnt++;
            }else {
                left--;
            }
        }

        return left == 0 ? cnt : -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
