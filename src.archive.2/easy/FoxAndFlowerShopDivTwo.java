package topc.easy;

import java.util.*;
import java.io.*;

// SRM 552 Division II Level One - 250
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12148&rd=15174
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+552
public class FoxAndFlowerShopDivTwo {
    public int theMaxFlowers(String[] flowers, int r, int c) {
        int n = flowers.length;
        int m = flowers[0].length();
        int best = 0;

        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 < m; c1++) {
                for (int r2 = r1 + 1; r2 <= n; r2++) {
                    for (int c2 = c1 + 1; c2 <= m; c2++) {
                        if (r1 <= r && r < r2 && c1 <= c && c < c2) {
                            continue;
                        }

                        int cnt = 0;

                        for (int i = r1; i < r2; i++) {
                            for (int j = c1; j < c2; j++) {
                                if (flowers[i].charAt(j) == 'F') {
                                    cnt++;
                                }
                            }
                        }

                        best = Math.max(best, cnt);
                    }
                }
            }
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
