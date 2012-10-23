package topc.math;

import java.util.*;
import java.io.*;

// SRM 167 Division I Level Two - 750
// advanced math, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1614&rd=4640
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm167
public class TeamPhoto {
    public int minDiff(int[] height) {
        int n         = height.length;
        int coach     = height[0];
        int c1        = height[1];
        int c2        = height[2];
        int players[] = Arrays.copyOfRange(height, 3, n);

        Arrays.sort(players);

        int x[]  = new int[n];
        int lo   = (n - 3) / 2;
        int ro   = (n - 3) - lo;
        int best = 1001001001;

        for (int split = 0; split <= 1; split++) {
            for (int sides = 0; sides <= 1; sides++) {
                for (int lslope = 0; lslope <= 1; lslope++) {
                    for (int rslope = 0; rslope <= 1; rslope++) {
                        int l = split == 0 ? lo : ro;
                        int r = split == 0 ? ro : lo;

                        x[0]     = sides == 0 ? c1 : c2;
                        x[n - 1] = sides == 0 ? c2 : c1;

                        for (int i = 0; i < l; i++) {
                            x[i + 1] = lslope == 0 ? players[i] : players[l - 1 - i];
                        }

                        x[l + 1] = coach;

                        for (int i = 0; i < r; i++) {
                            x[i + l + 2] = rslope == 0 ? players[l + i] : players[l + r - 1 - i];
                        }

                        int curr = 0;
                        for (int i = 1; i < n; i++) {
                            curr += Math.abs(x[i] - x[i - 1]);
                        }

                        best = Math.min(best, curr);
                    }
                }
            }
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
