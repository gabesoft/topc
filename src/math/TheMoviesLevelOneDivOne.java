package topc.math;

import java.util.*;
import java.io.*;

// SRM 469 Division I Level One - 250
// simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10898&rd=14152
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+469
public class TheMoviesLevelOneDivOne {
    public long find(int n, int m, int[] row, int[] seat) {
        HashMap<Integer, IntList> map = new HashMap<Integer, IntList>();

        for (int i = 0; i < row.length; i++) {
            if (!map.containsKey(row[i])) {
                map.put(row[i], new IntList());
            }

            IntList seats = map.get(row[i]);
            seats.add(seat[i]);
        }

        long count   = 0;
        long counted = 0;

        for (Map.Entry<Integer, IntList> entry : map.entrySet()) {
            IntList seats = entry.getValue();

            Collections.sort(seats);

            counted++;

            int k = 0;
            for (int p : seats) {
                count += Math.max(0, (p - 1 - k) - 1);
                k = p;
            }

            count += Math.max(0, (m - k) - 1);
        }

        count += (n - counted) * (m - 1L);

        return count;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    @SuppressWarnings("serial")
    public class IntList extends ArrayList<Integer> { }
}
