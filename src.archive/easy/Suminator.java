package topc.easy;

import java.util.*;
import java.io.*;

// SRM 553 Division I Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11354&rd=15175
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+553
public class Suminator {
    public int findMissing(int[] program, long wantedResult) {
        int k = -1;
        for (int i = 0; i < program.length; i++) {
            if (program[i] == -1) {
                k = i;
                break;
            }
        }

        program[k] = 0;

        long n = simulate(program);
        if (n == wantedResult) {
            return 0;
        }

        int hi = 1000000001;
        int lo = 1;
        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            program[k] = mid;

            long r = simulate(program);
            if (r == wantedResult) {
                return mid;
            } else if (r < wantedResult) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
    }

    private long simulate(int[] program) {
        Stack<Long> st = new Stack<Long>();

        for (int i = 0; i < program.length; i++) {
            if (program[i] != 0) {
                st.push((long)program[i]);
            } else if(st.size() > 1) {
                long x = st.pop();
                long y = st.pop();
                st.push(x + y);
            }
        }

        return st.size() > 0 ? st.pop() : 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
