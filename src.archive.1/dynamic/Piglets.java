package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 254 Division I Level Two - 500
// dynamic programming, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2245&rd=8006
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm254
public class Piglets {
    public int choose(String trough) {
        int n = trough.length();

        if (trough.charAt(0) == '-') { return 0; }
        if (trough.charAt(n - 1) == '-') { return n - 1; } 

        int last = trough.lastIndexOf("--");
        if (last != -1) { return last; }

        return trough.indexOf('-');
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
