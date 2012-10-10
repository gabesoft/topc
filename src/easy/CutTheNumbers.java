package topc.easy;

import java.util.*;
import java.io.*;

// SRM 513 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11501&rd=14538
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+513
public class CutTheNumbers {
    public int maximumSum(String[] board) {
        int w = board.length;
        int h = board[0].length();
        int t = w * h;

        int res = 0;

        for (int mask = 0; mask < (1 << t); mask++) {
            int s = 0;

            for (int i = 0; i < w; i++) {
                int x = 0;
                for (int j = 0; j < h; j++) {
                    if ((mask &  (1 << (i * h + j))) == 0) {
                        s += x;
                        x = 0;
                    } else {
                        x = x * 10 + (board[i].charAt(j) - '0');
                    }
                }
                s += x;
            }

            for (int j = 0; j < h; j++) {
                int x = 0;
                for (int i = 0; i < w; i++) {
                    if ((mask & (1 <<  (i * h + j))) != 0) {
                        s += x;
                        x = 0;
                    } else {
                        x = x * 10 + (board[i].charAt(j) - '0');
                    }
                }
                s += x;
            }

            res = Math.max(res, s);
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
