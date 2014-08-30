package topc.search;

import java.util.*;
import java.io.*;

// SRM 600 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12824&rd=15712
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+600
public class TheShuttles {
    public int getLeastCost(int[] cnt, int baseCost, int seatCost) {
        int best = Integer.MAX_VALUE;

        for (int seats = 1; seats < 200; seats++) {
            best = Math.min(best, cost(cnt, baseCost, seatCost, seats));
        }

        return best;
    }

    private int cost(int[] cnt, int base, int seat, int seats) {
        int sum = 0;
        int sh = base + seats * seat;

        for (int i = 0; i < cnt.length; i++) {
            int x = cnt[i] / seats + (cnt[i] % seats == 0 ? 0 : 1);
            sum += x * sh;
        }

        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
