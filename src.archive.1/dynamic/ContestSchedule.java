package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 320 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6708&rd=10000
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm320
public class ContestSchedule {
    int n;
    int T;
    Contest[] contest;
    HashMap<Integer, Integer> map;

    public double expectedWinnings(String[] contests) {
        T       = 0;
        n       = contests.length;
        map     = new HashMap<Integer, Integer>();
        contest = new Contest[n];

        for (int i = 0; i < n; i++) {
            contest[i] = new Contest(contests[i]);
            T          = Math.max(T, contest[i].t);
        }

        return count(0) / 100.0;
    }

    int count(int t) {
        if (t == T) { return 0; }
        if (map.containsKey(t)) { return map.get(t); }

        int best = 0;
        for (int i = 0; i < n; i++) {
            if (contest[i].s >= t) {
                best = Math.max(best, contest[i].p + count(contest[i].t));
            }
        }

        map.put(t, best);
        return best;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    class Contest {
        public final int s;
        public final int t;
        public final int p;

        public Contest(String str) {
            String[] parts = str.split(" ");

            s = Integer.parseInt(parts[0]);
            t = Integer.parseInt(parts[1]);
            p = Integer.parseInt(parts[2]);
        }
    }
}
