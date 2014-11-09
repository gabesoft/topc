package topc.search;

import java.util.*;
import java.io.*;

// SRM 158 Division II Level Three - 1000
// simple search, iteration, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1767&rd=4598
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm158
public class Gems {
    int n;
    int m;
    char[][] gems;

    public int numMoves(String[] board) {
        n = board.length;
        m = board[0].length();

        gems = new char[n][];
        for (int i = 0; i < n; i++) {
            gems[i] = board[i].toCharArray();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int r1 = i;
                int c1 = j;

                if (canSwap(i, j, i + 1, j)) {
                    count++;
                }
                if (canSwap(i, j, i, j + 1)) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean canSwap(int r1, int c1, int r2, int c2) {
        if (r2 == n || c2 == m) { return false; }

        swap(r1, c1, r2, c2);
        boolean result = hasTriple(r1, c1) || hasTriple(r2, c2);

        swap(r1, c1, r2, c2);
        return result;
    }

    private boolean hasTriple(int r, int c) {
        for (int i = r - 2; i < r + 1; i++) {
            if (i > -1 && i + 2 < n) {
                if (gems[i][c] == gems[i + 1][c] && gems[i + 1][c] == gems[i + 2][c]) {
                    return true;
                }
            }
        }
        for (int j = c - 2; j < c + 1; j++) {
            if (j > -1 && j + 2 < m) {
                if (gems[r][j] == gems[r][j + 1] && gems[r][j + 1] == gems[r][j + 2]) {
                    return true;
                }
            }
        }
        return false;
    }

    private void swap(int r1, int c1, int r2, int c2) {
        char temp = gems[r1][c1];
        gems[r1][c1] = gems[r2][c2];
        gems[r2][c2] = temp;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
