package topc.easy;

import java.util.*;
import java.io.*;

// SRM 592 Division I Level One - 300
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12758&rd=15704
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+592
public class LittleElephantAndBalls {
    public int getNumber(String S) {
        HashSet<Character> left = new HashSet<Character>();
        HashSet<Character> right = new HashSet<Character>();
        char[] chars = S.toCharArray();

        int count = 0;
        for (char c : chars) {
            count += left.size();
            count += right.size();
            (left.contains(c) ? right : left).add(c);
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
