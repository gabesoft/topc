package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 570 Division I Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12427&rd=15490
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+570
public class RobotHerb {
    public long getdist(int T, int[] a) {
        long x  = 0;
        long y  = 0;
        int dir = 0;

        for (int i = 0; i < a.length; i++) {
            long[] d = getDir(dir);

            x += d[0] * a[i];
            y += d[1] * a[i];

            dir += (a[i] % 4);
            dir %= 4;
        }

        if (dir == 0) {
            return dist(T * x, T * y);
        }
        if (dir == 2) {
            return T % 2 == 0 ? 0 : dist(x, y);
        } 
        if (dir == 1) {
            switch (T % 4) {
                case 1: return dist(x, y);
                case 2: return dist(x + y, y - x);
                case 3: return dist(y, x);
                case 0: return 0;
            }
        } else {
            switch (T % 4) {
                case 1: return dist(x, y);
                case 2: return dist(x - y, y + x);
                case 3: return dist(y, x);
                case 0: return 0;
            }
        }

        return -1;
    }

    private long dist(long x, long y) {
        return Math.abs(x) + Math.abs(y);
    }

    private long[] getDir(int dir) {
        switch (dir) {
            case 1:
                return new long[] { +1, +0 };
            case 2:
                return new long[] { +0, -1 };
            case 3:
                return new long[] { -1, +0 };
            case 0:
                return new long[] { +0, +1 };
        }
        return null;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
