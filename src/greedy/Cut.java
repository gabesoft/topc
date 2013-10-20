package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 528 Division I Level One - 250
// greedy, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11564&rd=14553
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+528
public class Cut {
    public int getMaximum(int[] eelLengths, int maxCuts) {

        ArrayList<Integer> mul10 = new ArrayList<Integer>();
        ArrayList<Integer> others = new ArrayList<Integer>();

        int count = 0;

        for (int i = 0; i < eelLengths.length; i++) {
            int eel = eelLengths[i];
            if (eel == 10) {
                count++;
            } else if (eel % 10 == 0) {
                mul10.add(eel);
            } else {
                others.add(eel);
            }
        }

        Collections.sort(mul10);
        Collections.sort(others);

        for (Integer eel : mul10) {
            while (eel > 10 && maxCuts > 0) {
                count++;
                eel -= 10;
                maxCuts--;
            }
            if (eel == 10) {
                count++;
            }
            if (maxCuts == 0) {
                break;
            }
        }

        for (int i = others.size() - 1; i > -1; i--) {
            int eel = others.get(i);

            while (eel > 10 && maxCuts > 0) {
                count++;
                eel -= 10;
                maxCuts--;
            }
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
