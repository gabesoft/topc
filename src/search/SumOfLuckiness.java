package topc.search;

import java.util.*;
import java.io.*;

// SRM 526 Division II Level Three - 1000
// search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11626&rd=14551
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+526
public class SumOfLuckiness {
    int DIGITS = 10;
    long[][] c;
    long[] pow8;

    public long theSum(int A, int B) {
        pow8    = new long[DIGITS + 1];
        pow8[0] = 1;

        for (int i = 1; i < DIGITS + 1; i++) {
            pow8[i] = 8 * pow8[i - 1];
        }

        c = new long[DIGITS + 1][DIGITS + 1];
        for (int i = 0; i < DIGITS + 1; i++) {
            c[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
            }
        }

        return theSum(B) - theSum(A - 1);
    }

    long theSum(int B) {
        long sum = 0;
        for (int n4 = 0; n4 <= DIGITS; n4++) {
            for (int n7 = 0; n4 + n7 <= DIGITS; n7++) {
                sum += Math.abs(n7 - n4) * waysToDo(n4, n7, B + 1);
            }
        }
        return sum;
    }

    long waysToDo(int n4, int n7, int B) {
        String s = "" + B;
        int n    = s.length();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            for (char d = '0'; d < s.charAt(i); d++) {
                int r4 = n4;
                int r7 = n7;

                if (d == '4') { r4--; }
                if (d == '7') { r7--; }
                
                int rem = n - i - 1;
                if (r4 >= 0 && r7 >= 0 && r4 + r7 <= rem) {
                    sum += c[rem][r4] * c[rem - r4][r7] * pow8[rem - r4 - r7];
                }
            }
            if (s.charAt(i) == '4') { n4--; }
            if (s.charAt(i) == '7') { n7--; }
        }

        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
