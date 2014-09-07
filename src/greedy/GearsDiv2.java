package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 589 Division II Level Two - 500
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12732&rd=15701
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+589
public class GearsDiv2 {
    public int getmin(String directions) {
        return Math.min(min(directions), min(directions.substring(1) + directions.charAt(0)));
    }

    private int min(String directions) {
        int n = directions.length();
        char[] ch = directions.toCharArray();

        for (int i = 0; i < n; i++) {
            char c1 = ch[(n + (i - 1)) % n];
            char c3 = ch[(i + 1) % n];

            if (c1 == ch[i] && ch[i] == c3) {
                ch[i] = '.';
            }
        }

        for (int i = 0; i < n; i++) {
            char c1 = ch[(n + (i - 1)) % n];
            char c3 = ch[(i + 1) % n];

            if (c1 == ch[i] || ch[i] == c3) {
                ch[i] = '.';
            }
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] == '.') {
                cnt++;
            }
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
