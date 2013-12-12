package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 231 Division II Level Three - 900
// greedy, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=3945&rd=6520
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm231
public class ProgramSchedule {
    public int schedule(int[] A, int[] B) {
        int n = A.length;

        Prog progs[] = new Prog[n];
        for (int i = 0; i < n; i++) {
            progs[i] = new Prog(A[i], B[i]);
        }

        Arrays.sort(progs);

        int start = 0;
        int end   = 0;

        for (int i = 0; i < n; i++) {
            start += progs[i].setup;
            end    = Math.max(end, start + progs[i].run);
        }

        return end;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }

    public class Prog implements Comparable<Prog> {
        public final int setup;
        public final int run;

        public Prog(int s, int r) {
            setup = s;
            run   = r;
        }

        public int compareTo(Prog o) {
            return run != o.run
                ? o.run - run
                : setup - o.setup;
        }
    }
}
