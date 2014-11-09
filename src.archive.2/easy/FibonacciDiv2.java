package topc.easy;

import java.util.*;
import java.io.*;

// SRM 622 Division II Level One - 250
// brute force, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13159&rd=15855
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+622
public class FibonacciDiv2 {
    public int find(int N) {
        long[] F = new long[100];
        F[0] = 0;
        F[1] = 1;

        for (int i = 2; i < F.length; i++) {
            F[i] = F[i - 1] + F[i - 2];
            if (F[i] > N) {
                return (int)Math.min(N - F[i - 1], F[i] - N);
            }
        }

        return 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
