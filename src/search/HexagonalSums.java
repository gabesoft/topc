package topc.search;

import java.util.*;
import java.io.*;

// SRM 205 Division I Level Two - 600
// search, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2921&rd=5851
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm205
public class HexagonalSums {
    int INF = 1 << 20;
    int[] H;
    public int minLength(int N) {
        H = buildHexTable(N);
        //return sol1(N);
        return sol2(N); // faster
    }

    private int sol2(int n) {
        for (int i = 0; i < H.length; i++) {
            if (H[i] == n) { return 1; }
        }

        if (search(n, 2, 0)) { return 2; }
        if (n > 146858) { return 3; }
        if (search(n, 3, 0)) { return 3; }
        if (n > 130) { return 4; }
        if (search(n, 4, 0)) { return 4; }
        if (n > 26) { return 5; }
        if (search(n, 5, 0)) { return 5; }

        return 6;
    }

    private int sol1(int n) {
        int[] M = new int[n + 1];

        Arrays.fill(M, INF);
        for (int i = 0; i < H.length; i++) {
            int h = H[i];
            if (h <= n) {
                M[h] = 1;
            }
        }

        boolean change = true;
        while (change) {
            change = false;
            if (M[n] < INF) { break; }
            for (int i = 0; i < H.length; i++) {
                int h = H[i];
                for (int j = 0; j + h < M.length; j++) {
                    if (M[j] > 0 && (M[j + h] > M[j] + 1)) {
                        M[j + h] = M[j] + 1;
                        change = true;
                    }
                }
            }
        }

        return M[n];
    }

    private boolean search(int n, int terms, int best) {
        if (n < 0) { return false; }
        if (terms > 2) {
            for (int i = best; H[i] <= n / terms; i++) {
                if (search(n - H[i], terms - 1, i)) {
                    return true;
                }
            }
        } else {
            for (int i = 0; H[i] <= n / terms; i++) {
                if (Arrays.binarySearch(H, n - H[i]) >= 0) {
                    return true;
                }
            }
        }
        return false;
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
