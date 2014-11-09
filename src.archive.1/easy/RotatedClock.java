package topc.easy;

import java.util.*;
import java.io.*;

// SRM 515 Division I Level One - 250
// brute force, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11329&rd=14540
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+515
public class RotatedClock {
    public String getEarliest(int hourHand, int minuteHand) {
        if (minuteHand % 6 != 0) { return ""; }

        int bestHr  = 13;
        int bestMin = 0;

        for (int pos = 0; pos < 12; pos++) {
            int offset = pos * 30;
            int hrDeg  = (hourHand - offset + 360) % 360;
            int minDeg = (minuteHand - offset + 360) % 360;

            int hr  = hrDeg / 30;
            int min = minDeg / 6;

            if (min == (hrDeg % 30) * 2 && hr < bestHr) {
                bestHr  = hr;
                bestMin = min;
            }
        }

        return bestHr == 13 ? "" : String.format("%02d:%02d", bestHr, bestMin);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
