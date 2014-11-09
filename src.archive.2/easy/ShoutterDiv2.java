package topc.easy;

import java.util.*;
import java.io.*;

// SRM 580 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12578&rd=15500
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+580
public class ShoutterDiv2 {
    public int count(int[] s, int[] t) {
        int n = s.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intersect(s[i], t[i], s[j], t[j])) {
                    c++;
                }
            }
        }
        return c;
    }

    private boolean intersect(int a, int b, int x, int y) {
        return x <= b && a <= y;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
