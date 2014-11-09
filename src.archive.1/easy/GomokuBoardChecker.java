package topc.easy;

import java.util.*;
import java.io.*;

// SRM 261 Division II Level Three - 1000
// brute force, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4652&rd=7995
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm261
public class GomokuBoardChecker {
    int m;
    int n;
    int[][] board;

    public String check(String[] board) {
        this.n     = board.length;
        this.m     = board[0].length();
        this.board = new int[n][m];

        boolean full = true;
        for (int i = 0; i < n; i++) {
            String s = board[i];
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '.') {
                    full = false;
                    continue;
                }
                this.board[i][j] = s.charAt(j) == 'X' ? 1 : -1;
            }
        }

        int won = 0;
        int co  = 0;
        int cx  = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (this.board[i][j] != 0) {
                    cx += this.board[i][j] > 0 ? this.board[i][j] : 0;
                    co += this.board[i][j] < 0 ? this.board[i][j] : 0;

                    int w = won(i, j);
                    if (w != 0) {
                        if (won == 0) {
                            won = w;
                        } else if (won != w) {
                            return "INVALID";
                        }
                    }
                }
            }
        }

        co = -co;

        if (Math.abs(co - cx) > 1) { return "INVALID"; }

        if (won == 0) {
            return full ? "DRAW" : "IN PROGRESS";
        }

        if (won ==  1 && co > cx) { return "INVALID"; }
        if (won == -1 && cx > co) { return "INVALID"; }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (this.board[i][j] == won) {
                    this.board[i][j] = 0;

                    if (!has5InARow(won)) { 
                        return won == 1 ? "X WON" : "O WON";
                    }

                    this.board[i][j] = won;
                }
            }
        }

        return "INVALID";
    }

    private boolean has5InARow(int v) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == v && won(i, j) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private int won(int i, int j) {
        int v = board[i][j];
        if (count(i, j,  0, 1) > 4) { return v; }
        if (count(i, j,  1, 0) > 4) { return v; }
        if (count(i, j,  1, 1) > 4) { return v; }
        if (count(i, j, -1, 1) > 4) { return v; }
        return 0;
    }

    private int count(int r, int c, int dr, int dc) {
        int v = board[r][c];
        return count(v, r + dr, c + dc, dr, dc) + count(v, r, c, -dr, -dc);
    }

    private int count(int v, int r, int c, int dr, int dc) {
        if (0 <= r && r < n && 0 <= c && c < m) {
            if (board[r][c] == v) {
                return 1 + count(v, r + dr, c + dc, dr, dc);
            }
        }
        return 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
