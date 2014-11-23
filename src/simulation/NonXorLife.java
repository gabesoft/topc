package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 541 Division II Level Three - 1000
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11890&rd=14733
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+541
public class NonXorLife {
    public int countAliveCells(String[] field, int K) {
        int MAX = 3100;
        int OFF = 1500;
        int INF = 2000;
        int dx[] = new int[] { 0, 0, -1, 1 };
        int dy[] = new int[] { -1, 1, 0, 0 };
        int dist[][] = new int[MAX][MAX];

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                dist[i][j] = INF;
            }
        }

        Queue<Integer> Q = new LinkedList<Integer>();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length(); j++) {
                if (field[i].charAt(j) == 'o') {
                    Q.offer(i + OFF);
                    Q.offer(j + OFF);
                    dist[i + OFF][j + OFF] = 0;
                }
            }
        }

        while (Q.size() > 0) {
            int x = Q.poll();
            int y = Q.poll();
            int d = dist[x][y];

            for (int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (0 <= nx && nx < MAX && 0 <= ny && ny < MAX) {
                    if (dist[nx][ny] > d + 1) {
                        dist[nx][ny] = d + 1;
                        Q.offer(nx);
                        Q.offer(ny);
                    }
                }
            }
        }

        int c = 0;
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                if (dist[i][j] <= K) {
                    c++;
                }
            }
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
