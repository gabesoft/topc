package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 602 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12924&rd=15820
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+602
public class TypoCoderDiv1 {
    int n;
    int D[];
    HashMap<String, Integer> map;

    public int getmax(int[] D, int X) {
        this.n = D.length;
        this.D = D;
        this.map = new HashMap<String, Integer>();
        return maxChanges(0, X);
    }

    private int maxChanges(int k, int score) {
        if (k == n) { return 0; }

        String key = k + ":" + score;

        if (map.containsKey(key)) {
            return map.get(key);
        }

        if (score >= 2200) {
            return 1 + maxChanges(k + 1, Math.max(0, score - D[k]));
        }

        int a = maxChanges(k + 1, Math.max(0, score - D[k]));
        int b = 0;

        if (k == n - 1 || score + D[k] - D[k + 1] < 2200) {
            b = (score + D[k] >= 2200 ? 1 : 0) + maxChanges(k + 1, score + D[k]);
        }

        int r = Math.max(a, b);

        map.put(key, r);
        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
