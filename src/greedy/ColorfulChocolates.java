package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 551 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12137&rd=15173
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+551
public class ColorfulChocolates {
    public int maximumSpread(String chocolates, int maxSwaps) {
        int n = chocolates.length();

        int best = 0;
        char[] choc = chocolates.toCharArray();

        for (int i = 0; i < n; i++) {
            char[] temp    = choc.clone();
            int swaps      = 0;
            boolean change = true;

            while(change && swaps < maxSwaps) {
                change = false;

                int up   = closest(temp, i, 1);
                int down = closest(temp, i, -1);

                int u = up - i;
                int d = i - down;

                if (up < n && (u <= d || down == -1)) {
                    swap(temp, up, up - 1);
                    change = true;
                    swaps++;
                } else if (down > -1 && (d <= u || up == n)) {
                    swap(temp, down, down + 1);
                    change = true;
                    swaps++;
                }
            }

            best = Math.max(best, spread(temp));
        }

        return best;
    }

    private int closest(char[] a, int k, int dir) {
        char c = a[k];
        while (k < a.length && k > -1 && a[k] == c) { k += dir; }
        while (k < a.length && k > -1 && a[k] != c) { k += dir; }
        return k;
    }

    private int spread(char[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            char c = a[i];
            int t  = 0;
            while (i < a.length && a[i] == c) {
                t++;
                i++;
            }
            i--;
            s = Math.max(s, t);
        }
        return s;
    }

    private void swap(char[] a, int i, int j) {
        char k = a[i];
        a[i] = a[j];
        a[j] = k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
