package topc.search;

import java.util.*;
import java.io.*;

// SRM 398 Division II Level Three - 900
// greedy, simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8160&rd=12170
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm398
public class MatchString {
    public int placeWords(String matchString, String[] matchWords) {
        int n   = matchString.length();
        int inf = 1 << 20;
        int sum = inf;

        int lp = 0;
        for (int i = 0; i < n; i++) {
            lp = Math.max(lp, matchWords[i].length());
        }

        for (int pos = 0; pos < lp; pos++) {
            int s = 0;

            for (int i = 0; i < n; i++) {
                String word = matchWords[i];
                int lidx    = Math.min(pos, word.length() - 1);
                int j       = 0;

                for (j = lidx; j > -1; j--) {
                    if (word.charAt(j) == matchString.charAt(i)) {
                        s += (pos - j);
                        break;
                    }
                }
                if (j == -1) {
                    s = inf;
                    break;
                }
            }

            sum = Math.min(sum, s);
        }

        return sum == inf ? -1 : sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
