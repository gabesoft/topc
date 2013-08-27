package topc.math;

import java.util.*;
import java.io.*;

// SRM 567 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12377&rd=15487
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+567
public class TheSquareRootDilemma {
    public int countPairs(int N, int M) {
        int count = 0;
        for (int a = 1; a <= N; a++) {
            int s = 1;

            for (int x = 2; x <= a / x; x++) {
                if (a % (x * x) == 0) {
                    s = x * x;
                }
            }

            int r = a / s;
            for (int y = 1; y * y * r <= M; y++) {
                count++;
            }
        }
        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
