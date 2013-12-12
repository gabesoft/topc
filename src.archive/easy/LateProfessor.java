package topc.easy;

import java.util.*;
import java.io.*;

// SRM 467 Division I Level One - 250
// brute force, math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10823&rd=14151
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+467
public class LateProfessor {
    public double getProbability(int waitTime, int walkTime, int lateTime, int bestArrival, int worstArrival) {
        int late = 0;
        int k    = 1;

        while (waitTime * k + walkTime * (k - 1) < worstArrival) {
            int s = Math.max(bestArrival, waitTime * k + walkTime * (k - 1));
            int e = Math.min(worstArrival, (waitTime + walkTime) * k - lateTime);

            if (bestArrival == worstArrival && s <= bestArrival && bestArrival <= e) {
                return 1.0;
            }

            if (s < e) {
                late += (e - s);
            }

            k++;
        }

        double all = worstArrival - bestArrival;
        return all > 0 ? late / all : 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
