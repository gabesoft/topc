package topc.easy;

import java.util.*;
import java.io.*;

// SRM 631 Division II Level One - 250
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13394&rd=16062
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+631
public class TaroGrid {
    public int getNumber(String[] grid) {
        int n = grid.length;
        int m = grid[0].length();

        int cnt = 0;
        for (int c = 0; c < m; c++) {
            char last = '.';
            int best = 0;
            int curr = 0;
            for (int r = 0; r < n; r++) {
                if (grid[r].charAt(c) == last) {
                    curr++;
                } else {
                    best = Math.max(best, curr);
                    curr = 1;
                }
                last = grid[r].charAt(c);
            }

            best = Math.max(best, curr);
            cnt = Math.max(cnt, best);
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
