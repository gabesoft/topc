package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 630 Division II Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13378&rd=16061
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+630
public class DoubleLetter {
    public String ableToSolve(String S) {
        boolean change = true;
        while (change) {
            change = false;
            if (S.length() == 0) {
                return "Possible";
            }
            for (int i = 0; i < S.length() - 1; i++) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    change = true;
                    S = S.substring(0, i) + S.substring(i + 2);
                    break;
                }
            }
        }

        return "Impossible";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
