package topc.easy;

import java.util.*;
import java.io.*;

// SRM 558 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12254&rd=15180
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+558
public class SurroundingGameEasy {
    public int score(String[] cost, String[] benefit, String[] stone) {
        int n = stone.length;
        int m = stone[0].length();

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dominated(stone, i, j)) {
                    res += (benefit[i].charAt(j) - '0');
                }
                if (stone[i].charAt(j) == 'o') {
                    res -= (cost[i].charAt(j) - '0');
                }
            }
        }

        return res;
    }

    private boolean dominated(String[] stone, int row, int col) {
        if (stone[row].charAt(col) == 'o') { return true; }

        int n = stone.length;
        int m = stone[0].length();
        int dx[] = new int[] { 1, -1, 0, 0 };
        int dy[] = new int[] { 0, 0, 1, -1 };

        for (int i = 0; i < dx.length; i++) {
            int r = row + dx[i];
            int c = col + dy[i]; 

            if (0 <= r && r < n && 0 <= c && c < m && stone[r].charAt(c) == '.') {
                return false;
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
