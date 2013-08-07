package topc.easy;

import java.util.*;
import java.io.*;

// SRM 155 Division I Level One - 300
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1669&rd=4580
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm155
public class PaternityTest {
    public int[] possibleFathers(String child, String mother, String[] men) {
        int n = child.length() / 2;
        int k = 1 << (n * 2);
        int m = 0;

        boolean match[] = new boolean[men.length];
        for (int i = 0; i < k; i++) {
            if (Integer.bitCount(i) == n && matches(child, mother, i)) {
                for (int j = 0; j < men.length; j++) {
                    if (match[j]) {
                        continue;
                    }
                    if (matches(child, men[j], ~i)) {
                        match[j] = true;
                        m++;
                    }
                }
            }
        }

        int r[] = new int[m];
        int j   = 0;

        for (int i = 0; i < men.length; i++) {
            if (match[i]) {
                r[j++] = i;
            }
        }

        return r;
    }

    private boolean matches(String a, String b, int k) {
        int n = a.length();
        for (int i = 0; i < n; i++) {
            if (on(k, i) && a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
