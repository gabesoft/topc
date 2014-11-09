package topc.easy;

import java.util.*;
import java.io.*;

// SRM 614 Division II Level One - 250
// brute force, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13048&rd=15847
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+614
public class MicroStrings {
    public String makeMicroString(int A, int D) {
        String s = "";
        while (A >= 0) {
            s += A;
            A -= D;
        }

        return s;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
