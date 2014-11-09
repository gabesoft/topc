package topc.math;

import java.util.*;
import java.io.*;

// SRM 257 Division II Level Three - 1000
// simple math, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4520&rd=8005
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm257
public class TimeCard {
    public String leave(String[] time) {
        int n = time.length;

        int shift  = 20 * 60;
        int target = 40 * 60;
        int actual = 0;
        int day    = 24 * 60;

        for (int i = 0; i < n - 1; i += 2) {
            Time s = new Time(time[i]);
            Time e = new Time(time[i + 1]);

            actual += (day + e.min - s.min) % day;
        }

        if (actual == target) {
            return time[n - 1];
        }
        if (actual > target) {
            return "ABOVE 40";
        }
        if (actual < target - shift) {
            return "BELOW 40";
        }

        int delta = target - actual;
        Time last = new Time(time[n - 1]);
        Time end  = new Time((last.min + delta) % day);

        return end.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Time {
        public final int min;

        public Time(String time) {
            int h = 0;
            int m = 0;

            h += time.charAt(0) - '0';
            h *= 10;
            h += time.charAt(1) - '0';

            if (time.indexOf('a') == -1 && h != 12) {
                h += 12;
            } else if (time.indexOf('p') == -1 && h == 12) {
                h = 0;
            }

            m += time.charAt(3) - '0';
            m *= 10;
            m += time.charAt(4) - '0';

            min = h * 60 + m;
        }

        public Time(int min) {
            this.min = min;
        }

        public String toString() {
            int h    = min / 60;
            int m    = min % 60;
            String t = "am";

            if (h > 12) {
                t = "pm";
                h = h - 12;
            } else if (h == 12) {
                t = "pm";
            } else if (h == 0) {
                h = 12;
            }

            int h1 = h / 10;
            int h2 = h % 10;
            int m1 = m / 10;
            int m2 = m % 10;

            return String.format("%s%s:%s%s,%s", h1, h2, m1, m2, t);
        }
    }
}
