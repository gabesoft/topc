package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 444 Division II Level Three - 1000
// dynamic programming, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10391&rd=13898
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+444
public class RotatingTriangles {
    public int count(String[] grid) {
        int ans = 0;
        int rc  = grid.length;
        int cc  = grid[0].length();

        char [][] G = new char[52][52];
        for (int i = 0; i < G.length; i++) {
            for (int j = 0; j < G[0].length; j++) {
                G[i][j] = (i > 0 && i <= rc && j > 0 && j <= cc) 
                    ? grid[i - 1].charAt(j - 1) 
                    : '.';
            }
        }

        for (int dir = 0; dir < 4; dir++) {
            for (int r = 1; r <= 50; r++) {
                for (int c = 1; c <= 50; c++) {
form1:
                    for (int s = 0; true; s++) {
                        if (G[r - 1][c + s] == '#') { break form1; }
                        if (G[r + s][c - 1] == '#') { break form1; }
                        for (int n = 0; n <= s; n++) {
                            if (G[r + n][c + s - n] == '.') { break form1; }
                        }
                        for (int n = 0; n <= s; n++) {
                            if (G[r + n][c + s - n] != '/') { continue form1; }
                        }
                        ans++;
                    }
form2:
                    for (int s = 0; true; s++) {
                        if (G[r + s][c - s] != '/') { break form2; }
                        if (G[r + s][c + s + 1] != '/') { break form2; }
                        for (int d = c - s + 1; d <= c + s; d++) { 
                            if (G[r + s][d] == '.') { break form2; }
                        }
                        for (int d = c - s; d <= c + s + 1; d++) {
                            if (G[r + s + 1][d] == '#') { continue form2; }
                        }
                        ans++;
                    }
                }
            }

            char [][] H = new char[52][52];
            for (int i = 0; i < 52; i++) {
                for (int j = 0; j < 52; j++) {
                    H[51 - j][i] = G[i][j];
                }
            }
            G = H;
        }

        return ans;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
