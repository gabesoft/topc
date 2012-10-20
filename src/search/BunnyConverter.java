package topc.search;

import java.util.*;
import java.io.*;

// SRM 487 Division II Level Three - 900
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10746&rd=14240
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+487
public class BunnyConverter {
    public int getMinimum(int n, int z, int start, int goal) {
        boolean seen[] = new boolean[n + 1];
        long y         = goal;

        long z3 = z % n;
        z3      = (z3 * z) % n;
        z3      = (z3 * z) % n;

        int steps = 0;

        while (y != start) {
            seen[(int)y] = true;

            long x = ((n - (y * y) % n) % n + (n - z3) % n) % n;
            if (x == 0) {
                x = n;
            }

            if (seen[(int)x]) {
                return -1;
            } else {
                steps++;
                y = x;
            }
        }

        return steps;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
