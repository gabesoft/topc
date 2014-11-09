package topc.greedy;

import java.util.*;
import java.io.*;

// TCO14 Parallel Round 2B Division I Level One - 350
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13110&rd=15997
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class SwitchingGame {
    public int timeToWin(String[] states) {
        int n        = states.length;
        int m        = states[0].length();
        int time     = n;
        char[] lamps = genChars(m, '-');
        char[] chars = new char[] { '+', '-' };

        for (int level = 0; level < n; level++) {
            for (char c : chars) {
                boolean toggle = false;

                for (int lamp = 0; lamp < m; lamp++) {
                    if (states[level].charAt(lamp) == c && lamps[lamp] != c) {
                        toggle = true;
                    }
                }

                if (toggle) {
                    time++;
                    for (int lamp = 0; lamp < m; lamp++) {
                        if (next(lamp, level, states) == c) {
                            lamps[lamp] = c;
                        }
                    }
                }
            }
        }

        return time;
    }

    private char[] genChars(int length, char c) {
        char[] chars = new char[length];
        Arrays.fill(chars, c);
        return chars;
    }

    private int next(int lamp, int level, String[] states) {
        for (int i = level; i < states.length; i++) {
            if (states[i].charAt(lamp) != '?') {
                return states[i].charAt(lamp);
            }
        }

        return '?';
    }
}
