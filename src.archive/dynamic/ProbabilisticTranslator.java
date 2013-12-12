package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 329 Division II Level Three - 1000
// dynamic programming, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6010&rd=10009
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm329
public class ProbabilisticTranslator {
    HashMap<String, Integer> map;
    int[][] word;
    int[][] freq;
    int[][] memo;
    int[] data;
    int n;
    int m;
    int k;

    public int maximumFidelity(String[] text, String[] dictionary, String[] frequencies) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();

        n    = 0;
        m    = dictionary.length;
        word = new int[m][];

        for (int i = 0; i < dictionary.length; i++) {
            String[] parts = dictionary[i].split("[:\\s]");
            word[i]       = new int[parts.length - 3];

            for (int j = 3; j < parts.length; j++) {
                if (!map1.containsKey(parts[j])) {
                    map1.put(parts[j], n++);
                }
                word[i][j - 3] = map1.get(parts[j]);
            }

            map2.put(parts[0], i);
        }

        freq = new int[n][n];
        for (int i = 0; i < frequencies.length; i++) {
            String[] parts = frequencies[i].split(" ");

            if (map1.containsKey(parts[0]) && map1.containsKey(parts[1])) {
                int w1       = map1.get(parts[0]);
                int w2       = map1.get(parts[1]);
                freq[w1][w2] = Integer.parseInt(parts[2]);
            }
        }

        String[] str = join(text).split(" ");
        k            = str.length;
        data         = new int[k];

        for (int i = 0; i < k; i++) {
            data[i] = map2.get(str[i]);
        }

        memo = new int[k][k + n];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        return fidelity(0, -1);
    }

    int fidelity(int widx, int prev) {
        if (widx == k) { return 0; }
        if (memo[widx][k + prev] > -1) { return memo[widx][k + prev]; }

        int best = 0;
        int w    = data[widx];

        for (int i = 0; i < word[w].length; i++) {
            int tr = word[w][i];
            int fr = (prev > -1) ? freq[prev][tr] : 0;
            best   = Math.max(best, fr + fidelity(widx + 1, tr));
        }

        memo[widx][k + prev] = best;
        return best;
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
