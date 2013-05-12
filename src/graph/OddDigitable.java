package topc.graph;

import java.util.*;
import java.io.*;

// SRM 255 Division I Level Three - 800
// graph theory, math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=4527&rd=7228
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm255
public class OddDigitable {
    public String findMultiple(int N, int M) {
        boolean[] seen      = new boolean[N];
        Queue<Integer> nums = new LinkedList<Integer>();
        Queue<String> strs  = new LinkedList<String>();

        nums.offer(0);
        strs.offer("");

        while (nums.size() > 0) {
            int c    = nums.poll();
            String s = strs.poll();

            if (c == M && s.length() > 0) { return s; }

            for (int j = 1; j < 10; j += 2) {
                int x = (c * 10 + j) % N;
                if (seen[x]) { continue; }

                seen[x] = true;
                nums.offer(x);
                strs.offer(s + j);
            }
        }

        return "-1";
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
