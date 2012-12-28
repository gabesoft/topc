package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 411 Division I Level Two - 500
// geometry, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9752&rd=12183
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm411
public class HoleCakeCuts {
    public int cutTheCake(int cakeLength, int holeLength, int[] horizontalCuts, int[] verticalCuts) {
        int h[]   = get(cakeLength, horizontalCuts);
        int v[]   = get(cakeLength, verticalCuts);
        int count = 0;

        for (int i = 0; i < h.length - 1; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                boolean fh = (-holeLength <= h[i]) && (h[i + 1] <= holeLength);
                boolean fv = (-holeLength <= v[j]) && (v[j + 1] <= holeLength);

                if (fv && fh) { continue; }

                count++;

                if (fh && (v[j] < -holeLength) && (v[j + 1] > holeLength)) { count++; }
                if (fv && (h[i] < -holeLength) && (h[i + 1] > holeLength)) { count++; }
            }
        }

        return count;
    }

    int[] get(int l, int[] cuts) {
        HashSet<Integer> set    = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(-l);
        list.add(l);

        for (int i = 0; i < cuts.length; i++) {
            if (!set.contains(cuts[i])) {
                set.add(cuts[i]);
                list.add(cuts[i]);
            }
        }

        int res[] = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        Arrays.sort(res);

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
