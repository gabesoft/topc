package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 564 Division II Level Two - 500
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12343&rd=15186
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+564
public class AlternateColors {
    public String getColor(long r, long g, long b, long k) {
        long min = Math.min(r, Math.min(g, b));

        if (k <= min * 3) {
            return (new String[] { "BLUE", "RED", "GREEN" })[(int)(k % 3)];
        }

        r -= min;
        g -= min;
        b -= min;
        k -= min * 3;

        int x = 0;

        x |= Math.min(1, r) << 2;
        x |= Math.min(1, g) << 1;
        x |= Math.min(1, b) << 0;

        if (x == 4) { return "RED"; }
        if (x == 2) { return "GREEN"; }
        if (x == 1) { return "BLUE"; }

        if (x == 6) { return get(r, g, k, new String[] { "GREEN", "RED" }); }
        if (x == 5) { return get(r, b, k, new String[] { "BLUE", "RED" }); }
        if (x == 3) { return get(g, b, k, new String[] { "BLUE", "GREEN" }); }

        return null;
    }

    private String get(long x, long y, long k, String[] data) {
        long min = Math.min(x, y);
        if (k <= min * 2) {
            return data[(int)(k % 2)];
        } else {
            return x < y ? data[0] : data[1];
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
