package topc.easy;

import java.util.*;
import java.io.*;

// SRM 592 Division I Level One - 300
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12758&rd=15704
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+592
public class LittleElephantAndBalls {
    public int getNumber(String S) {
        if (S.length() <= 1) { return 0; }
        if (S.length() == 2) { return 1; }
        if (S.length() == 3) { return 3; }

        int n       = S.length();
        String line = "" + S.charAt(0) + S.charAt(1);
        int all     = 1;

        for (int i = 2; i < n; i++) {

            int max   = 0;
            int index = 0;
            int m     = line.length();

            for (int j = 1; j < m; j++) {
                int pts = 0;

                pts += line.indexOf('R', j) == -1 ? 0 : 1;
                pts += line.indexOf('G', j) == -1 ? 0 : 1;
                pts += line.indexOf('B', j) == -1 ? 0 : 1;

                pts += line.substring(0, j).indexOf('R') == -1 ? 0 : 1;
                pts += line.substring(0, j).indexOf('G') == -1 ? 0 : 1;
                pts += line.substring(0, j).indexOf('B') == -1 ? 0 : 1;

                if (pts > max) {
                    max = pts;
                    index = j;
                }
            }

            line = line.substring(0, index) + S.charAt(i) + line.substring(index);
            all += max;
        }

        return all;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
