package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 571 Division I Level One - 250
// greedy, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12436&rd=15491
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+571
public class FoxAndMp3 {
    public String[] playList(int n) {
        int num[] = new int[11];

        num[0] = 1;
        for (int i = 1; i < num.length; i++) {
            num[i] = 10 * num[i - 1];
        }

        String sorted[] = new String[Math.min(n, 50)];
        for (int i = 0; i < sorted.length; i++) {
            String next = num[0] + "";

            for (int j = 1; j < num.length; j++) {
                if (num[j] > n) { break; }

                String s = num[j] + "";
                if (s.compareTo(next) < 0) {
                    next = s;
                }
            }

            sorted[i] = next + ".mp3";
            num[next.length() - 1]++;
        }

        return sorted;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
