package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 632 - TCO14 Wildcard Sweep Division II Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13391&rd=16075
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+632
public class RunningAroundPark {
    public int numberOfLap(int N, int[] d) {
        int prev = -1;
        int laps = 1;

        for (int x : d) {
            if (x <= prev) {
                laps++;
            }
            prev = x;
        }

        return laps;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
