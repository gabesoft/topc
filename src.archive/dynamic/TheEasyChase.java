package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 423 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=9977&rd=13514
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm423
public class TheEasyChase {
    int UNK  = 987654321;
    int dr[] = {-1,1,0,0,-2,2,0,0};
    int dc[] = {0,0,-1,1,0,0,-2,2};

    public String winner(int n, int rowWhite, int colWhite, int rowBlack, int colBlack) {
        int[][][][][] prev = new int[n][n][n][n][2];
        int[][][][][] curr = new int[n][n][n][n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        Arrays.fill(prev[i][j][k][l], UNK);
                        Arrays.fill(curr[i][j][k][l], UNK);
                    }
                }
            }
        }

        int rem = n * n * n * n * 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                curr[i][j][i][j] = new int[] { 0, 0 };
                prev[i][j][i][j] = new int[] { 0, 0 };
                rem -= 2;
            }
        }

        int move = 0;
        while (rem > 0) {
            move++;

            // white
            for (int rw = 0; rw < n; rw++) {
                for (int cw = 0; cw < n; cw++) {
                    for (int rb = 0; rb < n; rb++) {
                        for (int cb = 0; cb < n; cb++) {

                            if (curr[rw][cw][rb][cb][0] == UNK) {
                                for (int i = 0; i < 4; i++) {
                                    int r = rw + dr[i];
                                    int c = cw + dc[i];
                                    if (0 <= r && r < n && 0 <= c && c < n) {
                                        if (prev[r][c][rb][cb][1] <= 0) {
                                            curr[rw][cw][rb][cb][0] = move;
                                            rem--;
                                            break;
                                        }
                                    }
                                }
                                if (curr[rw][cw][rb][cb][0] == UNK) {
                                    boolean all = true;
                                    for (int i = 0; i < 4; i++) {
                                        int r = rw + dr[i];
                                        int c = cw + dc[i];
                                        if (0 <= r && r < n && 0 <= c && c < n) {
                                            if (prev[r][c][rb][cb][1] == UNK) {
                                                all = false;
                                            }
                                        }
                                    }
                                    if (all) {
                                        curr[rw][cw][rb][cb][0] = -move;
                                        rem--;
                                    }
                                }
                            }
                        }

                    }
                }
            }

            // black
            for (int rw = 0; rw < n; rw++) {
                for (int cw = 0; cw < n; cw++) {
                    for (int rb = 0; rb < n; rb++) {
                        for (int cb = 0; cb < n; cb++) {

                            if (curr[rw][cw][rb][cb][1] == UNK) {
                                for (int i = 0; i < 8; i++) {
                                    int r = rb + dr[i];
                                    int c = cb + dc[i];
                                    if (0 <= r && r < n && 0 <= c && c < n) {
                                        if (prev[rw][cw][r][c][0] <= 0) {
                                            curr[rw][cw][rb][cb][1] = move;
                                            rem--;
                                            break;
                                        }
                                    }
                                }
                                if (curr[rw][cw][rb][cb][1] == UNK) {
                                    boolean all = true;
                                    for (int i = 0; i < 8; i++) {
                                        int r = rb + dr[i];
                                        int c = cb + dc[i];
                                        if (0 <= r && r < n && 0 <= c && c < n) {
                                            if (prev[rw][cw][r][c][0] == UNK) {
                                                all = false;
                                            }
                                        }
                                    }
                                    if (all) {
                                        curr[rw][cw][rb][cb][1] = -move;
                                        rem--;
                                    }
                                }
                            }
                        }

                    }
                }
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        for (int l = 0; l < n; l++) {
                            prev[i][j][k][l] = curr[i][j][k][l].clone();
                        }
                    }
                }
            }
        }

        int X1 = rowWhite - 1;
        int Y1 = colWhite - 1;
        int X2 = rowBlack - 1;
        int Y2 = colBlack - 1;

        String res = "";
        if (curr[X1][Y1][X2][Y2][0] > 0) {
            res = "WHITE " + curr[X1][Y1][X2][Y2][0];
        } else {
            res = "BLACK " + (-curr[X1][Y1][X2][Y2][0]);
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
