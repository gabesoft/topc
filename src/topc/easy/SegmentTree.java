package topc.easy;

import java.util.*;
import java.io.*;

// http://codeforces.com/blog/entry/18051
public class SegmentTree {
    int[] t;
    int N = 100000;
    int n;

    public SegmentTree(int[] nums) {
        int n = nums.length;
        this.n = n;
        this.t = new int[2  *  N];

        for (int i = 0; i < n; i++) {
            this.t[n + i] = nums[i];
        }

        for (int i = n - 1; i > 0; i--) {
            this.t[i] = this.t[i << 1] + t[(i << 1) + 1];
        }
    }

    public void update(int i, int val) {
        t[i + this.n] = val;
        for (int j = i + this.n; j > 1; j >>= 1) {
            this.t[j >> 1] = t[j] + t[j ^ 1];
        }
    }

    public int sumRange(int i, int j) {
        int res = 0;
        for (int l = i + this.n, r = j + this.n + 1; l < r; l >>= 1, r >>= 1) {
            if (l % 2 == 1) {
                res += this.t[l++];
            }
            if (r % 2 == 1) {
                res += this.t[--r];
            }
        }
        return res;
    }

    @SuppressWarnings("unused")
    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
