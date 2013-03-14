package topc.graph;

import java.util.*;
import java.io.*;

// SRM 316 Division II Level Three - 1000
// graph theory, greedy, recursion
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6538&rd=9996
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm316
public class SpreadingNews {

    public int minTime(int[] supervisors) {
        return time(supervisors, 0);
    }

    private int time(int[] tree, int p) {
        int n = 0;
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] == p) {
                n++;
            }
        }

        int ch[] = new int[n];
        int ci   = 0;

        for (int i = 0; i < tree.length; i++) {
            if (tree[i] == p) {
                ch[ci++] = time(tree, i);
            }
        }

        Arrays.sort(ch);

        int best = 0;
        int t    = 1;

        for (int i = n - 1; i > -1; i--) {
            best = Math.max(best, ch[i] + t++);
        }

        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
