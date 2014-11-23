package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 541 Division I Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11887&rd=14733
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+541
public class AntsMeet {
    public int countAnts(int[] x, int[] y, String direction) {
        int n     = x.length;
        int dir[] = new int[n];

        for (int i = 0; i < n; i++) {
            switch (direction.charAt(i)) {
                case 'N': dir[i] = 0; break;
                case 'E': dir[i] = 1; break;
                case 'S': dir[i] = 2; break;
                case 'W': dir[i] = 3; break;
            }
        }

        for (int i = 0; i < n; i++) {
            x[i] *= 2;
            y[i] *= 2;
        }

        boolean[] gone = new boolean[n];
        int[][] delta  = new int[][] { new int[] { 0, 1 }, new int[] { 1, 0 }, new int[] { 0, -1 }, new int[] { -1, 0 } };

        for (int t = 0; t < 10000; t++) {
            HashMap<String, Integer> map = new HashMap<String, Integer>(n);

            for (int i = 0; i < n; i++) {
                if (gone[i]) { continue; }

                int[] d = delta[dir[i]];
                x[i] += d[0];
                y[i] += d[1];

                String pos = x[i] + ":" + y[i];

                if (map.containsKey(pos)) {
                    gone[map.get(pos)] = true;
                    gone[i] = true;
                } else {
                    map.put(pos, i);
                }
            }
        }

        int cnt = 0;
        for (boolean g : gone) {
            cnt += (g ? 1 : 0);
        }

        return n - cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
