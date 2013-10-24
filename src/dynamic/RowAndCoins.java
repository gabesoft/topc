package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 522 Division I Level One - 250
// dynamic programming, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11566&rd=14547
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+522
public class RowAndCoins {
    int n = 0;
    int C[];
    int memo[][];

    public String getWinner(String cells) {
        n = cells.length();
        C = new int[n];

        for (int i = 0; i < n; i++) {
            C[i] = cells.charAt(i) - 'A';
        }

        memo = new int[2][1 << n];
        Arrays.fill(memo[0], -1);
        Arrays.fill(memo[1], -1);

        return play(0, 0) == 0 ? "Alice" : "Bob";
    }

    private int play(int cells, int turn) {
        if (memo[turn][cells] > -1) { return memo[turn][cells]; }

        int selected = 0;
        int winner   = -1;

        for (int i = 0; i < n; i++) {
            if (on(cells, i)) {
                selected++;
            } else {
                winner = i;
            }
        }

        if (selected == n) { return -1; }
        if (selected == n - 1) { return C[winner]; }

        for (int start = 0; start < n; start++) {
            int curr = cells;

            if (!on(curr, start)) {
                for (int i = start; i < n; i++) {
                    if (on(curr, i)) { break; }

                    curr |= (1 << i);

                    if (play(curr, (turn + 1) % 2) == turn) {
                        memo[turn][cells] = turn;
                        return memo[turn][cells];
                    }
                }
            }
        }

        memo[turn][cells] = (turn + 1) % 2;
        return memo[turn][cells]; 
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
