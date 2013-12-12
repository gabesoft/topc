package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 367 Division II Level Three - 1000
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=8212&rd=10783
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm367
public class ProgrammingDevice {
    public int minPackets(int[] offset, int[] size, int maxData) {
        int n = offset.length;

        Offset[] offsets = new Offset[n];

        for (int i = 0; i < n; i++) {
            offsets[i] = new Offset(offset[i], size[i]);
        }

        Arrays.sort(offsets);

        int c  = 0;
        long l = offsets[n - 1].end();
        long x = offsets[0].o;

        while (x <= l) {
            for (int i = 0; i < n; i++) {
                if (offsets[i].end() > x && offsets[i].o <= x) {
                    long dx = offsets[i].end() - x;
                    long cx = dx > maxData ? dx / maxData : 1;

                    c += cx;
                    x += cx * maxData;

                    break;
                }
                if (offsets[i].end() == x) {
                    c += 1;
                    x += maxData;

                    break;
                }
            }
            
            for (int i = 0; i < n - 1; i++) {
                if (offsets[i].end() < x && offsets[i + 1].o > x) {
                    x = offsets[i + 1].o;
                    break;
                }
            }
        }

        return c;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Offset implements Comparable<Offset> {
        public final int o;
        public final int s;

        public Offset(int offset, int size) {
            o = offset;
            s = size;
        }

        public long end() {
            return o + s - 1;
        }

        public int compareTo(Offset other) {
            return o - other.o;
        }
    }
}
