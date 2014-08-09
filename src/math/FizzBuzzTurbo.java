package topc.math;

import java.util.*;
import java.io.*;

// TCO14 Round 1C Division I Level Two - 450
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13062&rd=15958
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2014+Round+1c
public class FizzBuzzTurbo {
    public long[] counts(long A, long B) {
        long X = divBy(B, 3) - divBy(A - 1, 3);
        long Y = divBy(B, 5) - divBy(A - 1, 5);
        long Z = divBy(B, 15) - divBy(A - 1, 15);

        return new long[] { X - Z, Y - Z, Z };
    }

    private long divBy(long n, long k) {
        long last = n - (n % k);
        return last / k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
