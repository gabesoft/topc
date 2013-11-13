package topc.math;

import java.util.*;
import java.io.*;

// SRM 499 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11327&rd=14428
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+499
public class ColorfulRabbits {
    public int getMinimum(int[] replies) {
        int counts[] = new int[1000001];

        for (int i = 0; i < replies.length; i++) {
            counts[replies[i]]++;
        }

        int count = 0;
        for (int i = 0; i < counts.length; i++) {
            int c = counts[i];
            int n = i + 1;
            if (c > 0) {
                count += ((c / n) * n);
                count += (c % n == 0 ? 0 : n);
            }
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
