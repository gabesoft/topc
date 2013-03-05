package topc.math;

import java.util.*;
import java.io.*;

// SRM 336 Division I Level Two - 500
// math, search, sorting
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7351&rd=10660
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm336
public class LikelyWord {
    public int likely(String[] dictionary, int k) {
        int n      = dictionary.length + 1;
        long best  = -1;
        long index = -1;
        long prev  = 0;

        for (int i = 0; i < n; i++) {
            long curr  = i < n - 1 ? countWords(dictionary[i], k) : pow(26, k);
            long count = curr - prev; 

            if (i > 0 && dictionary[i - 1].length() == k) {
                count--;
            }

            if (count > best) {
                best  = count;
                index = i;
            } else if (count == best) {
                index = -1;
            }

            prev = curr;
        }

        return (int)index;
    }

    long countWords(String before, int k) {
        while (before.length() < k) {
            before += 'a';
        }

        long num  = 0;

        for (int i = 0; i < k; i++) {
            num = num * 26 + (before.charAt(i) - 'a');
        }

        if (before.length() > k) {
            num++;
        }

        return num;
    }

    long pow(int a, int b) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
        }
        return res;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
