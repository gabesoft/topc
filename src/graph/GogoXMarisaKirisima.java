package topc.graph;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 530 Division I Level Two - 500
// graph theory, greedy
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=11267&rd=14723
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+530
public class GogoXMarisaKirisima {
    public int solve(String[] choices) {
        int n = choices.length;

        BigInteger mask1 = BigInteger.ZERO;
        BigInteger mask2 = BigInteger.ZERO;

        Queue<Integer> q = new LinkedList<Integer>();

        q.offer(0);
        mask1 = mask1.setBit(0);

        while (q.size() > 0) {
            int top = q.poll();
            for (int i = 0; i < n; i++) {
                if (choices[top].charAt(i) == 'Y') {
                    if (!mask1.testBit(i)) {
                        mask1 = mask1.setBit(i);
                        q.offer(i);
                    }
                }
            }
        }

        q.offer(n - 1);
        mask2 = mask2.setBit(n - 1);

        while (q.size() > 0) {
            int top = q.poll();
            for (int i = 0; i < n; i++) {
                if (choices[i].charAt(top) == 'Y') {
                    if (!mask2.testBit(i)) {
                        mask2 = mask2.setBit(i);
                        q.offer(i);
                    }
                }
            }
        }

        BigInteger mask = mask1.and(mask2);

        if (mask.compareTo(BigInteger.ZERO) == 0) { return 0; }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mask1.testBit(i) && mask2.testBit(j) && choices[i].charAt(j) == 'Y') {
                    res++;
                }
            }
        }

        res += 2;
        res -= countOnes(mask);

        return res;
    }

    int countOnes(BigInteger mask) {
        int n = 0;
        while (mask.compareTo(BigInteger.ZERO) > 0) {
           n++;
           mask = mask.and(mask.subtract(BigInteger.ONE));
        }
        return n;
    }

    //int countOnes(int m) {
        //int sum = 0;
        //while (m > 0) {
            //sum += (m & 1);
            //m >>= 1;
        //}
        //return sum;
    //}

    //int countOnes(long mask) {
        //int n = 0;
        //while (mask != 0) {
            //n++;
            //mask = mask & (mask - 1);
        //}
        //return n;
    //}

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
