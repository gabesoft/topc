package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 486 Division I Level One - 300
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10992&rd=14239
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+486
public class OneRegister {
    public String getProgram(int s, int t) {
        int t1 = 0;
        int t2 = 0;
        int s1 = 0;
        int s2 = 0;

        while (t % 2 == 0 && t > 1) {
            t = (t >> 1);
            t1++;
        }

        while (s % 2 == 0 && s > 1) {
            s = (s >> 1);
            s1++;
        }

        if (s != 1) {
            while (t % s == 0 && t > 1) {
                t = t / s;
                t2++;
            }
            s2 = 1;
        }

        if (t > 1) { return ":-("; }

        String a = find(s1, s2, t1, t2);
        String b = null;

        if (s1 > 0 || s2 > 0) {
           b = find(0, 0, t1, t2);
           if (b != null) {
               b = "/" + b;
           }
        }

        if (a == null && b == null) { return ":-("; }
        if (a == null) { return b; }
        if (b == null) { return a; }

        return a.length() > b.length() ? b : a;
    }

    private String find(int s1, int s2, int t1, int t2) {
        if (s1 == t1 && s2 == t2) { return ""; }
        if (s1 > t1 || s2 > t2) { return null; }

        String a = null;
        String b = null;

        if (s1 == 0 && s2 == 0) {
            a = find(1, s2, t1, t2);
        } else {
            a = find(1 + s1, s2, t1, t2);
            b = find(2 * s1, 2 * s2, t1, t2);
        }

        if (a != null) {
            a = "+" + a;
        }
        if (b != null) {
            b = "*" + b;
        }

        if (a == null) { return b; }
        if (b == null) { return a; }

        return a.length() < b.length() ? a : b;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
