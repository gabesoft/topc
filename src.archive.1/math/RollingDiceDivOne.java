package topc.math;

import java.util.*;
import java.io.*;

// SRM 536 Division I Level Two - 500
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11797&rd=14728
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+536
public class RollingDiceDivOne {
    public long mostLikely(int[] dice) {
        long sum = 0;
        int max  = 0;

        for (int i = 0; i < dice.length; i++) {
            sum += dice[i] - 1;
            max = Math.max(max, dice[i] - 1);
        }

        return dice.length + Math.min(sum / 2, sum - max);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
