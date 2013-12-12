package topc.graph;

import java.util.*;
import java.io.*;

// SRM 566 Division I Level One - 250
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12336&rd=15486
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+566
public class PenguinSledding {
    public long countDesigns(int numCheckpoints, int[] checkpoint1, int[] checkpoint2) {
        int n = numCheckpoints;
        int graph[][] = new int[n][n];

        for (int i = 0; i < checkpoint1.length; i++) {
            int x = checkpoint1[i] - 1;
            int y = checkpoint2[i] - 1;

            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        long count = 1 + checkpoint1.length;

        for (int i = 0; i < n; i++) {
            long degree = 0;
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1) {
                    degree++;
                }
            }

            if (degree > 1) {
                count += (1L << degree);
                count -= (degree + 1L);
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = k + 1; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (graph[i][k] == 1 && graph[k][j] == 1 && graph[i][j] == 1) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
