package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 448 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10620&rd=13902
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+448
public class TheCardLineDivTwo {
    int MOD = 1234567891;
    int n;
    int [][] memo;
    String[] cards;

    public int count(String[] cards) {
        this.n     = cards.length;
        this.cards = new String[n];
        this.memo  = new int[1 << n][n];

        for (int i = 0; i < n; i++) {
            String c      = cards[i];
            char s        = c.charAt(1);
            this.cards[i] = "" + c.charAt(0) + ((s == 'S' || s == 'C') ? 'B' : 'R');
        }

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return rec(0, -1);
    }

    int rec(int mask, int last) {
        if (mask == ((1 << n) - 1)) { return 1; }
        if (last > -1 && memo[mask][last] > -1) { return memo[mask][last]; }

        long sum    = 0L;
        String card = last > -1 ? cards[last] : "";

        for (int i = 0; i < n; i++) {
            if ((((mask >> i) & 1) == 0) && valid(card, cards[i])) {
                sum += rec(mask | (1 << i), i);
                if (sum >= MOD) {
                    sum -= MOD;
                }
            }
        }

        if (last > -1) {
            memo[mask][last] = (int)sum;
        }
        return (int)sum;
    }

    boolean valid(String c1, String c2) {
        if (c1 == "") { return true; }
        if (c1.charAt(0) == c2.charAt(0)) { return true; }
        if (c1.charAt(1) == c2.charAt(1)) { return true; }
        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
