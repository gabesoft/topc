package topc.easy;

import java.util.*;
import java.io.*;

// SRM 619 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13112&rd=15852
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+619
public class GoodCompanyDivTwo {
    public int countGood(int[] superior, int[] workType) {
        int n     = workType.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean diverse = true;
            HashSet<Integer> types = new HashSet<Integer>();
            types.add(workType[i]);

            for (int j = i + 1; j < n; j++) {
                if (superior[j] == i) {
                    if (types.contains(workType[j])) {
                        diverse = false;
                        break;
                    }
                    types.add(workType[j]);
                }
            }

            if (diverse) {
                count++;
            }
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
