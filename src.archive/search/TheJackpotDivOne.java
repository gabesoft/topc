package topc.search;

import java.math.*;
import java.util.*;
import java.io.*;

// SRM 504.5 Division I Level Two - 550
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11097&rd=14514
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+504.5
public class TheJackpotDivOne {
    public long[] find(long[] money, long jackpot) {
        int n           = money.length;
        BigInteger nbig = BigInteger.valueOf(n);

        int c = 0;
        while (jackpot > 0) {
            BigInteger sum = BigInteger.valueOf(money[0]);
            int min        = 0;
            long first     = money[0];
            boolean same   = true;

            for (int i = 1; i < n; i++) {
                same &= money[i] == first;
                sum   = sum.add(BigInteger.valueOf(money[i]));
                if (money[min] > money[i]) {
                    min = i;
                }
            }

            if (same) { break; }

            long avg = sum.divide(nbig).longValue();
            long inc =  Math.min(jackpot, avg - money[min] + 1);

            money[min] += inc;
            jackpot    -= inc;
        }

        long rest = jackpot / n;
        for (int i = 0; i < n - 1; i++) {
            money[i] += rest;
            jackpot  -= rest;
            rest      = jackpot / (n - i - 1);
        }
        money[n - 1] += rest;

        Arrays.sort(money);
        return money;
    }

    private long avg(long[] money) {
        long res = 0;
        for (int i = 0; ; ) {

        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
