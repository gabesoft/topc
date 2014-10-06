package topc.math;

import java.util.*;
import java.io.*;

// SRM 566 Division II Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12335&rd=15486
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+566
public class PenguinTiles {
    public int minMoves(String[] tiles) {
        int n = tiles.length;
        int m = tiles[0].length();
        int r = -1;
        int c = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tiles[i].charAt(j) == '.') {
                    r = i;
                    c = j;
                    break;
                }
            }
        }

        if (r == n - 1 && c == m - 1) {
            return 0;
        } else if (c == m - 1 || r == n - 1) {
            return 1;
        } else {
            return 2;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
