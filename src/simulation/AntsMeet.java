package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 541 Division I Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11887&rd=14733
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+541
public class AntsMeet {
    final int INF = 1 << 30;
    public int countAnts(int[] x, int[] y, String direction) {
        int n = x.length;

        boolean[] on = new boolean[n];

        Arrays.fill(on, true);

        boolean change = true;
        while (change) {
            change = false;

            HashSet<Integer> ants = new HashSet<Integer>();

            int meet = INF;

            for (int i = 0; i < n; i++) {
                if (!on[i]) { continue; }

                for (int j = 0; j < n; j++) {
                    if(!on[j] || i == j) { continue; }
                    char dir1 = direction.charAt(i);
                    char dir2 = direction.charAt(j);
                    int time  = meetTime(x[i], y[i], x[j], y[j], dir1, dir2);

                    if (time < meet) {
                        meet = time;
                        ants = new HashSet<Integer>();
                        ants.add(i);
                        ants.add(j);
                    } else if (time < INF && time == meet) {
                        ants.add(i);
                        ants.add(j);
                    }
                }

            }

            for (int a : ants) {
                on[a] = false;
            }
            change = ants.size() > 0;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (on[i]) {
                count++;
            }
        }

        return count;
    }

    private int meetTime(int x1, int y1, int x2, int y2, char dir1, char dir2) {
        if (dir1 == 'N' && dir2 == 'S' && x1 == x2 && y1 < y2) {
            return (y2 - y1);
        }
        if (dir1 == 'S' && dir2 == 'N' && x1 == x2 && y2 < y1) {
            return (y1 - y2);
        }
        if (dir1 == 'E' && dir2 == 'W' && y1 == y2 && x1 < x2) {
            return (x2 - x1);
        }
        if (dir1 == 'W' && dir2 == 'E' && y1 == y2 && x2 < x1) {
            return (x1 - x2);
        }

        if (dir1 == 'N' && dir2 == 'W' && y2 > y1 && x2 > x1) {
            return (y2 - y1 == x2 - x1) ? 2 * (y2 - y1) : INF;
        }
        if (dir1 == 'W' && dir2 == 'N' && y1 > y2 && x1 > x2) {
            return (y1 - y2 == x1 - x2) ? 2 * (y1 - y2) : INF;
        }
        if (dir1 == 'N' && dir2 == 'E' && y2 > y1 && x1 > x2) {
            return (y2 - y1 == x1 - x2) ? 2 * (y2 - y1) : INF;
        }
        if (dir1 == 'E' && dir2 == 'N' && y1 > y2 && x2 > x1) {
            return (y1 - y2 == x2 - x1) ? 2 * (y1 - y2) : INF;
        }

        if (dir1 == 'E' && dir2 == 'S' && y2 > y1 && x2 > x1) {
            return (y2 - y1 == x2 - x1) ? 2 * (y2 - y1) : INF;
        }
        if (dir1 == 'S' && dir2 == 'E' && y1 > y2 && x1 > x2) {
            return (y1 - y2 == x1 - x2) ? 2 * (y1 - y2) : INF;
        }
        if (dir1 == 'W' && dir2 == 'S' && y2 > y1 && x1 > x2) {
            return (y2 - y1 == x1 - x2) ? 2 * (y2 - y1) : INF;
        }
        if (dir1 == 'S' && dir2 == 'W' && y1 > y2 && x2 > x1) {
            return (y1 - y2 == x2 - x1) ? 2 * (y1 - y2) : INF;
        }

        return INF;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
