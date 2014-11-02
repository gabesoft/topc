package topc.easy;

import java.util.*;
import java.io.*;

// SRM 631 Division II Level Three - 950
// brute force, dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12856&rd=16062
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+631
public class TaroCoins {
    public long getNumber(long N) {
        long f[][] = new long[61][4];
        for (int i = 0; i < f.length; i++) {
            for (int owed = 0; owed < f[i].length; owed++) {
                f[i][owed] = 0;

                int r = owed + (((1L << i) & N) != 0 ? 1 : 0);

                for (int u = 0; u <= 2 && u <= r; u++) {
                    int no = 2 * (r - u);
                    if (no <= 3) {
                        if (i == 0) {
                            if (no == 0) {
                                f[i][owed] += 1;
                            }
                        } else {
                            f[i][owed] += f[i - 1][no];
                        }
                    }
                }
            }
        }

        return f[60][0];
    }
}
