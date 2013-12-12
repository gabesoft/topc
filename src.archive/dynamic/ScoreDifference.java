package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 328 Division II Level Three - 1000
// dynamic programming, recursion, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6854&rd=10008
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm328
public class ScoreDifference {
    int INF     = Integer.MAX_VALUE / 4;
    int[][] rem = {
        new int[] {},                 // 0
        new int[] {},                 // 1
        new int[] {},                 // 2
        new int[] {},                 // 3
        new int[] {},                 // 4
        new int[] { 1, 4, 6, 9  },    // 5
        new int[] { 2, 5, 7, 10 },    // 6
        new int[] {},                 // 7
        new int[] {},                 // 8
        new int[] { 5, 10, 13, 8 },   // 9
        new int[] { 6, 9, 14, 11 },   // 10
        new int[] {},                 // 11
        new int[] {},                 // 12
        new int[] {},                 // 13
        new int[] {},                 // 14
        new int[] {},                 // 15
    };
    int[][] memo;
    int[] pieces;

    public int maximize(String[] board) {
        pieces = new int[16];
        memo   = new int[2][1 << 16];

        Arrays.fill(memo[0], INF);
        Arrays.fill(memo[1], INF);

        int k = 0;
        for (int i = 0; i < board.length; i++) {
            String[] parts = board[i].split(" ");
            for (int j = 0; j < parts.length; j++) {
                pieces[k++] = Integer.parseInt(parts[j]);
            }
        }

        return play(0, 0);
    }

    int play(int game, int turn) {
        if (game == (1 << pieces.length) - 1) { return 0; }
        if (memo[turn][game] != INF) { return memo[turn][game]; }

        int best = turn == 0 ? -INF : INF;
        int pick = -1;
        for (int i = 0; i < pieces.length; i++) {
            if (off(game, i) && canTake(game, i)) {
                int piece = pieces[i];
                int next  = play(game | (1 << i), turn == 0 ? 1 : 0);

                int prev = best;
                best = turn == 0
                    ? Math.max(best,  piece + next)
                    : Math.min(best, -piece + next);

                if (prev != best) {
                    pick = i;
                }
            }
        }

        memo[turn][game] = best;
        return best;
    }

    boolean off(int mask, int k) {
        return ((mask >> k) & 1) == 0;
    }

    boolean on(int mask, int k) {
        return !off(mask, k);
    }

    boolean canTake(int mask, int k) {
        if (rem[k].length == 0) { return true; }

        for (int i = 0; i < rem[k].length; i++) {
            if (on(mask, rem[k][i])) {
                return true;
            }
        }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
