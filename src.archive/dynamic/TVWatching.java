package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 250 Division I Level Two - 500
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4571&rd=7225
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm250
public class TVWatching {
    public int mostMinutes(String[] programs) {
        int n = programs.length;

        Interval[] shows = new Interval[n];
        for (int i = 0; i < n; i++) {
            shows[i] = new Interval(programs[i]);
            if (shows[i].duration == 1440) {
                return shows[i].duration;
            }
        }

        int best = 0;
        for (int i = 0; i < 1441; i++) {
            int s = i;
            int e = i + 1440;

            ArrayList<Interval> batch = new ArrayList<Interval>();
            for (int j = 0; j < n; j++) {
                if (shows[j].within(s, e)) {
                    batch.add(shows[j]);
                }
            }

            Collections.sort(batch);
            best = Math.max(best, find(batch));
        }

        return best;
    }

    private int find(ArrayList<Interval> shows) {
        if (shows.size() == 0) { return 0; }

        int n   = shows.size();
        int P[] = new int[n];
        int O[] = new int[n];

        Arrays.fill(P, -1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (shows.get(i).disjoint(shows.get(j))) {
                    P[i] = j;
                } else {
                    break;
                }
            }
        }


        O[0] = shows.get(0).duration;
        for (int i = 1; i < n; i++) {
            int rest = P[i] > -1 ? O[P[i]] : 0;
            O[i]     = Math.max(O[i - 1], shows.get(i).duration + rest);
        }

        return O[n - 1];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Interval implements Comparable<Interval> {
        public final int duration;
        public final int end;
        public final int start;

        public Interval(String time) {
            String parts[] = time.split(" - ");

            int start = parse(parts[0]);
            int end   = parse(parts[1]);

            if (start >= end) {
                end += 1440;
            } 

            this.start    = start;
            this.end      = end;
            this.duration = end - start;
        }

        private int parse(String time) {
            int h1 = time.charAt(0) - '0';
            int h2 = time.charAt(1) - '0';

            int m1 = time.charAt(3) - '0';
            int m2 = time.charAt(4) - '0';

            int h = h1 * 10 + h2;
            int m = m1 * 10 + m2;

            int d = time.charAt(5) == 'P' ? 720 : 0;

            return (h % 12) * 60 + m + d;
        }

        public int compareTo(Interval other) {
            return end - other.end;
        }

        public boolean disjoint(Interval other) {
            int s1 = start;
            int e1 = end;
            int s2 = other.start;
            int e2 = other.end;

            return (s2 >= e1 || s1 >= e2);
        }

        public boolean within(int s, int e) {
            return s <= start && end <= e;
        }

        public String toString() {
            return String.format("[%s-%s]:%s", start, end, duration);
        }
    }
}
