package topc.graph;

import java.util.*;
import java.io.*;

// SRM 624 Division II Level One - 250
// graph theory, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13195&rd=15857
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+624
public class CostOfDancing {
    public int minimum(int K, int[] danceCost) {
        Arrays.sort(danceCost);
        int cost = 0;
        for (int i = 0; i < K; i++) {
            cost += danceCost[i];
        }
        return cost;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
