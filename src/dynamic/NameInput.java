package topc.dynamic;

import java.util.*;
import java.io.*;

// Member SRM 461 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10747&rd=14181
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class NameInput {
    String pred;
    String name;
    int[][] memo;
    int[][][] cpos;
    char[] chars;

    public int countUpDownKeyPresses(String[] predictionSequence, String[] name) {
        this.pred = "";
        this.name = "";

        for (int i = 0; i < predictionSequence.length; i++) {
            this.pred += predictionSequence[i];
        }
        for (int i = 0; i < name.length; i++) {
            this.name += name[i];
        }

        memo = new int[this.name.length()][pred.length()];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }

        chars = new char[10 + 26 + 26];
        fillChars();

        cpos = new int[pred.length()][128][];
        fillCPos();

        return count(0, 0);
    }

    void fillCPos() {
        int plen = pred.length();
        for (int p = 0; p < plen; p++) {
            for (int k = 0; k < chars.length; k++) {
                char c = chars[k];
                if (pred.indexOf(c) == -1) { continue; }

                int j1 = -1;
                int j2 = -1;
                int v1 =  0;
                int v2 =  0;

                for (int i = p; i < p + plen; i++) {
                    int j  = i > plen - 1 ? i - plen : i;
                    int cc = pred.charAt(j);
                    if (c == cc) {
                        j1 = (j1 == -1) ? j : j1;
                        j2 = j;
                    }
                }

                cpos[p][(int)c] = new int[] { j1, j2, dist(p, j1), dist(p, j2) };
            }
        }
    }

    int dist(int p, int i) {
        if (i == -1) { return -1; }

        int plen = pred.length();
        return i < p
            ? Math.min(p - i, plen - p + i)
            : Math.min(i - p, plen - i + p);
    }

    void fillChars() {
        int idx = 0;

        for (int i = 0; i < 10; i++) {
            chars[idx++] = (char)('0' + i);
        }

        for (int i = 0; i < 26; i++) {
            chars[idx]      = (char)('A' + i);
            chars[idx + 26] = (char)('a' + i);
            idx++;
        }
    }

    int count(int n, int p) {
        if (memo[n][p] > -1) { return memo[n][p]; }

        char c   = name.charAt(n);
        int plen = pred.length();
        int best = -1;

        if (n == name.length() - 1 && n > 0 && name.charAt(n - 1) == c) {
            best = 0;
        } else if (n == name.length() - 1) {
            int[] pos = cpos[p][(int)c];

            if (pos != null) {
                if (pos[0] != -1) {
                    int v = pos[2];
                    best = best == -1 ? v : Math.min(best, v);
                }
                if (pos[1] != -1) {
                    int v = pos[3];
                    best = best == -1 ? v : Math.min(best, v);
                }
            }
        } else if (n > 0 && name.charAt(n - 1) == c || pred.charAt(p) == c) { 
            best = count(n + 1, p);
        } else {
            int j1 = -1;
            int j2 = -1;
            int v1 =  0;
            int v2 =  0;
            int[] pos = cpos[p][(int)c];
            if (pos != null) {
                j1 = pos[0];
                j2 = pos[1];
                v1 = pos[2];
                v2 = pos[3];
            }

            if (j1 != -1) {
                int next = count(n + 1, j1);
                if (next == -1) { return -1; }

                int curr = v1 + next;
                best     = best == -1 ? curr : Math.min(best, curr);
            }

            if (j2 != -1 && j2 != j1) {
                int next = count(n + 1, j2);
                if (next == -1) { return -1; }

                int curr = v2 + next;
                best     = best == -1 ? curr : Math.min(best, curr);
            }
        }

        memo[n][p] = best;
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
