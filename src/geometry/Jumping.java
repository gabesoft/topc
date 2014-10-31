package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 633 Division II Level Two - 500
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13463&rd=16076
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+633
public class Jumping {
    public String ableToGet(int x, int y, int[] jumpLengths) {
        int n = jumpLengths.length;
        long a = 0;
        long b = 0;

        for (int i = 0; i < n; i++) {
            int r = jumpLengths[i];
            if (r <= a) {
                a = a - r;
            } else if (r <= b) {
                a = 0;
            } else {
                a = r - b;
            }

            b += r;
        }

        long dx = x;
        long dy = y;
        long r2 = dx * dx + dy * dy;

        return a * a <= r2 && r2 <= b * b ? "Able" : "Not able";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
