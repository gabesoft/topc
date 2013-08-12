package topc.graph;

import java.util.*;
import java.io.*;

// SRM 587 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12699&rd=15699
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+587
public class ThreeColorabilityEasy {
    int W;
    int H;
    int dr[] = new int[] { 0, 0, 1, -1 };
    int dc[] = new int[] { 1, -1, 0, 0 };
    String[] cells;

    public String isColorable(String[] cells) {
        H = cells.length + 1;
        W = cells[0].length() + 1;

        this.cells = cells;

        int[][] graph = new int[H * W][9];
        for (int i = 0; i < H * W; i++) {
            for (int j = 0; j < H * W; j++) {
                if (connected(i, j)) {
                    graph[i][++graph[i][0]] = j;
                }
            }
        }

        int[][] triangles = new int[2 * (H - 1) * (W - 1)][3];
        int k = 0;
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length(); j++) {
                if (cells[i].charAt(j) == 'N') {
                    triangles[k][0] = vertexIndex(i, j);
                    triangles[k][1] = vertexIndex(i, j + 1);
                    triangles[k][2] = vertexIndex(i + 1, j + 1);
                    k++;

                    triangles[k][0] = vertexIndex(i, j);
                    triangles[k][1] = vertexIndex(i + 1, j);
                    triangles[k][2] = vertexIndex(i + 1, j + 1);
                    k++;
                } else {
                    triangles[k][0] = vertexIndex(i, j);
                    triangles[k][1] = vertexIndex(i, j + 1);
                    triangles[k][2] = vertexIndex(i + 1, j);
                    k++;

                    triangles[k][0] = vertexIndex(i, j + 1);
                    triangles[k][1] = vertexIndex(i + 1, j + 1);
                    triangles[k][2] = vertexIndex(i + 1, j);
                    k++;
                }
            }
        }

        int[] color = new int[H * W];
        for (int i = 0; i < triangles.length; i++) {
            int a = triangles[i][0];
            int b = triangles[i][1];
            int c = triangles[i][2];

            boolean found = false;
            for (int c1 = 1; c1 < 4 && !found; c1++) {
                for (int c2 = 1; c2 < 4 && !found; c2++) {
                    if (c1 == c2) { continue; }

                    for (int c3 = 1; c3 < 4 && !found; c3++) {
                        if (c1 == c3 || c2 == c3) { continue; }

                        if (canAssign(a, b, c, c1, c2, c3, graph, color)) {
                            color[a] = color[a] == 0 ? c1 : color[a];
                            color[b] = color[b] == 0 ? c2 : color[b];
                            color[c] = color[c] == 0 ? c3 : color[c];
                            found = true;
                        }
                    }
                }
            }

            if (!found) { return "No"; }
        }

        return "Yes";
    }

    private boolean canAssign(int i, int j, int k, int c1, int c2, int c3, int[][] graph, int[] color) {
        c1 = color[i] > 0 ? color[i] : c1;
        c2 = color[j] > 0 ? color[j] : c2;
        c3 = color[k] > 0 ? color[k] : c3;

        return valid(c1, color, graph[i]) 
            && valid(c2, color, graph[j]) 
            && valid(c3, color, graph[k]);
    }

    private boolean valid(int c, int[] color, int[] neighbors) {
        for (int i = 1; i < neighbors[0] + 1; i++) {
            if (color[neighbors[i]] == c) {
                return false;
            }
        }
        return true;
    }

    private int vertexIndex(int r, int c) {
        return r * W + c;
    }

    private boolean connected(int i, int j) {
        int x = Math.min(i, j);
        int y = Math.max(i, j);

        int r1 = x / W;
        int c1 = x % W;
        int r2 = y / W;
        int c2 = y % W;

        for (int k = 0; k < dr.length; k++) {
            if (r2 == r1 + dr[k] && c2 == c1 + dc[k]) {
                return true;
            }
        }

        if (r1 + 1 == r2 && c1 + 1 == c2) {
            return cells[r1].charAt(c1) == 'N';
        }
        if (r1 + 1 == r2 && c1 == c2 + 1) {
            return cells[r1].charAt(c2) == 'Z';
        }

        return false;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
