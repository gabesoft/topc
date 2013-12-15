package topc.math;

import java.util.*;
import java.io.*;

// SRM 450 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10190&rd=13904
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+450
public class OrderedNim {
    public String winner(int[] layout) {
        int n = layout.length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 1 && layout[i] > 1) {
                return "Bob";
            } else if (i % 2 == 0 && layout[i] > 1) {
                return "Alice";
            }
        }

        return n % 2 == 1 ? "Alice" : "Bob";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
