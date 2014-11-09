package topc.math;

import java.util.*;
import java.io.*;

// SRM 524 Division I Level One - 250
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11607&rd=14549
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+524
public class MagicDiamonds {
    public long minimalTransfer(long n) {
        if (n == 1) { return 1L; }
        if (n == 3) { return 3L; }
        return isPrime(n) ? 2 : 1;
    }

    private boolean isPrime(long n) {
        long lim = (long)Math.sqrt(n) + 1;
        for (int i = 2; i < lim; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
