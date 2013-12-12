package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 573 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12470&rd=15493
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+573
public class TeamContest {
    public int worstRank(int[] strength) {
        int n  = strength.length;

        Arrays.sort(strength, 0, 3);
        Arrays.sort(strength, 3, n);

        int st = strength[0] + strength[2];

        int i = 3;
        int j = n - 1;
        int rank = 1;

        while (i < j) {
            if (strength[i] + strength[j] > st) {
                rank++;
                i += 2;
                j -= 1;
            } else {
                i += 3;
            }
        }

        return rank;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
