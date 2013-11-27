package topc.math;

import java.util.*;
import java.io.*;

// SRM 481 Division I Level One - 250
// simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11004&rd=14234
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+481
public class ChickenOracle {
    public String theTruth(int n, int eggCount, int lieCount, int liarCount) {
        boolean egg     = check(n, eggCount, lieCount, liarCount);
        boolean chicken = check(n, n - eggCount, lieCount, liarCount);

        if (egg && chicken) { return "Ambiguous"; }
        if (egg) { return "The egg"; }
        if (chicken) { return "The chicken"; }

        return "The oracle is a lie";
    }

    private boolean check(int n, int x, int lieCount, int liarCount) {
        for (int y = 0; y <= lieCount && y <= liarCount; y++) {
            int a = lieCount - y;
            int b = liarCount - y;
            int c = n - a - b - y;

            if (a + b == n - x && c + y == x && c >= 0) {
                return true;
            }
        }

        return false;
    }
}
