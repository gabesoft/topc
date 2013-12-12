package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 531 Division I Level One - 300
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11774&rd=14724
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+531
public class NoRepeatPlaylist {
    long MOD = 1000000007L;
    long dp[][];
    int N;
    int M;
    int P;

    public int numPlaylists(int N, int M, int P) {
        this.N = N;
        this.M = M;
        this.P = P;

        this.dp = new long[P + 1][N + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return (int)count(0, 0);
    }

    private long count(int pos, int played) {
        int uplayed = N - played;

        if (pos == P) { return uplayed == 0 ? 1 : 0; }
        if (dp[pos][played] > -1) { return dp[pos][played]; }

        long res = 0;
        if (uplayed > 0) {
            res += count(pos + 1, played + 1) * uplayed;
        }
        if (played > M) {
            res += count(pos + 1, played) * (played - M);
        }

        dp[pos][played] = res % MOD;
        return dp[pos][played];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
