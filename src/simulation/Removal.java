package topc.simulation;

import java.util.*;
import java.io.*;

// SRM 177 Division I Level Two - 450
// simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1973&rd=4690
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm177
public class Removal {
    public int finalPos(int n, int k, String[] remove) {
        Adj[] adj = new Adj[remove.length];
        int items = n;

        for (int i = 0; i < remove.length; i++) {
            String[] range = remove[i].split("-");

            int lo = Integer.parseInt(range[0]);
            int hi = Integer.parseInt(range[1]);
            int v  = hi - lo + 1;

            adj[i] = new Adj(lo, v);
            items -= v;

            for (int j = 0; j < i; j++) {
                if (adj[j].k >= adj[i].k && adj[j].k <= hi) {
                    adj[j].move(adj[j].k - adj[i].k);
                } else if (adj[j].k >= adj[i].k) {
                    adj[j].move(v);
                }
            }
        }

        if (k > items) { return -1; }

        int r = k;
        for (int i = 0; i < adj.length; i++) {
            if (k >= adj[i].k) {
                r += adj[i].v;
            }
        }

        return r;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Adj {
        public int k;
        public int v;

        public Adj(int threshold, int adjustment) {
            k = threshold;
            v = adjustment;
        }

        public void move(int d) {
            k -= d;
        }

        public String toString() {
            return k + ":" + v;
        }
    }

}
