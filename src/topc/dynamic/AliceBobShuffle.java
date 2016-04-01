package topc.dynamic;

import java.util.*;

// SRM 544 Division II Level Three - 1000
// dynamic programming, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11865&rd=14736
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+544
public class AliceBobShuffle {
    public static final int MOD = 1000000007;
    int dp[][][][] = null;
    int AS[] = null;
    int AE[] = null;
    int BS[] = null;
    int BE[] = null;

    public int countWays(int[] AliceStart, int[] BobStart, int[] AliceEnd, int[] BobEnd) {
        AS = AliceStart;
        AE = AliceEnd;
        BS = BobStart;
        BE = BobEnd;

        dp = new int[51][51][51][51];
        return rec(AS.length, BS.length, AE.length, BE.length);
    }

    private int rec(int a, int b, int c, int d) {
        if (dp[a][b][c][d] > 0) { return dp[a][b][c][d] - 1; }
        if (a == 0 && b == 0 && c == 0 && d == 0) { return 1; }

        long res = 0;

        if (a != 0) {
            if (c != 0 && AS[a - 1] == AE[c - 1]) {
                res += rec(a - 1, b, c - 1, d);
            }
            if (d != 0 && AS[a - 1] == BE[d - 1]) {
                res += rec(a - 1, b, c, d - 1);
            }
        }
        if (b != 0) {
            if (c != 0 && BS[b - 1] == AE[c - 1]) {
                res += rec(a, b - 1, c - 1, d);
            }
            if (d != 0 && BS[b - 1] == BE[d - 1]) {
                res += rec(a, b - 1, c, d - 1);
            }
        }

        res %= MOD;
        dp[a][b][c][d] = (int)res + 1;

        return (int)res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
