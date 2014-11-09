package topc.math;

import java.util.*;
import java.io.*;

// SRM 452 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10561&rd=13906
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+452
public class NotTwo {
    public int maxStones(int width, int height) {
        int count = 0;

        for (int i = 0; i < height; i++) {
            int row    = i % 4;
            int blocks = width / 4;
            int rest   = width % 4;

            count += (blocks * 2);

            if (rest > 0) {
                if (row == 0 || row == 1) {
                    count += (rest == 1 ? 1 : 2);
                } else {
                    count += (rest == 3 ? 1 : 0);
                }
            }
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
