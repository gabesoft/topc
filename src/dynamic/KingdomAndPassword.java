package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 548 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11869&rd=15170
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+548
public class KingdomAndPassword {
    long INF = 1 << 60;
    int n = 0;
    int restricted[] = null;
    int digits[] = null;
    int sorted[] = null;
    long old[][] = null;

    public long newPassword(long oldPassword, int[] restrictedDigits) {
        ArrayList<Integer> dg = new ArrayList<Integer>();

        long x = oldPassword;
        while (x > 0) {
            dg.add((int)(x % 10));
            x /= 10;
        }

        restricted = restrictedDigits;
        n = dg.size();
        digits = new int[n];
        sorted = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = dg.get(n - i - 1);
            sorted[i] = digits[i];
        }

        old = new long[2][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                old[0][i] *= 10;
                old[0][i] += digits[j];
            }
            for (int j = i; j < n; j++) {
                old[1][i] *= 10;
                old[1][i] += digits[j];
            }
        }

        debug("OLD0", old[0], oldPassword);
        debug("OLD1", old[1], oldPassword);

        Arrays.sort(sorted);
        debug(digits, sorted, oldPassword);

        //int next[] = new int[n];
        //boolean taken[] = new boolean[n];
        //for (int i = 0; i < n; i++) {
        //int diff = 10;
        //int digit = -1;

        //for (int j = 0; j < n; j++) {
        //if (restrictedDigits[i] == sorted[j] || taken[j]) {
        //continue;
        //}
        //int d = Math.abs(digits[i] - sorted[j]);
        //if (d < diff) {
        //diff = d;
        //digit = j;
        //}
        //}

        //if (digit == -1) {
        //debug(next, taken);
        //return -1;
        //} else {
        //taken[digit] = true;
        //next[i] = sorted[digit];
        //}
        //}

        long r1 = find(0, 1, 0);
        long r2 = find(0, 0, n - 1);

        if (Math.abs(oldPassword - r1) < Math.abs(oldPassword - r2)) {
            return r1;
        }
        if (Math.abs(oldPassword - r2) < Math.abs(oldPassword - r1)) {
            return r2;
        }
        return Math.min(r1, r2);

        //return find(0, n - 1);
    }

    private long find(int taken, int dir, int k) {
        if (k == -1) { return 0; }
        if (k == n) { return 0; }

        long best = INF;
        long rest = -1;

        long base = 1;
        for (int i = k + 1; i < n; i++) {
            base *= 10;
        }

        //debug(k, base);

        for (int i = 0; i < n; i++) {
            if (on(taken, i) || restricted[k] == sorted[i]) {
                continue;
            }

            long next = find(taken | (1 << i), dir, dir == 0 ? k - 1 : k + 1);

            if (next == -1) {
                continue;
            }

            long curr = dir == 0 ? next * 10 + sorted[i] : sorted[i] * base + next;
            long d = Math.abs(old[dir][k] - curr);

            //debug('F', k, curr, best, old[dir][k], d);

            if (d < best ) {
                best = d;
                rest = curr;
            }
            if (d == best && curr < rest) {
                rest = curr;
            }

            //debug(k, best, rest, curr);

            //int d = Math.abs(digits[k] - sorted[i]);
            //if (d < best) {
            //best = d;
            //digit = i;
            //rest = next;
            //}
        }

        //debug(k, Integer.toBinaryString(taken), rest);
        return rest;
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
