package topc.math;

import java.util.*;
import java.io.*;

// SRM 502 Division I Level One - 250
// math, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11359&rd=14431
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+502
public class TheLotteryBothDivs {
    HashSet<String> seen;

    public double find(String[] goodSuffixes) {
        ArrayList<String> suf = new ArrayList<String>();

        seen = new HashSet<String>();

        int n = goodSuffixes.length;
        for (int i = 0; i < n; i++) {
            if (seen.contains(goodSuffixes[i])) { continue; }

            seen.add(goodSuffixes[i]);
            boolean add = true;
            for (int j = 0; j < n; j++) {
                if (i != j && !canAdd(goodSuffixes, i, j)) {
                    add = false;
                    break;
                }
            }
            if (add) {
                suf.add(goodSuffixes[i]);
            }
        }

        double res = 0;
        for (String s : suf) {
            res += prob(s);
        }

        return res;
    }

    private boolean canAdd(String[] suf, int i, int j) {
        return suf[i].length() == suf[j].length() || !suf[i].endsWith(suf[j]);
    }

    private double prob(String s) {
        int n = s.length();
        double p = 1;
        for (int i = 0; i < n; i++) {
            p /= 10;
        }
        return p;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
