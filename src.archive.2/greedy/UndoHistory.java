package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 579 Division I Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12523&rd=15499
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+579
public class UndoHistory {
    public int minPresses(String[] lines) {
        int cnt   = lines[0].length() + 1;
        int n     = lines.length;
        int pre[] = new int[n];

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                pre[i] = Math.max(pre[i], prefix(lines[i], lines[j]));
            }
        }

        String buf = lines[0];
        for (int i = 1; i < n; i++) {
            String s = lines[i];

            if (!s.startsWith(buf)) {
                cnt += (s.length() - pre[i] + 2);
            } else {
                cnt += Math.min(s.length() - pre[i] + 2, s.length() - buf.length());
            }

            cnt += 1;
            buf = s;
        }

        return cnt;
    }

    private int prefix(String a, String b) {
        int p = 0;
        int k = 0;

        while (k < a.length() && k < b.length()) {
            if (a.charAt(k) == b.charAt(k)) {
                p++;
                k++;
            } else {
                break;
            }
        }

        return p;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
