package topc.math;

import java.util.*;
import java.io.*;

// SRM 459 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10682&rd=14145
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+459
public class Inequalities {
    public int maximumSubset(String[] inequalities) {
        int n = inequalities.length;
        Eq[] eq = new Eq[n];

        for (int i = 0; i < n; i++) {
            eq[i] = new Eq(inequalities[i]);
        }

        int max = 0;
        for (double i = -10; i < 1001; i += 0.5) {
            max = Math.max(max, countMatching(eq, i));
        }

        return max;
    }

    private int countMatching(Eq[] eq, double x) {
        int count = 0;
        for (int i = 0; i < eq.length; i++) {
            if (eq[i].check(x)) {
                count++;
            }
        }
        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Eq {
        int op;
        int val;

        public Eq(String str) {
            String[] parts = str.split("\\s+");
            if (parts[1].equals("<")) {
                op = 0;
            } else if (parts[1].equals("<=")) {
                op = 1;
            } else if (parts[1].equals("=")) {
                op = 2;
            } else if (parts[1].equals(">=")) {
                op = 3;
            } else if (parts[1].equals(">")) {
                op = 4;
            }

            val = Integer.parseInt(parts[2]);
        }

        public boolean check(double x) {
            switch (op) {
                case 0 : return x < val;
                case 1 : return x <= val;
                case 2 : return x == val;
                case 3 : return x >= val;
                case 4 : return x > val;
            }
            return false;
        }

        public String toString() {
            return op + " " + val;
        }
    }
}
