package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 532 Division I Level One - 300
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11754&rd=14725
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+532
public class DengklekMakingChains {
    public int maxBeauty(String[] chains) {
        int n      = chains.length;
        int single = 0;
        int max    = 0;
        int maxl   = 0;
        int maxr   = 0;
        int optl[] = new int[n];
        int optr[] = new int[n];
        int o      = 0;

        for (int i = 0; i < n; i++) {
            String chain = chains[i];
            if (chain.charAt(0) == '.' && chain.charAt(2) == '.') {
                single = Math.max(single, value(chain));
            } else if (chain.charAt(0) == '.') {
                maxl = Math.max(maxl, value(chain));
            } else if (chain.charAt(2) == '.') {
                maxr = Math.max(maxr, value(chain));
            } else if (chain.charAt(1) == '.') {
                optl[o] = chain.charAt(2) - '0';
                optr[o] = chain.charAt(0) - '0';
                o++;
            } else {
                max += value(chain);
            }
        }

        int a = single;
        int b = maxl + max + maxr;

        for (int i = 0; i < o; i++) {
            b = Math.max(b, optl[i] + max + maxr);
            b = Math.max(b, maxl + max + optr[i]);

            for (int j = 0; j < o; j++) {
                if (i != j) {
                    b = Math.max(b, optl[i] + max + optr[j]);
                }
            }
        }

        return Math.max(a, b);
    }

    private int value(String chain) {
        int d1 = chain.charAt(0) == '.' ? 0 : chain.charAt(0) - '0';
        int d2 = chain.charAt(1) == '.' ? 0 : chain.charAt(1) - '0';
        int d3 = chain.charAt(2) == '.' ? 0 : chain.charAt(2) - '0';
        return d1 + d2 + d3;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
