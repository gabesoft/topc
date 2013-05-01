package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 263 Division II Level Three - 900
// dynamic programming, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1776&rd=7997
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm263
public class DequeSort {
    public int minDeques(int[] data) {
        int count = 0;
        int q     = 0;

        Deque[] qs = new Deque[data.length];

        for (int i = 0; i < data.length; i++) {
            boolean added = false;
            for (int j = 0; j < q; j++) {
                if (addHi(qs[j], i, data)) {
                    added = true;
                    break;
                }
                if (addLo(qs[j], i, data)) {
                    added = true;
                    break;
                }
            }
            if (!added) {
                qs[q++] = new Deque(data[i]);
            }
        }

        return q;
    }

    private boolean addHi(Deque q, int k, int[] data) {
        if (data[k] < q.hi) { return false; }
        for (int i = k + 1; i < data.length; i++) {
            if (data[i] < data[k] && data[i] > q.hi) {
                return false;
            }
        }
        q.tail(data[k]);
        return true;
    }

    private boolean addLo(Deque q, int k, int[] data) {
        if (data[k] > q.lo) { return false; }
        for (int i = k + 1; i < data.length; i++) {
            if (data[i] > data[k] && data[i] < q.lo) {
                return false;
            }
        }
        q.head(data[k]);
        return true;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Deque {
        public int lo;
        public int hi;

        public Deque(int v) {
            lo = v;
            hi = v;
        }

        public void head(int v) {
            lo = v;
        }

        public void tail(int v) {
            hi = v;
        }

        public String toString() {
            return lo + ":" + hi;
        }
    }
}
