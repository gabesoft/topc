package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 300 Division II Level Three - 1000
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4431&rd=9821
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm300
public class CircleOrder {
    boolean cars[];
    boolean zones[];
    int n;

    public String firstOrder(String circle) {
        n     = circle.length();
        cars  = new boolean[26];
        zones = new boolean[26];

        for (int i = 0; i < n; i++) {
            char c = circle.charAt(i);
            if (Character.isLowerCase(c)) {
                cars[c - 'a'] = true;
            }
        }

        String res       = "";
        boolean progress = true;

        while (res.length() < (n / 2) && progress) {
            progress = false;

            for (int i = 0; i < 26; i++) {
                if (!cars[i]) { continue; }

                boolean right = move(circle, i, 1);
                boolean left  = move(circle, i, -1);

                if (right || left) {
                    progress = true;
                    res += (char)(i + 'a');
                    break;
                }
            }

            if (!progress) { return "NONE"; }
        }

        return res;
    }

    private boolean move(String circle, int ch, int dir) {
        char car  = (char)(ch + 'a');
        char zone = (char)(ch + 'A');

        int pos   = circle.indexOf(car);
        int index = safe(pos + dir);

        while (index != pos) {
            char c = circle.charAt(index);

            if (c == zone) {
                cars[ch]  = false;
                zones[ch] = true;
                return true;
            }

            if (Character.isLowerCase(c) && cars[c - 'a']) {
                return false;
            }

            if (Character.isUpperCase(c) && zones[c - 'A']) {
                return false;
            }

            index = safe(index + dir);
        }

        return false;
    }

    private int safe(int k) {
        if (k < 0) {
            return n - 1;
        }
        if (k == n) {
            return 0;
        }
        return k;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
