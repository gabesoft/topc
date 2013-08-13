package topc.easy;

import java.util.*;
import java.io.*;

// SRM 588 Division I Level One - 250
// brute force, greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12706&rd=15700
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+588
public class GUMIAndSongsDiv1 {
    int n;
    Tune[] tunes;

    public int maxSongs(int[] duration, int[] tone, int T) {
        n     = duration.length;
        tunes = new Tune[n];

        for (int i = 0; i < n; i++) {
            tunes[i] = new Tune(duration[i], tone[i]);
        }

        Arrays.sort(tunes);

        return find(0, -1, T);
    }

    private int find(int curr, int last, int time) {
        if (curr == n) { return 0; }

        int a = find(curr + 1, last, time);
        int b = 0;

        int x = last == -1 ? 0 : Math.abs(tunes[last].t - tunes[curr].t);
        int y = tunes[curr].d;

        if (x + y <= time) {
            b = 1 + find(curr + 1, curr, time - (x + y));
        }

        return Math.max(a, b);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Tune implements Comparable<Tune> {
        public final int d;
        public final int t;

        public Tune(int d, int t) {
            this.d = d;
            this.t = t;
        }

        public int compareTo(Tune o) {
            return (t == o.t) ? d - o.d : t - o.t;
        }
    }
}
