package topc.search;

import java.util.*;
import java.io.*;

// SRM 588 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12724&rd=15700
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+588
public class KeyDungeonDiv2 {
    public int countDoors(int[] doorR, int[] doorG, int[] keys) {
        int cnt = 0;
        for (int i = 0; i < doorG.length; i++) {
            int r = Math.max(0, doorR[i] - keys[0]);
            int g = Math.max(0, doorG[i] - keys[1]);
            int w = r + g - keys[2];

            if (w <= 0) {
                cnt++;
            }
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
