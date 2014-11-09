package topc.math;

import java.util.*;
import java.io.*;

// SRM 577 Division II Level Two - 500
// simple math, sorting, string parsing
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12521&rd=15497
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+577
public class EllysRoomAssignmentsDiv2 {
    public double getProbability(String[] input) {
        String r[] = join(input).split("\\s+");
        int n = r.length;
        int ratings[] = new int[n];
        int rooms = (n / 20) + (n % 20 == 0 ? 0 : 1);

        for (int i = 0; i < n; i++) {
            ratings[i] = Integer.parseInt(r[i]);
        }

        int er = ratings[0];
        int turn = 0;

        Arrays.sort(ratings);

        for (int i = n - 1; i > -1; i--) {
            if ((n - i - 1) % rooms == 0) { turn++; }
            if (ratings[i] == er) {
                break;
            }
        }

        if (er == ratings[n - 1]) { return 1.0; }
        if (turn == 1) { return 0.0; }

        return 1.0 / rooms;
    }

    String join(String[] input) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            builder.append(input[i]);
        }
        return builder.toString();
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
