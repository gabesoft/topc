package topc.easy;

import java.util.*;

// SRM 650 Division II Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13668&rd=16314
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+650
public class TaroFillingAStringDiv2 {
    public int getNumber(String S) {
        int n = S.length();

        while (n > 0 && S.charAt(0) == '?') {
            S = S.substring(1);
            n = n - 1;
        }

        while (n > 0 && S.charAt(n - 1) == '?') {
            S = S.substring(0, n - 1);
            n = n - 1;
        }

        int cnt    = 0;
        int wcards = 0;
        char last  = '.';

        for (char c : S.toCharArray()) {
            if (c != '?' && c == last && wcards == 0) {
                cnt++;
            }
            if (c != '?') {
                if (c != last && (wcards % 2) == 1 && wcards > 0) {
                    cnt++;
                }
                if (c == last && (wcards % 2) == 0 && wcards > 0) {
                    cnt++;
                }

                last   = c;
                wcards = 0;
            } else {
                wcards++;
            }
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
