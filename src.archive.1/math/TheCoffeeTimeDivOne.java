package topc.math;

import java.util.*;
import java.io.*;

// SRM 479 Division I Level One - 250
// greedy, simple math, simulation, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11028&rd=14158
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+479
public class TheCoffeeTimeDivOne {
    public long find(int n, int[] tea) {
        long tCount = tea.length;
        long cCount = n - tCount;

        long rcoffee = (long)Math.ceil(cCount / 7.0);
        long rtea    = (long)Math.ceil(tCount / 7.0);
        long serve   = n * 4L;

        Arrays.sort(tea);

        long t = 0;
        int k  = -1;

        for (int i = tea.length - 1; i > -1; i--) {
            k++;
            if (k % 7 == 0) {
                t += tea[i];
                k = 0;
            }
        }

        t *= 2L;

        k = tea.length - 1;

        long c = 0;
        long y = n;
        long x = tea[k--];

        while (x == y && y > 0) {
            y--;
            if (k > -1) {
                x = tea[k--];
            } else {
                x = -1;
            }
        }

        while (y > 0) {
            c += y;
            y -= 7;

            while (x >= y && y > 0) {
                y--;
                if (k > -1) {
                    x = tea[k--];
                } else {
                    x = -1;
                }
            }
        }

        c *= 2L;

        return (rcoffee + rtea) * 47L + serve + t + c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
