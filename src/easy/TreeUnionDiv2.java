package topc.easy;

import java.util.*;
import java.io.*;

// SRM 581 Division II Level Three - 1000
// brute force, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12587&rd=15501
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+581
public class TreeUnionDiv2 {
    static final int INF = 1000;
    int N = 0;
    int K = 0;
    int distA[][] = null;
    int distB[][] = null;
    int P[] = null;
    int best = 0;

    public int maximumCycles(String[] tree1, String[] tree2, int K) {
        this.N = tree1.length;
        this.K = K;

        distA = new int[9][9];
        distB = new int[9][9];
        P = new int[9];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                distA[i][j] = (tree1[i].charAt(j) == 'X') ? 1 : INF;
                distB[i][j] = (tree2[i].charAt(j) == 'X') ? 1 : INF;
            }
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    distA[i][j] = Math.min(distA[i][j], distA[i][k] + distA[k][j]);
                    distB[i][j] = Math.min(distB[i][j], distB[i][k] + distB[k][j]);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            P[i] = i;
        }

        best = 0;
        perm(0);
        return best;
    }

    private int countCycles() {
        int c = 0;
        for (int x = 0; x < N; x++) {
            for (int y = x + 1; y < N; y++) {
                if (distA[x][y] + distB[P[y]][P[x]] + 2 == K) {
                    c++;
                }
            }
        }
        return c;
    }

    private void perm(int i) {
        if (i == N - 1) {
            best = Math.max(best, countCycles());
        } else {
            for (int j = i; j < N; j++) {
                swap(P, i, j);
                perm(i + 1);
                swap(P, i, j);
            }
        }
    }

    private void swap(int a[], int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
