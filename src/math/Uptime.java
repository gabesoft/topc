package topc.math;

import java.util.*;
import java.text.*;
import java.io.*;

// SRM 213 Division I Level Two - 500
// math, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=2893&rd=5859
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm213
public class Uptime {
    long DAY  = 24 * 60 * 60;
    long HOUR = 60 * 60;
    long MIN  = 60;

    public String calcUptime(String started, String now) {
        if (started.equals(now)) { return ""; }

        Date d1  = parse(started);
        Date d2  = parse(now);
        long sec = (d2.getTime() - d1.getTime()) / 1000;

        return format(sec);
    }

    private String format(long secs) {
        long days = secs / DAY;

        secs = secs % DAY;
        long hours = secs / HOUR;

        secs = secs % HOUR;
        long mins = secs / MIN;

        secs = secs % MIN;

        String r = "";
        if (days > 0) {
            r += days + "d";
        }
        if (hours > 0) {
            if (r.length() > 0) { r += " "; }
            r += hours + "h";
        }
        if (mins > 0) {
            if (r.length() > 0) { r += " "; }
            r += mins + "m";
        }
        if (secs > 0) {
            if (r.length() > 0) { r += " "; }
            r += secs + "s";
        }

        return r;
    }

    private Date parse(String d) {
        TimeZone utc = TimeZone.getTimeZone("UTC");
        SimpleDateFormat format = new SimpleDateFormat("d MMM yyyy 'at' hh:mm:ss a");
        format.setTimeZone(utc);

        try {
            return format.parse(d);
        } catch (ParseException e) {
            return null;
        }
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
