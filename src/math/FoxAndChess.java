package topc.math;

import java.util.*;
import java.io.*;

// SRM 590 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12725&rd=15702
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+590
public class FoxAndChess {
    public String ableToMove(String begin, String target) {
        int n = begin.length();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < n; i++) {
            if (begin.charAt(i) == '.') { continue; }
            stack.push(begin.charAt(i));
        }

        for (int i = n - 1; i > -1; i--) {
            if (target.charAt(i) == '.') { continue; }
            if (stack.size() == 0) { return "Impossible"; }

            char b = stack.pop();
            char t = target.charAt(i);
            if (b != t) {
                return "Impossible";
            }
        }

        int r = 0;
        int l = 0;
        for (int i = 0; i < n; i++) {
            if (begin.charAt(i) == 'R') {
                r++;
            }
            if (target.charAt(i) == 'R') {
                r--;
            }

            if (target.charAt(i) == 'L') {
                l++;
            }
            if (begin.charAt(i) == 'L') {
                l--;
            }

            if (r < 0 || l < 0) {
                return "Impossible";
            }
        }

        return stack.size() == 0 ? "Possible" : "Impossible";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
