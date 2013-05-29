package topc.easy;

import java.util.*;
import java.io.*;

// SRM 574 Division II Level Three - 1000
// brute force, geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12478&rd=15494
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+574
public class PolygonTraversal2 {
    int N;
    public int count(int N, int[] points) {
        if (points.length == 2) { return 0; }

        this.N = N;

        int pts[] = new int[N];
        for (int i = 0; i < points.length; i++) {
            pts[i] = points[i] - 1;
        }

        return count(pts, points.length);
    }

    private int count(int[] pts, int index) {
        if (index == N) { return canAdd(pts, index, pts[0]) ? 1 : 0; }

        int last = pts[index - 1];
        int sum  = 0;

        for (int i = 0; i < N; i++) {
            if (canAdd(pts, index, i)) {
                pts[index] = i;
                sum += count(pts, index + 1);
            }
        }

        return sum;
    }

    private boolean canAdd(int[] pts, int l, int v) {
        int last = pts[l - 1];

        if (Math.abs(last - v) < 2) { return false; }

        int u1 = Math.min(last, v);
        int u2 = Math.max(last, v);

        boolean edge = false;
        boolean out  = true;

        for (int i = 0; i < l - 2; i++) {
            int a = pts[i];
            int b = pts[i + 1];

            if (a == v || b == v) {
                out = false;
            }

            boolean ain = u1 <= a && a < u2;
            boolean bin = u1 <= b && b < u2;

            if (ain != bin) {
                edge = true;
            }
        }

        return ((l == N && v == pts[0]) || out) && edge;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
