package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 496 Division I Level One - 250
// greedy, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11306&rd=14425
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+496
public class ColoredStrokes {
    public int getLeast(String[] picture) {
        int n = picture.length;
        int m = picture[0].length();

        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean inside = false;
            for (int j = 0; j < m; j++) {
                char c = picture[i].charAt(j);
                if (c == '.' || c == 'B') {
                    inside = false;
                } else if (!inside) {
                    inside = true;
                    count++;
                }
            }
        }

        for (int j = 0; j < m; j++) {
            boolean inside = false;
            for (int i = 0; i < n; i++) {
                char c = picture[i].charAt(j);
                if (c == '.' || c == 'R') {
                    inside = false;
                } else if (!inside) {
                    inside = true;
                    count++;
                }
            }
        }

        return count;
    }
}
