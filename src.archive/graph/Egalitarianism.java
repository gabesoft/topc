package topc.graph;

import java.util.*;
import java.io.*;

// SRM 584 Division I Level One - 250
// graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12613&rd=15696
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+584
public class Egalitarianism {
    public int maxDifference(String[] isFriend, int d) {
        int n    = isFriend.length;
        int best = 0;

        for (int i = 0; i < n; i++) {
            int dist[] = bfs(isFriend, i);
            int curr   = max(dist);

            best = Math.max(best, curr);
            if (curr == 0) {
                best = 0;
                break;
            }
        }

        return best == 0 ? -1 : (best - 1) * d;
    }

    private int max(int[] value) {
        int m = 0;
        for (int i = 0; i < value.length; i++) {
            m = Math.max(m, value[i]);
            if (value[i] == 0) {
                m = 0;
                break;
            }
        }
        return m;
    }

    private int[] bfs(String[] isFriend, int start) {
        int n       = isFriend.length;
        int queue[] = new int[n];
        int dist[]  = new int[n];

        int h = 0;
        int t = 0;

        dist[start] = 1;
        queue[t++]  = start;

        while (h < t) {
            int u = queue[h++];

            for (int i = 0; i < n; i++) {
                if (isFriend[u].charAt(i) == 'Y') {
                    if (dist[i] == 0 || dist[i] > dist[u] + 1) {
                        dist[i]    = dist[u] + 1;
                        queue[t++] = i;
                    }
                }
            }
        }

        return dist;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
