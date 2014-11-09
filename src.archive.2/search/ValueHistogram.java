package topc.search;

import java.util.*;
import java.io.*;

// SRM 565 Division II Level One - 250
// simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12275&rd=15187
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+565
public class ValueHistogram {
    public String[] build(int[] values) {
        int max = 0;
        int cnt[] = new int[10];

        for (int x : values) {
            cnt[x]++;
            max = Math.max(max, cnt[x]);
        }

        char res[][] = new char[max + 1][10];
        for (char c[] : res) {
            Arrays.fill(c, '.');
        }

        for (int i = 0; i < cnt.length; i++) {
            for (int j = 0; j < cnt[i]; j++) {
                res[j][i] = 'X';
            }
        }

        String r[] = new String[max + 1];
        for (int i = 0; i < res.length; i++) {
            r[r.length - i - 1] = new String(res[i]);
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
