package topc.search;

import java.util.*;
import java.io.*;

// SRM 625 Division II Level Three - 950
// simple search, iteration, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11844&rd=15858
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+625
public class ConundrumReloaded {
    public static final int INF = 1000;

    public int minimumLiars(String answers) {
        int r = INF;
        int n = answers.length();
        int q = -1;

        for (int i = 0; i < n; i++) {
            if (answers.charAt(i) == '?') {
                q = i;
            }
        }

        if (q == -1) {
            for (int v = 0; v < 2; v++) {
                boolean h = (v == 0);
                boolean p = h;
                int l = 0;
                boolean consistent = false;

                for (int i = 1; i <= n; i++) {
                    boolean t = (answers.charAt(i - 1) == 'H');
                    if (!p) {
                        t = !t;
                    }
                    if (!t) {
                        l++;
                    }
                    if (i == n) {
                        consistent = (t == h);
                    }
                    p = t;
                }
                if (consistent) {
                    r = Math.min(r, l);
                }
            }
        } else {
            String curr = "";
            r = 0;
            for (int i = 0; i <= n; i++) {
                int j = (q + i) % n;
                if (answers.charAt(j) == '?') {
                    if (curr.length() > 0) {
                        r += minimumLiarsLine(curr);
                    }
                    curr = "";
                } else {
                    curr = curr + answers.charAt(j);
                }
            }
            r = Math.min(r, INF);
        }

        return r == INF ? -1 : r;
    }

    private int minimumLiarsLine(String answers) {
        int n = answers.length();
        int r = INF;

        for (int v = 0; v < 2; v++) {
            boolean h = (v == 0);
            boolean p = h;

            int l = (h ? 0 : 1);

            for (int i = 1; i <= n; i++) {
                boolean t = answers.charAt(i - 1) == 'H';
                if (!p) {
                    t = !t;
                }
                if (!t) {
                    l++;
                }
                p = t;
            }
            r = Math.min(r, l);
        }
         return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
