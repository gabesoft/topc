package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 541 Division II Level Three - 1000
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11890&rd=14733
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+541
public class NonXorLife {
    int MAX  = 3100;
    int OFF  = 1500;
    int INF  = 2000;
    int[] dx = { 0, 0, -1, 1 };
    int[] dy = { -1, 1, 0, 0 };

    public int countAliveCells(String[] field, int K) {
        int[][] dist = new int[MAX][MAX];

        for (int i = 0; i < MAX; i++) {
            Arrays.fill(dist[i], INF);
        }

        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length(); j++) {
                if (field[i].charAt(j) == 'o') {
                    q.offer(i + OFF);
                    q.offer(j + OFF);
                    dist[i + OFF][j + OFF] = 0;
                }
            }
        }

        while (q.size() > 0) {
            int x = q.poll();
            int y = q.poll();
            int d = dist[x][y];

            for (int i = 0; i < dx.length; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < MAX && ny < MAX) {
                    if (dist[nx][ny] > d + 1) {
                        dist[nx][ny] = d + 1;
                        q.offer(nx);
                        q.offer(ny);
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
