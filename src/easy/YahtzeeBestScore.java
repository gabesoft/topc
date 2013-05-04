package topc.easy;

import java.util.*;
import java.io.*;

// SRM 262 Division II Level Three - 1100
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4800&rd=7996
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm262
public class YahtzeeBestScore {
    int[] perm;
    int level;
    int best;
    String[] hands;

    public int bestLowerScore(String[] hands) {
        this.hands = hands;
        this.perm  = new int[7];
        this.level = -1;
        this.best  = 0;

        permute(0);
        return best;
    }

    private void computeScore(int[] perm) {
        int score = 0;

        for (int i = 0; i < perm.length; i++) {
            score += score(hands[perm[i] - 1], i);
        }

        best = Math.max(best, score);
    }

    private int score(String hand, int pos) {
        int p = 1;
        int M = 0;
        int s = 0;

        int cnts[] = new int[6];
        for (int i = 0; i < hand.length(); i++) {
            cnts[hand.charAt(i) - '1']++;
        }

        for (int i = 0; i < cnts.length; i++) {
            if (cnts[i] > 0) {
                p *= cnts[i];
                s += cnts[i] * (i + 1);
                if (cnts[i] > M) {
                    M = cnts[i];
                }
            }
        }

        if (M == 5 && pos == 0) { return 50; }
        if (M == 5 && pos == 1) { return 25; }
        if (p == 6 && pos == 1) { return 25; }
        if (M >= 4 && pos == 2) { return s; }
        if (M >= 3 && pos == 3) { return s; }

        if (p == 1 && (cnts[0] == 0 || cnts[5] == 0) && pos == 4) return 40;
        if (p == 1 && (cnts[0] == 0 || cnts[5] == 0) && pos == 5) return 30;
        if (p == 1 && (cnts[1] == 0 || cnts[4] == 0) && pos == 5) return 30;

        if (p == 2 && (cnts[0] + cnts[1]) * (cnts[4] + cnts[5]) * (cnts[0] + cnts[5]) == 0 
                   && pos == 5) return 30;

        if (pos == 6) return s;

        return 0;
    }

    private void permute(int k) {
        level++;
        perm[k] = level;
        if (level == perm.length) {
            computeScore(perm);
        } else {
            for (int i = 0; i < perm.length; i++) {
                if (perm[i] == 0) {
                    permute(i);
                }
            }
        }
        level--;
        perm[k] = 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
