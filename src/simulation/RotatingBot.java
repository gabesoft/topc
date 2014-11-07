package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 550 Division I Level One - 300
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12033&rd=15172
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+550
public class RotatingBot {
    public int minArea(int[] moves) {
        boolean used[][] = new boolean[200][200];
        int x = 100;
        int y = 100;

        used[x][y] = true;

        int minx = x;
        int maxx = x;
        int miny = y;
        int maxy = y;

        int d = 0;
        int dx[] = new int[] { 1, 0, -1, 0 };
        int dy[] = new int[] { 0, -1, 0, 1 };

        int totalSteps = 0;

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < moves[i]; j++) {
                totalSteps++;
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (used[nx][ny]) { return -1; }

                x = nx;
                y = ny;

                minx = Math.min(minx, x);
                maxx = Math.max(maxx, x);
                miny = Math.min(miny, y);
                maxy = Math.max(maxy, y);

                used[x][y] = true;
            }

            d += 1;
            d %= 4;
        }

        d = 0;
        x = 100;
        y = 100;
        used = new boolean[200][200];
        used[x][y] = true;
        int[] moves2 = new int[moves.length];

        int k = 0;
        int m = 0;
        int i = 0;
        while (i < totalSteps) {
           int nx = x + dx[d];
           int ny = y + dy[d];

           if (used[nx][ny] || nx < minx || nx > maxx || ny < miny || ny > maxy) {
               moves2[k++] = m;
               m = 0;
               d += 1;
               d %= 4;
               nx = x + dx[d];
               ny = y + dy[d];
               if (used[nx][ny] || nx < minx || nx > maxx || ny < miny || ny > maxy) {
                   break;
               }
           } else {
               x = nx;
               y = ny;
               used[nx][ny] = true;
               m++;
               i++;
           }
        }

        if (m != 0 && k < moves2.length) {
            moves2[k++] = m;
        }
        if (!equal(moves, moves2)) {
            return -1;
        }

        return (maxx - minx + 1) * (maxy - miny + 1);
    }

    private boolean equal(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
