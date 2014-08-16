package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 615 Division II Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13089&rd=15848
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+615
public class AmebaDiv2 {
    public int simulate(int[] X, int A) {
        for (int i = 0; i < X.length; i++) {
            if (A == X[i]) {
                A *= 2;
            }
        }
        return A;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
