package topc.easy;

import java.util.*;
import java.io.*;

// SRM 473 Division I Level One - 250
// brute force, simple math, simulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10979&rd=14155
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+473
public class SequenceOfCommands {
    public String whatHappens(String[] commands) {
        int ud  = 0;
        int lr  = 0;
        int dir = 0;

        String command = join(commands);

        command += command;
        command += command;

        int n = command.length();
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            char d  = command.charAt(i);

            while (++i < n && command.charAt(i) == d) {
                cnt++;
            }
            i--;

            if (d == 'L') {
                cnt *= 3;
                cnt %= 4;
            }
            if (d == 'R') {
                cnt %= 4;
            }

            if (d == 'L' || d == 'R') {
                dir = (dir + cnt) % 4;
            } else if (dir == 0) {
                ud += cnt;
            } else if (dir == 2) {
                ud -= cnt;
            } else if (dir == 1) {
                lr += cnt;
            } else if (dir == 3) {
                lr -= cnt;
            }
        }

        return (ud == 0 && lr == 0) ? "bounded" : "unbounded";
    }

    private String join(String[] input) {
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
