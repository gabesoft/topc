package topc.stringm;

import java.util.*;
import java.io.*;

// SRM 649 Division I Level One - 250
// string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13656&rd=16313
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+649
public class Decipherability {
    public String check(String s, int K) {
        int n = s.length();
        if (K == n) { return "Certain"; }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && j - i <= K) {
                    return "Uncertain";
                }
            }
        }

        return "Certain";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
