package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 521 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10943&rd=14546
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+521
public class MissingParentheses {
    public int countCorrections(String par) {
        int stack = 0;
        int add   = 0;

        for (int i = 0; i < par.length(); i++) {
            if (par.charAt(i) == '(') {
                stack++;
            } else if (stack == 0) {
                add++;
            } else {
                stack--;
            }
        }

        return Math.abs(stack) + add;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
