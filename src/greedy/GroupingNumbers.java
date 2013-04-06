package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 280 Division II Level Three - 1000
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=5937&rd=8077
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm280
public class GroupingNumbers {
    int perm[];
    int level;
    int numbers[];
    int groups;
    double best;

    public double minRange(int[] numbers, int n) {
        this.numbers = numbers;
        this.groups  = n;

        perm  = new int[numbers.length];
        best  = Integer.MAX_VALUE;
        level = -1;

        permute(0);

        return best;
    }

    private void computeRange() {
        int cycles = 0;
        int n      = 0;
        int cur    = 0; 

        double sum = 0;
        double avg = 0;
        double min = Integer.MAX_VALUE;
        double max = -1;

        boolean used[] = new boolean[perm.length];

        while (true) {
            used[cur] = true;

            sum += numbers[cur];
            cur  = perm[cur] - 1;

            n++;

            if (used[cur]) {
                avg = sum / n;
                min = Math.min(min, avg);
                max = Math.max(max, avg);

                cycles++;

                if (cycles > groups) { break; }

                n   = 0;
                sum = 0;

                for (cur = 0; cur < perm.length && used[cur]; cur++);
                if  (cur == perm.length) { break; }
            }
        }

        if (cycles == groups) {
            best = Math.min(best, max - min);
        }
    }

    private void permute(int k) {
        level++;
        perm[k] = level;
        if (level == perm.length) {
            computeRange();
        } else {
            for (int i = 0; i < perm.length; i++) {
                if (perm[i] == 0) {
                    permute(i);
                }
            }
        }
        level--;
        perm[k] = 0;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
