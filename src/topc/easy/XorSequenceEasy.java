package topc.easy;

import java.util.*;

// SRM 649 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13657&rd=16313
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+649
public class XorSequenceEasy {
    public int getmax(int[] A, int N) {
        int n = Integer.bitCount(N - 1);
        int x = 0;

        for (int i = n; i > -1; i--) {
           int xa = x | (1 << i);
           int xb = x;

           int ca = count(A, xa);
           int cb = count(A, xb);

           x = (ca > cb) ? xa : xb;
        }

        return count(A, x);
    }

    private int count(int[] a, int x) {
        int n = a.length;
        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               if ((a[i] ^ x) < (a[j] ^ x)) {
                   c++;
               }
            }
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
