package topc.math;

import java.util.*;
import java.io.*;

// SRM 267 Division II Level Three - 1000
// math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3488&rd=8000
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm267
public class WordNumber {
    public String theWord(int alpha, int n) {
        long sum  = alpha;
        long apow = alpha;
        long prev = 0;
        int wlen  = 1;

        while (n > sum) {
            apow *= alpha;
            prev  = sum;
            sum  += apow;
            wlen += 1;
        }

        long pow[]  = buildPowTable(alpha, wlen);
        long m      = (long) n - prev;
        String word = "";

        for (int p = wlen; p > 0; p--) {
            for (int j = 1; j < alpha + 1; j++) {
                if (m <= j * pow[p - 1]) {
                    word += (char)('a' + (j - 1));
                    m    -= ((j - 1) * pow[p - 1]);
                    break;
                }
            }
        }

        return word;
    }

    private long[] buildPowTable(int n, int k) {
        long pow[] = new long[k + 1];

        pow[0] = 1;
        for (int i = 1; i < k + 1; i++) {
            pow[i] = n * pow[i - 1];
        }

        return pow;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
