package topc.search;

import java.util.*;
import java.io.*;

// SRM 620 Division I Level One - 250
// search, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13142&rd=15853
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+620
public class PairGame {
    public int maxSum(int a, int b, int c, int d) {
        HashSet<AbstractMap.SimpleEntry<Integer, Integer>> set = new HashSet<AbstractMap.SimpleEntry<Integer, Integer>>();

        find(set, a, b);

        int res = -1;

        for (AbstractMap.SimpleEntry<Integer, Integer> e : set) {
            while (c > 0 && d > 0) {
                AbstractMap.SimpleEntry<Integer, Integer> pair = new AbstractMap.SimpleEntry<Integer, Integer>(c, d);
                if (set.contains(pair)) {
                    res = Math.max(res, c + d);
                }

                if (c > d) {
                    c -= d;
                } else {
                    d -= c;
                }
            }
        }

        return res;
    }

    private void find(HashSet<AbstractMap.SimpleEntry<Integer, Integer>> set, int a, int b) {
        while (a > 0 && b > 0) {
            set.add(new AbstractMap.SimpleEntry<Integer, Integer>(a, b));

            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
