package topc.graph;

import java.util.*;
import java.io.*;

// SRM 608 Division II Level Three - 1000
// graph theory
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13002&rd=15841
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+608
public class BigOEasy {
    public String isBounded(String[] graph) {
        int n = graph.length;
        boolean reach[][] = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                reach[i][j] = graph[i].charAt(j) == 'Y';
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    reach[i][j] |= reach[i][k] && reach[k][j];
                }
            }
        }

        boolean[] saved = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!saved[i]) {
                ArrayList<Integer> scc = new ArrayList<Integer>();
                scc.add(i);

                for (int j = i + 1; j < n; j++) {
                    if (reach[i][j] && reach[j][i]) {
                        scc.add(j);
                        saved[j] = true;
                    }
                }

                if (scc.size() > 1) {
                    for (int j : scc) {
                        int degree = 0;
                        for (int k : scc) {
                            if (j != k && reach[j][k] && graph[j].charAt(k) == 'Y') {
                                degree++;
                            }
                        }
                        if (degree != 1) {
                            return "Unbounded";
                        }
                    }
                }
            }
        }

        return "Bounded";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
