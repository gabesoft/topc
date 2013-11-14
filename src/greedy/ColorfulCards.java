package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 495 Division I Level One - 275
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11302&rd=14424
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+495
public class ColorfulCards {
    int memo[][];

    public int[] theCards(int N, String colors) {
        int n = colors.length();

        int sieve[] = buildSieve(N);
        int input[] = new int[n];
        int cards[] = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = (colors.charAt(i) == 'R') ? 1 : 0;
        }

        memo = new int[n + 1][N + 1];

        int s = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = s + 1; j < sieve.length; j++) {
                if (input[i] != sieve[j]) { continue; }
                if (valid(sieve, input, i, j)) {
                    if (c == 0) {
                        s = j;
                    }
                    c++;
                }
                if (c > 1) {
                    break;
                }
            }
            cards[i] = c > 1 ? -1 : s;
        }

        return cards;
    }

    private boolean valid(int[] sieve, int[] input, int ix, int sx) {
        if (ix + 1 == input.length) { return true; }
        if (sx + 1 == sieve.length) { return false; }

        if (memo[ix][sx] > 0) { return memo[ix][sx] == 1; }

        for (int i = sx + 1; i < sieve.length; i++) {
            if (input[ix + 1] == sieve[i] && valid(sieve, input, ix + 1, i)) {
                memo[ix][sx] = 1;
                return true;
            }
        }

        memo[ix][sx] = 2;
        return false;
    }

    int[] buildSieve(int n) {
        int sieve[] = new int[n + 1];
        int lim     = (int)Math.sqrt(n + 1);

        for (int i = 0; i < sieve.length; i++) {
            sieve[i] = i;
        }

        for (int i = 2; i < n + 1; i++) {
            if (sieve[i] == i) {    // i is prime
                for (int j = 1; j * i < sieve.length; j++) {
                    sieve[j * i] = i;
                }
            }
        }

        int res[] = new int[n + 1];
        for (int i = 2; i < n + 1; i++) {
            res[i] = (sieve[i] == i) ? 1 : 0;
        }

        return res;
    }


    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
