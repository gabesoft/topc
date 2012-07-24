package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 349 Division II Level Three - 1000
// dynamic programming, math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4585&rd=10673
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm349
public class BoggleScore {
    long MOD = 10000000000000L;
    public long bestScore(String[] grid, String[] words) {
        long total       = 0;
        char[][] letters = new char[6][6];

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[0].length; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    letters[i][j] = '.';
                } else {
                    letters[i][j] = grid[i - 1].charAt(j - 1);
                }
            }
        }

        for (int k = 0; k < words.length; k++) {
            long[][][] count = new long[6][6][words[k].length()];
            char c = words[k].charAt(0);
            for (int i = 1; i < 4 + 1; i++) {
                for (int j = 1; j < 4 + 1; j++) {
                    if (letters[i][j] == c) {
                        count[i][j][0] = 1;
                    }
                }
            }

            for (int m = 1; m < words[k].length(); m++) {
                c = words[k].charAt(m);
                for (int i = 1; i < 4 + 1; i++) {
                    for (int j = 1; j < 4 + 1; j++) {
                        if (letters[i][j] == c) {
                            for (int x = -1; x <= 1; x++) {
                                for (int y = -1; y <= 1; y++) {
                                    if (x != 0 || y != 0) {
                                        count[i][j][m] += count[i + x][j + y][m - 1];
                                    }
                                }
                            }
                            count[i][j][m] = count[i][j][m] % MOD;
                        }
                    }
                }
            }

            long t = 0;
            for (int i = 1; i < 4 + 1; i++) {
                for (int j = 1; j < 4 + 1; j++) {
                    t += count[i][j][words[k].length() - 1];
                }
            }
            t = t % MOD;
            t = t * words[k].length() * words[k].length();
            t = t % MOD;

            total = total + t;
            total = total % MOD;
        }

        return total;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
