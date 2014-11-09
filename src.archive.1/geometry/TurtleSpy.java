package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 538 Division I Level Two - 450
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11704&rd=14729
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+538
public class TurtleSpy {
    public double maxDistance(String[] commands) {
        int n = commands.length;
        int f = 0;
        int b = 0;
        int a[] = new int[n + 1];

        a[0] = 1;
        for (int i = 0; i < n; i++) {
            String parts[] = commands[i].split("\\s+");
            switch (parts[0].charAt(0)) {
                case 'l': a[a[0]++] = Integer.parseInt(parts[1]); break;
                case 'r': a[a[0]++] = 360 -Integer.parseInt(parts[1]); break;
                case 'f': f += Integer.parseInt(parts[1]); break;
                case 'b': b += Integer.parseInt(parts[1]); break;
            }
        }

        if (b == 0) { return f; }
        if (a[0] == 0) { return Math.abs(f - b); }

        int M[][] = new int[a[0]][360];

        M[0][0] = 1;
        for (int i = 1; i < a[0]; i++) {
            for (int w = 0; w < 360; w++) {
                M[i][w] = M[i - 1][w];
                if (M[i][w] == 0) {
                    M[i][w] = M[i - 1][(360 + w - a[i]) % 360];
                }
            }
        }

        int best = 0;
        for (int i = 0; i < 360; i++) {
            int v = M[a[0] - 1][i];
            if (v == 1 && Math.abs(180 - i) < Math.abs(180 - best)) {
                best = i;
            }
        }

        double w = b * Math.cos(Math.toRadians(best));
        double h = b * Math.sin(Math.toRadians(best));

        return Math.sqrt((f - w) * (f - w) + h * h);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
