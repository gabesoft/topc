package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 608 Division II Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13000&rd=15841
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+608
public class OneDimensionalRobotEasy {
    public int finalPosition(String commands, int A, int B) {
        int pos = 0;

        for (int i = 0; i < commands.length(); i++) {
            if (commands.charAt(i) == 'L') {
                pos = Math.max(-A, pos - 1);
            } else {
                pos = Math.min(B, pos + 1);
            }
        }
        return pos;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
