package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 534 Division I Level One - 250
// dynamic programming, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11791&rd=14727
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+534
public class EllysCheckers {
    int n;
    int memo[][];

    public String getWinner(String board) {
        n = board.length();

        int m = 0;
        for (int i = 0; i < n - 1; i++) {
            if (board.charAt(i) == 'o') {
                m = on(m, i);
            }
        }

        memo = new int[2][1 << n];

        Arrays.fill(memo[0], -1);
        Arrays.fill(memo[1], -1);

        return win(m, true) ? "YES" : "NO";
    }

    private boolean win(int game, boolean turn) {
        if (memo[turn ? 1 : 0][game] > -1) { return memo[turn ? 1 : 0][game] == 1; }

        boolean w = !turn;

        for (int i = 0; i < n - 1; i++) {
            if (isOff(game, i)) { continue; }

            int next = -1;
            if (isOff(game, i + 1)) {
                next = on(off(game, i), i + 1);
            }
            if (i < n - 3 && isOn(game, i + 1) && isOn(game, i + 2) && isOff(game, i + 3)) {
                next = on(off(game, i), i + 3);
            }

            if (next > -1) {
                if (turn && win(next, !turn)) {
                    w = true;
                    break;
                }
                if (!turn && !win(next, !turn)) {
                    w = false;
                    break;
                }
            }
        }

        memo[turn ? 1 : 0][game] = w ? 1 : 0;
        return w;
    }

    private int off(int mask, int bit) {
        return mask & ~(1 << bit);
    }

    private int on(int mask, int k) {
        return k == n - 1 ? mask : mask | (1 << k);
    }

    private boolean isOn(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private boolean isOff(int mask, int k) {
        return !isOn(mask, k);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
