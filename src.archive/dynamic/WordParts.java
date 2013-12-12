package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 156 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1361&rd=4585
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm156
public class WordParts {
    int INF = 1000;
    int memo[];
    String[] parts;
    String word;

    public int partCount(String original, String compound) {
        int n = original.length();
        int k = 1;

        word     = compound;
        parts    = new String[2 * n - 1];
        parts[0] = original;

        for (int i = 1; i < n; i++) {
            parts[k++] = original.substring(0, i);
        }
        for (int i = 1; i < n; i++) {
            parts[k++] = original.substring(i, n);
        }

        memo = new int[compound.length()];
        Arrays.fill(memo, -1);

        int res = count(0);
        return res == INF ? -1 : res;
    }

    private int count(int index) {
        if (index == word.length()) { return 0; }
        if (memo[index] > -1) { return memo[index]; }

        int best = INF;
        for (int i = 0; i < parts.length; i++) {
            if (word.startsWith(parts[i], index)) {
                best = Math.min(best, 1 + count(index + parts[i].length()));
            }
        }

        memo[index] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
