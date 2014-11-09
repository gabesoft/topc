package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 627 Division II Level One - 250
// geometry, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13277&rd=16008
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+627
public class ManySquares {
    public int howManySquares(int[] sticks) {
        int[] counts = new int[1001];
        int n = sticks.length;

        for (int i = 0; i < n; i++) {
          counts[sticks[i]]++;
        }

        int total = 0;

        for (int i = 0; i < counts.length; i++) {
          total += (counts[i] / 4);
        }

        return total;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
