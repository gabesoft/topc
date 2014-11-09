package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 599 Division II Level Two - 500
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12870&rd=15711
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+599
public class BigFatInteger2 {
    public String isDivisible(int A, int B, int C, int D) {
        HashMap<Long, Long> ap = primeFactors(A);
        HashMap<Long, Long> cp = primeFactors(C);

        for (long k : cp.keySet()) {
            if (!ap.containsKey(k)) {
                ap.put(k, 0L);
            }
            if (cp.get(k) * D > ap.get(k) * B) {
                return "not divisible";
            }
        }

        return "divisible";
    }

    private HashMap<Long, Long> primeFactors(long x) {
        HashMap<Long, Long> res = new HashMap<Long, Long>();

        for (int p = 2; p * p <= x; p++) {
            if (x % p == 0) {
                long r = 0;
                while (x % p == 0) {
                    x /= p;
                    r++;
                }
                res.put((long)p, r);
            }
        }
        if (x != 1) {
            res.put(x, 1L);
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
