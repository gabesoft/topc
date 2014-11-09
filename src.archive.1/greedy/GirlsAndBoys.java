package topc.greedy;

import java.util.*;
import java.io.*;

// TCO10 Qual 1 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7794&rd=14294
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'10+Qualification+Round+1
public class GirlsAndBoys {
    public int sortThem(String row) {
        char[] ch = row.toCharArray();

        int n = ch.length;
        int b = 0;

        for (int i = 0; i < n; i++) {
            if (ch[i] == 'B') {
                b++;
            }
        }

        int s = 0;
        int e = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] == 'B' && i < b) {
                s++;
            }
            if (ch[i] == 'B' && i >= (n - b)) {
                e++;
            }
        }

        int start = s >= e ? 0 : (n - b);
        int end   = s >= e ? b : n;

        int count      = 0;
        boolean change = true;

        while (change) {
            change = false;
            for (int i = 0; i < n - 1; i++) {
                if (ch[i] == ch[i + 1]) { continue; }
                if (ch[i] == 'B' && start > 0 && (i < start || i < (end - 1))) {
                    swap(ch, i, i + 1);
                    count++;
                    change = true;
                } 
                else if (ch[i + 1] == 'B' && start == 0 && (i >= end || (i + 1) > start)) {
                    swap(ch, i, i + 1);
                    count++;
                    change = true;
                }
            }
        }

        return count;
    }

    private void swap(char[] ch, int i, int j) {
        char t = ch[i];
        ch[i]  = ch[j];
        ch[j]  = t;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
