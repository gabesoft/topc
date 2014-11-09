package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 558 Division I Level One - 275
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11835&rd=15180
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+558
public class Stamp {
    int INF = 1 << 30;
    int pushCost = 0;
    int n = 0;
    int a[] = null;

    public int getMinimumCost(String desiredColor, int stampCost, int pushCost) {
        this.n = desiredColor.length();
        this.a = new int[n];
        this.pushCost = pushCost;

        for (int i = 0; i < n; i++) {
            char c = desiredColor.charAt(i);
            if (c == '*') { a[i] = 7; }
            if (c == 'R') { a[i] = 1; }
            if (c == 'G') { a[i] = 2; }
            if (c == 'B') { a[i] = 4; }
        }

        int best = INF;

        for (int l = 1; l <= n; l++) {
            best = Math.min(best, stampCost * l + cost(l));
        }

        return best;
    }

    private int cost(int l) {
        int C[] = new int[n + 1];

        Arrays.fill(C, INF);
        C[0] = 0;

        for (int i = 0; i < n; i++) {
            int color = 7;
            for (int j = i; j < n; j++) {
                color &= a[j];

                if (color == 0) {
                    break;
                }

                int seg = j - i + 1;
                if (seg < l) {
                    continue;
                }

                if (C[i] != INF) {
                    C[j + 1] = Math.min(C[j + 1], C[i] + ((seg + l - 1) / l) * pushCost);
                }
            }
        }

        return C[n];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
