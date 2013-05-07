package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 259 Division I Level Two - 600
// dynamic programming, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4718&rd=8012
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm259
public class SuperString {
    public String goodnessSubstring(String[] superstring) {
        String str = join(superstring);
        int n      = str.length();
        int G[][]  = new int[n][n];
        int C[]    = new int[26];

        int max     = 0;
        String best = "";

        for (int i = 0; i < n; i++) {
            G[i][i] = 1;

            for (int j = i + 1; j < n; j++) {
                G[i][j] = G[i][j - 1];

                int count = count(str, i, j, j);

                if (count == 0) {
                    G[i][j]++;
                } else if (count == 1) {
                    G[i][j]--;
                }

                String s = str.substring(i, j + 1);
                if (G[i][j] > max || (G[i][j] == max && best.compareTo(s) > 0)) {
                    max  = G[i][j];
                    best = s;
                }
            }

            if (G[i][i] > max) {
                best = str.charAt(i) + "";
            }
        }

        return best;
    }

    private int count(String str, int s, int e, int k) {
        char c  = str.charAt(k);
        int cnt = 0;

        for (int i = s; i < e; i++) {
            if (str.charAt(i) == c) { 
                cnt++;
            }
            if (cnt > 1) { 
                return cnt;
            }
        }

        return cnt;
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
