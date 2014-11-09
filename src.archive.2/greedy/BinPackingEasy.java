package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 598 Division II Level Two - 500
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12862&rd=15710
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+598
public class BinPackingEasy {
    public int minBins(int[] item) {
        Arrays.sort(item);

        int h = 0;
        int t = item.length - 1;
        int count = 0;

        while (h <= t) {
            int bin = 300;

            for (int i = t; i >= h; i--) {
                if (bin - item[i] >= 0) {
                    t = i - 1;
                    bin -= item[i];
                } else {
                    break;
                }
            }

            for (int i = h; i <= t; i++) {
                if (bin - item[i] >= 0) {
                    h = i + 1;
                    bin -= item[i];
                } else {
                    break;
                }
            }

            count++;
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
