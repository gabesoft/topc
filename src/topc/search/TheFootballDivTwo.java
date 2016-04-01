package topc.search;

import java.util.*;

// SRM 646 Division II Level Three - 1000
// search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13630&rd=16278
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+646
public class TheFootballDivTwo {
    public int find(int yourScore, int[] scores, int[] numberOfTeams) {
        int n = 1;

        for (int x : numberOfTeams) {
            n += x;
        }

        int res = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < scores.length; i++) {
            int si = scores[i];
            int ti = numberOfTeams[i];

            if (yourScore >= si) {
                x += ti;
            } else if (yourScore + 6 < si) {
                x += ti;
                res += ti;
            } else if (si <= yourScore + 3) {
                y += ti;
            }
        }

        n -= 2 + 2 * x + y;

        if (n > 0) {
            res += (n + 1) / 2;
        }

        return 1 + res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
