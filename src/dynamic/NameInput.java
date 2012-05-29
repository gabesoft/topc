package topc.dynamic;

import java.util.*;
import java.io.*;

// Member SRM 461 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10747&rd=14181
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class NameInput {
    String pred;
    String name;
    int[][] memo;

    public int countUpDownKeyPresses(String[] predictionSequence, String[] name) {
        this.pred = "";
        this.name = "";

        for (int i = 0; i < predictionSequence.length; i++) {
            this.pred += predictionSequence[i];
        }
        for (int i = 0; i < name.length; i++) {
            this.name += name[i];
        }

        this.memo = new int[this.name.length()][this.pred.length()];

        return count(0, 0);
    }

    int count(int n, int p) {
        if (memo[n][p] > 0) { return memo[n][p]; }

        char c   = name.charAt(n);
        int plen = pred.length();
        int best = -1;

        if (n == name.length() - 1) {
            for (int i = p; i < plen; i++) {
                if (pred.charAt(i) == c) {
                    best = best == -1 ? (i - p) : Math.min(best, i - p);
                    break;
                }
            }
            for (int i = p; i > -1; i--) {
                if (pred.charAt(i) == c) {
                    best = best == -1 ? (p - i) : Math.min(best, p - i);
                    break;
                }
            }
        } else if (n > 0 && name.charAt(n - 1) == c) { 
            return count(n + 1, p);
        } else {
            for (int i = p; i < p + plen; i++) {

                int j   = i > plen - 1 ? i - plen : i;
                char cc = pred.charAt(j);

                if (c == cc) {
                    int next = count(n + 1, j);
                    if (next == -1) { return -1; }

                    int v = j < p 
                        ? Math.min(p - j, plen - p + j)
                        : Math.min(j - p, plen - j + p);
                    int curr = v + next;

                    best = best == -1 ? curr : Math.min(best, curr);
                }
            }
        }

        memo[n][p] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
