package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 534 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11522&rd=14727
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+534
public class EllysFiveFriends {
    public final int MAX = 5;
    public final int BASE = 26;
    public final int MASK = 11881376;
    public final int MOD = 1000000007;

    int[][] a;
    int[] dyn;
    int[] len;
    int[] idx;

    public int getZero(int[] numbers) {
        a   = new int[MAX][BASE];
        len = new int[MAX];
        idx = new int[MAX];
        dyn = new int[MASK];

        Arrays.fill(dyn, -1);

        for (int i = 0; i < MAX; i++) {
            while (numbers[i] > 0) {
                if (numbers[i] % 2 == 1) {
                    a[i][len[i]++] = 1;
                    numbers[i]--;
                } else {
                    a[i][len[i]++] = 0;
                    numbers[i] >>= 1;
                }
            }
        }

        return rec();
    }

    int rec() {
        int flag = 1;
        int mask = 0;

        for (int i = 0; i < MAX; i++) {
            if (idx[i] < len[i]) {
                flag = 0;
            }
            mask = mask * BASE + idx[i];
        }
        if (flag == 1) { return 1; }
        if (dyn[mask] != -1) { return dyn[mask]; }

        int ans = 0;
        for (int i1 = 0; i1 < MAX; i1++) {
            if (idx[i1] < len[i1]) {
                int i2 = (i1 + 1) % MAX;
                if (idx[i2] < len[i2]) {
                    if (a[i1][idx[i1]] == 1 && a[i2][idx[i2]] == 1) {
                        idx[i1]++;
                        idx[i2]++;
                        ans += rec();
                        if (ans >= MOD) {
                            ans -= MOD;
                        }
                        idx[i1]--;
                        idx[i2]--;
                    }

                    int s1 = idx[i1];
                    int s2 = idx[i2];
                    idx[i1] = Math.min(idx[i1] + a[i1][idx[i1]] + 1, len[i1]);
                    idx[i2] = Math.min(idx[i2] + a[i2][idx[i2]] + 1, len[i2]);
                    ans += rec();
                    if (ans >= MOD) {
                        ans -= MOD;
                    }
                    idx[i1] = s1;
                    idx[i2] = s2;
                }
            }
        }

        dyn[mask] = ans;
        return dyn[mask];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
