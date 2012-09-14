package topc.easy;

import java.util.*;
import java.io.*;

// SRM 545 Division II Level Three - 1000
// brute force, math, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12030&rd=14737
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+545
public class SpacetskE {
    int MOD = 1000000007;

    public int  countsets(int L, int H, int K) {
        if (K == 1) { return (L + 1) * (H + 1); }

        int[][] bc = binomialCoefficient(300, MOD);

        int sum = 0;

        for (int x0 = 0; x0 <= L; x0++) {

            for (int dx = -L; dx <= L; dx++) {

                for (int dy = 1; dy <= H; dy++) {

                    if (gcd(dx, dy) == 1) {
                        int t = 0;
                        int x = x0;
                        int y = 0;

                        while (x >= 0 && x <= L && y <= H) {
                            t++;
                            x += dx;
                            y += dy;
                        }

                        sum = (sum + bc[t][K]) % MOD;
                    }
                }
            }
        }

        return sum;

    }

    int gcd(int a, int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }

        return a;
    }

    public static int[][] binomialCoefficient(int n, int mod) {
        int[][] bc = new int[(int)n + 1][(int)n + 1];
        if (mod == 1) { return bc; }

        for (int i = 0; i < n + 1; i++) {
            bc[i][0] = 1;
            for (int j = 1; j < i + 1; j++) {
                bc[i][j] = bc[i - 1][j - 1] + bc[i - 1][j];
                bc[i][j] = (bc[i][j] >= mod) ? (bc[i][j] - mod) : bc[i][j];
            }
        }

        return bc;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
