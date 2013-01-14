package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 380 Division I Level Two - 500
// greedy, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8228&rd=10802
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm380
public class CompilingDecksWithJokers {
    int cards[];
    int n;
    long jokers;

    public int maxCompleteDecks(int[] cards, int jokers) {
        this.n      = cards.length;
        this.cards  = cards;
        this.jokers = jokers;

        int lo = 0;
        int hi = Integer.MAX_VALUE;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (canCompile(mid)) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return hi;
    }

    boolean canCompile(long decks) {
        long missing = 0;

        for (int i = 0; i < n; i++) {
            missing += Math.max(0, decks - cards[i]);
        }

        return jokers >= missing && missing <= decks;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
