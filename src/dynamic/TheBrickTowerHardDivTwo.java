package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 554 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12164&rd=15176
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+554
public class TheBrickTowerHardDivTwo {
    long MOD = 1234567891L;
    int C;
    int K;
    long[][][][][][] memo;

    public int find(int C, int K, int H) {
        this.C = C;
        this.K = K;
        this.memo = new long[C + 1][C + 1][C + 1][C + 1][K + 1][H + 1];

        for (int c1 = 0; c1 <= C; c1++) {
            for (int c2 = 0; c2 <= C; c2++) {
                for (int c3 = 0; c3 <= C; c3++) {
                    for (int c4 = 0; c4 <= C; c4++) {
                        for (int k = 0; k <= K; k++) {
                            Arrays.fill(memo[c1][c2][c3][c4][k], -1);
                        }
                    }
                }
            }
        }

        long sum = 0L;

        for (int h = 0; h < H; h++) {
            for (int c1 = 0; c1 < C; c1++) {
                for (int c2 = 0; c2 < C; c2++) {
                    for (int c3 = 0; c3 < C; c3++) {
                        for (int c4 = 0; c4 < C; c4++) {
                            int k = countEq(c1, c2, c3, c4);
                            sum += rec(c1, c2, c3, c4, k, h);
                            if (sum > MOD) { sum -= MOD; }
                        }
                    }
                }
            }
        }

        return (int)sum;
    }

    long rec(int p1, int p2, int p3, int p4, int k, int h) {
        if (k > K) { return 0; }
        if (h == 0) { return 1; }
        if (memo[p1][p2][p3][p4][k][h] > -1) { return memo[p1][p2][p3][p4][k][h]; }

        long sum = 0L;

        for (int c1 = 0; c1 < C; c1++) {
            for (int c2 = 0; c2 < C; c2++) {
                for (int c3 = 0; c3 < C; c3++) {
                    for (int c4 = 0; c4 < C; c4++) {
                        int nextk = k;

                        nextk += countEq(c1, c2, c3, c4);
                        nextk += (c1 == p1) ? 1 : 0;
                        nextk += (c2 == p2) ? 1 : 0;
                        nextk += (c3 == p3) ? 1 : 0;
                        nextk += (c4 == p4) ? 1 : 0;

                        sum += rec(c1, c2, c3, c4, nextk, h - 1);
                        if (sum > MOD) { sum -= MOD; }
                    }
                }
            }
        }

        memo[p1][p2][p3][p4][k][h] = sum;
        return sum;
    }

    int countEq(int c1, int c2, int c3, int c4) {
        return 
            (c1 == c2 ? 1 : 0) +
            (c1 == c4 ? 1 : 0) +
            (c2 == c3 ? 1 : 0) +
            (c4 == c3 ? 1 : 0);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
