package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 599 Division II Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12869&rd=15711
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+599
public class MiniatureDachshund {
    public int maxMikan(int[] mikan, int weight) {
        Arrays.sort(mikan);

        for (int i = 0; i < mikan.length; i++) {
            if (weight + mikan[i] > 5000) { return i; }
            if (i == mikan.length - 1) { return i + 1; }
            weight += mikan[i];
        }

        return 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
