package topc.greedy;

import java.util.*;
import java.io.*;

// TCO10 Qual 2 Division I Level One - 250
// greedy, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10896&rd=14277
// editorial: http://apps.topcoder.com/wiki/display/tc/TCO'10+Qualification+Round+2
public class JingleRingle {
    public int profit(int[] buyOffers, int[] sellOffers, int tax) {
        for (int i = 0; i < buyOffers.length; i++) {
            buyOffers[i] -= (buyOffers[i] * tax) / 100;
        }

        Arrays.sort(buyOffers);
        Arrays.sort(sellOffers);

        int b = buyOffers.length - 1;
        int s = 0;

        int profit = 0;

        while (b > -1 && s < sellOffers.length) {
            if (buyOffers[b] > sellOffers[s]) {
                profit += (buyOffers[b--] - sellOffers[s++]);
            } else {
                break;
            }
        }

        return profit;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
