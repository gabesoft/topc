package topc.graph;

import java.util.*;
import java.io.*;

// SRM 228 Division I Level Three - 1000
// graph theory, recursion, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3517&rd=6517
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm228
public class Loopy {
    int n;
    int T[];
    int G[][];
    int R[];
    int C[];

    public int minLoop(String[] code) {
        n = code.length;
        T = new int[n];
        R = new int[n];
        C = new int[n];

        G = new int[n][n];
        for (int i = 0; i < n; i++) {
            String stmt = code[i];
            String parts[] = stmt.split("\\s+");

            if (stmt.equals("RETURN")) {
                T[i] = 1;
            } else {
                int k1 = Integer.parseInt(parts[1]);
                int k2 = Integer.parseInt(parts[3]);
                G[i][k1] = 1;
                G[i][k2] = 1;
            }
        }

        boolean follow[] = new boolean[n];
        Arrays.fill(follow, true);

        reach(R, follow, 0);

        boolean change = true;
        while (change) {
            change = false;

            for (int i = 0; i < n; i++) {
                if (T[i] == 1 || R[i] == 0) { continue; }

                for (int j = 0; j < n; j++) {
                    if (G[i][j] == 0 || T[j] == 0) { continue; }

                    T[i]   = 1;
                    change = true;
                }
            }
        }

        Arrays.fill(C, -1);

        int min = 1000;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (G[j][i] == 1) {
                    boolean seen[] = new boolean[n];
                    loop(j, i, seen);

                    if (seen[i] && checkEntry(seen[0] ? 0 : i, seen) && checkLoop(i, seen)) {
                        int c = 0;
                        for (int k = 0; k < n; k++) {
                            if (seen[k]) { c++; }
                        }
                        min = Math.min(min, c);
                    }
                }
            }
        }

        return min == 1000 ? 0 : min;
    }

    private boolean checkLoop(int entry, boolean[] cycle) {
        int seen[] = new int[n];
        reach(seen, cycle, entry);
        for (int i = 0; i < n; i++) {
            if (cycle[i] && seen[i] == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean checkEntry(int entry, boolean[] cycle) {
        for (int i = 0; i < n; i++) {
            if (R[i] == 0 || T[i] == 0) { continue; }

            for (int j = 0; j < n; j++) {
                if (j == entry || j == 0) { continue; }
                if (G[i][j] == 1) {
                    if (!cycle[i] && cycle[j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void loop(int a, int entry, boolean[] seen) {
        if (R[a] == 0 || R[entry] == 0) { return; }
        if (T[a] == 0 || T[entry] == 0) { return; }
        if (a == entry) { seen[entry] = true; }
        if (seen[a]) { return; }

        seen[a] = true;

        for (int i = 0; i < n; i++) {
            if (G[i][a] == 1) {
                loop(i, entry, seen);
            }
        }
    }

    private void reach(int[] R, boolean[] follow, int k) {
        if (R[k] == 1) { return; }

        R[k] = 1;
        for (int i = 0; i < n; i++) {
            if (G[k][i] == 1 && follow[i]) {
                reach(R, follow, i);
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
