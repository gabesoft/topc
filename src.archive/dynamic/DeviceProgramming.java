package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 367 Division I Level Two - 500
// dynamic programming, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7810&rd=10783
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm367
public class DeviceProgramming {
    int n;
    long overhead;
    long packet;
    Offset[] offsets;
    HashMap<Long, Long> map;

    public long minBytes(int[] offset, int[] size, int maxPacketSize, int overhead) {
        this.n        = offset.length;
        this.offsets  = new Offset[n];
        this.overhead = overhead;
        this.packet   = maxPacketSize - overhead;
        this.map      = new HashMap<Long, Long>();

        for (int i = 0; i < n; i++) {
            offsets[i] = new Offset(offset[i], size[i]);
        }

        Arrays.sort(offsets);

        return find(offsets[0].o);
    }

    long find(long x) {
        if (x > offsets[n - 1].end()) { return 0; }
        if (map.containsKey(x)) { return map.get(x); }


        // outside
        for (int i = 0; i < n - 1; i++) {
            if (offsets[i].end() < x && offsets[i + 1].o > x) {
                map.put(x, find(offsets[i + 1].o));
                return map.get(x);
            }
        }

        // inside
        for (int i = 0; i < n; i++) {
            if (offsets[i].end() >= x && offsets[i].o <= x) {
                long dx = offsets[i].end() - x + 1L;
                if (dx >= packet) {
                    long cx = dx / packet;
                    map.put(x, cx * (overhead + packet) + find(x + cx * packet));
                    return map.get(x);
                } else {
                    if (i == n - 1) { return overhead + dx; }

                    long best = overhead + packet + find(x + packet);
                    for (long j = dx; j < packet; j++) {
                        best = Math.min(best, overhead + j + find(x + j));
                    }

                    map.put(x, best);

                    return map.get(x);
                }
            }
        }

        assert false : "malfunction";
        return -1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Offset implements Comparable<Offset> {
        public final long o;
        public final long s;

        public Offset(long offset, long size) {
            o = offset;
            s = size;
        }

        public long end() {
            return o + s - 1;
        }

        public int compareTo(Offset other) {
            return (int)(o - other.o);
        }
    }
}
