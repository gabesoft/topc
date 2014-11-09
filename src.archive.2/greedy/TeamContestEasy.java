package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 573 Division II Level Two - 500
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12471&rd=15493
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+573
public class TeamContestEasy {
    public int worstRank(int[] strength) {
        Arrays.sort(strength, 0, 3);
        Arrays.sort(strength, 3, strength.length);

        int n = strength.length;
        int st = strength[1] + strength[2];
        int i = 3 + ((n - 1) / 3);
        int j = n - 1;

        int rank = 1;

        while (i < j) {
            if (strength[i] + strength[j] > st) {
                rank++;
                i++;
                j--;
            } else {
                i++;
            }
        }

        return rank;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
