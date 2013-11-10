package topc.greedy;

import java.util.*;
import java.io.*;

// Member SRM 503 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11204&rd=14432
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class ToastXToast {
    public int bake(int[] undertoasted, int[] overtoasted) {
        Arrays.sort(undertoasted);
        Arrays.sort(overtoasted);

        int[] U = undertoasted;
        int[] O = overtoasted;

        if (U[0] >= O[0] || U[U.length - 1] >= O[O.length - 1]) {
            return -1;
        }
        if (U[U.length - 1] < O[0] || U.length == 1 || O.length == 1) {
            return 1;
        }

        return 2;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
