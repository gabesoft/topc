package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 191 Division II Level Three - 1000
// geometry, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2329&rd=4775
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm191
public class CuboidJoin {
    int MAX = 5001;

    public long totalVolume(int[] cuboids) {
        int n    = cuboids.length / 6;
        long vol = 0;

        Cube cubes[] = new Cube[n];
        for (int i = 0; i < n; i++) {
            int j = i * 6;
            cubes[i] = new Cube(
                    cuboids[j], cuboids[j + 1], cuboids[j + 2],
                    cuboids[j + 3], cuboids[j + 4], cuboids[j + 5]);
            vol += cubes[i].volume();
        }

        for (int i = 2; i < n + 1; i++) {
            long d = (i % 2 == 0) ? -1 : 1;
            int k  = 1 << n;

            for (int j = 0; j < k; j++) {
                if (Integer.bitCount(j) == i) {
                    vol += d * intersection(cubes, j);
                }
            }
        }

        return vol;
    }

    private long intersection(Cube[] cubes, int mask) {
        Cube c = new Cube(-MAX, -MAX, -MAX, MAX, MAX, MAX);

        for (int i = 0; i < cubes.length; i++) {
            if (((mask >> i) & 1) == 1) {
                c = c.intersect(cubes[i]);
                if (c == null) {
                    break;
                }
            }
        }

        return c == null ? 0 : c.volume();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Cube {
        long x1;
        long y1;
        long z1;
        long x2;
        long y2;
        long z2;

        public Cube(long x1, long y1, long z1, long x2, long y2, long z2) {
            this.x1 = x1;
            this.y1 = y1;
            this.z1 = z1;
            this.x2 = x2;
            this.y2 = y2;
            this.z2 = z2;
        }

        public long volume() {
            long dx = Math.abs(x1 - x2);
            long dy = Math.abs(y1 - y2);
            long dz = Math.abs(z1 - z2);
            return dx * dy * dz;
        }

        public Cube intersect(Cube c) {
            long[] x = intersection(x1, x2, c.x1, c.x2);
            long[] y = intersection(y1, y2, c.y1, c.y2);
            long[] z = intersection(z1, z2, c.z1, c.z2);

            return (x == null || y == null || z == null)
                ? null
                : new Cube(x[0], y[0], z[0], x[1], y[1], z[1]);
        }

        private long[] intersection(long a, long b, long c, long d) {
            if ((a <= c && d <= b) || (a >= c && d >= b)) {
                return new long[] { Math.max(a, c), Math.min(b, d) };
            }
            if (c < a && d < b && d > a) {
                return new long[] { a, d };
            }
            if (c > a && d > b && c < b) {
                return new long[] { c, b };
            }
            return null;
        }

        public String toString() {
            return String.format("(%s,%s,%s):(%s,%s,%s)", x1, y1, z1, x2, y2, z2);
        }
    }
}
