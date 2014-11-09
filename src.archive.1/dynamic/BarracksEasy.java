package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 418 Division II Level Three - 1000
// dynamic programming, greedy, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10073&rd=13509
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm418
public class BarracksEasy {
    int rate;

    public int attack(int myUnits, int barHp, int unitsPerRound) {
        rate = unitsPerRound;
        return rec(myUnits, barHp, 0);
    }

    int rec(int u, int b, int s) {
        if (u <= 0) { return -1; }
        if (s <= 0 && b <= 0) { return 0; }

        int turns = -1;
        int uc    = Math.min(u, s + b);
        for (int i = Math.max(0, uc - s); i <= Math.min(uc, b); i++) {
            if (i == 0 && b > 0) { continue; }

            int nb   = b - i;
            int ns   = s - (uc - i);
            int next = rec(u - ns, nb, ns + (nb <= 0 ? 0 : rate)); 

            if (next > -1) {
                turns = turns == -1 ? (next + 1) : Math.min(turns, next + 1);
            }
        }

        return turns;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
