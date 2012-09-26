package topc.graph;

import java.util.*;
import java.io.*;

// SRM 524 Division II Level Three - 1000
// graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11629&rd=14549
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+524
public class MultiplesWithLimit {
    public String minMultiples(int N, int[] forbiddenDigits) {
        String D       = "0123456789";
        String best[]  = new String[N];
        int len[]      = new int[N];
        boolean skip[] = new boolean[10];

        Arrays.fill(best, "");
        for (int i = 0; i < forbiddenDigits.length; i++) {
            skip[forbiddenDigits[i]] = true;
        }

        int queue[] = new int[N + 1];
        int head    = 0;
        int tail    = 0;

        queue[0] = 0;
        len[0]   = 0;

        while (head <= tail) {
            int top = queue[head];
            for (int i = 0; i < 10; i++) {
                if (!skip[i]) {
                    if (top > 0 || i > 0) {
                        int next = (10 * top + i) % N;
                        String str = best[top] + D.charAt(i);
                        if (best[next] == "") {
                            best[next] = str;
                            len[next]  = len[top] + 1;

                            if (best[next].length() > 10) {
                                int l = best[next].length();
                                best[next] = best[next].substring(0, 5) + best[next].substring(l - 5, l);
                            }

                            tail++;
                            queue[tail] = next;
                        }
                    }
                }
            }
            head++;
        }

        if (best[0] == "") { return "IMPOSSIBLE"; }

        int l = best[0].length();
        String ans = "";

        if (l >= 9) {
            for (int i = 0; i < 3; i++) {
                ans += best[0].charAt(i);
            }
            ans += "...";
            for (int i = l - 3; i < l; i++) {
                ans += best[0].charAt(i);
            }
            ans += "(";
            ans += String.valueOf(len[0]);
            ans += " digits)";
        } else {
            ans = best[0];
        }

        return ans;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
