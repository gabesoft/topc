package topc.codility;

import java.util.*;
import java.io.*;

public class Problem1 {
    public long toBase10(int[] A) {
        long pow = 1;
        long n = 0;

        for (int i = 0; i < A.length; i++) {
            n += (pow * A[i]);
            pow *= (-2);
        }

        return n;
    }

    public int[] toBaseM2(long n) {
        ArrayList<Integer> bits = new ArrayList<Integer>();

        while (Math.abs(n) > 1) {
            bits.add((int)(Math.abs(n) % 2));
            n = (long)Math.ceil(n / (-2.0));
        }

        if (n != 0) {
            bits.add(1);
        }

        int[] result = new int[bits.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = bits.get(i);
        }

        return result;
    }

    private void debug(Object... os) {
        System.out.println(Arrays.deepToString(os));
    }
}
