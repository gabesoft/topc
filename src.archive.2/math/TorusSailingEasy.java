package topc.math;

import java.util.*;
import java.io.*;

// SRM 614 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13085&rd=15847
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+614
public class TorusSailingEasy {
    public double expectedTime(int N, int M, int goalX, int goalY) {
        int cnt = 1;
        int goal = -1;

        while (cnt % N != 0 || cnt % M != 0) {
            if (cnt % N == goalX && cnt % M == goalY) {
                goal = cnt;
            }
            cnt++;
        }

        return goal == -1 ? -1 : (cnt - goal) * goal;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
