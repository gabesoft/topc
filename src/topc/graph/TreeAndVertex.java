package topc.graph;

import java.util.*;

// SRM 686 Division II Level One - 250
// graph theory, simple search, iteration
// statement: https://community.topcoder.com/stat?c=problem_statement&pm=14212&rd=16690
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+686
public class TreeAndVertex {
    public int get(int[] tree) {
        int max = 0;
        int n = tree.length;
        int[] nodes = new int[n + 1];

        for (int i = 0; i < n; i++) {
            int u = tree[i];
            int v = i + 1;
            nodes[u]++;
            nodes[v]++;
            max = Math.max(max, Math.max(nodes[v], nodes[u]));
        }

        return max;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
