package topc.math;

import java.util.*;
import java.io.*;

// SRM 551 Division II Level Three - 950
// advanced math, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12138&rd=15173
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+551
public class ColorfulCupcakesDivTwo {
    long MOD     = 1000000007L;
    int[] colors = new int[3];
    long[][][][][] memo;

    public int countArrangements(String cupcakes) {
        int A = 0;
        int B = 0;
        int C = 0;
        int n = cupcakes.length();

        for (int i = 0; i < n; i++) {
            switch (cupcakes.charAt(i)) {
                case 'A': A++; break;
                case 'B': B++; break;
                case 'C': C++; break;
                default: assert false: "invalid char";
            }
        }

        memo = new long[A + 1][B + 1][C + 1][3][3];

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                for (int k = 0; k < memo[0][0].length; k++) {
                    for (int l = 0; l < memo[0][0][0].length; l++) {
                        Arrays.fill(memo[i][j][k][l], -1);
                    }
                }
            }
        }

        return (int)count(A, B, C, -1, -1);
    }

    long count(int A, int B, int C, int fst, int last) {
        if (fst > -1 && last > -1 && memo[A][B][C][fst][last] > -1) { return memo[A][B][C][fst][last]; }

        colors[0] = A;
        colors[1] = B;
        colors[2] = C;

        long sum = 0;

        if (A + B + C == 1) {
            for (int i = 0; i < colors.length; i++) {
                if (i != fst && i != last) {
                    sum += colors[i];
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                if (i != last && colors[i] > 0) {
                    colors[i]--;
                    sum += count(colors[0], colors[1], colors[2], (fst == -1) ? i : fst, i); 
                    colors[i]++;
                    if (sum > MOD) {
                        sum -= MOD;
                    }
                }
            }
        }

        if (fst > -1 && last > -1) {
            memo[A][B][C][fst][last] = sum;
        }

        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
