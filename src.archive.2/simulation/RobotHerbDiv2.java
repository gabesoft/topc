package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 570 Division II Level Two - 500
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12425&rd=15490
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+570
public class RobotHerbDiv2 {
    int id[][] = new int[][] { new int[] { 1, 0 }, new int[] { 0, -1 }, new int[] { -1, 0 }, new int[] { 0, 1 } };

    public int getdist(int T, int[] a) {
        int x   = 0;
        int y   = 0;
        int d[] = id[0];

        for (int i = 0; i < T; i++) {
            for (int k : a) {
                x += k * d[0];
                y += k * d[1];
                d = dir(d, k % 4);
            }
        }

        return Math.abs(x) + Math.abs(y);
    }

    private int[] dir(int[] d, int t) {
        int dir = 0;
        for (int i = 0; i < id.length; i++) {
            if (id[i][0] == d[0] && id[i][1] == d[1]) {
                dir = i;
                break;
            }
        }

        dir += t;
        dir %= 4;

        return id[dir];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
