package topc.easy;

import java.util.*;
import java.io.*;

// SRM 512 Division I Level One - 256
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11295&rd=14537
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+512
public class MysteriousRestaurant {
    public int maxDays(String[] prices, int budget) {
        int n = prices.length;
        int m = prices[0].length();

        int pr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = prices[i].charAt(j);
                pr[i][j] = c - '0';

                if (Character.isLetter(c)) {
                    pr[i][j] = Character.isUpperCase(c) ? (c - 'A' + 10) : (c - 'a' + 36);
                }

                if (i >= 7) {
                    pr[i][j] += pr[i - 7][j];
                }
            }
        }

        int best[] = new int[n];
        for (int i = 0; i < n; i++) {
            int min = pr[i][0];
            for (int j = 1; j < m; j++) {
                min = Math.min(pr[i][j], min);
            }
            for (int k = 0; k < 7 && i + k < n; k++) {
                best[i + k] += min;
            }
        }

        for (int i = 0; i < n; i++) {
            if (best[i] > budget) {
                return i;
            }
        }

        return n;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
