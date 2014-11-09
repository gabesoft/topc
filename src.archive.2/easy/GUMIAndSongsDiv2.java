package topc.easy;

import java.util.*;
import java.io.*;

// SRM 588 Division II Level Two - 500
// brute force, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12707&rd=15700
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+588
public class GUMIAndSongsDiv2 {
    public int maxSongs(int[] duration, int[] tone, int T) {
        int n = duration.length;
        int l = (1 << n);
        Song[] xs = new Song[n];

        for (int i = 0; i < n; i++) {
            xs[i] = new Song(duration[i], tone[i]);
        }

        Arrays.sort(xs);

        int best = 0;
        for (int i = 1; i < l; i++) {
           if (can(xs, i, T)) {
               best = Math.max(best, Integer.bitCount(i));
           }
        }

        return best;
    }

    private boolean can(Song[] xs, int k, int T) {
        int d = 0;
        int t = 0;

        for (int i = 0; i < xs.length; i++) {
            if (on(k, i)) {
                if (d == 0) {
                    d = xs[i].d;
                    t = xs[i].t;
                } else {
                    d += xs[i].d;
                    d += (xs[i].t - t);
                    t = xs[i].t;
                }
            }
            if (d > T) {
                return false;
            }
        }

        return true;
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Song implements Comparable<Song>  {
        public int d;
        public int t;

        public Song (int d, int t) {
            this.d = d;
            this.t = t;
        }

        public int compareTo(Song o) {
            return this.t - o.t;
        }
    }
}
