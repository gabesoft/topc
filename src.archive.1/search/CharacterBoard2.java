package topc.search;

import java.util.*;
import java.io.*;

// SRM 576 Division II Level Three - 1024
// brute force, simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12506&rd=15496
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+576
public class CharacterBoard2 {
    long MOD = 1000000009L;
    int W;
    long memo[];

    public int countGenerators(String[] fragment, int W, int i0, int j0) {
        this.W = W;
        this.memo = new long[W + 1];

        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < fragment.length; i++) {
            for (int j = 0; j < fragment[i].length(); j++) {
                set.add(fragment[i].charAt(j));
            }
        }

        if (set.size() > W) { return 0; }

        int min  = set.size();
        long sum = 0;

        for (int i = min; i < W + 1; i++) {
            char S[]      = new char[i];
            boolean valid = true;

            Arrays.fill(S, '?');

            int w = S.length;
            for (int j = 0; j < fragment.length; j++) {
                for (int k = 0; k < fragment[j].length(); k++) {
                    int p  = position(i, j, k);
                    char c = fragment[j].charAt(k);

                    if (S[p] != '?' && S[p] != c) {
                        valid = false;
                    } else if (S[p] == '?') {
                        w--;
                    }

                    S[p] = c;
                }
            }

            if (valid) {
                sum += count(w);
                sum %= MOD;
            }
        }

        return (int)sum;
    }

    private long count(int w) {
        if (w == 0) { return 1; }
        if (memo[w] > 0) { return memo[w]; }

        memo[w] = (26 * count(w - 1)) % MOD;
        return memo[w];
    }

    private int position(int len, int r, int c) {
        return (r * W + c) % len;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
