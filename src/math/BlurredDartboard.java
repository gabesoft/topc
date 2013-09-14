package topc.math;

import java.util.*;
import java.io.*;

// TCO12 Round 2B Division I Level One - 300
// math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11944&rd=15094
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO+2012+Round+2b
public class BlurredDartboard {
    public int minThrows(int[] points, int P) {
        int n = points.length;

        int[] max = new int[n];
        boolean[] hidden = new boolean[n];
        int maxVisible = 0;
        int hcount = 0;

        Arrays.fill(hidden, true);
        for (int i = 0; i < n; i++) {
            maxVisible = Math.max(maxVisible, points[i]);
            if (points[i] > 0) {
                hidden[points[i] - 1] = false;
            } else {
                hcount++;
            }
        }

        if (hcount == 1) {
            for (int i = 0; i < n; i++) {
                if (hidden[i]) {
                    for (int j = 0; j < n; j++) {
                        if (points[j] == 0) {
                            points[j] = (i + 1);
                            hidden[i] = false;
                            maxVisible = Math.max(maxVisible, points[j]);
                            break;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int k = i + 1;
            int s = 0;
            for (int j = 0; j < n && k > 0; j++) {
                if (hidden[j]) {
                    s += (j + 1);
                    k--;
                }
            }
            max[i] = Math.max(s, maxVisible * (i + 1));
        }

        int start = 0;
        for (int i = 1; i < n; i++) {
            int k1 = i;
            int k2 = i + 1;

            int v1 = max[i - 1];
            int v2 = max[i];

            if (v2 * k1 > v1 * k2) {
                start = i;
            }
        }

        long r = P / max[start];
        long v = r * max[start];

        r *= (start + 1);

        if (v < P) {
            if (start == 0) {
                r += 1;
            } else {
                for (int i = 0; i < start + 1; i++) {
                    if (v + max[i] >= P) {
                        r += (i + 1);
                        break;
                    }
                }
            }
        }

        return (int)r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
