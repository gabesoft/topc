package topc.search;

import java.util.*;
import java.io.*;

// SRM 332 Division II Level Three - 1000
// search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7323&rd=10012
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm332
public class Squares {
    int n;
    int m;

    public int countSquares(String[] field) {
        n = field.length;
        m = field[0].length();

        int count = 0;
        for (int x1 = 0; x1 < n; x1++) {
            for (int y1 = 0; y1 < m; y1++) {
                for (int x2 = 0; x2 < n; x2++) {
                    for (int y2 = 0; y2 < m; y2++) {
                        char c1 = field[x1].charAt(y1);
                        char c2 = field[x2].charAt(y2);
                        if ((x1 != x2 || y1 != y2) && c1 == c2) {
                            int dy = y2 - y1;
                            int dx = x2 - x1;
                            int y3 = y2 + dx;
                            int x3 = x2 - dy;
                            int y4 = y3 - dy;
                            int x4 = x3 - dx;
                            if (valid(x3, y3) && valid(x4, y4)) {
                                char c3 = field[x3].charAt(y3);
                                char c4 = field[x4].charAt(y4);
                                if (c1 == c3 && c1 == c4) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return count / 4;
    }

    private boolean valid(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < m;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
