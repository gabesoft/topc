package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 281 Division II Level Three - 900
// dynamic programming, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5869&rd=8078
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm281
public class BinarySearchable {
    public int howMany(int[] sequence) {
        int n     = sequence.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int v      = sequence[i];
            boolean ok = true;

            for (int j = 0; j < i && ok; j++) {
                if (sequence[j] > v) {
                    ok = false;
                }
            }

            for (int j = i + 1; j < n && ok; j++) {
                if (sequence[j] < v) {
                    ok = false;
                }
            }

            if (ok) {
                count++;
            }
        }
        
        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
