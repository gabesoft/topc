package topc.easy;

import java.util.*;
import java.io.*;

// SRM 540 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11872&rd=14732
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+540
public class RandomColoringDiv2 {
    public int getCount(int maxR, int maxG, int maxB, int startR, int startG, int startB, int d1, int d2) {
        int cnt = 0;

        for (int r = 0; r < maxR; r++) {
            for (int g = 0; g < maxG; g++) {
                for (int b = 0; b < maxB; b++) {
                    int dr = Math.abs(r - startR);
                    int dg = Math.abs(g - startG);
                    int db = Math.abs(b - startB);

                    if (dr <= d2 && dg <= d2 && db <= d2) {
                        if (dr >= d1 || dg >= d1 || db >= d1) {
                            cnt++;
                        }
                    }
                }
            }
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
