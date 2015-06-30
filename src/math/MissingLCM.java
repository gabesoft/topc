package topc.math;

import java.util.*;
import java.io.*;

// SRM 661 Division I Level One - 250
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13766&rd=16464
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+661
public class MissingLCM {
    public int getMin(int N) {
        if (N == 1) { return 2; }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 2; i <= N; i++) {
            addPrimes(i, map);
        }

        int M = 1;
        while (map.size() > 0) {
            removePrimes(N + M++, map);
        }

        return N + M - 1;
    }

    private void removePrimes(int x, HashMap<Integer, Integer> map) {
        for (int p = 2; p <= x / p; p++) {
            if (x % p == 0) {
                int cnt = 0;

                while (x % p == 0) {
                    cnt++;
                    x /= p;
                }

                if (map.containsKey(p) && map.get(p) <= cnt) {
                    map.remove(p);
                }
            }
        }

        if (x > 1) {
            if (map.containsKey(x) && map.get(x) <= 1) {
                map.remove(x);
            }
        }
    }

    private void addPrimes(int x, HashMap<Integer, Integer> map) {
        for (int p = 2; p <= x / p; p++) {
            if (x % p == 0) {
                int cnt = 0;

                while (x % p == 0) {
                    cnt++;
                    x /= p;
                }

                if (!map.containsKey(p)) {
                    map.put(p, 0);
                }

                map.put(p,  Math.max(map.get(p), cnt));
            }
        }

        if (x > 1) {
            if (!map.containsKey(x)) {
                map.put(x, 0);
            }
            map.put(x, Math.max(map.get(x), 1));
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
