package topc.geometry;

import java.util.*;
import java.io.*;

// TCI '02 Round 4 Division I Level Three - 1000
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=924&rd=4355
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=invit02_r4
public class Symmetry {
    double EPS = 1e-6;

    int count = 0;
    int n     = 0;
    int px[];
    int py[];

    long lx[];
    long ly[];
    long ldx[];
    long ldy[];

    public int countLines(String[] points) {
        String s = join(points);
        String parts[] = s.split("\\s+");

        int k = 0;

        n = parts.length / 2;
        px = new int[n];
        py = new int[n];

        for (int i = 0; i < parts.length - 1; i += 2) {
            px[k] = Integer.parseInt(parts[i]) * 2;
            py[k] = Integer.parseInt(parts[i + 1]) * 2;
            k++;
        }

        lx  = new long[100000];
        ly  = new long[100000];
        ldx = new long[100000];
        ldy = new long[100000];

        count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int mx = (px[i] + px[j]) / 2;
                int my = (py[i] + py[j]) / 2;

                tryLine(mx, my, py[j] - py[i], px[j] - px[i]);
                tryLine(mx, my, px[j] - px[i], py[i] - py[j]);
            }
        }

        return count;
    }

    void tryLine(long bx, long by, long dy, long dx) {
        for (int i = 0; i < n; i++) {
            double b = ((double) (dy * (px[i] - bx) - dx * (py[i] - by))) / (double) (dx * dx + dy * dy);

            double nx = px[i] - 2 * b * dy;
            double ny = py[i] + 2 * b * dx;

            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (Math.abs(nx - px[j]) < EPS && Math.abs(ny - py[j]) < EPS) {
                    found = true;
                    break;
                }
            }

            if (!found) { return; }
        }

        for (int i = 0; i < count; i++) {
            if (dx == 0) {
                if (ldx[i] != 0) { continue; }
                if (lx[i] == bx) { return; }
                continue;
            }

            if (dy == 0) {
                if (ldy[i] != 0) { continue; }
                if (ly[i] == by) { return; }
                continue;
            }

            if (ldx[i] == 0 || ldy[i] == 0) { continue; }
            if (ldy[i] * dx != ldx[i] * dy) { continue; }
            if (dx * (ly[i] - by) != dy * (lx[i] - bx)) { continue; }

            return;
        }

        lx[count]  = bx;
        ly[count]  = by;
        ldx[count] = dx;
        ldy[count] = dy;
        count++;
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
            builder.append(" ");
        }
        return builder.toString().substring(0, builder.length() - 1);
    }


    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
