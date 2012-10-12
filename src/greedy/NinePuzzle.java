package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 498 Division II Level Three - 950
// greedy, search
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11225&rd=14427
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+498
public class NinePuzzle {
    public int getMinimumCost(String init, String goal) {
        char code[] = new char[128];
        int count[] = new int[4];

        code['R'] = 0;
        code['G'] = 1;
        code['B'] = 2;
        code['Y'] = 3;

        for (int i = 0; i < goal.length(); i++) {
            char c = goal.charAt(i);
            if (c != '*') {
                count[code[c]]++;
            }
        }

        for (int i = 0; i < init.length(); i++) {
            char c = init.charAt(i);
            if (c != '*') {
               count[code[c]]--;
            }
        }

        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                sum += count[i];
            }
        }

        return sum;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
