package topc.search;

import java.util.*;
import java.io.*;

// SRM 581 Division I Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12588&rd=15501
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+581
public class SurveillanceSystem {
    public String getContainerInfo(String containers, int[] reports, int L) {
        int n = containers.length();

        int[] counts = new int[L + 1];
        for (int i = 0; i < reports.length; i++) {
            counts[reports[i]]++;
        }

        int[] watched = new int[n - L + 1];
        for (int i = 0; i < watched.length; i++) {
            watched[i] = 0;
            for (int j = i ; j < i + L; j++) {
                watched[i] += (containers.charAt(j) == 'X') ? 1 : 0;
            }
        }

        char[] res = new char[n];
        Arrays.fill(res, '?');

        for (int i = 0; i < n; i++) {
            int[] without = new int[L + 1];
            for (int j = 0; j + L <= n; j++) {
                if (!(j <= i && i < j + L)) {
                    without[watched[j]]++;
                }
            }

            boolean canWithout = valid(without, counts);
            if (!canWithout) {
                res[i] = '+';
            } else {
                boolean canWith = false;
                for (int j = 0; j + L <= n; j++) {
                    if (j <= i && i < j + L) {
                        if (counts[watched[j]] >= 1) {
                            canWith = true;
                            break;
                        }
                    }
                }
                if (!canWith) {
                    res[i] = '-';
                }
            }
        }

        return new String(res);
    }

    private boolean valid(int[] available, int[] needed) {
        for (int i = 0; i < available.length; i++) {
            if (available[i] < needed[i]) {
                return false;
            }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
