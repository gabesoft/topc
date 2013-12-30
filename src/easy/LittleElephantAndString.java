package topc.easy;

import java.util.*;
import java.io.*;

// SRM 597 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12854&rd=15709
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+597
public class LittleElephantAndString {
    public int getNumber(String A, String B) {
        int[] chars = new int[26];

        for (char c : A.toCharArray()) {
            chars[c - 'A']++;
        }

        for (char c : B.toCharArray()) {
            chars[c - 'A']--;
        }

        for (int x : chars) {
            if (x != 0) {
                return -1;
            }
        }

        int n = A.length();
        int j = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            while (j >= 0 && A.charAt(j) != B.charAt(i)) {
                j--;
            }
            if (j < 0) {
                return i + 1;
            }
            j--;
        }

        return 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
