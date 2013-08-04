package topc.easy;

import java.util.*;
import java.io.*;

// SRM 161 Division I Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1802&rd=4610
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm161
public class TennisRallies {
    int[][] F;
    int A;
    int L;

    public int howMany(int numLength, String[] forbidden, int allowed) {
        A = allowed;
        L = numLength;

        //return bruteForce(forbidden);
        return rec(allowed, "", forbidden); // faster
    }

    private int rec(int allowed, String curr, String[] forbidden) {
        if (curr.length() == L) { return 1; }

        int count = 0;
        for (int i = 0; i < 2; i++) {
            int a  = allowed;
            char c = (char)(i + 'c');

            String next = curr + c;
            for (int j = 0; j < forbidden.length; j++) {
                if (next.endsWith(forbidden[j])) {
                    a--;
                }
            }

            if (a <= 0) {
                continue;
            }

            count += rec(a, next, forbidden);
        }

        return count;
    }

    private int bruteForce(String[] forbidden) {
        int k   = 0;
        int max = 1 << L;

        F = new int[forbidden.length][3];
        for (int i = 0; i < forbidden.length; i++) {
            F[i][2] = forbidden[i].length();
            for (int j = 0; j < F[i][2]; j++) {
                int bit = forbidden[i].charAt(j) == 'c' ? 0 : 1;
                F[i][0] |= (bit << j);
                F[i][1] |= (1 << j);
            }
        }

        for (int i = 0; i < max; i++) {
            if (countForbidden(i) < A) {
                k++;
            }
        }

        return k;

    }

    private int countForbidden(int seq) {
        int c = 0;
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < F.length; j++) {
                if (F[j][2] + i > L) {
                    continue;
                }

                if (containsAt(seq, F[j][0], F[j][1], i)) {
                    c++;
                }

                if (c >= A) {
                    return c;
                }
            }
        }
        return c;
    }

    private boolean containsAt(int a, int b, int m, int k) {
        m <<= k;
        m &= a;
        m >>= k;
        return m == b;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
