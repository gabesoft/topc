package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 600 Division I Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12888&rd=15712
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+600
public class ORSolitaire {
    public int getMinimum(int[] numbers, int goal) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int x : numbers) {
            if ((goal | x) == goal) {
                nums.add(x);
            }
        }

        int min = 100;

        for (int i = 0; i < 32; i++) {
            if (on(goal, i)) {
                int c = 0;
                for (int x : nums) {
                    if (on(x, i)) {
                        c++;
                    }
                }
                min = Math.min(min, c);
            }
        }

        return min == 100 ? 0 : min;
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
