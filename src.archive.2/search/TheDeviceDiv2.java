package topc.search;

import java.util.*;
import java.io.*;

// SRM 569 Division II Level Two - 500
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12399&rd=15489
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+569
public class TheDeviceDiv2 {
    public String identify(String[] plates) {
        int n = plates[0].length();

        int ONE[] = new int[n];
        int ZERO[] = new int[n];

        for (String p : plates) {
            for (int i = 0; i < n; i++) {
                char c = p.charAt(i);
                if (c == '1') {
                    ONE[i]++;
                } else {
                    ZERO[i]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            boolean a = ONE[i] > 1;
            boolean b = ONE[i] > 0 && ZERO[i] > 0;

            if (!a || !b) {
                return "NO";
            }
        }

        return "YES";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
