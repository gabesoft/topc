package topc.sorting;

import java.util.*;
import java.io.*;

// SRM 276 Division II Level Three - 1000
// sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5942&rd=8073
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm276
public class FunctionDependency {
    int n;
    HashMap<String, Integer> toIndex;
    String[] sorted;
    IntSet[] dep;

    public String[] scriptingOrder(String[] funcs, String[] depends) {
        n       = funcs.length;
        toIndex = new HashMap<String, Integer>();
        sorted  = new String[n];
        dep     = new IntSet[n];

        for (int i = 0; i < n; i++) {
            toIndex.put(funcs[i], i);
            sorted[i] = funcs[i];

            String d = depends[i];
            dep[i]   = d.length() == 0
                ? new IntSet()
                : toSet(d.split("\\s+"));
        }

        Arrays.sort(sorted);
        return topoSort();
    }

    private String[] topoSort() {
        boolean[] seen = new boolean[n];
        String[] topo  = new String[n];

        int pos = 0;
        while (pos < n) {
            int cur = pos;
            for (int i = 0; i < n; i++) {
                int k = toIndex.get(sorted[i]);
                if (seen[k]) { continue; }

                boolean ok = true;

                for (int j = 0; j < n; j++) {
                    if (!seen[j] && dep[k].contains(j)) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                    topo[pos++] = sorted[i];
                    seen[k]     = true;
                    break;
                } 
            }

            if (cur == pos) { return null; }
        }

        return topo;
    }

    private IntSet toSet(String[] nums) {
        IntSet set = new IntSet();

        for (int i = 0; i < nums.length; i++) {
            set.add(Integer.parseInt(nums[i]));
        }

        return set;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    @SuppressWarnings("serial")
    class IntSet extends HashSet<Integer> {

    }
}
