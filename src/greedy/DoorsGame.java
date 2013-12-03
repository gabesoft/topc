package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 470 Division I Level One - 250
// greedy, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10915&rd=14153
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+470
public class DoorsGame {
    public int determineOutcome(String doors, int trophy) {
        String jdoors = "";
        String bdoors = "";
        int jcnt      = 0;
        int bcnt      = 0;

        for (int i = 0; i < doors.length(); i++) {
            char c   = doors.charAt(i);
            String s = i < trophy ? jdoors : bdoors;

            if (s.indexOf(c) == -1) {
                s += c;
            }
            if (i < trophy) {
                jcnt   += (s.length() - jdoors.length());
                jdoors  = s;
            } else {
                bcnt   += (s.length() - bdoors.length());
                bdoors = s;
            }
        }

        int common = charsInCommon(jdoors, bdoors);
        if (common == 0 && jcnt <= bcnt) {
            return 1 + (jcnt - 1) * 2;
        }
        if (common == 0 && jcnt > bcnt) {
            return -(bcnt * 2);
        }
        if (bcnt - jcnt >= common) {
            return 1 + (jcnt - 1) * 2;
        }
        if (jcnt - bcnt > common) {
            return -(bcnt * 2);
        }

        return 0;
    }

    private int charsInCommon(String s1, String s2) {
        String a = (s1.length() < s2.length()) ? s1 : s2;
        String b = (s1.length() < s2.length()) ? s2 : s1;

        int cnt = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (b.indexOf(c) != -1) {
                cnt++;
            }
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
