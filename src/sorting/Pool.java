package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 163 Division I Level Two - 500
// sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1809&rd=4620
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm163
public class Pool {
    int A[] = new int[] { 1, 0, 0, 1, 8, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
    int B[] = new int[] { 0, 1, 1, 0, 8, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1 };

    public int rackMoves(int[] triangle) {
        int n      = triangle.length;
        int data[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (triangle[i] <  8) { data[i] = 0; }
            if (triangle[i] >  8) { data[i] = 1; }
            if (triangle[i] == 8) { data[i] = 8; }
        }

        int a = swap(data.clone(), A);
        int b = swap(data.clone(), B);

        return Math.min(a, b);
    }

    private int swap(int[] x, int[] y) {
        return swap(x, y, false) + swap(x, y, true);
    }

    private int swap(int[] x, int[] y, boolean soft) {
        int count = 0;
        int n     = x.length;

        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < n; i++) {
                if (x[i] != y[i]) {
                    for (int j = i + 1; j < n; j++) {
                        if (x[j] != y[j]) {
                            if (soft || (x[i] == y[j] && x[j] == y[i])) {
                                change = true;
                                swap(x, i, j);
                                count++;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return count;
    }

    private void swap(int[] x, int i, int j) {
        int temp = x[i];
        x[i] = x[j];
        x[j] = temp;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
