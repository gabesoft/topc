package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 522 Division I Level One - 250
// dynamic programming, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11566&rd=14547
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+522
public class RowAndCoins {
    public String getWinner(String cells) {
        int n = cells.length();

        int b = 0;
        int a = 0;

        int k = 0;
        while (k < n) {
            if (cells.charAt(k) == 'A') {
                a++;
            } else {
                b++;
            }

            int j = k;
            while (j < n && cells.charAt(k) == cells.charAt(j)) {
                j++;
            }

            k = j;
        }

        return a >= b ? "Alice" : "Bob";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
