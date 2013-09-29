package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 534 Division I Level One - 250
// dynamic programming, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11791&rd=14727
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+534
public class EllysCheckers {
    public String getWinner(String board) {
        int n = board.length();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (board.charAt(i) == 'o') {
                sum += (n - i - 1);
            }
        }

        return sum % 2 == 0 ? "NO" : "YES";
    }
}
