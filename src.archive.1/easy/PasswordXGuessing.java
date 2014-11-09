package topc.easy;

import java.util.*;
import java.io.*;

// TCO12 Round 1C Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11867&rd=15092
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2012+Round+1c
public class PasswordXGuessing {
    public long howMany(String[] guesses) {
        if (guesses.length == 1) { return 9L * guesses[0].length(); }

        int count = 0;
        int n = guesses[0].length();
        String first = guesses[0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                char c = (char)(j + '0');
                if (first.charAt(i) != c) {
                    String s = first.substring(0, i) + c + first.substring(i + 1, n);
                    boolean ok = true;

                    for (int k = 1; k < guesses.length; k++) {
                        ok &= differByOne(s, guesses[k]);
                    }
                    if (ok) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private boolean differByOne(String s1, String s2) {
        int d = 0;
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                d++;
            }
            if (d > 1) {
                break;
            }
        }
        return d == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
