package topc.math;

import java.util.*;
import java.io.*;

// SRM 526.5 Division I Level One - 250
// math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11706&rd=14762
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+526.5
public class MagicCandy {
    public int whichOne(int n) {
        int pos = n;
        while (n > 1) {
            int rem = (int) Math.sqrt(n);
            if (rem * rem == n) {
                pos--;
            }
            n -= rem;
        }
        return pos;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
