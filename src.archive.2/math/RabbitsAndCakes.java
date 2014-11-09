package topc.math;

import java.util.*;
import java.io.*;

// TCO13 Semifinal 1 Division I Level One - 300
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12787&rd=15808
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class RabbitsAndCakes {
    public long getNumber(int minR, int maxR, int minC, int maxC) {
        long count   = 0;
        int fst      = minR - maxC;
        int lst      = maxR - minC;
        int startWay = -1;
        int endWay   = 0;
        int startC   = maxC;
        int endC     = maxC;
        int endR     = minR;

        for (int d = fst; d <= lst; d++) {
            int inc = 0;
            if (d <= 0) {
                count += endC - startC + 1;
            } else {
                count += (endC / d) - ((startC - 1) / d);
            }
            if (startC == minC) {
                startWay = 0;
            }
            if (endR == maxR) {
                endWay = -1;
            }
            endR++;
            startC += startWay;
            endC += endWay;
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
