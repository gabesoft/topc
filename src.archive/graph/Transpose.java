package topc.graph;

import java.util.*;
import java.io.*;

// SRM 199 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2360&rd=5074
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm199
public class Transpose {
    public int numSwaps(int M, int N) {
        int st[] = new int[M * N];
        int en[] = new int[N * M];
        int k;

        k = 0;
        for (int i = 0; i < st.length; i++) {
            st[i] = k++;
        }

        k = 0;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                en[k++] = i * N + j;
            }
        }

        int swaps = 0;
        int n     = M * N;

        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < n; i++) {
                if (st[i] != en[i]) {
                    for (int j = i + 1; j < n; j++) {
                        if (st[j] == en[i]) {
                            swap(st, i, j);
                            change = true;
                            swaps++;
                        }
                    }
                }
            }
        }

        return swaps;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
