package topc.easy;

import java.util.*;
import java.io.*;

// TCO10 Semi 2 Division I Level One - 250
// brute force, dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11014&rd=14285
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'10+Semifinal+2
public class YetAnotherRobotSimulation {
    public double getMaximumProbability(int L, int[] locationsX, int[] locationsY) {
        double C[][] = new double[L + 1][L + 1];

        for (int i = 0; i <= L; i++) {
            C[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }

        double prob[][][] = new double[L + 1][L + 1][201];
        for (int pos = 0; pos <= L; pos++) {
            for (int neg = 0; pos + neg <= L; neg++) {
                for (int t = -100; t <= 100; t++) {
                    prob[pos][neg][t + 100] = 0;
                    for (int p = 0; p <= pos; p++) {
                        int n = p - t;
                        if (n >= 0 && n <= neg) {
                            prob[pos][neg][t + 100] += C[pos][p] / (1L << pos) * C[neg][n] / (1L << neg);
                        }
                    }
                }
            }
        }

        double result = 0;
        for (int up = 0; up <= L; up++) {
            for (int down = 0; down + up <= L; down++) {
                for (int left = 0; left + down + up <= L; left++) {
                    int right = L - left - down - up;
                    double p = 0;
                    for (int i = 0; i < locationsX.length; i++) {
                        p += prob[up][down][locationsY[i] + 100] * prob[right][left][locationsX[i] + 100];
                    }
                    result = Math.max(result, p);
                }
            }
        }

        return result;
    }
}
