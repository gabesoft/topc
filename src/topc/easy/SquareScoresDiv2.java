package topc.easy;

import java.util.*;

// SRM 654 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13700&rd=16318
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+654
public class SquareScoresDiv2 {
    public int getscore(String s) {
        int n = s.length();
        int c = n;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                boolean ok = true;

                for (int k = j + 1; (k < j + i) && ok; k++) {
                    if (s.charAt(k) != s.charAt(j)) {
                        ok = false;
                    }
                }

                // debug(i, j, ok);
                // debug(s.substring(j, j + i));

                if (ok) {
                    c++;
                }
            }
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
