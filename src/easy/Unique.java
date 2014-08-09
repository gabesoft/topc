package topc.easy;

import java.util.*;
import java.io.*;

// TCO14 Round 1C Division I Level One - 250
// brute force, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13067&rd=15958
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2014+Round+1c
public class Unique {
    public static final char NUL = '\u0000';

    public String removeDuplicates(String S) {
        char[] chars = S.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == NUL) { continue; }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == chars[i]) {
                    chars[j] = NUL;
                }
            }
        }

        String r = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != NUL) {
                r += chars[i];
            }
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
