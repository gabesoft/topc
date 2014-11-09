package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 564 Division II Level One - 250
// simulation, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12325&rd=15186
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+564
public class FauxPalindromes {
    public String classifyIt(String word) {
        if (pali(word)) {
            return "PALINDROME";
        }

        String w = "";
        int k = 0;
        while (k < word.length()) {
            char c = word.charAt(k);
            k++;
            while (k < word.length() && word.charAt(k) == c) {
                k++;
            }
            w += c;
        }

        if (pali(w)) {
            return "FAUX";
        }

        return "NOT EVEN FAUX";
    }

    boolean pali(String s) {
        int n = s.length();

        if (n <= 1) { return true; }

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
