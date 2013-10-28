package topc.greedy;

import java.util.*;
import java.io.*;

// TCO11 Semifinal 1 Division I Level One - 250
// greedy, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11513&rd=14649
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class OrthogonalAnagram {
    char[] orig;
    int[][] taken;

    public String solve(String S) {
        int n       = S.length();
        int[] chars = new int[26];

        orig  = S.toCharArray();
        taken = new int[n][26];

        for (int i = 0; i < n; i++) {
            int j = S.charAt(i) - 'a';

            chars[j]++;

            for (int k = 0; k < i + 1; k++) {
                taken[k][j]++;
            }
        }

        String res = find(chars,  0);
        return res == null ? "" : res;
    }

    private String find(int[] available, int index) {
        if (index == orig.length) { return ""; }

        int places = orig.length - index;
        for (int i = 0; i < available.length; i++) {
            if (available[i] > places - taken[index][i]) {
                return null;
            }
        }

        for (int i = 0; i < available.length; i++) {
            char c = (char)(i + 'a');
            if (available[i] > 0 && orig[index] != c) {
                available[i]--;

                String next = find(available, index + 1);
                if (next != null) {
                    return c + next;
                }

                available[i]++;
            }
        }

        return null;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
