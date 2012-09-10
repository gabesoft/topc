package topc.greedy;

import java.util.*;
import java.io.*;

// SRM 546 Division I Level Two - 500
// brute force, greedy, simple math, simple search, iteration
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=12045&rd=14738
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+546
public class FavouriteDigits {
    public long findNext(long N, int digit1, int count1, int digit2, int count2) {
        int d1 = digit1 < digit2 ? digit1 : digit2;
        int d2 = digit1 < digit2 ? digit2 : digit1;
        int c1 = digit1 < digit2 ? count1 : count2;
        int c2 = digit1 < digit2 ? count2 : count1;

        char cd1 = (char)(d1 + '0');
        char cd2 = (char)(d2 + '0');
        String n = (N - 1) + "";
        int len  = Math.max(c1 + c2, n.length());

        n = str(len - n.length(), '0') + n;

        int lc1       = Math.max(0, c1 - (cd1 == '1' ? 1 : 0));
        int lc2       = Math.max(0, c2 - (cd2 == '1' ? 1 : 0));
        String longer = str(1, '1') + str(len - lc1 - lc2, '0') + str(lc1, cd1) + str(lc2, cd2);

        String ans = "";
        for (int i = 0; i < len; i++) {
            for (char d = '9'; d > n.charAt(i); d--) {
                int t1 = Math.max(0, c1 - (d == cd1 ? 1 : 0));
                int t2 = Math.max(0, c2 - (d == cd2 ? 1 : 0));
                if (t1 + t2 > len - 1 - i) { continue; }

                String curr = n.substring(0, i) 
                    + str(1, d) 
                    + str(len - i - 1 - t1 - t2, '0') 
                    + str(t1, cd1) + str(t2, cd2);

                if (curr.charAt(0) != '0') {
                    ans = curr;
                }
            }
            c1 -= n.charAt(i) == cd1 ? 1 : 0;
            c2 -= n.charAt(i) == cd2 ? 1 : 0;
        }

        if (ans.length() == 0) {
            ans = longer;
        }

        return Long.parseLong(ans);
    }

    String str(int k, char c) {
        String res = "";
        for (int i = 0; i < k; i++) {
            res += c;
        }
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
