package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 202 Division II Level Three - 1000
// geometry, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2876&rd=5848
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm202
public class SimplePath {
    public int trouble(String direction, int[] length) {
        int n  = length.length;
        int sx = 0;
        int sy = 0;

        Segment seg[] = new Segment[length.length];
        for (int i = 0; i < n; i++) {
            seg[i] = new Segment(sx, sy, direction.charAt(i), length[i], i);
            sx     = seg[i].ex;
            sy     = seg[i].ey;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (seg[i].intersects(seg[j])) {
                    return i;
                }
            }
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Segment {
        int pos;
        public final int sx;
        public final int sy;
        public final int ex;
        public final int ey;

        public Segment(int sx, int sy, char dir, int len, int pos) {
            this.sx  = sx;
            this.sy  = sy;
            this.pos = pos;

            switch (dir) {
                case 'N': 
                    ex = sx;
                    ey = sy + len;
                    break;
                case 'S':
                    ex = sx;
                    ey = sy - len;
                    break;
                case 'W':
                    ex = sx + len;
                    ey = sy;
                    break;
                case 'E':
                    ex = sx - len;
                    ey = sy;
                    break;
                default:
                    ex = 0;
                    ey = 0;
            }
        }

        private boolean intersects(Segment s) {
            int x1 = Math.min(sx, ex);
            int y1 = Math.min(sy, ey);
            int x2 = Math.max(sx, ex);
            int y2 = Math.max(sy, ey);

            int x3 = Math.min(s.sx, s.ex);
            int y3 = Math.min(s.sy, s.ey);
            int x4 = Math.max(s.sx, s.ex);
            int y4 = Math.max(s.sy, s.ey);

            if (Math.abs(pos - s.pos) == 1) {
                boolean a = x3 < x2 && x1 < x4 && y3 < y2 && y1 < y4;
                boolean b = y1 == y3 && x3 < x2 && x1 < x4;
                boolean c = x1 == x3 && y3 < y2 && y1 < y4;
                return a || b || c;
            } else {
                return x3 <= x2 && x1 <= x4 && y3 <= y2 && y1 <= y4;
            }
        }

        public String toString() {
            return String.format("[%s,%s]-[%s,%s]", sx, sy, ex, ey);
        }
    }
}
