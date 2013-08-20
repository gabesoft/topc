package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 579 Division I Level One - 250
// greedy, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12523&rd=15499
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+579
public class UndoHistory {
    public int minPresses(String[] lines) {
        return solve1(lines);
        //return solve2(lines);
    }

    private int solve2(String[] lines) {
        int cost = lines[0].length() + 1;

        for (int i = 1; i < lines.length; i++) {
            int icost = 1000000000;

            for (int j = 0; j < i; j++) {
                int k = 0;
                while (k < lines[i].length() && k < lines[j].length()) {
                    if (lines[i].charAt(k) == lines[j].charAt(k)) {
                        k++;
                    } else {
                        break;
                    }
                }

                int ijcost = 2 + (lines[i].length() - k) + 1;
                if (j == i - 1 && k == lines[j].length()) {
                    ijcost -= 2;
                }

                icost = Math.min(icost, ijcost);
            }

            cost += icost;
        }

        return cost;
    }

    private int solve1(String[] lines) {
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

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
