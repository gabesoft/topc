package topc.dynamic;

import java.util.*;
import java.io.*;

// TCO13 Championship Round Division I Level One - 300
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12830&rd=15814
// editorial: http://apps.topcoder.com/wiki/display/tc/Algorithm+Problem+Set+Analysis
public class ScoringSystems {
    public String isEquivalent(int[] c, int[] s) {
        int sum = 0;

        for (int x : c) { sum += x; }

        int[] B = new int[sum + 1];

        Arrays.fill(B, -1);

        B[0] = 0;
        for (int i = 0; i < c.length; i++) {
            int[] nB = B.clone();

            for (int z = 0; z < B.length; z++) {
                if (B[z] > -1) {
                    int ciel  = z + c[i];
                    int snuke = B[z] + s[i];

                    if (nB[ciel] > -1 && nB[ciel] != snuke) {
                        return "Not Equivalent";
                    }

                    nB[ciel] = snuke;
                }
            }

            B = nB;
        }

        int last = B[0];
        for (int i = 1; i < B.length; i++) {
            if (B[i] == -1) { continue; }
            if (B[i] <= last) {
                return "Not Equivalent";
            } else {
                last = B[i];
            }
        }

        return "Equivalent";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
