package topc.easy;

import java.util.*;
import java.io.*;

// SRM 582 Division II Level Three - 1000
// brute force, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12581&rd=15502
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+582
public class ColorTheCells {
    int[] time;
    int[] done;
    int best;
    int n;

    public int minimalTime(int[] dryingTime) {
        time = dryingTime;
        n    = time.length;
        done = new int[n];
        best = 1 << 25;

        Arrays.fill(done, -1);
        dfs(0, 0, 0);
        return best;
    }

    private void dfs(int t, int p, int count) {
        if (count == n) {
            best = Math.min(best, t);
        }

        for (int i = 0; i < n; i++) {
            if (done[i] == -1) {
                for (int k = i - 1; k <= i + 1; k += 2) {
                    if (k >= n || k < 0) { continue; }

                    int nt  = t;
                    int cur = p;

                    while (cur != k) {
                        cur -= (cur > k) ? 1 : -1;
                        nt++;
                        nt = Math.max(nt, done[cur]);
                    }

                    nt++;
                    done[i] = nt + time[i] + 1;
                    dfs(nt, k, count + 1);
                    done[i] = -1;
                }
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
