package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 563 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12333&rd=15185
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+563
public class SpellCardsEasy {
    int n;
    int level[];
    int damage[];
    int memo[][];

    public int maxDamage(int[] level, int[] damage) {
        this.level  = level;
        this.damage = damage;
        this.n      = level.length;
        this.memo   = new int[51][51];

        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return find(0, 0);
    }

    int find(int p, int owed) {
        if (memo[p][owed] > -1) { return memo[p][owed]; }
        if (n - p == owed) { return 0; }

        int res = find(p + 1, Math.max(owed - 1, 0));

        if (owed + level[p] - 1 <= n - p - 1) {
            res = Math.max(res, damage[p] + find(p + 1, owed + level[p] - 1));
        }

        memo[p][owed] = res;
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
