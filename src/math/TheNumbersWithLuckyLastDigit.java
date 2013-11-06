package topc.math;

import java.util.*;
import java.io.*;

// SRM 504.5 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11096&rd=14514
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+504.5
public class TheNumbersWithLuckyLastDigit {
    public int find(int n) {
        int c = 0;
        while (n >= 7) {
            if (n % 10 == 7 || n % 10 == 4) {
                return c + 1;
            }
            n -= 4;
            c++;
        }

        return n == 4 ? c + 1 : -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
