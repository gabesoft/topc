package topc.search;

import java.util.*;
import java.io.*;

// SRM 250 Division II Level Three - 1000
// search, string manipulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4589&rd=7225
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm250
public class Acronyms {
    public String acronize(String[] document) {
        String doc = join(document, " ");
        String sentences[] = doc.split("\\s\\s");

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = convert(sentences[i]);
        }

        return join(sentences, "  ");
    }

    private String convert(String sen) {
        int start = -1;
        int end   = -1;

        String words[] = sen.split("\\s");

        int n     = words.length;
        int seq[] = new int[n];
        int cnt[] = new int[n];
        int last  = -1;
        int k     = 1;

        for (int i = 1; i < n; i++) {
            char c = words[i].charAt(0);
            if (Character.isUpperCase(c)) {
                if (last == -1) {
                    seq[i] = k;
                } else if (i - last < 3) {
                    seq[i] = k;
                } else {
                    k++;
                    seq[i] = k;
                }
                last = i;

                cnt[seq[i]]++;
            }
        }

        for (int i = 1; i < n - 1; i++) {
            if (seq[i] == 0 && seq[i - 1] > 0 && seq[i - 1] == seq[i + 1]) {
                seq[i] = seq[i - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            if (seq[i] > 0 && cnt[seq[i]] > 1) {
                words[i] = convertWord(words[i], i == n - 1 || seq[i + 1] != seq[i]);
            }
        }

        String res = "";
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && seq[i] > 0 && seq[i] == seq[i + 1]) {
                res += words[i];
            } else {
                if (i < n - 1) {
                    res += words[i] + " ";
                } else {
                    res += words[i];
                }
            }
        }

        return res;
    }

    private String convertWord(String word, boolean last) {
        if (!Character.isUpperCase(word.charAt(0))) { return ""; }

        String res = "";
        int n      = word.length();

        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                res += c;
            } else if (last && i == n - 1 && !Character.isLetter(c) && c != ' ') {
                res += c;
            }
        }

        return res;
    }

    String join(String[] input, String sep) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
            if (i < input.length - 1) {
                builder.append(sep);
            }
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
