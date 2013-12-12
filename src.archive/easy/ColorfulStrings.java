package topc.easy;

import java.util.*;
import java.io.*;

// SRM 464 Division I Level One - 250
// brute force, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10724&rd=14149
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+464
public class ColorfulStrings {
    int count;
    int index;
    String res;
    HashSet<Integer> set;

    public String getKth(int n, int k) {
        if (k > 22000) { return ""; }
        if (n == 1) { return k <= 10 ? ("" + (k - 1)) : ""; }
        if (n > 8) { return ""; }

        count = 0;
        index = k;
        res   = "";
        set   = new HashSet<Integer>();

        find("", n);

        return res;
    }

    private void find(String n, int len) {
        if (count == index) { return; }
        if (!valid(n)) { return; }
        if (n.length() == len) {
            count++;
            if (count == index) {
                res = n;
            }
            return;
        }

        for (int i = 2; i < 10; i++) {
            if (n.indexOf(i + '0') == -1) {
                find(n + i, len);
            }
        }
    }

    private boolean valid(String x) {
        int n = x.length();

        set.clear();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= (n - i); j++) {
                int prod = 1;
                for (int k = j; k < (j + i); k++) {
                    prod *= (x.charAt(k) - '0');
                }

                if (set.contains(prod)) {
                    return false;
                } else {
                    set.add(prod);
                }
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
