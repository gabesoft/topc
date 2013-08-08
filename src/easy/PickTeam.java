package topc.easy;

import java.util.*;
import java.io.*;

// SRM 153 Division II Level Three - 1000
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=1773&rd=4570
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm153
public class PickTeam {
    int n;
    int like[][];

    public String[] pickPeople(int teamSize, String[] people) {
        n    = people.length;
        like = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] parts = people[i].split("\\s+");
            for (int j = 1; j < parts.length; j++) {
                like[i][j - 1] = Integer.parseInt(parts[j]);
            }
        }

        int k = 1 << n;
        int selected = 0;
        int sum = -(1 << 20);
        for (int i = 1; i < k; i++) {
            if (Integer.bitCount(i) == teamSize) {
                int s = getSum(i);
                if (s > sum) {
                    sum = s;
                    selected = i;
                }
            }
        }

        String res[] = new String[teamSize];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (on(selected, i)) {
                String[] parts = people[i].split("\\s+");
                res[j++] = parts[0];
            }
        }

        Arrays.sort(res);
        return res;
    }

    private int getSum(int mask) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (!on(mask, i)) { continue; }
            for (int j = i + 1; j < n; j++) {
                if (on(mask, j)) {
                    sum += like[i][j];
                }
            }
        }
        return sum;
    }

    private boolean on(int mask, int k) {
        return ((mask >> k) & 1) == 1;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
