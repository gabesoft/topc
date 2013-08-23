package topc.stringm;

import java.util.*;
import java.io.*;

// TCO13 Round 2A Division I Level One - 300
// string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12494&rd=15594
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class TheLargestString {
    public String find(String s, String t) {
        int n = s.length();

        String sdp[] = new String[n + 1];
        String tdp[] = new String[n + 1];

        Arrays.fill(sdp, "");
        Arrays.fill(tdp, "");

        for (int i = 0; i < n; i++) {
            for (int j = i; j > -1; j--) {
                String x = sdp[j] + s.charAt(i);
                String y = tdp[j] + t.charAt(i);

                String s1 = x + y;
                String s2 = sdp[j + 1] + tdp[j + 1];

                if (s1.compareTo(s2) > 0) {
                    sdp[j + 1] = x;
                    tdp[j + 1] = y;
                }
            }
        }

        String res = "";
        for (int i = 0; i < sdp.length; i++) {
            String r = sdp[i] + tdp[i];
            if (r.compareTo(res) > 0) {
                res = r;
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
