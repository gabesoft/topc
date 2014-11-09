package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 528 Division I Level One - 250
// greedy, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11564&rd=14553
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+528
public class Cut {
    public int getMaximum(int[] eelLengths, int maxCuts) {

        Arrays.sort(eelLengths);

        int count = 0;

        for (int eel : eelLengths) {
            if (eel % 10 == 0) {
                if (maxCuts >= eel / 10 - 1) {
                    maxCuts -= eel / 10 - 1;
                    count   += eel / 10;
                } else {
                    count   += maxCuts;
                    maxCuts  = 0;
                }
            }
        }

        for (int eel : eelLengths) {
            if (eel % 10 != 0) {
                int c    = Math.min(maxCuts, eel / 10);
                count   += c;
                maxCuts -= c;
            }
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
