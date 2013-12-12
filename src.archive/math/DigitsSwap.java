package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 436 Division II Level Three - 1000
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10342&rd=13698
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+436
public class DigitsSwap {
    public String maximalProduct(String x, String y, int swaps) {
        char xc[] = x.toCharArray();
        char yc[] = y.toCharArray();

        BigInteger a = find(xc.clone(), yc.clone(), swaps);
        BigInteger b = find(yc.clone(), xc.clone(), swaps);

        return a.compareTo(b) < 0 ? b.toString() : a.toString();
    }

    BigInteger find(char[] s1, char[] s2, int swaps) {
        int count       = 0;
        int n           = s1.length;
        boolean same    = false;
        boolean greater = false;

        for (int i = 0; i < n && count < swaps; i++) {
            if (s1[i] == s2[i]) {
                same = true;
                continue;
            }

            if (greater) {
                if (s1[i] > s2[i]) {
                    swap(s1, s2, i);
                    count++;
                }
            } else {
                if (s1[i] < s2[i]) {
                    swap(s1, s2, i);
                    count++;
                }
                greater = true;
            }
        }

        if (count % 2 != swaps % 2 && !same) {
            swap(s1, s2, n - 1);
        }

        return mul(s1, s2);
    }

    BigInteger mul(char[] a, char[] b) {
        BigInteger n1 = new BigInteger(new String(a));
        BigInteger n2 = new BigInteger(new String(b));
        return n1.multiply(n2);
    }

    void swap(char[] x, char[] y, int i) {
        char temp = x[i];
        x[i] = y[i];
        y[i] = temp;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
