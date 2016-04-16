package topc.easy;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

// https://leetcode.com/problems/additive-number/
public class AdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        if (num == null || num.length() < 3) {
            return false;
        }

        int n = num.length();
        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = num.charAt(i) - '0';
        }

        return find(digits, 0, 0);
    }

    private boolean find(int[] digits, int s, int minl) {
        if (s == digits.length - 2) {
            return false;
        }

        int n = digits.length;

        BigInteger x = BigInteger.ZERO;
        BigInteger y = BigInteger.ZERO;
        BigInteger ten = BigInteger.TEN;

        x = BigInteger.valueOf(digits[s]);

        for (int j = s; j < n - 2; j++) {
            if (j > s) {
                x = x.multiply(ten);
                x = x.add(BigInteger.valueOf(digits[j]));
            }

            if (digits[s] == 0 && j > s) {
                return false;
            }

            if (j - s < minl) {
                continue;
            }

            int k  = j + 1;
            y = BigInteger.valueOf(digits[k]);

            for (int l = k; l < n - 1; l++) {
                if (l > k) {
                    y = y.multiply(ten);
                    y = y.add(BigInteger.valueOf(digits[l]));
                }

                if (digits[k] == 0 && l > k) {
                    continue;
                }

                BigInteger sum = x.add(y);
                int[] sumDigits = getDigits(sum);
                int m = sumDigits.length;
                int q = l + 1;
                boolean ok = m <= (n - q);

                for (int p = q; ok && (p - q < m); p++) {
                    if (digits[p] != sumDigits[p - q]) {
                        ok = false;
                    }
                }

                if (ok && (q + m == n || find(digits, k, l - k))) {
                    return true;
                }
            }
        }

        return false;
    }

    private int[] getDigits(BigInteger num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        BigInteger[] resultAndReminder;

        while (num.compareTo(BigInteger.ZERO) != 0) {
            resultAndReminder = num.divideAndRemainder(BigInteger.TEN);
            list.add(Math.abs(resultAndReminder[1].intValue()));
            num = resultAndReminder[0];
        }

        int n = list.size();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = list.get(n - i - 1);
        }

        return digits;
    }

    @SuppressWarnings("unused")
    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
