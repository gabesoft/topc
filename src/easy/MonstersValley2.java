package topc.easy;

import java.util.*;
import java.io.*;

// SRM 565 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12351&rd=15187
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+565
public class MonstersValley2 {
    long D[] = null;
    int price[] = null;
    int dread[] = null;
    int n = 0;
    int INF = 1 << 30;

    public int minimumPrice(int[] dread, int[] price) {
        this.n = dread.length;
        this.D = new long[1 << n];
        this.price = price;
        this.dread = dread;

        for (int i = 1; i < D.length; i++) {
            long sum = 0;
            for (int j = 0; j < dread.length; j++) {
                if (on(i, j)) {
                    sum += dread[j];
                }
            }
            D[i] = sum;
        }

        return min(0, 0);
    }

    private int min(int mask, int k) {
        if (k == n) { return 0; }

        int a = price[k] + min(mask | (1 << k), k + 1);
        int b = INF;

        if (D[mask] >= dread[k]) {
            b = min(mask, k + 1);
        }

        return Math.min(a, b);
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
