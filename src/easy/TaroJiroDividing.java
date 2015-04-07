package topc.easy;

import java.util.*;
import java.io.*;

// SRM 650 Division II Level One - 250
// brute force
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=13672&rd=16314
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+650
public class TaroJiroDividing {
    public int getNumber(int A, int B) {
        HashSet<Integer> set = new HashSet<Integer>();

        while (A % 2 == 0) {
            set.add(A);
            A = A >> 1;
        }
        set.add(A);

        int cnt = 0;
        while (B % 2 == 0) {
            if (set.contains(B)) {
                cnt++;
            }
            B = B >> 1;
        }
        if (set.contains(B)) {
            cnt++;
        }

        return cnt;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
