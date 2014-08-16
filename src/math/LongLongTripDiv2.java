package topc.math;

import java.util.*;
import java.io.*;

// SRM 615 Division II Level Two - 500
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13091&rd=15848
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+615
public class LongLongTripDiv2 {
    public String isAble(long D, int T, int B) {
        if ((D - T) % (B - 1) != 0) {
            return "Impossible";
        }

        long y = (D - T) / (B - 1);

        return y >= 0 && y <= T ? "Possible" : "Impossible";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
