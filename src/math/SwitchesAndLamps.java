package topc.math;

import java.util.*;
import java.io.*;

// TCO12 Round 2A Division I Level One - 300
// math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11894&rd=15093
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2012+Round+2a
public class SwitchesAndLamps {
    public int theMin(String[] switches, String[] lamps) {
        int n = switches[0].length();
        int m = switches.length;

        char map[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(map[i], '0');
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char sw = switches[i].charAt(j);

                for (int k = 0; k < n; k++) {
                    char lp = lamps[i].charAt(k);

                    if (sw != lp) {
                        map[j][k] = '1';
                    } 
                }
            }
        }

        HashMap<String, Integer> unknown = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String key = new String(map[i]);
            if (!unknown.containsKey(key)) {
                unknown.put(key, 0);
            }
            unknown.put(key, unknown.get(key) + 1);
        }

        int max = 0;
        for (String key: unknown.keySet()) {
            int value = unknown.get(key);
            int zeros = zeros(key);

            max = Math.max(max, value);

            if (zeros != value || zeros == 0) { return -1; }
        }

        int min = 0;
        while (max > 1) {
            min++;
            max = (max + 1) / 2;
        }

        return min;
    }

    private int zeros(String s) {
        int z = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                z++;
            }
        }
        return z;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
