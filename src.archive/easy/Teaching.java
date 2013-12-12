package topc.easy;

import java.util.*;
import java.io.*;

// SRM 427 Division II Level Three - 1000
// brute force, simulation, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10044&rd=13518
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm427
public class Teaching {
    char[] skip = new char[] { 'a', 'n', 't', 'i', 'c' };

    public int count(String[] words, int K) {
        if (K < 5) { return 0; }

        int n      = words.length;
        int k      = K - 5;
        int count  = 0;

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String f = format(words[i]);
            if (f.length() == 0) {
                count++;
                continue;
            }
            if (f.length() > k) {
                continue;
            }
            list.add(f);
        }

        if (list.size() == 0) { return count; }

        int p        = 0;
        char chars[] = new char[21];

        for (int i = 0; i < 26; i++) {
            char c = (char)(i + 'a');
            if (keep(c)) {
                chars[p++] = c;
            }
        }

        int best       = 0;
        char letters[] = new char[k];

        for (int i = 0; i < (1 << 21); i++) {
            if (Integer.bitCount(i) == k) {
                int m = 0;
                for (int j = 0; j < p; j++) {
                    if (((i >> j) & 1) == 1) {
                        letters[m++] = chars[j];
                    }
                }
                best = Math.max(best, countWords(list, letters));
            }
        }

        return count + best;
    }

    int countWords(List<String> list, char[] letters) {
        int count = 0;
        for (String s : list) {
            if (contains(letters, s.toCharArray())) {
                count++;
            }
        }
        return count;
    }

    boolean contains(char[] letters, char[] word) {
        if (letters.length < word.length) { return false; }

        int j = 0;
        for (int i = 0; i < letters.length; i++) {
            if (j == word.length) { return true; }
            if (letters[i] < word[j]) { continue; }
            if (letters[i] > word[j]) { return false; }
            if (letters[i] == word[j]) { j++; }
        }

        return j == word.length;
    }

    String format(String word) {
        String s = "";
        HashSet<Character> set = new HashSet<Character>();

        for (int i = 0; i < skip.length; i++) {
            set.add(skip[i]);
        }

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (set.contains(c)) { continue; }

            set.add(c);
            s += c;
        }

        char arr[] = s.toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }

    boolean keep(char c) {
        for (int i = 0; i < skip.length; i++) {
            if (c == skip[i]) { return false; }
        }
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
