package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 529 Division II Level Three - 1000
// simple math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11746&rd=14722
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+529
public class MinskyMysteryDiv2 {
    public long computeAnswer(long N) {
        if (N < 2) {
            return -1;
        }

        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return i + (N / i);
            }
        }

        return N + 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
