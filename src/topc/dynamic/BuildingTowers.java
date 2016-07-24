package topc.dynamic;

import java.util.*;

// SRM 647 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13606&rd=16279
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+647
public class BuildingTowers {
    Lim[] lim;
    int K;
    int N;

    public long maxHeight(int N, int K, int[] x, int[] t) {
        this.K = K;
        this.N = N - 1;
        this.lim = new Lim[x.length];

        for (int i = 0; i < x.length; i++) {
            lim[i] = new Lim(x[i], t[i]);
        }

        Arrays.sort(lim);

        long lo = 0;
        long hi = this.N * (long)K;

        while (lo < hi) {
            long md = lo + (hi - lo + 1) / 2;

            if (possible(md)) {
                lo = md;
            } else {
                hi = md - 1;
            }
        }

        return lo;
    }

    private boolean possible(long h) {
        long last = roundUpToKMultiple(h) / K;

        if (last > N) {
            return false;
        }

        for (int i = 0; i < lim.length; i++) {
            if (lim[i].t >= h) { continue; }

            Lim l = lim[i];
            long dist = roundUpToKMultiple(h - l.t) / K;

            if (Math.abs(last - l.x) < dist) {
                last = l.x + dist;
            }
        }

        return last <= N;
    }

    private long roundUpToKMultiple(long x) {
        return (x % K == 0) ? x : x + K - x % K;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Lim implements Comparable<Lim>  {
        public int x;
        public long t;

        public Lim (int x, long t) {
            this.x = x - 1;
            this.t = t;
        }

        @Override
    public int compareTo(Lim o) {
            return this.x - o.x;
        }

        @Override
    public String toString() {
            return "(" + x + ", " + t + ")";
        }
    }
}
