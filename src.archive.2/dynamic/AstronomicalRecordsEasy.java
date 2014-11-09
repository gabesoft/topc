package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 594 Division II Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12812&rd=15706
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+594
public class AstronomicalRecordsEasy {
    public int minimalPlanets(int[] A, int[] B) {
        int res = A.length + B.length;
        for (int p : A) {
            for (int q : B) {
                HashSet<Integer> seen = new HashSet<Integer>();
                for (int x : A) {
                    seen.add(x * q);
                }
                for (int y : B) {
                    seen.add(y * p);
                }
                res = Math.min(res, seen.size());
            }
        }
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
