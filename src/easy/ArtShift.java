package topc.easy;

import java.util.*;
import java.io.*;

// TCO11 Round 3 Division I Level One - 250
// brute force, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11440&rd=14567
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'11+Online+Round+3
public class ArtShift {
    public int maxShifts(String sequence) {

        int n = sequence.length();
        int b = 0;
        int w = 0;

        for (int i = 0; i < n; i++) {
            if (sequence.charAt(i) == 'B') {
                b++;
            } else {
                w++;
            }
        }

        return find(1, 2, w + b, Math.min(w, b));
    }

    private int find(int curr, int x, int n, int t) {
        int r = curr;

        if (t > 0 && x <= n) {
            r = Math.max(r, find(lcm(curr, x), x + 1, n - x, t - 1));
        } 
        if (x + 1 <= n) {
            r = Math.max(r, find(curr, x + 1, n, t));
        }

        return r;
    }

    private int gcd(int x, int y) {
        while (x != 0) {
            int z = x;
            x = y % x;
            y = z;
        }
        return y;
    }

    private int lcm(int x, int y) {
        return x * (y / gcd(x, y));
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
