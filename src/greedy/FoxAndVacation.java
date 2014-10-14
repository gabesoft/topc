package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 561 Division II Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11813&rd=15183
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+561
public class FoxAndVacation {
    public int maxCities(int total, int[] d) {
        Arrays.sort(d);
        int cnt = 0;
        int tot = 0;
        for (int i = 0; i < d.length; i++) {
            tot += d[i];
            if (tot > total) {
                break;
            }
            cnt++;
        }
        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
