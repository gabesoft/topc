package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 346 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7684&rd=10670
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm346
public class FastPostman {
    int INF = Integer.MAX_VALUE / 4;
    int n;
    Letter[] letters;

    public int minTime(int[] address, int[] maxTime, int initialPos) {
        n       = address.length;
        letters = new Letter[n];

        boolean hasInitial = false;
        for (int i = 0; i < n; i++) {
            letters[i] = new Letter(address[i], maxTime[i]);
            if (!hasInitial && initialPos == address[i]) {
                hasInitial = true;
            }
        }

        if (!hasInitial) {
            Letter[] temp = new Letter[n + 1];
            for (int i = 0; i < n; i++) {
                temp[i] = letters[i];
            }
            temp[n] = new Letter(initialPos, INF);
            n++;
            letters = temp;
        }

        Arrays.sort(letters);

        int lo  = -1;
        int hi  = -1;

        for (int i = 0; i < n; i++) {
            if (initialPos == letters[i].dist) {
                lo  = (i > 0) ? i - 1 : -1;
                hi  = i;
                break;
            }
        }

        return time(lo, hi);
    }

    int time(int l, int r) {
        int[][][] dp = new int[2][n][n];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                Arrays.fill(dp[i][j], INF);
            }
        }

        if (l != -1) {
            if (letters[l].time >= letters[r].dist - letters[l].dist) {
                dp[0][l][r] = letters[r].dist - letters[l].dist;
                dp[1][l][r] = 2 * (letters[r].dist - letters[l].dist);
            }
        }

        if (r != -1 && r < n - 1) {
            if (letters[r + 1].time >= letters[r + 1].dist - letters[r].dist) {
                dp[0][r][r + 1] = 2 * (letters[r + 1].dist - letters[r].dist);
                dp[1][r][r + 1] = letters[r + 1].dist - letters[r].dist;
            }
        }

        for (int i = r; i > -1; i--) {
            for (int j = i + 1; j < n; j++) {
                if (letters[j].time >= dp[0][i][j - 1] + (letters[j].dist - letters[i].dist)) {
                    int x = dp[0][i][j - 1] + (letters[j].dist - letters[i].dist) + (letters[j].dist - letters[i].dist); 
                    dp[0][i][j] = Math.min(dp[0][i][j], x);
                }
                if (letters[j].time >= dp[1][i][j - 1] + (letters[j].dist - letters[j - 1].dist)) {
                    int x = dp[1][i][j - 1] + (letters[j].dist - letters[j - 1].dist) + (letters[j].dist - letters[i].dist);
                    dp[0][i][j] = Math.min(dp[0][i][j], x);
                }
                if (letters[i].time >= dp[0][i + 1][j] + (letters[i + 1].dist - letters[i].dist)) {
                    int x = dp[0][i + 1][j] + (letters[i + 1].dist - letters[i].dist); 
                    dp[0][i][j] = Math.min(dp[0][i][j], x);
                }
                if (letters[i].time >= dp[1][i + 1][j] + (letters[j].dist - letters[i].dist)) {
                    int x = dp[1][i + 1][j] + (letters[j].dist - letters[i].dist); 
                    dp[0][i][j] = Math.min(dp[0][i][j], x);
                }
                if (letters[j].time >= dp[0][i][j - 1] + (letters[j].dist - letters[i].dist)) {
                    int x = dp[0][i][j - 1] + (letters[j].dist - letters[i].dist); 
                    dp[1][i][j] = Math.min(dp[1][i][j], x);
                }
                if (letters[j].time >= dp[1][i][j - 1] + (letters[j].dist - letters[j - 1].dist)) {
                    int x = dp[1][i][j - 1] + (letters[j].dist - letters[j - 1].dist); 
                    dp[1][i][j] = Math.min(dp[1][i][j], x);
                }
                if (letters[i].time >= dp[0][i + 1][j] + (letters[i + 1].dist - letters[i].dist)) {
                    int x = dp[0][i + 1][j] + (letters[i + 1].dist - letters[i].dist) + (letters[j].dist - letters[i].dist); 
                    dp[1][i][j] = Math.min(dp[1][i][j], x);
                } 
                if (letters[i].time >= dp[1][i + 1][j] + (letters[j].dist - letters[i].dist)) {
                    int x = dp[1][i + 1][j] + (letters[j].dist - letters[i].dist) + (letters[j].dist - letters[i].dist);
                    dp[1][i][j] = Math.min(dp[1][i][j], x);
                }
            }
        }

        int res = Math.min(dp[0][0][n - 1], dp[1][0][n - 1]);
        return res == INF ? -1 : res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Letter implements Comparable<Letter> {
        public final int dist;
        public final int time;

        public Letter(int dist, int time) {
            this.dist = dist;
            this.time = time;
        }

        public int compareTo(Letter other) {
            return Integer.valueOf(dist).compareTo(other.dist);
        }
    }
}
