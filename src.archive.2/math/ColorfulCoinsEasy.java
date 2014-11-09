package topc.math;

import java.util.*;
import java.io.*;

// SRM 616 Division II Level Two - 600
// greedy, simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13094&rd=15849
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+616
public class ColorfulCoinsEasy {
    public String isPossible(int[] values) {
        int n = values.length;;
        int[] limits = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            limits[i] = values[i + 1] / values[i];
        }

        Arrays.sort(limits);

        for (int i = 0; i < n - 1; i++) {
            if (i + 1 >= limits[i]) {
                return "Impossible";
            }
        }

        return "Possible";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
