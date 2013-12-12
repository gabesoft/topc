package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 544 Division II Level Three - 1000
// dynamic programming, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11865&rd=14736
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+544
public class AliceBobShuffle {
    final int MOD = 1000000007;
    int[][][][] memo;
    int[] astart;
    int[] bstart;
    int[] aend;
    int[] bend;

    public int countWays(int[] AliceStart, int[] BobStart, int[] AliceEnd, int[] BobEnd) {
        astart = AliceStart;
        aend   = AliceEnd;
        bstart = BobStart;
        bend   = BobEnd;
        memo = new int[astart.length + 1][bstart.length + 1][aend.length + 1][bend.length + 1];
        return dp(astart.length, bstart.length, aend.length, bend.length);
    }

    int dp(int as, int bs, int ae, int be) {
        long sum = memo[as][bs][ae][be] - 1;
        if (sum == -1) {
            sum = 0;
            if (as == 0 && bs == 0 && ae == 0 && be == 0) {
                sum = 1;
            }
            if (as != 0) {
                if (ae != 0 && astart[as - 1] == aend[ae - 1]) {
                    sum += dp(as - 1, bs, ae - 1, be);
                }
                if (be != 0 && astart[as - 1] == bend[be - 1]) {
                    sum += dp(as - 1, bs, ae, be - 1);
                }
            }
            if (bs != 0) {
                if (ae != 0 && bstart[bs - 1] == aend[ae - 1]) {
                    sum += dp(as, bs - 1, ae - 1, be);
                }
                if (be != 0 && bstart[bs - 1] == bend[be - 1]) {
                    sum += dp(as, bs - 1, ae, be - 1);
                }
            }
            sum %= MOD;
            memo[as][bs][ae][be] = (int) sum + 1;
        }
        return (int)sum;
    }


    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
