package topc.recursion;

import java.util.*;
import java.io.*;

// SRM 228 Division II Level Three - 900
// recursion, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3516&rd=6517
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm228
public class DeadCode {
    int n;
    int T[];
    int G[][];
    int R[];

    public int deadCount(String[] code) {
        n = code.length;
        T = new int[n];
        R = new int[n];

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

        reach(0);

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

        int c = 0;
        for (int i = 0; i < n; i++) {
            if (R[i] == 0 || T[i] == 0) {
                c++;
            }
        }

        return c;
    }

    private void reach(int k) {
        if (R[k] == 1) { return; }

        R[k] = 1;
        for (int i = 0; i < n; i++) {
            if (G[k][i] == 1) {
                reach(i);
            }
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
