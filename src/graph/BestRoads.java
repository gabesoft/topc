package topc.graph;

import java.util.*;
import java.io.*;

// SRM 424 Division II Level Three - 900
// graph theory, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10172&rd=13515
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm424
public class BestRoads {
    public int[] numberOfRoads(String[] roads, int M) {
        int n = roads.length;
        char c[][] = new char[n][];

        for (int i = 0; i < n; i++) {
            c[i] = roads[i].toCharArray();
        }

        // find the highest priority mst
        int id[] = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }

        int components = n;
        int deg[]      = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i][j] == 'N' || id[i] == id[j]) {
                    continue;
                }
                int idi = id[i];
                int idj = id[j];
                M--;
                components--;
                c[i][j] = 'N';
                c[j][i] = 'N';
                deg[i]++;
                deg[j]++;
                for (int k = 0; k < n; k++) {
                    if (id[k] == idi) {
                        id[k] = idj;
                    }
                }
            }
        }

        if (components > 1) { return new int[] {}; }

        // add free roads
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (c[i][j] == 'Y' && M > 0) {
                    M--;
                    c[i][j] = 'N';
                    c[j][i] = 'N';
                    deg[i]++;
                    deg[j]++;
                }
            }
        }

        if (M != 0) { return new int[] {}; }

        return deg;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
