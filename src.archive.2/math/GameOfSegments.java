package topc.math;

import java.util.*;
import java.io.*;

// SRM 624 Division II Level Three - 1000
// advanced math, dynamic programming, geometry
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13204&rd=15857
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+624
public class GameOfSegments {
    public int winner(int N) {
        int nimber[] = new int[N + 1];

        for (int n = 0; n <= N; n++) {
            HashSet<Integer> options = new HashSet<Integer>();
            for (int i = 0; i <= n - 2; i++) {
                options.add(nimber[i] ^ nimber[n - 2 - i]);
            }

            int r = 0;
            while (options.contains(r)) { r++; }
            nimber[n] = r;
        }

        return nimber[N] > 0 ? 1 : 2;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
