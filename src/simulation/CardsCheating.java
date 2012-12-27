package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 415 Division II Level Three - 1000
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9934&rd=13506
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm415
public class CardsCheating {
    public int numberOfShuffles(int[] cards, int[] shuffle) {
        int n      = cards.length;
        int deck[] = new int[n];
        int orig[] = new int[n];

        for (int i = 0; i < n; i++) {
            deck[i] = i;
            orig[i] = i;
        }

        if (eq(deck, cards, 3)) { return 0; }

        deck      = doShuffle(deck, shuffle);
        int count = 1;

        while (!eq(deck, orig, n)) {
            if (eq(deck, cards, 3)) { 
                return count;
            }

            deck = doShuffle(deck, shuffle);
            count++;
        }

        return -1;
    }

    boolean eq(int[] a, int[] b, int mod) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % mod != b[i]) { return false; }
        }
        return true;
    }

    int[] doShuffle(int[] deck, int[] shuffle) {
        int ans[] = new int[deck.length];
        for (int i = 0; i < deck.length; i++) {
            ans[i] = deck[shuffle[i]];
        }
        return ans;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
