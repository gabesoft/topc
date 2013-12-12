package topc.math;

import java.util.*;
import java.io.*;

// Member SRM 489 Division I Level One - 300
// math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11211&rd=14242
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class BallsConverter {
    public String theGood(String[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int v1 = value(a[i].charAt(j));
                    int v2 = value(a[j].charAt(k));
                    if (a[v1].charAt(k) != a[i].charAt(v2)) {
                        return "Bad";
                    }
                }
            }
        }

        return "Good";
    }

    private int value(char c) {
        return Character.isUpperCase(c) ? c - 'A' : c - 'a' + 26;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
