package topc.easy;

import java.util.*;
import java.io.*;

// SRM 539 Division I Level One - 250
// brute force, search, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11855&rd=14731
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+539
public class Over9000Rocks {
    public int countPossibilities(int[] lowerBound, int[] upperBound) {
        int n = lowerBound.length;

        ArrayList<Interval> intervals = new ArrayList<Interval>();
        for (int i = 0; i < (1 << n); i++) {
            Interval x = getInterval(i, lowerBound, upperBound);
            if (x != null) {
                intervals.add(x);
            }
        }

        Collections.sort(intervals);

        int count = 0;
        int last  = 9000;
        for (Interval x : intervals) {
            if (x.ub <= last) {
                continue;
            }

            int lb = x.lb;
            int ub = x.ub;
            if (x.lb <= last) {
                lb = last + 1;
            }

            count += (ub - lb + 1);
            last = ub;
        }


        return count;
    }

    private Interval getInterval(int chosen, int[] lb, int[] ub) {
        int min = 0;
        int max = 0;

        for (int i = 0; i < lb.length; i++) {
            if (((chosen >> i) & 1) == 1) {
                min += lb[i];
                max += ub[i];
            }
        }

        return max <= 9000 ? null : new Interval(Math.max(9001, min), max);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Interval implements Comparable<Interval> {
        public final int lb;
        public final int ub;

        public Interval(int lb, int ub) {
            this.lb = lb;
            this.ub = ub;
        }

        public int compareTo(Interval o) {
            return lb == o.lb ? ub - o.ub : lb - o.lb;
        }

        public String toString() {
            return lb + "-" + ub;
        }
    }
}
