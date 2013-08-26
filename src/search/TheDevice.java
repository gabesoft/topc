package topc.search;

import java.util.*;
import java.io.*;

// SRM 569 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12388&rd=15489
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+569
public class TheDevice {
    public int minimumAdditional(String[] plates) {
        int n = plates[0].length();
        int m = plates.length * (plates.length - 1) / 2;

        int A[][] = new int[n][m];
        int O[][] = new int[n][m];
        int X[][] = new int[n][m];

        int p = 0;
        for (int i = 0; i < plates.length; i++) {
            for (int j = i + 1; j < plates.length; j++) {
                String p1 = plates[i];
                String p2 = plates[j];

                for (int b = 0; b < n; b++) {
                    int x = p1.charAt(b) - '0';
                    int y = p2.charAt(b) - '0';

                    A[b][p] = x & y;
                    O[b][p] = x | y;
                    X[b][p] = x ^ y;
                }

                p++;
            }
        }

        int max = 0;
        for (int b = 0; b < n; b++) {
            int curr = 0;
            curr += equal(A[b], O[b]);
            curr += equal(A[b], X[b]);
            curr += equal(O[b], X[b]);
            max = Math.max(max, curr);
        }

        if (max > 2) { return 2; }
        if (max > 0) { return 1; }
        return 0;
    }

    private int equal(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return 0;
            }
        }
        return 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
