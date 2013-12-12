package topc.easy;

import java.util.*;
import java.io.*;

// SRM 561 Division I Level One - 250
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12314&rd=15183
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+561
public class ICPCBalloons {
    public int minRepaintings(int[] balloonCount, String balloonSize, int[] maxAccepted) {
        int m = 0;
        int l = 0;

        for (int i = 0; i < balloonCount.length; i++) {
            char c = balloonSize.charAt(i);
            l += (c == 'L') ? 1 : 0;
            m += (c == 'M') ? 1 : 0;
        }

        int M[] = new int[m];
        int L[] = new int[l];

        int im = 0;
        int il = 0;
        int sm = 0;
        int sl = 0;

        for (int i = 0; i < balloonCount.length; i++) {
            char c = balloonSize.charAt(i);
            if (c == 'L') {
                L[il++]  = balloonCount[i];
                sl      += balloonCount[i];
            } else {
                M[im++]  = balloonCount[i];
                sm      += balloonCount[i];
            }
        }

        Arrays.sort(M);
        Arrays.sort(L);
        Arrays.sort(maxAccepted);

        int len  = 1 << maxAccepted.length;
        int best = -1;

        for (int mask = 0; mask < len; mask++) {
            int count = calc(maxAccepted, M, L, mask, sm, sl);
            if (count > -1) {
                if (best == -1 || best > count) {
                    best = count;
                }
            }
        }

        return best;
    }

    private int calc(int[] need, int[] M, int[] L, int mask, int sm, int sl) {
        int[] got = new int[need.length];

        for (int i = M.length - 1; i > -1; i--) {
            for (int j = need.length - 1; j > -1; j--) {
                if (on(mask, j) && got[j] == 0) {
                    got[j] = Math.min(need[j], M[i]);
                    sm -= got[j];
                    break;
                }
            }
        }

        for (int i = L.length - 1; i > -1; i--) {
            for (int j = need.length - 1; j > -1; j--) {
                if (!on(mask, j) && got[j] == 0) {
                    got[j] = Math.min(need[j], L[i]);
                    sl -= got[j];
                    break;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < need.length; i++) {
            int delta = need[i] - got[i];

            count += delta;

            if (on(mask, i)) {
                sm -= delta;
            } else {
                sl -= delta;
            }
            if (sm < 0 || sl < 0) {
                return -1;
            }
        }

        return count;
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
