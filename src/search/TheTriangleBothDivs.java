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
        String min     = getMin(time[1]);
        String hour    = time[0];

        int n = input.length();
        ArrayList<String> matches = new ArrayList<String>();

        for (int h = 0; h < 24; h++) {
            for (int g = -9; g < 10; g++) {
                String str = String.format("%02d:%s GMT%s", h, min, g < 0 ? g : "+" + g);

                boolean match = true;
                for (int i = 0; i < n; i++) {
                    if (str.charAt(i) != input.charAt(i)) {
                        if (input.charAt(i) != '?') {
                            match = false;
                            break;
                        }
                    }
                }

                if (match) {
                    int hh = (h - g + 24) % 24;
                    matches.add(String.format("%02d:%s", hh, min));
                }
            }
        }

        Collections.sort(matches);

        return matches.get(0);
    }

    private String getMin(String str) {
        char c1 = str.charAt(0);
        char c2 = str.charAt(1);
        return (c1 == '?' ? '0' : c1) + "" + (c2 == '?' ? '0' : c2);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
