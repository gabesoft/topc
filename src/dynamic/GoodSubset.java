package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 632 - TCO14 Wildcard Sweep Division II Level Three - 1000
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13396&rd=16075
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+632
public class GoodSubset {
    public static final int MOD = 1000000007;
    HashMap<String, Integer> map;
    int d[];

    public int numberOfSubsets(int goodValue, int[] d) {
        this.map = new HashMap<String, Integer>();
        this.d = d;
        return f(goodValue, d.length) - (goodValue == 1 ? 1 : 0);
    }

    private int f(int x, int t) {
        String key = x + ":" + t;

        if (map.containsKey(key)) { return map.get(key); }

        int res = 0;
        if (t == 0) {
            res = (x == 1) ? 1 : 0;
        } else {
            if (x % d[t - 1] == 0) {
                res += f(x / d[t - 1], t - 1);
            }
            res += f(x, t - 1);
        }

        res %= MOD;
        map.put(key, res);
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
