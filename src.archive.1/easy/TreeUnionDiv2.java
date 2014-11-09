package topc.easy;

import java.util.*;
import java.io.*;

// SRM 581 Division II Level Three - 1000
// brute force, graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12587&rd=15501
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+581
public class TreeUnionDiv2 {
    int[] perm;
    int n;
    int level;
    int best;
    int K;
    int distA[][];
    int distB[][];

    public int maximumCycles(String[] tree1, String[] tree2, int K) {
        this.n     = tree1.length;
        this.level = -1;
        this.best  = 0;
        this.perm  = new int[n];
        this.K     = K;

        this.distA = new int[n][n];
        this.distB = new int[n][n];

        int INF = 1000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                distA[i][j] = tree1[i].charAt(j) == 'X' ? 1 : INF;
                distB[i][j] = tree2[i].charAt(j) == 'X' ? 1 : INF;
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    distA[i][j] = Math.min(distA[i][j], distA[i][k] + distA[k][j]);
                    distB[i][j] = Math.min(distB[i][j], distB[i][k] + distB[k][j]);
                }
            }
        }

        permute(0);

        return best;
    }

    private int count(int[] perm) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (distA[i][j] + distB[perm[j] - 1][perm[i] - 1] + 2 == K) {
                    c++;
                }
            }
        }
        return c;
    }

    private void permute(int k) {
        level++;
        perm[k] = level;
        if (level == perm.length) {
            best = Math.max(best, count(perm));
        } else {
            for (int i = 0; i < perm.length; i++) {
                if (perm[i] == 0) {
                    permute(i);
                }
            }
        }
        level--;
        perm[k] = 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
