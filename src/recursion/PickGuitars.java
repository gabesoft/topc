package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 366 Division II Level Three - 1000
// recursion, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8177&rd=10781
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm366
public class PickGuitars {
    int[] data;
    int n;
    int[][][] memo;

    public int maxValue(int[] guitarValues) {
        n    = guitarValues.length;
        data = guitarValues;
        memo = new int[n][n][];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = new int[] { -1, -1 };
            }
        }

        return find(-1, -1, true);
    }

    int find(int st, int en, boolean me) {
        int best = 0;

        if (st == -1) {
            for (int i = 0; i < n; i++) {
                best = Math.max(best, data[i] + find(start(i + 1), end(i - 1), !me));
            }

            return best;
        }

        if (st == en) { return me ? data[st] : 0; }
        if (memo[st][en][me ? 1 : 0] > -1) { return memo[st][en][me ? 1 : 0]; }

        if (me) {
            best = data[st] + find(start(st + 1), en, !me);
            best = Math.max(best, data[en] + find(st, end(en - 1), !me));
        } else {
            best = find(start(st + 1), en, !me);
            best = Math.min(best, find(st, end(en - 1), !me));
        }

        if (st < en) {
            for (int i = st + 1; i < en; i++) {
                best = next(best, st, en, i, me);
            }
        } else {
            for (int i = st + 1; i < n; i++) {
                best = next(best, st, en, i, me);
            }
            for (int i = 0; i < en; i++) {
                best = next(best, st, en, i, me);
            }
        }

        memo[st][en][me ? 1 : 0] = best;
        return best;
    }

    int next(int best, int st, int en, int i, boolean me) {
        int rest = find(st, end(i - 1), !me) + find(start(i + 1), en, !me);
        return me 
            ? Math.max(best, data[i] + rest)
            : Math.min(best, rest);
    }

    int start(int v) {
        return v % n;
    }

    int end(int v) {
        return v < 0 ? n - 1 : v;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
