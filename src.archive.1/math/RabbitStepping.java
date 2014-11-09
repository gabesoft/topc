package topc.math;

import java.util.*;
import java.io.*;

// SRM 475 Division I Level One - 300
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10878&rd=14156
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+475
public class RabbitStepping {
    public double getExpected(String field, int r) {
        //return solve1(field, r);
        return solve2(field, r);
    }

    private double solve2(String field, int r) {
        int n = field.length();
        int sum = 0;
        int cnt = 0;

        for (int h = 0; h < (1 << n); h++) {
            if (Integer.bitCount(h) == r) {
                sum += Integer.bitCount(h & 0x55555) % 2;
                sum += Integer.bitCount(h & 0xaaaaa) % 2;
                cnt += 1;
            }
        }

        return sum / (double) cnt;
    }

    private double solve1(String field, int r) {
        int counts[] = new int[3];

        int n   = field.length();
        int lim = 1 << n;

        for (int i = 1; i < lim; i++) {
            if (Integer.bitCount(i) == r) {
                int c = play(field, i, n);
                counts[c]++;
            }
        }

        double t = counts[0] + counts[1] + counts[2];
        double e = counts[1] / t + counts[2] / t * 2;

        return e;
    }

    private int play(String field, int rabbits, int n) {
        if (n <= 2) { return Integer.bitCount(rabbits & 3); }

        int[] game = new int[n];

        for (int i = 0; i < n; i++) {
            if (on(rabbits, i)) {
                game[i] = 1;
            }
        }

        int[] reds = new int[n];

        Arrays.fill(reds, -1);

        for (int i = n; i > 2; i--) {
            int[] next = new int[i - 1];

            next[1]     += game[0];
            reds[1]      = -1;

            next[i - 2] += game[i - 1];
            reds[i - 2]  = +1;

            next[i - 3] += game[i - 2];
            reds[i - 3]  = +1;

            for (int j = 1; j < i - 2; j++) {
                char c = field.charAt(j);
                if (game[j] > 0) {
                    switch (c) {
                        case 'W':
                            next[j - 1]++;
                            reds[j - 1] = +1;
                            break;
                        case 'B':
                            next[j + 1]++;
                            reds[j + 1] = -1;
                            break;
                        case 'R':
                            next[j + reds[j]]++;
                            reds[j + reds[j]] = -reds[j];
                            break;
                    }
                }
            }

            for (int j = 0; j < next.length; j++) {
                if (next[j] > 1) {
                    next[j] = 0;
                }
            }

            game = next;
        }

        return game[0] + game[1];
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
