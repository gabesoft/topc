package topc.search;

import java.util.*;
import java.io.*;

// SRM 618 Division II Level Two - 500
// simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13147&rd=15851
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+618
public class LongWordsDiv2 {
    public String find(String word) {
        int n = word.length();

        if (n == 1) { return "Likes"; }
        if (n == 2) { return word.charAt(0) == word.charAt(1) ? "Dislikes" : "Likes"; }

        for (int i = 1; i < n; i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                return "Dislikes";
            }
        }

        return n < 4 || valid(word) ? "Likes" : "Dislikes";
    }

    private boolean valid(String s) {
        int n = s.length();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int x = j + 1; x < n; x++) {
                    if (s.charAt(i) == s.charAt(x)) {
                        for (int y = x + 1; y < n; y++) {
                            if (s.charAt(j) == s.charAt(y)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
