package topc.search;

import java.util.*;
import java.io.*;

// SRM 421 Division II Level Three - 1000
// simple math, simple search, iteration, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9871&rd=13512
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm421
public class FloorIndicator {
    public double averageFloor(int N, String[] indicator) {
        for (int i = 0; i < indicator.length; i++) {
            indicator[i] += '.';
        }

        char ind[][][] = new char[N][indicator.length][];
        for (int i = 0; i < N; i++) {
            char d[][] = ind[i];

            for (int j = 0; j < indicator.length; j++) {
                String s   = indicator[j];
                d[j] = new char[] { s.charAt(i * 4), s.charAt(i * 4 + 1), s.charAt(i * 4 + 2) };
            }
        }

        int possible[] = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                if (canShow(ind[i], j)) {
                    possible[i] |= (1 << j);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (Integer.bitCount(possible[i]) == 0) { return -1; }
        }

        double k = 1;

        for (int i = 0; i < N; i++) {
            k *= Integer.bitCount(possible[i]);
        }

        double avg[] = new double[N];
        for (int i = 0; i < N; i++) {
            double sum = 0;
            int mask   = possible[i];
            for (int j = 0; j < 10; j++) {
                if (((mask >> j) & 1) == 1) {
                    sum += (j * (k / Integer.bitCount(mask)));
                }
            }
            avg[i] = sum / k;
        }

        int m      = 1;
        double res = 0.0;

        for (int i = N - 1; i > -1; i--) {
            res += (avg[i] * m);
            m *= 10;
        }

        return res;
    }

    boolean canShow(char[][] ind, int digit) {
        switch (digit) {
            case 0:
                return ind[1][1] == '.' && ind[2][1] == '.' && ind[3][1] == '.';
            case 1:
                for (int i = 0; i < 5; i++) {
                    if (ind[i][0] != '.' || ind[i][1] != '.') {
                        return false;
                    }
                }
                return true;
            case 2:
                return ind[1][0] == '.' && ind[1][1] == '.' && ind[3][1] == '.' && ind[3][2] == '.';
            case 3:
                return ind[1][0] == '.' && ind[1][1] == '.' && ind[3][0] == '.' && ind[3][1] == '.';
            case 4:
                return ind[0][1] == '.' && ind[1][1] == '.' && ind[3][0] == '.' && ind[3][1] == '.' && ind[4][0] == '.' && ind[4][1] == '.';
            case 5:
                return ind[1][1] == '.' && ind[1][2] == '.' && ind[3][0] == '.' && ind[3][1] == '.';
            case 6:
                return ind[1][1] == '.' && ind[1][2] == '.' && ind[3][1] == '.';
            case 7:
                for (int i = 1; i < 5; i++) {
                    if (ind[i][0] != '.' || ind[i][1] != '.') {
                        return false;
                    }
                }
                return true;
            case 8:
                return ind[1][1] == '.' && ind[3][1] == '.';
            case 9:
                return ind[1][1] == '.' && ind[3][0] == '.' && ind[3][1] == '.';
        }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
