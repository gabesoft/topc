package topc.search;

import java.util.*;
import java.io.*;

// SRM 569 Division II Level One - 250
// simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12404&rd=15489
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+569
public class TheJediTestDiv2 {
    public int countSupervisors(int[] students, int Y, int J) {
        int best = 1 << 30;
        for (int i = 0; i < students.length; i++) {
            int cnt = count(Math.max(0, students[i] - Y), J);
            for (int j = 0; j < students.length; j++) {
                if (i != j) {
                    cnt += count(students[j], J);
                }
            }
            best = Math.min(best, cnt);
        }
        return best;
    }

    private int count(int x, int j) {
        return x / j + (x % j == 0 ? 0 : 1);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
