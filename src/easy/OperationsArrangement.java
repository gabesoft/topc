package topc.easy;

import java.util.*;
import java.io.*;

// SRM 285 Division II Level Three - 1000
// brute force, dynamic programming, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5952&rd=8082
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm285
public class OperationsArrangement {
    public String arrange(String sequence) {
        String res = sequence.charAt(0) + "";

        if (sequence.indexOf("0") != -1) {
            for (int i = 1; i < sequence.length(); i++) {
                res += "*" + sequence.charAt(i);
            }
        } else {
            int acc = sequence.charAt(0) - '0';
            for (int i = 1; i < sequence.length(); i++) {
                char c = sequence.charAt(i);
                int v  = c - '0';
                if (acc * v > acc + v) {
                    res += "+" + c;
                    acc = v;
                } else {
                    res += "*" + c;
                    acc *= v;
                }
            }
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
