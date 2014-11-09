package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 579 Division II Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12524&rd=15499
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+579
public class PrimalUnlicensedCreatures {
    public int maxWins(int initialLevel, int[] grezPower) {
        Arrays.sort(grezPower);

        int n = grezPower.length;
        int k = initialLevel;
        int c = 0;

        for (int i = 0; i < n; i++) {
            if (grezPower[i] < k) {
                k += grezPower[i] / 2;
                c++;
            }
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
