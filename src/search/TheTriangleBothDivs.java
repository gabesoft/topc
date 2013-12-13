package topc.search;

import java.util.*;
import java.io.*;

// SRM 457 Division I Level One - 250
// simple search, iteration, string manipulation, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10696&rd=14144
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+457
public class TheTriangleBothDivs {
    public String fix(String input) {
        String[] parts = input.split("\\s+");
        String[] time  = parts[0].split(":");
        char op        = parts[1].charAt(3);
        char gmt       = parts[1].charAt(4);

        String min  = getTime(time[1]);
        String hour = time[0];

        if (valid(hour, gmt, op, 24)) {
            return String.format("%02d:%s", 0, min);
        }
        for (int i = 0; i < 24; i++) {
            if (valid(hour, gmt, op, i)) {
                return String.format("%02d:%s", i, min);
            }
        }

        return null;
    }

    private boolean valid(String hour, char g, char o, int h) {
        char h1 = hour.charAt(0);
        char h2 = hour.charAt(1);

        if (h1 == '?' && h2 == '?') { return true; }

        if (h1 != '?' && h2 != '?') {
            int hh = Integer.parseInt(hour);
            return valid(g, o, hh, h);
        }

        for (int i = 0; i < 10; i++) {
            int hh    = h1 == '?' ? ((i * 10) + (h2 - '0')) : ((h1 - '0') * 10 + i);
            int delta = hh - h;

            if (hh >= 24) { continue; }

            if (valid(g, o, hh, h)) {
                return true;
            }
        }

        return false;
    }

    private boolean valid(char g, char o, int hh, int h) {
        int delta = hh - h;

        if (o == '?' && g == '?') {
            return Math.abs(delta) <= 9;
        }
        if (g == '?') {
            return o == '-' ? (delta < 0 && delta >= -9) : (delta >= 0 && delta <= 9);
        }
        if (o == '?') {
            int o1 = (g - '0');
            int o2 = -o1;
            return valid(hh, h, o1) || valid(hh, h, o2);
        } else {
            int mul = o == '-' ? -1 : 1;
            int offset = mul * (g - '0');
            return valid(hh, h, offset);
        }
    }

    private boolean valid(int hh, int h, int offset) {
        return (hh - offset) % 24 == h || (h + offset) % 24 == hh;
    }

    private String getTime(String str) {
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        return (c1 == '?' ? '0' : c1) + "" + (c2 == '?' ? '0' : c2);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
