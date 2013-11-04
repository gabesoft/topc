package topc.math;

import java.util.*;
import java.io.*;

// TCO11 Round 2 Division I Level One - 250
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11161&rd=14566
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'11+Online+Round+2
public class GuessTheNumberGame {
    final long MOD = 1000000007L;

    public int possibleClues(int n) {
        long ways = 1;

        boolean[] composite = new boolean[n + 1];
        for (int x = 2; x <= n; x++) {
            if (!composite[x]) {
                long y   = 1;
                long exp = 0;

                while (y * x <= n) {
                    y *= x;
                    exp++;
                }

                ways = (ways * (exp + 1)) % MOD;

                for (int i = x + x; i <= n; i += x) {
                    composite[i] = true;
                }
            }

        }

        return (int) ways;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
