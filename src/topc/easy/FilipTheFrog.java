package topc.easy;

import java.util.*;

// SRM 659 Division II Level One - 250
// brute force, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13779&rd=16462
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+659
public class FilipTheFrog {
    public int countReachableIslands(int[] positions, int L) {
        int n   = positions.length;
        int q[] = new int[n * n * 2];
        int h   = 0;
        int t   = 0;
        int cnt = 0;

        q[h++] = 0;

        boolean seen[] = new boolean[n];
        while (h >= t) {
            int top = q[t++];

            if (seen[top]) { continue; }

            cnt++;
            seen[top] = true;
            for (int i = 0; i < n; i++) {
                if (!seen[i] && Math.abs(positions[i] - positions[top]) <= L) {
                    q[h++] = i;
                }
            }
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
