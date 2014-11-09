package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 566 Division II Level Three - 1000
// dynamic programming, geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12341&rd=15486
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+566
public class FencingPenguinsEasy {
    public double calculateMinArea(int numPosts, int radius, int[] x, int[] y) {
        double px[] = new double[numPosts];
        double py[] = new double[numPosts];
        
        for (int i = 0; i < numPosts; i++) {
            double a = i * 2 * Math.PI / numPosts;
            px[i] = radius * Math.cos(a);
            py[i] = radius * Math.sin(a);
        }

        boolean valid[][] = new boolean[numPosts][numPosts];
        for (int i = 0; i < numPosts; i++) {
            for (int j = 0; j < numPosts; j++) {
                valid[i][j] = true;
                for (int k = 0; k < x.length; k++) {
                    if (ccw(px[i], py[i], px[j], py[j], x[k], y[k]) != 1) {
                        valid[i][j] = false;
                    }
                }
            }
            valid[i][i] = false;
        }

        double INF = 1e50;
        double dp[][] = new double[numPosts][numPosts];

        for (int dif = 1; dif < numPosts; dif++) {
            for (int l = 0; l + dif < numPosts; l++) {
                int r = l + dif;
                dp[l][r] = INF;

                for (int nl = l + 1; nl <= r; nl++) {
                    if (valid[l][nl]) {
                        double area = triangleArea(px[l], py[l], px[nl], py[nl], px[r], py[r]);
                        dp[l][r] = Math.min(dp[l][r], area + dp[nl][r]);
                    }
                }
            }
        }

        double res = INF;
        for (int l = 0; l < numPosts; l++) {
            for (int r = l + 2; r < numPosts; r++) {
                if (valid[r][l]) {
                    res = Math.min(res, dp[l][r]);
                }
            }
        }

        return res < INF ? res : -1;
    }

    private double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        x1 -= x3;
        y1 -= y3;
        x2 -= x3;
        y2 -= y3;

        return (x1 * y2 - x2 * y1) / 2;
    }

    private int ccw(double x1, double y1, double x2, double y2, double x3, double y3) {
        x1 -= x3;
        y1 -= y3;
        x2 -= x3;
        y2 -= y3;

        double s = x1 * y2 - x2 * y1;

        if (s > 0) {
            return 1;
        } else if (s < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
