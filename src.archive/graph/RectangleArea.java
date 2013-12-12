package topc.graph;

import java.util.*;
import java.io.*;

// Member SRM 505 Division I Level One - 300
// graph theory, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11400&rd=14434
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class RectangleArea {
    int[] a;

    public int minimumQueries(String[] known) {
        int n = known.length;
        int m = known[0].length();

        a = new int[n + m];
        for (int i = 0; i < n + m; i++) {
            a[i] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (known[i].charAt(j) == 'Y') {
                    join(i, j + n);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (join(i, j + n)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean join(int x, int y) {
        x = parent(x);
        y = parent(y);

        if (x == y) { return false; }

        a[x] = y;

        return true;
    }

    private int parent(int x) {
        while (x != a[x]) {
            x = a[x];
        }
        return x;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
