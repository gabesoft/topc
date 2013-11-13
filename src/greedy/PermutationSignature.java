package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 497 Division I Level One - 250
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11115&rd=14426
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+497
public class PermutationSignature {
    String sig;
    int n;

    public int[] reconstruct(String signature) {
        n = signature.length();
        sig = signature;

        int d = 1;
        int s = 0;
        while (s < n && signature.charAt(s++) == 'D') {
            d++;
        }

        int[] res = new int[n + 1];
        boolean used[] = new boolean[n + 2];

        res[0] = d;
        used[d] = true;

        find(res, used, 0);

        return res;
    }

    private void find(int[] data, boolean[] used, int k) {
        if (k == n) { return; }

        char c = sig.charAt(k);
        if (k < n - 1 && c == 'I' && sig.charAt(k + 1) == 'D') {
            int d = data[k];
            int s = k + 1;

            for (int i = 0; i < used.length; i++) {
                if (used[i] && i > d) {
                    d = i;
                }
            }

            while (s < n && sig.charAt(s++) == 'D') {
                d++;
            }

            data[k + 1] = d + 1;
            used[d + 1] = true;

            find(data, used, k + 1);
        } else {
            int a = c == 'I' ? 1 : -1;
            int d = data[k] + a;

            while (used[d]) {
                d += a;
            }

            data[k + 1] = d;
            used[d] = true;

            find(data, used, k + 1);
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
