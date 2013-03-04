package topc.math;

import java.util.*;
import java.io.*;

// SRM 336 Division II Level Three - 900
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7350&rd=10660
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm336
public class MostLikely {
    public int likelyRank(int[] sc, int low, int high) {
        int best = 0;
        int r    = -1;
        int n    = sc.length + 1;

        int scores[] = new int[n + 1];

        scores[0] = -1;
        scores[n] = high + 1;

        for (int i = 1; i < n; i++) {
            scores[i] = sc[i - 1];
        }

        Arrays.sort(scores);
        reverse(scores);

        for (int i = 0; i < n; i++) {
            int lo = Math.max(scores[i + 1], low);
            int hi = Math.min(scores[i] - 1, high);

            if (lo > hi) { continue; }

            int t = hi - lo + 1;

            if (t > best) {
                r    = i + 1;
                best = t;
            } else if (t == best) {
                r = -1;
            }
        }

        return r;
    }

    void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public int likelyRank2(int[] sc, int low, int high) {
        int n        = sc.length;
        int counts[] = new int[n];

        int score[] = new int[n];
        int above[] = new int[n];

        Arrays.sort(sc);

        HashSet<Integer> seen = new HashSet<Integer>();
        int v                 = 0;

        for (int i = 0; i < sc.length; i++) {
            if (!seen.contains(sc[i])) {
                seen.add(sc[i]);
                score[v++] = sc[i];
            }
            for (int j = 0; j < v - 1; j++) {
                above[j]++;
            }
        }

        for (int i = 0; i < v - 1; i++) {
            int hi    = Math.min(high + 1, score[i + 1]);
            int lo    = Math.max(low, score[i]);
            counts[i] = Math.max(0, hi - lo);
        }

        counts[v - 1] = high >= score[v - 1] ? (high - score[v - 1] + 1) : 0;

        int best = 0;
        for (int i = 1; i < v; i++) {
            if (counts[best] < counts[i]) {
                best = i;
            }
        }

        int c = 0;
        for (int i = 0; i < v; i++) {
            if (counts[i] == counts[best]) {
                c++;
            }
        }

        int below = score[0] - low;

        if (below == counts[best]) {
            return -1;
        } else if (below > counts[best]) { 
            return 1 + n;
        } else {
            return c > 1 ? -1 : 1 + above[best];
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
