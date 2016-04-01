package topc.greedy;

import java.util.*;

// SRM 546 Division I Level Two - 500
// brute force, greedy, simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12045&rd=14738
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+546
public class FavouriteDigits {
    public long findNext(long n, int digit1, int count1, int digit2, int count2) {
        if (digit1 > digit2) {
            int t = digit1;
            digit1 = digit2;
            digit2 = t;

            t = count1;
            count1 = count2;
            count2 = t;
        }

        char d1 = (char)('0' + digit1);
        char d2 = (char)('0' + digit2);

        String N = "" + (n - 1);
        int L = Math.max(count1 + count2, N.length());
        N = str(L - N.length(), '0') + N;

        int lc1 = Math.max(0, count1 - (d1 == '1' ? 1 : 0));
        int lc2 = Math.max(0, count2 - (d2 == '1' ? 1 : 0));

        String longer = str(1, '1') + str(L - lc1 - lc2, '0') + str(lc1, d1) + str(lc2, d2);
        String answer = "";

        for (int i = 0; i < L; i++) {
            for (char d = '9'; d > N.charAt(i); d--) {
                int c1 = Math.max(0, count1 - (d == d1 ? 1 : 0));
                int c2 = Math.max(0, count2 - (d == d2 ? 1 : 0));

                if (c1 + c2 > L - 1 - i) {
                    continue;
                }

                String curr = N.substring(0, i) + str(1, d) + str(L - i - 1 - c1 - c2, '0') + str(c1, d1) + str(c2, d2);
                if (curr.charAt(0) != '0') {
                    answer = curr;
                }
            }

            count1 -= (N.charAt(i) == d1 ? 1 : 0);
            count2 -= (N.charAt(i) == d2 ? 1 : 0);
        }

        if (answer.length() == 0) {
            answer = longer;
        }

        return Long.parseLong(answer);
    }

    private String str(int n, char c) {
        String r = "";
        for (int i = 0; i < n; i++) {
            r += c;
        }
        return r;
    }
    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
