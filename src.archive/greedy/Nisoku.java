package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 463 Division I Level Two - 500
// greedy, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10760&rd=14148
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+463
public class Nisoku {
    public double theMax(double[] cards) {
        int n = cards.length;
        Arrays.sort(cards);

        double res = 0.0;
        for (int s = 0; s <= n; s += 2) {
            double p = 1.0;

            for (int i = s; i < n; i++) {
                p *= cards[i];
            }

            for (int i = 0; i < s / 2; i++) {
                p *= cards[i] + cards[s - i - 1];
            }

            res = Math.max(res, p);
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
