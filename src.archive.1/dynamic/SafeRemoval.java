package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 553 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11737&rd=15175
// editorial: http://community.topcoder.com/tco12/happened-in-srm-553/
public class SafeRemoval {
    int n;
    int[] seq;
    HashMap<String, Integer> map;

    public int removeThem(int[] seq, int k) {
        this.n   = seq.length;
        this.seq = seq;
        this.map = new HashMap<String, Integer>();

        Arrays.sort(this.seq);

        return remove(k, new boolean[n]);
    }

    int remove(int k, boolean[] removed) {
        int s = sum(removed);

        if (k == 0) { return s; }

        String key = k + Arrays.toString(removed);
        if (map.containsKey(key)) { return map.get(key); }

        int best      = -1;
        boolean[] mod = new boolean[4];

        for (int i = 0; i < n; i++) {
            if (!removed[i] && (s - seq[i]) % 4 != 0) {
                if (!mod[seq[i] % 4]) {
                    mod[seq[i] % 4] = true;
                    removed[i]      = true;
                    int next        = remove(k - 1, removed);
                    best            = Math.max(best, next);
                    removed[i]      = false;
                }
            }
        }

        map.put(key, best);
        return best;
    }

    int sum(boolean[] removed) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (!removed[i]) {
                s += seq[i];
            }
        }
        return s;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
