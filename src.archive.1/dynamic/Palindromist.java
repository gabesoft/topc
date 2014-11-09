package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 294 Division I Level Two - 500
// dynamic programming, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6115&rd=9815
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm294
public class Palindromist {
    HashSet<String> words;
    String[] str;
    String[][] memo;

    public String palindrome(String text, String[] words) {
        this.words = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            this.words.add(words[i]);
        }

        str    = new String[2];
        str[0] = fst(text);
        str[1] = snd(text);

        int n = Math.max(str[0].length(), str[1].length());
        memo  = new String[2][n + 1];

        ArrayList<String> pali = new ArrayList<String>();
        String f1 = find(0, 0);
        String f2 = find(1, 0);

        if (f1.length() > 0) {
            pali.add(f1);
        }
        if (f2.length() > 0) {
            pali.add(f2);
        }

        if (pali.size() == 0) { return ""; }

        Collections.sort(pali);
        return pali.get(0);
    }

    String find(int si, int index) {
        String s = str[si];

        if (index == s.length()) { return ""; }
        if (memo[si][index] != null) { return memo[si][index]; }

        int len    = s.length();
        String res = "";

        for (int i = index; i < len + 1; i++) {
            String w = s.substring(index, i);
            if (words.contains(w)) {
                String next = find(si, i);
                if (next.length() > 0) {
                    res = w + " " + next;
                }
                if (i == len) {
                    res = w;
                }
                if (res.length() > 0) {
                    break;
                }
            }
        }

        memo[si][index] = res;
        return memo[si][index];
    }

    String fst(String text) {
        int n    = text.length();
        String t = text.substring(0, n - 1); 
        return t + text.charAt(n - 1) + reverse(t);
    }

    String snd(String text) {
        return text + reverse(text);
    }

    String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
