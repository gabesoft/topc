package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 449 Division I Level One - 250
// geometry, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10548&rd=13903
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+449
public class MaxTriangle {
    public double calculateArea(int A, int B) {
        HashSet<Integer> set = new HashSet<Integer>();
        int len = (int)Math.sqrt(Math.max(A, B) + 1000);
        for (int i = 0; i < len; i++) {
            set.add(i * i);
        }

        double max = -1;

        for (int i = 0; i * i <= A; i++) {
            int wA = i * i;
            int hA = A - wA;

            if (set.contains(hA)) {
                for (int j = 0; j * j <= B; j++) {
                    int wB = j * j;
                    int hB = B - wB;

                    if (set.contains(hB)) {
                        int xa = (int)Math.sqrt(wA);
                        int ya = (int)Math.sqrt(hA);

                        int xb = (int)Math.sqrt(wB);
                        int yb = (int)Math.sqrt(hB);

                        int x[] = new int[] { 0, xa, xb };
                        int y[] = new int[] { 0, ya, yb };
                        max = Math.max(max, area(x, y));

                        x[2] = -x[2];
                        max = Math.max(max, area(x, y));
                    }
                }
            }
        }

        return max;
    }

    private double area(int[] x, int[] y) {
        double a = Math.sqrt(sq(x[1] - x[0]) + sq(y[1] - y[0]));
        double b = Math.sqrt(sq(x[2] - x[1]) + sq(y[2] - y[1]));
        double c = Math.sqrt(sq(x[2] - x[0]) + sq(y[2] - y[0]));
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private long sq(long x) {
        return x * x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
