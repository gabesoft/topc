package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 249 Division I Level One - 350
// dynamic programming, math, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4616&rd=7224
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm249
public class TableSeating {
    double memo[];
    double P[];
    int tb;

    public double getExpected(int numTables, int[] probs) {
        tb   = numTables;
        memo = new double[1 << 13];
        P    = new double[probs.length];

        Arrays.fill(memo, -2.0);
        for (int i = 0; i < probs.length; i++) {
            P[i] = probs[i] / 100.0;
        }

        return solve(0);
    }

    private double solve(int seating) {
        if (memo[seating] > -1.0) { return memo[seating]; }

        double res = 0;
        double sum = 0;
        int cnt    = 0;

        for (int i = 0; i < P.length; i++) {
            int t = i + 1;
            sum   = 0;
            cnt   = 0;

            int curr = (1 << t) - 1;
            for (int j = 0; j + t <= tb; j++) {
                if ((seating & (curr << j)) == 0) {
                    sum += solve(seating + (curr << j)) + t;
                    cnt++;
                }
            }

            if (cnt != 0) {
                sum /= cnt;
                res += sum * P[i];
            }
        }

        memo[seating] = res;
        return memo[seating];
    }

    //public double getExpected(int numTables, int[] probs) {
    //double canseat[] = new double[1 << 12];
    //for (int i = (1 << numTables) - 1; i >= 0; i--) {
    //int prob   = 0;
    //double sum2 = 0;

    //for (int t = 0; t < probs.length; t++) {
    //int count   = 0;
    //double sum1 = 0;
    //int len     = t + 1;
    //int cust    = (1 << len) - 1;

    //for (int j = 0; j < numTables; j++) {
    //int mask = cust << j;
    //if (mask < (1 << numTables) && (i & mask) == 0) {
    //sum1 += len + canseat[i | mask];
    //count++;
    //}
    //}

    //if (count > 0) {
    //sum2 += (sum1 / count) * probs[t];
    //}

    //prob += probs[t];

    //if (prob > 0) {
    //canseat[i] = sum2 / prob;
    //}
    //}
    //}

    //return canseat[0];
    //}

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
