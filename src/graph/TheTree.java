package topc.graph;

import java.util.*;
import java.io.*;

// SRM 591 Division I Level One - 275
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12746&rd=15703
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+591
public class TheTree {
    public int maximumDiameter(int[] cnt) {
        int res = 0;
        int n   = cnt.length;

        for (int i = 0; i < n; i++) {
            boolean cut = false;

            for (int j = i; j < n; j++) {
                if (cnt[j] == 1) {
                    res = Math.max(res, n - i + j - i);
                    cut = true;
                    break;
                }
            }

            if (!cut) {
                res = Math.max(res, 2 * (n - i));
            }
        }

        return res;
    }
}
