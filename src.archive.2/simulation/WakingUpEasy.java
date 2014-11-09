package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 616 Division II Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13125&rd=15849
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+616
public class WakingUpEasy {
    public int countAlarms(int[] volume, int S) {
        int count = 0;
        int n = volume.length;
        int k = 0;
        while (S > 0) {
            int v = volume[k];
            k = (k + 1) % n;
            S -= v;
            count++;
        }
        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
