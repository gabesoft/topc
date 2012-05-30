package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 459 Division II Level Three - 1000
// dynamic programming, graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10723&rd=14145
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+459
public class ParkAmusement {
    String[] landings;
    double[][] memo;
    int n;

    public double getProbability(String[] landings, int startLanding, int K) {
        this.n        = landings.length;
        this.landings = landings;
        this.memo     = new double[n][K + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -2.0);
        }

        double sum   = 0.0;
        double lprob = 0.0;

        for (int i = 0; i < n; i++) {
            double curr = prob(i, K);
            sum += curr;
            if (startLanding == i) {
                lprob = curr;
            }
        }

        return lprob / sum;
    }

    double prob(int l, int d) {
        if (d < 0) { return 0.0; }
        if (memo[l][d] > -1.0) { return memo[l][d]; }
        
        double res     = 0.0;
        String landing = landings[l];

        if (landing.indexOf('E') != -1) {
            res = d == 0 ? 1.0 : 0.0;
        } else if (landing.indexOf('P') != -1) {
            res = 0.0;
        } else {
            double ones = 0.0;

            for (int i = 0; i < n; i++) {
                if (landing.charAt(i) == '1') {
                    ones++;
                    res += prob(i, d - 1);
                }
            }
            
            res = res / ones;
        }

        memo[l][d] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
