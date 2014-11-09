package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 619 Division II Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13146&rd=15852
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+619
public class ChooseTheBestOne {
    public int countNumber(int N) {
        long count = N;
        int p      = 0;
        long t     = 1;

        boolean[] f = new boolean[N];
        while (count > 1) {
            long k = (t * t * t) % count + count;

            for (int i = 0; i < k - 1; i++) {
                while (f[p]) { p = (p + 1) % N; }
                p = (p + 1) % N;
            }

            while (f[p]) { p = (p + 1) % N; }
            f[p] = true;

            t++;
            count--;
        }

        for (int i = 0; i < N; i++) {
            if (!f[i]) {
                return i + 1;
            }
        }

        return 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
