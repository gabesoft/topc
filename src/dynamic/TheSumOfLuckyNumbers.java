package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 403 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8571&rd=12175
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm403
public class TheSumOfLuckyNumbers {
    int [] nums;
    int N;

    public int[] sum(int n) {
        nums = new int[126];

        genNums("");
        Arrays.sort(nums);

        int [][] dp = new int[n + 1][];

        dp[0] = new int[] {};
        for (int i = 4; i < n + 1; i++) {
            int [] best = null;
            for (int j = 0; j < N; j++) {
                int f = nums[j];
                if (f > i) { break; }

                int [] prev = dp[i - f];
                if (prev != null) {
                    if (best == null || (prev.length + 1) < best.length) {
                        best = extend(f, prev);
                    }
                }
            }
            dp[i] = best;
        }

        int [] res = dp[n];
        return res == null ? new int[] {} : res;
    }

    int[] extend(int k, int [] arr) {
        int [] res = new int[arr.length + 1];
        res[0] = k;
        for (int i = 0; i < arr.length; i++) {
            res[i + 1] = arr[i];
        }
        return res;
    }

    void genNums(String s) {
        int n1 = Integer.parseInt(s + "4");
        int n2 = Integer.parseInt(s + "7");

        if (n1 < 1000000) {
            nums[N++] = n1;
            genNums(s + "4");
        }
        if (n2 < 1000000) {
            nums[N++] = n2;
            genNums(s + "7");
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
