package topc.greedy;

import java.util.*;
import java.io.*;

// TCO11 Qual 2 Division I Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11418&rd=14530
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'11+Qualification+Round+2
public class BlackWhiteMagic {
    public int count(String creatures) {
        int n = creatures.length();
        int w = 0;

        for (int i = 0; i < n; i++) {
            if (creatures.charAt(i) == 'W') {
                w++;
            }
        }

        int c = 0;
        for (int i = 0; i < w; i++) {
            if (creatures.charAt(i) == 'B') {
                c++;
            }
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
