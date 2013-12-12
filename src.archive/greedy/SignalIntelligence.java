package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 480 Division II Level Three - 900
// encryption/compression, greedy, math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11059&rd=14159
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+480
public class SignalIntelligence {
    long[] pow2;

    public long encrypt(int[] numbers) {
        int n     = numbers.length;
        long best = Long.MAX_VALUE - 1;
        pow2      = getPow2();

        for (int i = 0; i < n; i++) {
            int[] nums = extract(numbers, i);
            Arrays.sort(nums);

            long pos = 1;
            for (int j = 0; j < n - 1; j++) {
                pos += nums[j];
                pos  = nextPow2(pos);
            }

            if (pos > 0) {
                pos += numbers[i];
                best = Math.min(best, pos - 1);
            }
        }

        return best;
    }

    int[] extract(int[] arr, int k) {
        int res[] = new int[arr.length - 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = i < k ? arr[i] : arr[i + 1];
        }
        return res;
    }

    long nextPow2(long n) {
        for (int i = 1; i < pow2.length; i++) {
            if (n < pow2[i]) {
                return pow2[i];
            }
        }
        return -1;
    }

    long[] getPow2() {
        long[] res = new long[62];
        res[0]     = 1;

        for (int i = 1; i < res.length; i++) {
            res[i] = 2 * res[i - 1];
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
