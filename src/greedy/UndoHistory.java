package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 579 Division I Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12523&rd=15499
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+579
public class UndoHistory {
    public int minPresses(String[] lines) {
        HashSet<String> undo = new HashSet<String>();

        int ops       = 0;
        String buffer = "";

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            int start   = 0;

            String bestMatch = getBestMatch(undo, line);
            if (line.startsWith(buffer)) {
                if (bestMatch.length() > buffer.length() + 1) {
                    ops += 2;
                    start = bestMatch.length();
                } else {
                    start = buffer.length();
                }
            } else {
                start = bestMatch.length();
                ops += 2;
            }

            int len = line.length();
            for (int j = start; j < len; j++) {
                undo.add(line.substring(0, j));
                ops++;
            }

            buffer = line;
            undo.add(buffer);
            ops++;
        }

        return ops;
    }

    private String getBestMatch(HashSet<String> undo, String line) {
        int len = line.length();
        for (int i = len; i > 0; i--) {
            String sub = line.substring(0, i);
            if (undo.contains(sub)) {
                return sub;
            }
        }
        return "";
    }
}
