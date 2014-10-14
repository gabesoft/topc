package topc.easy;

import java.util.*;
import java.io.*;

// SRM 561 Division I Level One - 250
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12314&rd=15183
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+561
public class ICPCBalloons {
    long INF = 1 << 60;

    public int minRepaintings(int[] balloonCount, String balloonSize, int[] maxAccepted) {
        int cnt = 0;
        int n = maxAccepted.length;

        ArrayList<Integer> L = new ArrayList<Integer>();
        ArrayList<Integer> M = new ArrayList<Integer>();

        for (int i = 0; i < balloonCount.length; i++) {
            if (balloonSize.charAt(i) == 'L') {
                L.add(balloonCount[i]);
            } else {
                M.add(balloonCount[i]);
            }
        }

        Collections.sort(L);
        Collections.sort(M);

        Arrays.sort(maxAccepted);

        long best = INF;

        for (int i = 0; i < (1 << n); i++) {
            int l[] = get(maxAccepted, i, 1);
            int m[] = get(maxAccepted, i, 0);

            long cl = count(l, L);
            long cm = count(m, M);

            best = Math.min(best, cl + cm);
        }

        return best >= INF ? -1 : (int)best;
    }

    private long count(int a[], ArrayList<Integer> b) {
        int ak = a.length - 1;
        int bk = b.size() - 1;
        long need = 0;
        long have = 0;

        while (ak > -1 && bk > -1) {
            int x = b.get(bk--) - a[ak--];
            if (x < 0) {
                need += Math.abs(x);
            } else {
                have += x;
            }
        }

        while (bk > -1) {
            have += b.get(bk--);
        }

        while (ak > -1) {
            need += a[ak--];
        }

        if (need > have) {
            return INF;
        } else {
            return need;
        }
    }

    private int[] get(int a[], int mask, int bit) {
        int n = a.length;
        int m = bit == 1 ? Integer.bitCount(mask) : n - Integer.bitCount(mask);

        int x[] = new int[m];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if (on(mask, i, bit)) {
                x[k++] = a[i];
            }
        }

        return x;
    }

    private boolean on(int mask, int k, int bit) {
        return ((mask >> k) & 1) == bit;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
