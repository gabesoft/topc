package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 321 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=6771&rd=10001
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm321
public class LexStringWriter {
    boolean[] have;
    int[] first;
    int[] last;
    int[] count;

    public int minMoves(String s) {
        int n = s.length();

        have  = new boolean[26];
        first = new int[26];
        last  = new int[26];
        count = new int[26];

        for (int i = 0; i < n; i++) {
            int v = s.charAt(i) - 'a';

            if (!have[v]) {
                first[v] = i;
            }

            have[v] = true;
            last[v] = i;
            count[v]++;
        }

        int leftp  = 0;
        int leftv  = 0;
        int rightp = 0;
        int rightv = 0;

        for (int i = 0; i < have.length; i++) {
            if (have[i]) {
                int l = Math.min(leftv + Math.abs(last[i] - leftp), rightv + Math.abs(last[i] - rightp)) + 
                    Math.abs(first[i] - last[i]) + count[i];
                int r = Math.min(leftv + Math.abs(first[i] - leftp), rightv + Math.abs(first[i] - rightp)) +
                    Math.abs(last[i] - first[i]) + count[i];
                leftp  = first[i];
                rightp = last[i];
                leftv  = l;
                rightv = r;
            }
        }

        return Math.min(leftv, rightv);
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
