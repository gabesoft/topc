package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 570 Division II Level One - 250
// greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12424&rd=15490
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+570
public class Chopsticks {
    public int getmax(int[] length) {
        int[] cnt = new int[101];
        for (int x : length) {
            cnt[x]++;
        }

        int res = 0;
        for (int c : cnt) {
            res += c / 2;
        }

        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
