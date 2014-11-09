package topc.graph;

import java.util.*;
import java.io.*;

// SRM 550 Division II Level Three - 1000
// graph theory, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11494&rd=15172
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+550
public class TopView {
    public String findOrder(String[] grid) {
        int n = 0;
        int w = grid.length;
        int h = grid[0].length();

        HashMap<Character, Integer> charId = new HashMap<Character, Integer>();
        char idChar[] = new char[200];

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                char ch = grid[i].charAt(j);
                if (ch != '.' && !charId.containsKey(ch)) {
                    idChar[n] = ch;
                    charId.put(ch, n++);
                }
            }
        }

        boolean before[][] = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            int minx = w - 1;
            int maxx = -1;
            int miny = h - 1;
            int maxy = -1;

            for (int x = 0; x < w; x++) {
                for (int y = 0; y < h; y++) {
                    if (grid[x].charAt(y) == idChar[i]) {
                        minx = Math.min(minx, x);
                        maxx = Math.max(maxx, x);
                        miny = Math.min(miny, y);
                        maxy = Math.max(maxy, y);
                    }
                }
            }

            for (int x = minx; x <= maxx; x++) {
                for (int y = miny; y <= maxy; y++) {
                    if (grid[x].charAt(y) == '.') {
                        return "ERROR!";
                    }
                    if (grid[x].charAt(y) != idChar[i]) {
                        before[i][charId.get(grid[x].charAt(y))] = true;
                    }
                }
            }
        }


        // topo sort
        String res = "";
        boolean[] removed = new boolean[n];

        for (int i = 0; i < n; i++) {
            char bestc = 'z' + 1;
            int bestv = -1;

            for (int j = 0; j < n; j++) {
                if (!removed[j]) {
                    boolean can = true;
                    for (int k = 0; k < n; k++) {
                        can &= (removed[k] || !before[k][j]);
                    }
                    if (can) {
                        if (bestc > idChar[j]) {
                            bestv = j;
                            bestc = idChar[j];
                        }
                        if (j < bestv && bestc == idChar[j]) {
                            bestv = j;
                        }
                    }
                }
            }

            if (bestv == -1) {
                return "ERROR!";
            }

            res += bestc;
            removed[bestv] = true;
        }

        return res;
    }
}
