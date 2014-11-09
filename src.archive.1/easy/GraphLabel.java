package topc.easy;

import java.util.*;
import java.io.*;

// SRM 256 Division II Level Three - 950
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4690&rd=7992
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm256
public class GraphLabel {
    boolean[][] graph;
    int[] perm;
    int level;
    int best;

    public int adjacentDifference(String[] graph) {
        int n = graph.length;

        this.perm  = new int[n];
        this.level = -1;
        this.best  = 10;

        this.graph = new boolean[n][n];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                this.graph[i][j] = graph[i].charAt(j) == '1';
            }
        }

        permute(0);

        return best;
    }

    private int max(int[] nums) {
        int max = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j]) {
                    max = Math.max(max, Math.abs(nums[i] - nums[j]));
                }
            }
        }
        return max;
    }

    private void permute(int k) {
        level++;
        perm[k] = level;
        if (level == perm.length) {
            best = Math.min(best, max(perm));
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
