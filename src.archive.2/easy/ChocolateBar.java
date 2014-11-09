package topc.easy;

import java.util.*;
import java.io.*;

// SRM 556 Division II Level One - 250
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12190&rd=15178
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+556
public class ChocolateBar {
    public int maxLength(String letters) {
        int n = letters.length();
        int best = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int len = j - i + 1;

                for (int x = i; x <= j && len > 0; x++) {
                    for (int y = x + 1; y <= j; y++) {
                        if (letters.charAt(x) == letters.charAt(y)) {
                            len = 0;
                            break;
                        }
                    }
                }

                best = Math.max(best, len);
            }
        }

        return best;
    }
}
