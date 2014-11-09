package topc.search;

import java.util.*;
import java.io.*;

// SRM 260 Division I Level Two - 500
// recursion, simple search, iteration, simulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4765&rd=7994
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm260
public class SlowDigitalClock {
    String currentTime;
    String clockTime;
    int secsPerMinute;

    public String firstCorrectTime(String currentTime, String clockTime, int secsPerMinute) {
        this.currentTime   = currentTime;
        this.clockTime     = clockTime;
        this.secsPerMinute = secsPerMinute;

        Clock actual = new Clock(currentTime);
        Clock slow   = new Clock(clockTime);

        int a = secsPerMinute;
        int b = 0;
        int s = 0;
        do {
            if (check(actual, slow, false) != null) { 
                return check(actual, slow, false);
            }

            if (slow.validRev()) {
                while (true) {
                    b += 60;
                    if (b <= a) {
                        actual.tick();
                        if (check(actual, slow, true) != null) { 
                            return check(actual, slow, true);
                        }
                    } else {
                        b -= 60;
                        break;
                    }
                }
            } else {
                s  = ((a - b) / 60) * 60;
                b += s;
                actual.add(s);
            }

            slow.tick();
            a += secsPerMinute;
        } while (true);
    }

    private String check(Clock actual, Clock slow, boolean same){
        int a1          = actual.added() / secsPerMinute;
        int a2          = slow.added() / 60;
        boolean changed = actual.added() > 0 || slow.added() > 0;

        if ((!same || a1 == a2) && actual.time().equals(slow.timeRev())) { 
            return actual.time();
        }
        if (changed && actual.time().equals(currentTime) && slow.time().equals(clockTime)) { 
            return "";
        }

        return null;
    }

    public class Clock {
        boolean validRev;
        String originalTime;
        int DAY = 24 * 60 * 60;
        int added;
        int seconds;

        public Clock(String time) {
            int h1 = time.charAt(0) - '0';
            int h2 = time.charAt(1) - '0';
            int m1 = time.charAt(3) - '0';
            int m2 = time.charAt(4) - '0';

            int h = h1 * 10 + h2;
            int m = m1 * 10 + m2;

            seconds = h * 60 * 60;
            seconds = seconds + m * 60;

            originalTime = time;
            added        = 0;
            validRev     = timeRev().indexOf('X') == -1;
        }

        private int[] digits() {
            int r[] = new int[4];
            int h   = (seconds / 60) / 60;
            int m   = (seconds - h * 60 * 60) / 60;

            r[0] = h / 10;
            r[1] = h % 10;
            r[2] = m / 10;
            r[3] = m % 10;

            return r;
        }

        public String time() {
            int[] d = digits();
            return String.format("%s%s:%s%s", d[0], d[1], d[2], d[3]);
        }

        public String timeRev() {
            int[] d = digits();
            return String.format("%s%s:%s%s", rev(d[3]), rev(d[2]), rev(d[1]), rev(d[0]));
        }

        public void tick() {
            add(60);

            String t = timeRev();
            int h1   = t.charAt(0) - '0';
            int m1   = t.charAt(3) - '0';
            validRev = h1 < 3 && m1 < 6 && t.indexOf('X') == -1;
        }

        public boolean validRev() {
            return validRev;
        }

        private int added() {
            return added;
        }

        public void add(int seconds) {
            added        += seconds;
            this.seconds  = (this.seconds + seconds) % DAY;
        }

        private String rev(int d) {
            if (d == 6) { return "9"; }
            if (d == 9) { return "6"; }
            if (d == 3 || d == 4 || d == 7) { return "X"; }
            return d + "";
        }
    }
}
