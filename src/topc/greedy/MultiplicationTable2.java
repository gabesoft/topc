package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 685 Division I Level One - 250
// greedy
// statement: https://community.topcoder.com/stat?c=problem_statement&pm=14193&rd=16689
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+685
public class MultiplicationTable2 {
    public int minimalGoodSet(int[] table) {
        int n = (int)Math.sqrt(table.length);
        int best = n * n;
        boolean set[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            Queue<Integer> q = new LinkedList<Integer>();
            int count = 0;

            Arrays.fill(set, false);

            set[i] = true;
            count++;

            q.offer(table[i * n + i]);

            while(q.size() > 0) {
                int y = q.poll();

                if (set[y]) {
                    continue;
                }

                set[y] = true;
                count++;

                for (int x = 0; x < n; x++) {
                    if (set[x]) {
                        int v = table[y * n + x];
                        int u = table[x * n + y];

                        if (!set[v]) {
                            q.offer(v);
                        }
                        if (u != v && !set[u]) {
                            q.offer(u);
                        }
                    }
                }

                if (count >= best) {
                    break;
                }
            }

            best = Math.min(best, count);
        }

        return best;
    }

    @SuppressWarnings("unused")
    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
