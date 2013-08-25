package topc.search;

import java.util.*;
import java.io.*;

// TCO13 Round 1B Division I Level One - 250
// greedy, simple search, iteration, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12450&rd=15580
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class EllysPairs {
    public int getDifference(int[] knowledge) {
        Arrays.sort(knowledge);

        int n     = knowledge.length;
        int m     = n / 2;
        int worst = 2000;
        int best  = 0;

        for (int i = 0; i < m; i++) {
            int quality = knowledge[i] + knowledge[n - i - 1];

            best  = Math.max(best, quality);
            worst = Math.min(worst, quality);
        }

        return best - worst;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
