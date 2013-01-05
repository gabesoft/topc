package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 394 Division I Level Two - 600
// geometry, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8546&rd=11128
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm394
public class CentersOfSymmetry {
    public int lineConfigurations(int[] x1, int[] y1, int[] x2, int[] y2) {
        int n    = x1.length;
        Line lines[] = new Line[n];

        for (int i = 0; i < n; i++) {
            lines[i] = new Line(x1[i], y1[i], x2[i], y2[i]);
        }

        Arrays.sort(lines);

        int s   = 0;
        int nax = 0;

        ArrayList<Line> ax = new ArrayList<Line>();
        while (s < n) {
            int t    = s;
            int sumc = 0;

            while (t < n && lines[t].a == lines[s].a && lines[t].b == lines[s].b) {
                sumc += lines[t].c;
                t++;
            }

            nax++;

            for (int i = s; i < t; i++) {
                int j = t - (i - s) - 1;
                if ((lines[i].c + lines[j].c) * (t - s) != sumc * 2) {
                    return 0;
                }
            }

            Line line = new Line((t - s) * lines[s].a, (t - s) * lines[s].b, sumc);

            ax.add(line);

            s = t;
        }

        if (nax == 1) {
            return -1;
        } else {
            int ip[] = null;

            for (int i = 0; i < ax.size(); i++) {
                for (int j = i + 1; j < ax.size(); j++) {
                    Line l1  = ax.get(i);
                    Line l2  = ax.get(j);
                    int is[] = l1.intersect(l2);

                    if (ip == null) {
                        ip = is;
                    } else {
                        if (!Arrays.equals(ip, is)) {
                            return 0;
                        }
                    }
                }
            }

            return 1;
        }
    }

    int gcd(int x, int y) {
        while (y != 0) {
            int t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Line implements Comparable<Line> {
        public final int a;
        public final int b;
        public final int c;

        Line(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        Line(int x1, int y1, int x2, int y2) {
            int ta = y1 - y2;
            int tb = x2 - x1;
            int tc = ta * x1 + tb * y1;

            int d = gcd(Math.abs(ta), Math.abs(tb));
            
            ta /= d;
            tb /= d;
            tc /= d;

            if (ta < 0 || (ta == 0 && tb < 0)) {
                a = -ta;
                b = -tb;
                c = -tc;
            } else {
                a = ta;
                b = tb;
                c = tc;
            }
        }

        public int compareTo(Line o) {
            if (a != o.a) {
                return a - o.a;
            }
            if (b != o.b) {
                return b - o.b;
            }
            return c - o.c;
        }

        public int[] intersect(Line l) {
            int r[] = new int[4];

            r[0] = c * l.b - b * l.c;
            r[1] = a * l.b - b * l.a;
            r[2] = a * l.c - c * l.a;
            r[3] = a * l.b - b * l.a;

            int d1 = gcd(r[0], r[1]);
            int d2 = gcd(r[2], r[3]);

            r[0] /= d1;
            r[1] /= d1;
            r[2] /= d2;
            r[3] /= d2;

            return r;
        }
    }
}
