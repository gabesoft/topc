package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 454 Division I Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10706&rd=13908
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+454
public class DoubleXor {
    public int calculate(int N) {
        int r = N;
        for (int i = N - 1; i > 0; i--) {
            r = dxor(r, i);
        }
        return r;
    }

    private int dxor(int a, int b) {
        int r = 0;
        int m = 1;
        while (a > 0 || b > 0) {
            int d1 = a % 10;
            int d2 = b % 10;
            int d  = (d1 ^ d2) % 10;

            r += (d * m);
            m *= 10;
            a /= 10;
            b /= 10;
        }
        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
