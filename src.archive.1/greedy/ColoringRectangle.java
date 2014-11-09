package topc.greedy;

import java.util.*;
import java.io.*;

// Member SRM 461 Division I Level One - 300
// greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10731&rd=14181
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class ColoringRectangle {
    final int INF = 1000;

    public int chooseDisks(int width, int height, int[] red, int[] blue) {
        Arrays.sort(red);
        Arrays.sort(blue);

        int a = cover(width, height, red, blue);
        int b = cover(width, height, blue, red);
        int r = Math.min(a, b);

        return r == INF ? -1 : r;
    }

    private int cover(int w, int h, int[] fst, int[] snd) {
        double x  = 0;
        int c     = 0;
        int i[]   = new int[] { fst.length - 1, snd.length - 1 };
        int d[][] = new int[][] { fst, snd };
        int t     = 0;

        while (x < w && (i[t % 2] >= 0)) {
            int index  = i[t % 2];
            int data[] = d[t % 2];
            int next   = data[index];

            i[t % 2]--;
            t++;

            x = disc(w, h, x, next / 2.0);
            c++;

            if (x < 0) { return INF; }
        }

        return x < w ? INF : c;
    }

    private double disc(int w, int h, double s, double r) {
        double y = h / 2.0;
        return y > r ? -1 : s + 2 * Math.sqrt(r * r - y * y);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
