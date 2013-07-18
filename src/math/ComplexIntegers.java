package topc.math;

import java.util.*;
import java.io.*;

// SRM 198 Division II Level Three - 1000
// advanced math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2439&rd=5073
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm198
public class ComplexIntegers {
    boolean[] prime;

    public String[] classify(int[] realPart, int[] imaginaryPart) {
        int n = realPart.length;

        Complex[] nums = new Complex[n];
        for (int i = 0; i < n; i++) {
            nums[i] = new Complex(realPart[i], imaginaryPart[i]);
        }

        String[] types = new String[n];
        for (int i = 0; i < n; i++) {
            types[i] = nums[i].type();
        }

        return types;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Complex {
        // z = a + ib
        int a;
        int b;

        public Complex(int r, int i) {
            a = r;
            b = i;
        }

        public String type() {
            int n = norm();
            if (n == 0) { return "zero"; }
            if (n == 1) { return "unit"; }

            int absA = Math.abs(a);
            int absB = Math.abs(b);

            if (absA == 0 && isPrime(absB) && absB % 4 == 3) { return "prime"; }
            if (absB == 0 && isPrime(absA) && absA % 4 == 3) { return "prime"; }
            if (absA != 0 && absB != 0 && isPrime(n)) { return "prime"; }

            return "composite";
        }

        private int norm() {
            return a * a + b * b;
        }

        private boolean isPrime(int n) {
            int max = (int)Math.sqrt(n) + 1;
            for (int i = 2; i < max; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
