package topc.math;

import java.util.*;
import java.io.*;

// SRM 647 Division II Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13632&rd=16279
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+647
public class PeacefulLine {
    public String makeLine(int[] xs) {
        int[] c = new int[26];
        int max = 0;

        for (int x : xs) {
            c[x]++;
            max = Math.max(c[x], max);
        }

        return xs.length - max >= max - 1 ? "possible" : "impossible";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
