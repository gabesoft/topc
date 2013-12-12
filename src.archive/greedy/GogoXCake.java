package topc.greedy;

import java.io.*;
import java.util.*;

// SRM 530 Division I Level One - 250
// greedy, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11274&rd=14723
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+530
public class GogoXCake {
    public String solve(String[] cake, String[] cutter) {
        char[][] CK = new char[cake.length][];
        char[][] CU = new char[cutter.length][];

        for (int i = 0; i < CK.length; i++) {
            CK[i] = cake[i].toCharArray();
        }
        for (int i = 0; i < CU.length; i++) {
            CU[i] = cutter[i].toCharArray();
        }

        int c = -1;
        for (int i = 0; i < CU[0].length; i++) {
            if (CU[0][i] == '.') {
                c = i;
                break;
            }
        }

        for (int i = 0; i < CK.length; i++) {
            for (int j = 0; j < CK[i].length; j++) {
                if (CK[i][j] == '.') {
                    if (!cut(CK, CU, i, j - c)) {
                        return "NO";
                    }
                }
            }
        }

        for (int i = 0; i < CK.length; i++) {
            for (int j = 0; j < CK[i].length; j++) {
                if (CK[i][j] == '.') {
                    return "NO";
                }
            }
        }

        return "YES";
    }

    private boolean cut(char[][] cake, char[][] cutter, int r, int c) {
        for (int i = 0; i < cutter.length; i++) {
            for (int j = 0; j < cutter[i].length; j++) {
                int nr = r + i;
                int nc = c + j;
                if (0 <= nr && nr < cake.length && 0 <= nc && nc < cake[0].length) {
                    char ck = cake[nr][nc];
                    char cu = cutter[i][j];

                    if (cu == '.' && ck == '.') {
                        cake[nr][nc] = '+';
                    } else if (cu == '.') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
