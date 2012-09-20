package topc.math;

import java.util.*;
import java.io.*;

// SRM 539 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11848&rd=14731
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+539
public class CaptureFish {
    public int getParity(String fish) {
        int count = 0;
        int n     = fish.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                char inside   = '*';
                char outside  = '*';
                boolean valid = true;

                for (int k = 0; k < n; k++) {
                    char f = fish.charAt(k);
                    if (i <= k && k < j) {
                        if (f != '*') {
                            if (inside == '*') {
                                inside = f;
                            } else if (inside != f) {
                                valid = false;
                            }
                        }
                    } else {
                        if (f != '*') {
                            if (outside == '*') {
                                outside = f;
                            } else if (outside != f) {
                                valid = false;
                            }
                        }
                    }
                }

                if (valid && (inside == '*' || outside == '*' || inside != outside) ) {
                    count++;
                }
            }
        }
        return count % 2;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
