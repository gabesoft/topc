package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 500 Division I Level One - 250
// greedy, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11342&rd=14429
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+500
public class MafiaGame {
    public double probabilityToLose(int N, int[] decisions) {

        int n       = decisions.length;
        double prob = 1;
        int prev    = N;
        int round   = 0;

        int[] votes = new int[N];
        for (int i = 0; i < n; i++) {
            votes[decisions[i]]++;
        }

        Arrays.sort(votes);

        while (true) {
            int[] xs = new int[prev];
            int m = 0;

            for (int i = 0; i < prev; i++) {
                xs[i] += votes[N - i - 1];
                m     += votes[N - i - 1];
            }

            for (int i = m; i < N; i++) {
                Arrays.sort(xs);
                xs[0]++;
            }

            Arrays.sort(xs);

            int max  = xs[xs.length - 1];
            int curr = 0;

            for (int i = xs.length - 1; i > -1; i--) {
                if (xs[i] == max) {
                    curr++;
                } else {
                    break;
                }
            }

            if (curr == prev) {
                return 0;
            }

            if (round > 0) {
                prob *= (curr / (double)prev);
            }

            prev = curr;
            round++;

            if (curr == 1) {
                break;
            }
        }

        return prob;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
