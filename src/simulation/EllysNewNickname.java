package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 577 Division II Level One - 250
// simulation, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12459&rd=15497
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+577
public class EllysNewNickname {
    static char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u', 'y' };

    public int getLength(String nickname) {
        int len   = nickname.length();
        int n     = len;
        char last = nickname.charAt(0);

        for (int i = 1; i < n; i++) {
            if (vowel(nickname.charAt(i))) {
                if (vowel(last)) {
                    len--;
                } else {
                    last = nickname.charAt(i);
                }
            } else {
                last = nickname.charAt(i);
            }
        }

        return len;
    }

    private boolean vowel(char c) {
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == c) {
                return true;
            }
        }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
