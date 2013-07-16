package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 204 Division I Level One - 300
// greedy, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2312&rd=5850
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm204
public class Apothecary {
    int N = 14;

    public int[] balance(int W) {
        int xs[] = new int[N];
        int size = 1;
        int k    = 0;

        while (W > 0) {
            if (W % 3 == 1) {
                W -= 1;
                xs[k++] = size;
            }
            if (W % 3 == 2) {
                W += 1;
                xs[k++] = -size;
            }
            W /= 3;
            size *= 3;
        }

        int r[] = new int[k];
        for (int i = 0; i < k; i++) {
            r[i] = xs[i];
        }

        Arrays.sort(r);
        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
