package topc.easy;

import java.util.*;
import java.io.*;

// SRM 618 Division II Level One - 250
// brute force, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13072&rd=15851
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+618
public class WritingWords {
    public int write(String word) {
        int r = 0;
        for (int i = 0; i < word.length(); i++) {
            r += (word.charAt(i) - 'A' + 1);
        }
        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
