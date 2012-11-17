package topc.search;

import java.util.*;
import java.io.*;

// SRM 450 Division II Level Three - 1000
// search, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10070&rd=13904
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+450
public class EnemyTowers {
    int INF = Integer.MAX_VALUE / 4;

    public int attack(int myUnits, int hpT, int attackT, int numWodT, int numStoT) {
        int hi   = myUnits;
        int lo   = 0;
        int best = INF;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int tw  = time(mid, hpT, attackT, numWodT);
            int ts  = time(myUnits - mid, hpT, attackT, numStoT);
            best    = Math.min(best, Math.max(tw, ts));

            if (tw == ts) { break; }

            if (tw < ts) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }


        return best == INF ? -1 : best;
    }

    int time(int units, int hpT, int attackT, int numT) {
        int hp     = hpT;
        int tower  = 0;
        int rounds = 0;

        while (units > 0 && numT > 0) {
            hp -= units;

            while (hp <= 0 && numT > 0) {
                numT--;
                hp += hpT;
            }

            units -= numT * attackT;
            rounds++;
        }

        return numT == 0 ? rounds : INF;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
