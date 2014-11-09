package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 177 Division I Level Two - 450
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1973&rd=4690
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm177
public class Removal {
    public int finalPos(int n, int k, String[] remove) {
        long r = k;

        for (int i = remove.length - 1; i > -1; i--) {
            String[] range = remove[i].split("-");

            int lo = Integer.parseInt(range[0]);
            int hi = Integer.parseInt(range[1]);

            if (r >= lo) {
                r += (hi - lo + 1);
            }
        }

        return r > n ? -1 : (int)r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
