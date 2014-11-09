package topc.easy;

import java.util.*;
import java.io.*;

// SRM 600 Division II Level Two - 600
// brute force, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12890&rd=15712
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+600
public class ORSolitaireDiv2 {
    public int getMinimum(int[] numbers, int goal) {
        String G   = Integer.toBinaryString(goal);
        int[] have = new int[G.length()];

        for (int i = 0; i < numbers.length; i++) {
            if ((goal | numbers[i]) != goal) { continue; }

            String s = Integer.toBinaryString(numbers[i]);
            int k = s.length();

            for (int j = k - 1; j > -1; j--) {
                if (s.charAt(j) == '1') {
                    have[k - j - 1]++;
                }
            }
        }

        int best = numbers.length;

        for (int i = have.length - 1; i > -1; i--) {
            if (G.charAt(i) == '1') {
                best = Math.min(best, have[have.length - i - 1]);
            }
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
