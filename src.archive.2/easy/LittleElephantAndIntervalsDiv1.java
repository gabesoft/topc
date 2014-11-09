package topc.easy;

import java.util.*;
import java.io.*;

// SRM 595 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12822&rd=15707
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+595
public class LittleElephantAndIntervalsDiv1 {
    public long getNumber(int M, int[] L, int[] R) {
        int[] layers   = new int[M];
        boolean seen[] = new boolean[L.length + 1];

        int l = 0;
        for (int i = 0; i < L.length; i++) {
            l++;
            for (int j = L[i]; j <= R[i]; j++) {
                layers[j - 1] = l;
            }
        }

        long res = 1;
        int last = -1;

        seen[0] = true;
        for (int i = 0; i < M; i++) {
            if (seen[layers[i]]) { continue; }

            seen[layers[i]] = true;
            res *= 2;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
