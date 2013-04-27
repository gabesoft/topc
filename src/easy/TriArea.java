package topc.easy;

import java.util.*;
import java.io.*;

// SRM 268 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4699&rd=8001
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm268
public class TriArea {
    public double area(int[] xCenter, int[] yCenter, int[] height) {
        Square sq[] = new Square[200901];

        int k = 0;
        for (int x = -200; x < 201; x++) {
            for (int y = -200; y < 301; y++) {
                sq[k++] = new Square(x, y);
            }
        }

        for (int i = 0; i < xCenter.length; i++) {
            for (int j = 0; j < sq.length; j++) {
                sq[j].mark(height[i], xCenter[i], yCenter[i]);
            }
        }

        double c = 0;
        for (int i = 0; i < sq.length; i++) {
            c += sq[i].count();
        }

        return c / 4.0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Square {
        public final int x;
        public final int y;
        int tr;

        public Square(int x, int y) {
            this.x  = x;
            this.y  = y;
            this.tr = 0;
        }

        public int count() { return Integer.bitCount(tr); }

        public void mark(int h, int cx, int cy) {
            if (h + cy <= y) { return; }
            if (cy >= y + 1) { return; }
            if (cx - h >= x + 1) { return; }
            if (cx + h <= x) { return; }

            for (int i = 0; i < h; i++) {
                if (x == cx - h + i) {
                    if (y > cy + i) { return; }
                    if (y == cy + i) {
                        mark(2);
                        mark(3);
                        return;
                    } 
                }
                if (x + 1 == cx + h - i) {
                    if (y > cy + i) { return; }
                    if (y == cy + i) {
                        mark(0);
                        mark(3);
                        return;
                    }
                }
            }

            mark(0);
            mark(1);
            mark(2);
            mark(3);
        }

        private void mark(int k) {
            tr = tr | (1 << k);
        }
    }
}
