package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 654 Division I Level One - 250
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13694&rd=16318
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+654
public class SquareScores {
    public double calcexpectation(int[] pp, String s) {
        int n = s.length();
        double res = 0.0;
        double p[] = new double[26];

        for (int i = 0; i < pp.length; i++) {
            p[i] = pp[i] / 100.0;
        }

        for (int i = 0; i < n; i++) {
            char ch = '?';
            boolean wrong = false;
            int q = 0;

            for (int j = i; (j < n) && !wrong; j++) {
                char c = s.charAt(j);
                if (c != '?') {
                    if (ch == '?') {
                        ch = c;
                    } else if (ch != c) {
                        wrong = true;
                    }
                } else {
                    q++;
                }

                if (!wrong) {
                    if (ch == '?') {
                        for (int k = 0; k < p.length; k++) {
                            res += Math.pow(p[k], q);
                        }
                    } else {
                        res += Math.pow(p[ch - 'a'], q);
                    }
                }
            }

        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
