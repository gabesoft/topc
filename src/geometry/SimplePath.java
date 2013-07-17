package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 202 Division II Level Three - 1000
// geometry, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2876&rd=5848
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm202
public class SimplePath {
    public int trouble(String direction, int[] length) {
        int n = length.length;

        Segment seg[] = new Segment[length.length];
        int sx = 0;
        int sy = 0;

        for (int i = 0; i < n; i++) {
            char d  = direction.charAt(i);
            int len = length[i];
            seg[i]  = new Segment(sx, sy, d, len, i);
            sx      = seg[i].ex;
            sy      = seg[i].ey;
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
        boolean vert;
        int pos;

        public final int sx;
        public final int sy;
        public final int ex;
        public final int ey;

        public Segment(int sx, int sy, char dir, int len, int pos) {
            this.sx   = sx;
            this.sy   = sy;
            this.vert = (dir == 'N' || dir == 'S');
            this.pos  = pos;

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
            Segment s1 = s.pos > pos ? this : s;
            Segment s2 = s.pos > pos ? s : this;

            if (s1.ex == s2.ex && s1.ey == s2.ey) {
                return true;
            }
            if (s1.vert && s2.vert) {
                return s1.sx == s2.sx && intersects(s1.sy, s1.ey, s2.sy, s2.ey);
            }
            if (!s1.vert && !s2.vert) {
                return s1.sy == s2.sy && intersects(s1.sx, s1.ex, s2.sx, s2.ex);
            }

            int x  = s1.vert ? s1.sx : s2.sx;
            int y  = s1.vert ? s2.sy : s1.sy;
            int x1 = s1.vert ? s2.sx : s1.sx;
            int x2 = s1.vert ? s2.ex : s1.ex;
            int y1 = s1.vert ? s1.sy : s2.sy;
            int y2 = s1.vert ? s1.ey : s2.ey;

            if (intersects(x1, x2, x) && intersects(y1, y2, y)) {
                return s1.pos + 1 < s2.pos;
            } else {
                return false;
            }
        }

        private boolean intersects(int s1, int s2, int s) {
            int a = Math.min(s1, s2);
            int b = Math.max(s1, s2);
            return a <= s && s <= b;
        }

        private boolean intersects(int s1, int s2, int s3, int s4) {
            int a = Math.min(s1, s2);
            int b = Math.max(s1, s2);
            int x = Math.min(s3, s4);
            int y = Math.max(s3, s4);
            return x < b && a < y;
        }

        public String toString() {
            return String.format("[%s,%s]-[%s,%s]", sx, sy, ex, ey);
        }
    }
}
