package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 500 Division I Level One - 250
// greedy, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11342&rd=14429
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+500
public class MafiaGame {
    public double probabilityToLose(int N, int[] decisions) {
        Arrays.sort(decisions);

        int count = 0;
        int maxCount = 0;
        int playersWithMaxCount = 0;

        for (int i = 0; i < decisions.length; i++) {
            if (i == 0 || decisions[i] == decisions[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                playersWithMaxCount = 1;
                maxCount = count;
            } else if (count == maxCount) {
                playersWithMaxCount++;
            }
        }

        int c = playersWithMaxCount;
        if (c == decisions.length) { return 0; }

        while (true) {
            if (c == 0) { return 0; }
            if (c == 1) { return 1.0 / playersWithMaxCount; }
            c = N % c;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
