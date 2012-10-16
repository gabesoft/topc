package topc.easy;

import java.util.*;
import java.io.*;

// SRM 496 Division II Level Three - 1000
// brute force, recursion, simple math
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11296&rd=14425
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+496
public class PalindromfulString {
    int M;
    int K;
    long ans;
    public long count(int N, int M, int K) {
        this.M   = M;
        this.K   = K;
        this.ans = 0;

        construct(N, "", 'a');

        return ans;
    }

    void construct(int rem, String sofar, char next) {
        if (rem == 0) {
           int tot = 0; 

           for (int t = 0; t < sofar.length() - M + 1; t++) {
               int first    = t;
               int last     = t + M - 1;
               boolean pali = true;

               while (last >= t) {
                   if (sofar.charAt(first) != sofar.charAt(last)) {
                       pali = false;
                       break;
                   }
                   first++;
                   last--;
               }
               if (pali) {
                   tot++;
               }
           }

           if (tot >= K) {
               ans += countPatterns(next);
           }
           return;
        }

        construct(rem - 1, sofar + next, (char)(next + 1));
        for (char c = 'a'; c < next; c++) {
            construct(rem - 1, sofar + c, next);
        }
    }

    long countPatterns(char next) {
        long summand = 1;
        long base    = 26;

        for (int p = 0; p < next - 'a'; p++) {
            summand *= base;
            base--;
        }
        return summand;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
