package topc.easy;

import java.util.*;
import java.io.*;

// SRM 656 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13748&rd=16416
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+656
public class CorruptedMessage {
    public String reconstructMessage(String s, int k) {
        for (int i = 0; i < 26; i++) {
            char c = (char)(i + 'a');
            int cnt = 0;

            for (char x : s.toCharArray()) {
                if (c != x) {
                    cnt++;
                }
            }

            if (cnt == k) {
                return message(c, s.length());
            }
        }

        return null;
    }

    private String message(char c, int len) {
        char[] ch = new char[len];
        Arrays.fill(ch, c);
        return new String(ch);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
