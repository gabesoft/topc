package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 315 Division II Level Three - 900
// recursion, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6628&rd=9995
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm315
public class KidsGame {
    public int kthKid(int n, int m, int k) {
        int index   = (m - 1 + n) % n + 1;
        int beforeK = k - 1;

        int r = 1;
        while (index != beforeK + 1) {
            if (index < beforeK + 1) {
                beforeK--;
            }

            r++;
            n--;

            index = (index - 1 + m + n - 1) % n + 1;
        }

        return r;
    }
}
