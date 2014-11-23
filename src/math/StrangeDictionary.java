package topc.math;

import java.util.*;
import java.io.*;

// SRM 542 Division II Level Three - 950
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11929&rd=14734
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+542
public class StrangeDictionary {
    public double[] getExpectedPositions(String[] words) {
        int n = words.length;
        double ret[] = new double[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double diff = 0;
                double jwin = 0;

                for (int k = 0; k < words[i].length(); k++) {
                    if (words[i].charAt(k) != words[j].charAt(k)) {
                        diff++;
                        jwin += (words[i].charAt(k) < words[j].charAt(k) ? 1 : 0);
                    }
                }

                ret[i] += (diff - jwin) / diff;
                ret[j] += jwin / diff;
            }
        }

        return ret;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
