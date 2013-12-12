package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 563 Division I Level One - 300
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12331&rd=15185
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+563
public class FoxAndHandle {
    public String lexSmallestName(String S) {
        int chars[] = new int[26];
        for (int i = 0; i < S.length(); i++) {
            int c = S.charAt(i) - 'a';
            chars[c]++;
        }

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count += chars[i];
        }

        count /= 2;

        String res = "";
        int k      = 0;

        while (count > 0) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] > 0) {
                    char c = (char)(i + 'a');
                    int j  = indexOf(S, k, c);
                    if (j > -1) {
                        chars[i] -= 2;
                        if (count(S, chars, j + 1) >= count - 1) {
                            count--;
                            res += c;
                            k    = j + 1;
                            break;
                        } else {
                            chars[i] += 2;
                        }
                    }
                }
            }
        }

        return res;
    }

    private int count(String s, int[] chars, int k) {
        chars = chars.clone();

        int len = s.length();
        int res = 0;

        for (int i = k; i < len; i++) {
            char c = s.charAt(i);
            if (chars[c - 'a'] > 0) {
                chars[c - 'a'] -= 2;
                res++;
            }
        }

        return res;
    }

    private int indexOf(String s, int start, char ch) {
        int len = s.length();
        for (int i = start; i < len; i++) {
            if (s.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
