package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 645 Division II Level One - 250
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13604&rd=16277
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+645
public class BacteriesColony {
    public int[] performTheExperiment(int[] colonies) {
        int n    = colonies.length;
        int ch[] = new int[n];

        boolean change = true;
        while (change) {
            change = false;

            Arrays.fill(ch, 0);

            for (int i = 1; i < n - 1; i++) {
                int x = colonies[i];

                if (colonies[i - 1] > x && x < colonies[i + 1]) {
                    ch[i] = 1;
                }
                if (colonies[i - 1] < x && x > colonies[i + 1]) {
                    ch[i] = -1;
                }
            }

            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != 0) {
                    change = true;
                    colonies[i] += ch[i];
                }
            }
        }

        return colonies;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
