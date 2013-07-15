package topc.search;

import java.util.*;
import java.io.*;

// SRM 205 Division I Level Two - 600
// search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2921&rd=5851
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm205
public class HexagonalSums {
    int[] H;
    public int minLength(int N) {
        H = buildHexTable(N);

        int[] M = new int[N + 1];
        for (int i = 0; i < H.length; i++) {
            int h = H[i];
            if (h <= N) {
                M[h] = 1;
            }
        }

        boolean change = true;
        while (change) {
            change = false;

            for (int i = 0; i < H.length; i++) {
                int h = H[i];
                for (int j = 0; j + h < M.length; j++) {
                    if (M[j] > 0 && (M[j + h] == 0 || M[j + h] > M[j] + 1)) {
                        M[j + h] = M[j] + 1;
                        change = true;
                    }
                }
            }
        }

        return M[N];
    }

    private int[] buildHexTable(int n) {
        int k = 1;
        int h = 1;

        while (h < n) {
            h = hex(k++);
        }

        int t[] = new int[k];
        for (int i = 0; i < k; i++) {
            t[i] = hex(i + 1);
        }

        return t;
    }

    private int hex(int k) {
        return 2 * k * (2 * k - 1) / 2;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
