package topc.easy;

import java.util.*;
import java.io.*;

// TCO13 Round 2B Division I Level One - 250
// brute force, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12520&rd=15633
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class FruitTrees {
    public int maxDist(int apple, int kiwi, int grape) {
        int l1 = gcd(apple, kiwi);
        int l2 = gcd(grape, kiwi);
        int l3 = gcd(apple, grape);

        if (l1 == l2 && l2 == l3) { return l1 / 3; }

        return Math.min(l1, Math.min(l2, l3)) / 2;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }

        return a;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
