package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 180 Division II Level Three - 1000
// geometry, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2301&rd=4720
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm180
public class PulseRadar {
    int n;
    int x1[];
    int y1[];
    int x2[];
    int y2[];
    int x3[];
    int y3[];

    public int[] deduceSpeeds(int[] x1, int[] y1, int[] x2, int[] y2, int[] x3, int[] y3) {
        this.n  = x1.length;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        int m1[] = new int[n];
        int m2[] = new int[n];

        Arrays.fill(m1, -1);
        Arrays.fill(m2, -1);

        boolean ok1 = findMatch(m1, m2, 0, 0);
        boolean ok2 = findMatch(m2, m1, 0, 0);

        if (!ok1 || ok1 == ok2) { return new int[0]; } 

        int speed[] = new int[n];
        for (int i = 0; i < n; i++) {
            speed[i] = calcSpeed(i, m1[i]);
        }

        return speed;
    }

    private int calcSpeed(int p1, int p3) {
        double x1  = this.x1[p1];
        double y1  = this.y1[p1];
        double x3  = this.x3[p3];
        double y3  = this.y3[p3];
        double len = Math.sqrt(sq(x1 - x3) + sq(y1 - y3));

        return (int)Math.round(len / 2);
    }

    private double sq(double n) {
        return n * n;
    }

    private boolean findMatch(int[] match, int[] skip, int p2, int p3) {
        if (Integer.bitCount(p3) == n) { return true; }

        for (int i = 0; i < n; i++) {
            if (match[i] > -1) { continue; }
            for (int j = 0; j < n; j++) {
                if (on(p2, j)) { continue; }
                for (int k = 0; k < n; k++) {
                    if (on(p3, k)) { continue; }
                    if (skip[i] != k && canMatch(i, j, k)) {
                        match[i] = k;
                        if (findMatch(match, skip, set(p2, j), set(p3, k))) {
                            return true;
                        }
                        match[i] = -1;
                    }
                }
            }
        }

        return false;
    }

    private int set(int mask, int k) {
        return mask | (1 << k);
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private boolean canMatch(int p1, int p2, int p3) {
        int x1 = this.x1[p1];
        int y1 = this.y1[p1];
        int x2 = this.x2[p2];
        int y2 = this.y2[p2];
        int x3 = this.x3[p3];
        int y3 = this.y3[p3];
        return (x1 + x3) == 2 * x2 && (y1 + y3) == 2 * y2;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
