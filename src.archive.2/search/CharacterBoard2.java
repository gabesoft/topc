package topc.search;

import java.util.*;
import java.io.*;

// SRM 576 Division II Level Three - 1024
// brute force, simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12506&rd=15496
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+576
public class CharacterBoard2 {
    public static final int MOD = 1000000009;
    public int countGenerators(String[] fragment, int W, int i0, int j0) {
        int r = fragment.length;
        int c = fragment[0].length();
        int res = 0;

        for (int w = 1; w <= W; w++) {
            HashMap<Integer, Character> map = new HashMap<Integer, Character>();
            boolean good = true;

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    int p = ((i0 + i) * W + (j0 + j)) % w;
                    if (map.containsKey(p)) {
                        good &= (map.get(p) == fragment[i].charAt(j));
                    } else {
                        map.put(p, fragment[i].charAt(j));
                    }
                }
            }
            if (good) {
                int x = w - map.size();
                res = (res + pow(26, x)) % MOD;
            }
        }

        return res;
    }

    private int pow(int x, int y) {
        long res = 1;
        long a = x;

        while (y > 0) {
            if ((y & 1) != 0) {
                res = (res * a) % MOD;
            }
            a = (a * a) % MOD;
            y >>= 1;
        }

        return (int)res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
