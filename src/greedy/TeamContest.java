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

        int x  = Math.min(strength[0], Math.min(strength[1], strength[2]));
        int y  = Math.max(strength[0], Math.max(strength[1], strength[2]));
        int st = x + y;

        int others[] = new int[n - 3];
        for (int i = 3; i < n; i++) {
            others[i - 3] = strength[i];
        }

        Arrays.sort(others);

        int rank = 1;

        boolean taken[] = new boolean[others.length];
        for (int i = others.length - 1; i > -1; i--) {
            if (taken[i]) { continue; }

            int k = -1;
            int a = others[i];
            int b = 0;

            for (int j = i - 1; j > -1; j--) {
                if (a + others[j] > st && !taken[j]) {
                    b = others[j];
                    k = j;
                }
            }

            if (k > -1 && k < i - 1) {
                taken[i] = true;
                taken[k] = true;
                taken[k + 1] = true;
                rank++;
            }
        }

        return rank;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
