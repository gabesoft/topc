package topc.dynamic;

import java.util.*;
import java.io.*;

// SRM 384 Division II Level Three - 1000
// dynamic programming
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=7756&rd=10808
// editorial: http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm384
public class PowerGame {
    int INF=999998;

    public String winner(int size0, int size1) {
        int res1 = count(size0);
        int res2 = count(size1);
        int res = Math.min(res1, res2);

        return String.format("%s will win after %s moves", res % 2 == 0 ? "Bob" : "Alan", res);
    }

    int count(int size) {
        int [] moves = new int[105];
        int j        = 0;

        for (int i = 1; i < moves.length; i++) {
            int num = i * i;
            if (num > size) { break; }
            moves[j++] = num;
        }

        int [] len = new int[size + 1];
        
        for (int i = 1; i < size + 1; i++) {
            int smallestEven = INF;
            int largestOdd   = -1;

            for (int k = 0; k < j; k++) {
                if (i - moves[k] >= 0) {
                    int delta = i - moves[k];
                    if (len[delta] % 2 == 0) {
                        if (len[delta] < smallestEven) {
                            smallestEven = len[delta];
                        }
                    } else {
                        if (len[delta] > largestOdd) {
                            largestOdd = len[delta];
                        }
                    }
                }
            }

            if (smallestEven != INF) {
                len[i] = smallestEven + 1;
            } else {
                len[i] = largestOdd + 1;
            }
        }

        return len[size];
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
