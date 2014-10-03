package topc.easy;

import java.util.*;
import java.io.*;

// SRM 571 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12438&rd=15491
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+571
public class FoxAndGame {
    public int countStars(String[] result) {
        int cnt = 0;
        for (String s : result) {
            for (char c : s.toCharArray()) {
                if (c == 'o') {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
