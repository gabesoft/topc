package topc.simulation;

import java.util.*;
import java.io.*;

// Member SRM 468 Division I Level One - 250
// simulation, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10762&rd=14183
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class T9 {
    public String message(String[] part, String[] dict, String[] keystr) {
        String keys = join(keystr);
        String msg  = "";

        int[] ch = new int[26];
        for (int i = 0; i < part.length; i++) {
            for (int j = 0; j < part[i].length(); j++) {
                ch[part[i].charAt(j) - 'a'] = i + 1;
            }
        }

        int n = keys.length();
        int k = 0;
        while (k < n) {
            while (k < n && keys.charAt(k) == '0') { 
                msg += ' ';
                k   += 1;
            }

            String key = "";
            int index  = 0;

            while (k < n && keys.charAt(k) != '0' && keys.charAt(k) != '#' && keys.charAt(k) != '*') {
                key += keys.charAt(k);
                k   += 1;
            }

            while (k < n && (keys.charAt(k) == '#' || keys.charAt(k) == '*')) {
                index += (keys.charAt(k) == '#' ? 1 : 5);
                k     += 1;
            }

            msg += word(key, index, ch, dict);
        }

        return msg;
    }

    private String word(String key, int index, int[] ch, String[] dict) {
        if (key.length() == 0) { return ""; }

        ArrayList<String> words = new ArrayList<String>();

        for (int i = 0; i < dict.length; i++) {
            int n = dict[i].length();

            if (key.length() != n) { continue; }

            boolean valid = true;
            for (int j = 0; j < n; j++) {
                int c = dict[i].charAt(j) - 'a';

                if (ch[c] != key.charAt(j) - '0') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                words.add(dict[i]);
            }
        }

        Collections.sort(words);

        return words.get(index);
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
