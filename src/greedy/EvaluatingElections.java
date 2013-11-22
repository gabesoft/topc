package topc.greedy;

import java.util.*;
import java.io.*;

// TCO10 Final Division I Level One - 250
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11124&rd=14287
// editorial: http://www.topcoder.com/tc?module=Static&d1=tournaments&d2=tco10&d3=alg_finals_analysis
public class EvaluatingElections {
    int D[];
    int n;

    public int evaluate(int[] districts) {
        Arrays.sort(districts);

        D = districts;
        n = D.length;

        int m = min(0, n / 2, n % 2);
        int s = 0;

        for (int i = 0; i < n; i++) {
            s += D[i];
        }

        return s - m + 1;
    }

    private int min(int index, int wins, int ties) {
        if (wins == 0 && ties == 0) { return 0; }
        if (wins < 0) { return 0; }

        if (D[index] % 2 == 0 && ties > 0) {
            return (D[index] / 2) + min(index + 1, wins, ties - 1);
        } else {
            return (D[index] / 2) + min(index + 1, wins - 1, ties) + 1;
        }
    }
}
