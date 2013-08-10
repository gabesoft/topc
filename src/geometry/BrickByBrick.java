package topc.geometry;

import java.util.*;
import java.io.*;

// SRM 150 Division II Level Three - 1100
// geometry, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1751&rd=4555
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm150
public class BrickByBrick {
    int[][] DIR = new int[][] { new int[] { 2, 3, 0, 1 }, new int[] { 1, 0, 3, 2 } };

    int[][][] DR = new int[][][] {
        new int[][] { new int[] { 0, 0, -1, -1 }, new int[] { -1, -1, 0, 0 } },
        new int[][] { new int[] { 1, 1,  0,  0 }, new int[] {  1,  1, 0, 0 } }
    };
    int[][][] DC = new int[][][] {
        new int[][] { new int[] { 1,  0,  1,   0 }, new int[] {   1,  0,  1, 0 } },
        new int[][] { new int[] { 0, -1,  0,  -1 }, new int[] {  -1,  0, -1, 0 } }
    };

    int[][] BDR = new int[][] { new int[] { 0, 0, -1, -1 }, new int[] { 0,  0, 0,  0 } };
    int[][] BDC = new int[][] { new int[] { 0, 0,  0,  0 }, new int[] { 0, -1, 0, -1 } };

    public int timeToClear(String[] map) {
        int n = map.length + 2;
        int m = map[0].length() + 2;

        int blocks = 0;
        int[][] data = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    data[i][j] = 2;
                } else {
                    char c = map[i - 1].charAt(j - 1);
                    if (c == '#') {
                        data[i][j] = 2;
                    }
                    if (c == 'B') {
                        data[i][j] = 1;
                        blocks++;
                    }
                }
            }
        }

        int seen[][][][] = new int[2][4][n][m];

        int[] state = new int[] { 0, 0, 1, 1, 0 };
        int time    = 0;

        while (true) {
            int loc = state[0];
            int dir = state[1];
            int r   = state[2];
            int c   = state[3];

            int br = r + BDR[loc][dir];
            int bc = c + BDC[loc][dir];

            state[4] = data[br][bc] > 0 ? 1 : 0;

            if (data[br][bc] == 1) {
                data[br][bc] = 0;
                blocks--;
            }

            if (blocks == 0) {
                break;
            }

            state = nextState(state);

            if (seen[loc][dir][r][c] > 256) {
                break;
            }

            seen[loc][dir][r][c]++;
            time++;
        }

        return blocks == 0 ? time : -1;
    }

    private int[] nextState(int[] state) {
        int loc     = state[0];
        int dir     = state[1];
        int r       = state[2];
        int c       = state[3];
        int blocked = state[4];

        int next[] = new int[5];

        next[0] = (loc + 1) % 2;
        next[1] = blocked == 0 ? dir : DIR[loc][dir];
        next[2] = r + DR[loc][blocked][dir];
        next[3] = c + DC[loc][blocked][dir];

        return next;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
