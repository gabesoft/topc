package topc.search;

import java.util.*;
import java.io.*;

// SRM 615 Division I Level One - 250
// search, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13088&rd=15848
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+615
public class AmebaDiv1 {
    public int count(int[] X) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < X.length; i++) {
            fill(X, set, X[i]);
        }

        int c = 0;
        for (int i = 0; i < X.length; i++) {
            if (!set.contains(X[i])) {
                c++;
                set.add(X[i]);
            }
        }

        return c;
    }

    private void fill(int[] xs, HashSet<Integer> set, int v) {

        for (int i = 0; i < xs.length; i++) {
            if (v == xs[i]) {
                v *= 2;
            }
        }

        set.add(v);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
