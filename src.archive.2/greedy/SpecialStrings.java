package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 634 Division II Level Three - 1000
// greedy, search, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13233&rd=16077
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+634
public class SpecialStrings {
    public String findNext(String current) {
        int n = current.length();
        for (int i = n - 1; i >= 0; i--) {
            if (current.charAt(i) == '0') {
                char[] s = current.toCharArray();
                for (int j = i; j < n; j++) {
                    s[j] = '1';
                }
                if (isSpecial(new String(s))) {
                    for (int j = i + 1; j < n; j++) {
                        s[j] = '0';
                        if (!isSpecial(new String(s))) {
                            s[j] = '1';
                        }
                    }
                    return new String(s);
                }
            }
        }

        return "";
    }

    private boolean isSpecial(String s) {
        int n = s.length();
        for (int i = 1; i < n; i++) {
            if (s.substring(0, i).compareTo(s.substring(i)) >= 0) {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
