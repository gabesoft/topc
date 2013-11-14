package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 496 Division I Level One - 250
// greedy, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11306&rd=14425
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+496
public class ColoredStrokes {
    public int getLeast(String[] picture) {
        int n = picture.length;
        int m = picture[0].length();

        int[][] pic = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pic[i][j] = code(picture[i].charAt(j));
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (pic[i][j] == 2) {
                    clearRow(pic, i, j);
                    clearCol(pic, i, j);
                    count += 2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (pic[i][j] != 0) {
                    if (pic[i][j] == 1) {
                        clearRow(pic, i, j);
                        count++;
                    } else {
                        clearCol(pic, i, j);
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private void clearCol(int[][] pic, int r, int c) {
        pic[r][c] = 0;

        for (int i = r + 1; i < pic.length; i++) {
            if (pic[i][c] == 2) {
                pic[i][c] = 1;
            } else if (pic[i][c] == 3) {
                pic[i][c] = 0;
            } else {
                break;
            }
        }

        for (int i = r - 1; i > -1; i--) {
            if (pic[i][c] == 2) {
                pic[i][c] = 1;
            } else if (pic[i][c] == 3) {
                pic[i][c] = 0;
            } else {
                break;
            }
        }
    }

    private void clearRow(int[][] pic, int r, int c) {
        pic[r][c] = 0;

        for (int j = c + 1; j < pic[0].length; j++) {
            if (pic[r][j] == 2) {
                pic[r][j] = 3;
            } else if (pic[r][j] == 1) {
                pic[r][j] = 0;
            } else {
                break;
            }
        }

        for (int j = c - 1; j > -1; j--) {
            if (pic[r][j] == 2) {
                pic[r][j] = 3;
            } else if (pic[r][j] == 1) {
                pic[r][j] = 0;
            } else {
                break;
            }
        }
    }

    private int code(char c) {
        if (c == 'R') { return 1; }
        if (c == 'G') { return 2; }
        if (c == 'B') { return 3; }
        return 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
