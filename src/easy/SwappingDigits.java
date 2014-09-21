package topc.easy;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 583 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12609&rd=15503
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+583
public class SwappingDigits {
    public String minNumber(String num) {
        BigInteger k = new BigInteger(num);
        char[] chars = num.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
                if (i != j) {
                    swap(chars, i, j);
                    if (chars[0] > '0') {
                        BigInteger p = new BigInteger(new String(chars));
                        if (p.compareTo(k) < 0) {
                            k = p;
                        }
                    }
                    swap(chars, i, j);
                }
            }
        }

        return k.toString();
    }

    private void swap(char[] c, int i, int j) {
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
