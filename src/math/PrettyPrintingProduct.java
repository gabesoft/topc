package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 420 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9916&rd=13511
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm420
public class PrettyPrintingProduct {
    public String prettyPrint(int A, int B) {
        int twos  = 0;
        int fives = 0;

        long D = 1L;
        long MOD = (long) Math.pow(10, 12);

        for (int i = A; i < B + 1; i++) {
            int temp = i;

            while (temp % 2 == 0) {
                temp /= 2;
                twos++;
            }

            while (temp % 5 == 0) {
                temp /= 5;
                fives++;
            }

            D *= temp;
            D %= MOD;
        }

        int zeroes = Math.min(twos, fives);

        twos  -= zeroes;
        fives -= zeroes;

        while (twos-- > 0) {
            D *= 2;
            D %= MOD;
        }

        while (fives-- > 0) {
            D *= 5;
            D %= MOD;
        }

        double logProd = 0;
        for (int i = A; i < B + 1; i++) {
            logProd += Math.log10(1.0 * i);
        }

        logProd -= zeroes;

        if (logProd < 11.5 && D < (long) Math.pow(10, 10)) {
            return String.format("%s * 10^%s", D, zeroes);
        } else {
            logProd   = logProd - (int)logProd + 4;
            int first = (int) Math.pow(10.0, logProd);
            long last = D % 100000;
            return String.format("%s...%05d * 10^%s", first, last, zeroes);
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
