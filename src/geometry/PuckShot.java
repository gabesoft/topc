package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 186 Division I Level Three - 1000
// geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2411&rd=4750
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm186
public class PuckShot {
    public double caromAngle(int puckCoord, int[] xCoords, int[] yCoords) {
        double iceWidth    = 3000;
        double iceHeight   = 1733;
        double goalWidth   = 183;
        double playerWidth = 50;

        double sl[]  = new double[50];
        double sr[]  = new double[50];
        double nsl[] = new double[50];
        double nsr[] = new double[50];

        int px   = puckCoord;
        int snum = 1;
        int pnum = 2 * xCoords.length;

        sl[0] = iceWidth + (iceWidth - goalWidth) / 2.0;
        sr[0] = sl[0] + goalWidth;

        for (int i = 0; i < pnum; i++) {
            double x = xCoords[(i < pnum / 2) ? i : i - pnum / 2];
            double y = yCoords[(i < pnum / 2) ? i : i - pnum / 2];

            if (i >= pnum / 2) {
                x += 2 * (iceWidth - x);
            }

            double l = px + iceHeight / y * (x - playerWidth / 2.0 - px);
            double r = px + iceHeight / y * (x + playerWidth / 2.0 - px);

            int nsnum = 0;

            for (int j = 0; j < snum; j++) {
                if (l <= sl[j] && sr[j] <= r) { continue; }

                if (r < sl[j] || sr[j] < l) {
                    nsl[nsnum]   = sl[j];
                    nsr[nsnum++] = sr[j];
                    continue;
                }

                if (sl[j] < l) {
                    nsl[nsnum]   = sl[j];
                    nsr[nsnum++] = l;
                }

                if (r < sr[j]) {
                    nsl[nsnum]   = r;
                    nsr[nsnum++] = sr[j];
                }
            }

            for (int j = 0; j < nsnum; j++) {
                sl[j] = nsl[j];
                sr[j] = nsr[j];
            }

            snum = nsnum;
        }

        if (snum == 0) { return -1; }

        double x = sl[0];

        return Math.atan(iceHeight / (x - px)) * 180.0 / Math.PI;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
