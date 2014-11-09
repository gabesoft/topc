package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 598 Division II Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12863&rd=15710
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+598
public class ErasingCharacters {
    public String simulate(String s) {
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    change = true;
                    s = s.substring(0, i) + s.substring(i + 2);
                    break;
                }
            }
        }
        return s;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
