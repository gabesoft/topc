package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 587 Division I Level One - 250
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12300&rd=15699
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+587
public class JumpFurther {
    public int furthest(int N, int badStep) {
        int k = 0;

        for (int i = 0; i < N; i++) {
            int n = i + 1;
            if (n * (n + 1) / 2 == badStep) {
                k = i + 1;
                break;
            }
        }

        int sum = N * (N + 1) / 2;

        return k == 0 ? sum : sum - 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
