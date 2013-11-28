package topc.math;

import java.util.*;
import java.io.*;

// Member SRM 478 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11022&rd=14187
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class CarrotJumping {
    final long MOD = 1000000007L;

    public int theJump(int init) {
        int res = 100001;
        for (int a = 0; a <= 100000; a++) {
            for (int b = 0; b < 3; b++) {
                long v = pow(a * 3 + b * 2);
                long c = (v * init + (v - 1 + MOD) % MOD) % MOD;
                if (c == 0) {
                    res = Math.min(res, a + b);
                }
            }
        }

        return res == 100001 ? -1 : res;
    }

    private long pow(int v) {
        if (v == 0) { return 1; }
        if (v == 1) { return 2; }

        long x = pow(v / 2);
        if (v % 2 != 0) {
            return (x * x * 2) % MOD;
        } else {
            return (x * x) % MOD;
        }
    }
}
