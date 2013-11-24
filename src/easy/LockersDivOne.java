package topc.easy;

import java.util.*;
import java.io.*;

// Member SRM 482 Division I Level One - 250
// brute force, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11110&rd=14235
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class LockersDivOne {
    public int lastOpened(int N) {
        if (N == 1) { return 1; }

        int nums[] = new int[N / 2];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i + 1) * 2;
        }

        int k = 3;
        while (k < nums.length) {
            int n = nums.length;
            int temp[] = new int[n - (n / k)];

            temp[0] = nums[1];

            int m = 2;
            for (int i = 1; i < temp.length; i++) {
                if (m % k == 0) {
                    m++;
                }
                if (m == nums.length) {
                    break;
                }
                temp[i] = nums[m++];
            }

            nums = temp;
            k++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return nums[i - 1];
            }
        }

        return nums[nums.length - 1];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
