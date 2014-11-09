package topc.math;

import java.util.*;
import java.io.*;
import java.text.*;

// SRM 231 Division I Level Two - 450
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3943&rd=6520
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm231
public class LargeSignTest {
    public String pvalue(int N, int K) {
        if (2 * K == N) { return "100.0%"; }

        double f = 1;
        double r = 1;
        double k = 0;

        for (int i = 1; i <= Math.min(K, N - K); i++) {
            f  = f * (N - i + 1) / i;
            r += f;
            while (r > 2) {
                r /= 2;
                f /= 2;
                k++;
            }
        }

        while (k++ < N - 1) {
            r /= 2;
        }

        DecimalFormat format = new DecimalFormat("0.0");
        return format.format(r * 100) + "%";

    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
