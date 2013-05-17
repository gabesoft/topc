package topc.easy;

import java.util.*;
import java.io.*;

// SRM 246 Division I Level Two - 500
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4472&rd=7221
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm246
public class CalcButton {
    public String getDigits(String[] sequence) {
        String seq = join(sequence);
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        int n       = seq.length();
        int bestc   = n;
        String best = null;

        for (int i = 0; i < n - 2; i++) {
            String sub = seq.substring(i, i + 3);

            if (!map.containsKey(sub)) {
                map.put(sub, count(seq, sub, 0));
            } else {
                continue;
            }

            if (map.get(sub) < bestc) {
                bestc = map.get(sub);
                best  = sub;
            } else if (map.get(sub) == bestc && sub.compareTo(best) < 0) {
                best = sub;
            }
        }

        return best == null ? "000" : best;
    }

    private int count(String seq, String pat, int start) {
        int n = seq.length();

        if (start > n - 3) { return n - start; }

        for (int i = 0; i < 3; i++) {
            if (pat.charAt(i) != seq.charAt(i + start)) {
                return 1 + count(seq, pat, start + 1);
            }
        }

        return 1 + count(seq, pat, start + 3);
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
