package topc.easy;

import java.util.*;
import java.io.*;

// SRM 506 Division II Level Three - 1000
// brute force, graph theory, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11268&rd=14435
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+506
public class SlimeXResidentSlime {
    int [] dr = {0, 0, 1, -1};
    int [] dc = {1, -1, 0, 0}; 
    int n;
    int m;
    int INF = Integer.MAX_VALUE / 4;

    public int exterminate(String[] field) {
        n = field.length;
        m = field[0].length();

        int sr = -1;
        int sc = -1;
        int s  = 0;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (field[r].charAt(c) == '$') {
                    sr = r;
                    sc = c;
                }
                if (isNumber(field, r, c)) {
                    s++;
                }
            }
        }

        if (s > 9) { return -1; }

        int toId[][] = new int[n][m];
        int ofId[][] = new int[s][];

        int k = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (isNumber(field, r, c)) {
                    toId[r][c] = k;
                    ofId[k] = new int[]{ r, c };
                    k++;
                }
            }
        }

        int start[] = findShortestPaths(field, toId, s, sr, sc);
        int best    = INF;

        for (int i = 0; i < s; i++) {
            best = Math.min(best, start[i] + findBest(field, toId, ofId, i));
        }

        return best == INF ? -1 : best;
    }

    int findBest(String[] field, int[][] toId, int[][] ofId, int start) {
        int sr    = ofId[start][0];
        int sc    = ofId[start][1];
        int depth = field[sr].charAt(sc) - '0';
        int slm[] = new int[ofId.length];
        int res   =  find(field, toId, sr, sc, depth, slm);
        return res == -1 ? INF : depth - res;
    }

    int find(String[] field, int[][] toId, int r, int c, int depth, int[] slm) {
        slm = slm.clone();

        if (isNumber(field, r, c)) {
            int id  = toId[r][c];
            slm[id] = field[r].charAt(c) - '0';
        }

        boolean allDead = true;
        for (int i = 0; i < slm.length; i++) {
            if (slm[i] == 0) {
                allDead = false;
            }
            if (slm[i] > 0) {
                slm[i]--;
            }
        }

        if (allDead) { return depth; }
        if (depth == 0) { return -1; }

        int best = -1;
        for (int i = 0; i < dr.length; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (inside(nr, nc) && field[nr].charAt(nc) != '#') {
                best = Math.max(best, find(field, toId, nr, nc, depth - 1, slm));
            }
        }

        return best;
    }

    int[] findShortestPaths(String[] field, int[][] toId, int s, int sr, int sc) {
        int paths[] = new int[s];
        int queue[] = new int[10 * n * m];
        int len[][] = new int[n][m];
        int head    = 0;
        int tail    = 0;

        queue[tail++] = sr;
        queue[tail++] = sc;

        Arrays.fill(paths, INF);

        boolean seen[][] = new boolean[n][m];
        while (head <= tail) {
            int r = queue[head];
            int c = queue[head + 1];

            if (!seen[r][c]) {
                seen[r][c] = true;

                if (isNumber(field, r, c)) {
                    int id = toId[r][c];
                    paths[id] = len[r][c];
                }

                int l = len[r][c];

                for (int i = 0; i < dr.length; i++) {
                    int nr = r + dr[i];
                    int nc = c + dc[i];
                    if (inside(nr, nc) && field[nr].charAt(nc) != '#') {
                        queue[tail++] = nr;
                        queue[tail++] = nc;
                        len[nr][nc]   = l + 1;
                    }
                }
            }

            head += 2;
        }

        return paths;
    }

    boolean inside(int r, int c) {
        return 0 <= r && r < n && 0 <= c && c < m;
    }

    boolean isNumber(String[] field, int r, int c) {
        int v = field[r].charAt(c) - '0'; 
        return 0 <= v && v <= 9;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
