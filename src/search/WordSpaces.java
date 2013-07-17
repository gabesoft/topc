package topc.search;

import java.util.*;
import java.io.*;

// SRM 201 Division II Level Three - 1000
// simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1044&rd=5872
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm201
public class WordSpaces {
    char[] S;

    public int[] find(String sentence, String[] words) {
        S = sentence.toCharArray();

        int[] loc = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            loc[i] = find(words[i].toCharArray());
        }

        return loc;
    }

    private int find(char[] word) {
        for (int i = 0; i < S.length; i++) {
            if (S[i] != word[0]) { continue; }

            for (int d = 1; d <= S.length; d++) {
                boolean found = true;

                for (int j = 0; j < word.length; j++) {
                    int k = j * d + i;

                    if (k >= S.length || S[k] != word[j]) {
                        found = false;
                        break;
                    }
                }

                if (found) { return i; }
            }
        }

        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
