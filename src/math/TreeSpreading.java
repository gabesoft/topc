package topc.math;

import java.util.*;
import java.io.*;

// SRM 227 Division I Level Two - 500
// dynamic programming, simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3518&rd=6516
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm227
public class TreeSpreading {
    long memo[][][][][];

    public long countArrangements(int a, int b, int c, int d) {
        memo = new long[5][a + 1][b + 1][c + 1][d + 1];

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                for (int k = 0; k < memo[i][j].length; k++) {
                    for (int l = 0; l < memo[i][j][k].length; l++) {
                        Arrays.fill(memo[i][j][k][l], -1);
                    }
                }
            }
        }

        return count('e', a, b, c, d);
    }

    private long count(char last, int a, int b, int c, int d) {
        if (a == 0 && b == 0 && c == 0 && d == 0) { return 1; }
        if (memo[last - 'a'][a][b][c][d] > -1) {
            return memo[last - 'a'][a][b][c][d];
        }

        long sum = 0;

        if (last != 'a' && a > 0) {
            sum += count('a', a - 1, b, c, d);
        }
        if (last != 'b' && b > 0) {
            sum += count('b', a, b - 1, c, d);
        }
        if (last != 'c' && c > 0) {
            sum += count('c', a, b, c - 1, d);
        }
        if (last != 'd' && d > 0) {
            sum += count('d', a, b, c, d - 1);
        }

        memo[last - 'a'][a][b][c][d] = sum;
        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
