package topc.math;

import java.util.*;
import java.io.*;
import java.math.*;

// SRM 434 Division I Level Two - 500
// simple math, sorting, string manipulation
// statement: http://community.topcoder.com/stat?c=problem_statement&pm=10266&rd=13696
// editorial: http://apps.topcoder.com/wiki/display/tc/SRM+434
public class HexatridecimalSum {
    public String maximizeSum(String[] numbers, int k) {
        BigInteger base  = BigInteger.valueOf(36);
        BigInteger inc[] = new BigInteger[36];

        Arrays.fill(inc, BigInteger.ZERO);

        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i < numbers.length; i++) {
            String n = numbers[i];

            for (int j = 0; j < numbers[i].length(); j++) {
                int digit  = valueOf(n.charAt(n.length() - 1 - j));
                inc[digit] = inc[digit].add(base.pow(j).multiply(BigInteger.valueOf(35 - digit)));
            }

            sum = sum.add(new BigInteger(n, 36));
        }


        Arrays.sort(inc);

        for (int i = 0; i < k; i++) {
            sum = sum.add(inc[35 - i]);
        }

        return sum.toString(36).toUpperCase();
    }

    int valueOf(char c) {
        return c <= '9' ? c - '0' : 10 + c - 'A';
    }
}
