package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO10 Round 4 Division I Level One - 250
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10988&rd=14282
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'10+Online+Round+4
public class BankLottery {
    int J;
    int M;
    int O;
    int W;
    double memo[][];

    public double expectedAmount(int[] accountBalance, int weeklyJackpot, int weekCount) {
        return solve2(accountBalance, weeklyJackpot, weekCount);
    }

    private double solve2(int[] accountBalance, int weeklyJackpot, int weekCount) {
        double total = 0;
        for (int x : accountBalance) {
            total += x;
        }
        return accountBalance[0] + (accountBalance[0] / total) * weeklyJackpot * weekCount;
    }

    private double solve1(int[] accountBalance, int weeklyJackpot, int weekCount) {
        if (accountBalance[0] == 0) { return 0; }

        J    = weeklyJackpot;
        W    = weekCount;
        memo = new double[W + 1][W + 1];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -2.0);
        }

        M = accountBalance[0];
        O = 0;

        for (int i = 1; i < accountBalance.length; i++) {
            O += accountBalance[i];
        }

        return prob(0, 0);
    }

    private double prob(int won, int weeks) {
        if (weeks == W) { return won * J + M; }
        if (memo[won][weeks] > -1.0) { return memo[won][weeks]; }

        int lost      = weeks - won;
        int othersBal = lost * J + O;
        int myBal     = won * J + M;

        double t = myBal + othersBal;
        double a = myBal / t * prob(won + 1, weeks + 1);
        double b = othersBal / t * prob(won, weeks + 1);

        memo[won][weeks] = a + b;
        return memo[won][weeks];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
